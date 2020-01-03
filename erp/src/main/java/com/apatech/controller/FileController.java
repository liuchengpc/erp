package com.apatech.controller;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.apatech.domain.Member;
import com.apatech.service.MemberService;
import com.apatech.service.MemberlvService;





@Controller
@RequestMapping("/file")
public class FileController {

	@RequestMapping("/toPage")
	public String toPage() {
		return "file/page";
	}
	private String sfile = "";//存放图片名称
	
	 /**
     * 单个文件上传
     * @param request
     * @return
     */
    @RequestMapping(value="/upload2",produces="text/html;charset=utf-8")
    @ResponseBody
    private String upload2(@RequestParam(value = "file",required = false) CommonsMultipartFile  partFile,HttpServletRequest request) {
        try {
           String path = "/Users";
           System.out.println("这个临时文件的路径是:"+ path);
           //UUID是jdk自带的一个主键策略
      	 	String newName = UUID.randomUUID().toString().replaceAll("-", "");
      	 
      	 	System.out.println(partFile.toString());
      	 	String ententionName = partFile.getOriginalFilename().substring(partFile.getOriginalFilename().lastIndexOf("."));	//获取后缀名
           System.out.println("文件的名字："+newName+ententionName);
           partFile.transferTo(new File(path + File.separator + newName + ententionName));
           sfile=newName+ententionName;
   		return sfile;
       } catch (Exception e) {
           e.printStackTrace();
           return "文件上传失败！";
       } 
   }
	
	
	/**
	 * form表单文件上传
	 * @param files
	 * @return
	 */
	@RequestMapping("/upload")
	 @ResponseBody
	public String upload(MultipartFile [] files) {
		System.out.println("进入upload表单文件上传");
		System.out.println(files.toString());
		
		File directory = new File("E:\\images");//文件保存路径
		if(!directory.exists()) {//判断是否有此文件夹
			directory.mkdirs();//创建文件夹
		}
		try {
			for(MultipartFile l : files) {
				String url = "E:\\images";//设置文件上传位置
				String ententionName = l.getOriginalFilename().substring(l.getOriginalFilename().lastIndexOf("."));	//获取后缀名
		  	 	String newName = UUID.randomUUID().toString().replaceAll("-", "");//获取新图片名
				File f = new File(url + File.separator + newName + ententionName);
				l.transferTo(f);
				url = newName+ententionName;//新图片名
				sfile="/"+url;
			   System.out.println("文件的名字："+url);
			}
			System.out.println("to成功了");
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			 return "文件上传失败！";
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			 return "文件上传失败！";
		}
		return sfile;
	}
	
	/**
	 * ajax文件上传
	 * @param files
	 * @return
	 */
	@RequestMapping("/uploadAjax")
	@ResponseBody
	public String uploadAjax(MultipartFile [] files) {
		File directory = new File("/Users/tangyong/upload");
		if(!directory.exists()) {
			directory.mkdirs();
		}
		try {
			for(MultipartFile l : files) {
				String url = "/Users/tangyong/upload/";
				url = url+"/"+l.getOriginalFilename();
				File f = new File(url);
				l.transferTo(f);
			}
			System.out.println("to成功了");
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "success";
	}
	
	/**
	 * 文件下载
	 * @return
	 */
	@RequestMapping("/download")
	@ResponseBody
	public ResponseEntity<byte []> download(){
		try {
			FileInputStream is = new FileInputStream("/Users/tangyong/upload/QR.jpg");
			byte[] bytes = new byte[is.available()];
			is.read(bytes);
			HttpHeaders headers = new HttpHeaders();
			headers.setContentDispositionFormData("attachment", "qr.jpg");
			headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
			return new ResponseEntity<byte[]>(bytes, headers, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	
	
	//以下zhz内容
	@Autowired
	private MemberService dao;
	@Autowired
	private MemberlvService dao2;
	/**
	 * 多条件导出
	 * @return
	 */
	@RequestMapping("/exportExcel")
	public ResponseEntity<byte []> exportExcel(Integer lvid,String PhoneOrName){
		//导出的会员信息
		List<Member> list = dao.queryAllBy(lvid, PhoneOrName);
		//导出会员信息为excel
		Workbook wb = new XSSFWorkbook();
		Sheet sheet = wb.createSheet();
		Row titleRow = sheet.createRow(0);
		titleRow.createCell(0).setCellValue("姓名");
		titleRow.createCell(1).setCellValue("手机");
		titleRow.createCell(2).setCellValue("省份");
		titleRow.createCell(3).setCellValue("城市");
		titleRow.createCell(4).setCellValue("地区");
		titleRow.createCell(5).setCellValue("详细地址");
		titleRow.createCell(6).setCellValue("等级");
		titleRow.createCell(7).setCellValue("余额");
		titleRow.createCell(8).setCellValue("积分");
		for(int i=0;i<list.size();i++) {
			Row row = sheet.createRow(i+1);
			/**
			 * 名称
			 */
			Cell nameCell = row.createCell(0);
			nameCell.setCellValue(list.get(i).getName());
			/**
			 * 电话
			 */
			Cell phoneCell = row.createCell(1);
			phoneCell.setCellValue(list.get(i).getPhone());
			/**
			 * 省
			 */
			Cell provinceCell = row.createCell(2);
			provinceCell.setCellValue(list.get(i).getProvince());
			/**
			 * 市
			 */
			Cell cityCell = row.createCell(3);
			cityCell.setCellValue(list.get(i).getCity());
			/**
			 * 区
			 */
			Cell regionCell = row.createCell(4);
			regionCell.setCellValue(list.get(i).getRegion());
			/**
			 * 街道
			 */
			Cell streetCell = row.createCell(5);
			streetCell.setCellValue(list.get(i).getStreet());
			/**
			 * 等级
			 */
			Cell memberlvnameCell = row.createCell(6);
			memberlvnameCell.setCellValue(list.get(i).getMemberlvname());
			/**
			 * 余额
			 */
			Cell priceCell = row.createCell(7);
			priceCell.setCellValue(list.get(i).getPrice());
			/**
			 * 积分
			 */
			Cell integralCell = row.createCell(8);
			integralCell.setCellValue(list.get(i).getIntegral());
		}
		
		HttpHeaders headers = new HttpHeaders();
		ByteArrayOutputStream bot = new ByteArrayOutputStream();
		try {
			wb.write(bot);
			headers.setContentDispositionFormData("attachment", new String("会员导出.xlsx".getBytes("utf-8"),"iso-8859-1"));
			headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ResponseEntity<byte[]>(bot.toByteArray(), headers, HttpStatus.OK);
	}
	/**
	 * 下载模板
	 * @return
	 */
	@RequestMapping("/downloadMB")
	public ResponseEntity<byte []> downloadMB(){
		//导出会员信息为excel
		Workbook wb = new XSSFWorkbook();
		Sheet sheet = wb.createSheet();
		
		Row titleRow = sheet.createRow(0);
		titleRow.createCell(0).setCellValue("姓名");
		titleRow.createCell(1).setCellValue("手机");
		titleRow.createCell(2).setCellValue("省份");
		titleRow.createCell(3).setCellValue("城市");
		titleRow.createCell(4).setCellValue("地区");
		titleRow.createCell(5).setCellValue("详细地址");
		titleRow.createCell(6).setCellValue("等级");
		titleRow.createCell(7).setCellValue("余额");
		titleRow.createCell(8).setCellValue("积分");
		Row row = sheet.createRow(1);
		/**
		 * 名称
		 */
		Cell nameCell = row.createCell(0);
		nameCell.setCellValue("皮皮");
		/**
		 * 电话
		 */
		Cell phoneCell = row.createCell(1);
		phoneCell.setCellValue("18112345678");
		/**
		 * 省
		 */
		Cell provinceCell = row.createCell(2);
		provinceCell.setCellValue("湖南省");
		/**
		 * 市
		 */
		Cell cityCell = row.createCell(3);
		cityCell.setCellValue("株洲市");
		/**
		 * 区
		 */
		Cell regionCell = row.createCell(4);
		regionCell.setCellValue("天元区");
		/**
		 * 街道
		 */
		Cell streetCell = row.createCell(5);
		streetCell.setCellValue("黄山路205号");
		/**
		 * 等级
		 */
		Cell memberlvnameCell = row.createCell(6);
		memberlvnameCell.setCellValue("VIP");
		/**
		 * 余额
		 */
		Cell priceCell = row.createCell(7);
		priceCell.setCellValue(0);
		/**
		 * 积分
		 */
		Cell integralCell = row.createCell(8);
		integralCell.setCellValue(0);
			
		
		HttpHeaders headers = new HttpHeaders();
		ByteArrayOutputStream bot = new ByteArrayOutputStream();
		try {
			wb.write(bot);
			headers.setContentDispositionFormData("attachment", new String("导入范本.xlsx".getBytes("utf-8"),"iso-8859-1"));
			headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ResponseEntity<byte[]>(bot.toByteArray(), headers, HttpStatus.OK);
	}
	/**
	 * 导入会员
	 * @param file
	 * @return
	 */
	@RequestMapping(value = "/excelUpload",method = RequestMethod.POST)
	@ResponseBody
	public Map<String, String> excelUpload(MultipartFile file) {
		Map<String,String> map=new HashMap<String,String>();
		try {
			//将传入的文件转换成excel
			Workbook wb = new XSSFWorkbook(file.getInputStream());
			//获取sheet业的个数
			int sheets = wb.getNumberOfSheets();
			List<Member> list=new ArrayList<Member>();
			for(int i=0;i<sheets;i++) {
				//根据下标获取sheet页
				Sheet sheet = wb.getSheetAt(i);
				//获取当前sheet页的行数
				int rows = sheet.getPhysicalNumberOfRows();
				for(int j=1;j<rows;j++) {
					//根据下标获取行
					Row row = sheet.getRow(j);
					/**
					 * 名称
					 */
					row.getCell(0).setCellType(CellType.STRING);
					Cell nameCell = row.getCell(0);
					/**
					 * 电话
					 */
					row.getCell(1).setCellType(CellType.STRING);
					Cell phoneCell = row.getCell(1);
					/**
					 * 省
					 */
					row.getCell(2).setCellType(CellType.STRING);
					Cell provinceCell = row.getCell(2);
					/**
					 * 市
					 */
					row.getCell(3).setCellType(CellType.STRING);
					Cell cityCell = row.getCell(3);
					/**
					 * 区
					 */
					row.getCell(4).setCellType(CellType.STRING);
					Cell regionCell = row.getCell(4);
					/**
					 * 街道
					 */
					row.getCell(5).setCellType(CellType.STRING);
					Cell streetCell = row.getCell(5);
					/**
					 * 等级
					 */
					row.getCell(6).setCellType(CellType.STRING);
					Cell memberlvnameCell = row.getCell(6);
					/**
					 * 余额
					 */
					Cell priceCell = row.getCell(7);
					/**
					 * 积分
					 */
					Cell integralCell = row.getCell(8);
					
					Member m=new Member();
					m.setName(nameCell.getStringCellValue());
					m.setPhone(phoneCell.getStringCellValue());
					m.setProvince(provinceCell.getStringCellValue());
					m.setCity(cityCell.getStringCellValue());
					m.setRegion(regionCell.getStringCellValue());
					m.setStreet(streetCell.getStringCellValue());
					m.setMemberlvname(memberlvnameCell.getStringCellValue());
					Double price=priceCell.getNumericCellValue();
					m.setPrice(price.floatValue());
					Double integral=integralCell.getNumericCellValue();
					m.setIntegral(integral.intValue());
					
					
					list.add(m);
				}
				for (Member m : list) {
					if(m.getPhone().length()!=11) {
						map.put("code","no");
						map.put("message","手机号必须为11位数!请更改表格!手机号码为:"+m.getPhone());
						return map;
					}
					if(dao.queryAllByPhone(m.getPhone())!=null) {
						map.put("code","no");
						map.put("message","手机号不能重复!请确保表格中的会员尚未存在!手机号码为:"+m.getPhone());
						return map;
					}
					if(dao2.queryAllByMemberlvName(m.getMemberlvname())==null) {
						map.put("code", "no");
						map.put("message", "未查询到等级!请确保等级名称无误!等级名称为:"+m.getMemberlvname());
						return map;
					}
					if(m.getName()==null||m.getName().equals("")) {
						map.put("code", "no");
						map.put("message", "名称不能为空!");
						return map;
					}
					m.setMemberlvid(dao2.queryAllByMemberlvName(m.getMemberlvname()).getMemberlvid());
				}
				
				for (Member m : list) {
					dao.insert(m);
				}
				map.put("code", "yes");
				map.put("message", "导入成功!!");
				return map;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return map;
	}
}
