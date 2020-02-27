import {
    getLast,
    getPage,
    getFirst,
    getNext,
    getPrev,
    getPureId,
    insertWithDetails
}from "../rest/purchase_return_receipt_rest.js";
let orderStatusMeta = {

};
let viewModel = new Vue({
    el: '#app',
    data() {
        return {
            purechaseReturn: {
                pureId: "", // 编号
                supplierId: "", // 供应商编号
                pureEngname: "", // 供应商地址
                puretId: "", // 采购入库类型id
                purePriceIncludeTax: "", // 单价是否含税
                warehouseId: "", // 仓库id
                pureSingleStatus: "", // 凭证编号
                pureDocumentDate: "", // 单据日期
                pureDocumentNumber: "", // 单据号码
                currencyId: "", // 币别id
                pureExchangeRate: "", // 汇率
                pureForeignTrade: "", // 国外贸易
                pureSunnum: "", // 总数量
                pureSunmoney: "", // 总金额
                pureTax: "", // 总税额
                pureIncludeTaxAmount: "", // 总含税金额
                pureDeliveryAddress: "", // 送货地址
                pureBuyer: "", // 采购人员
                pureBelongsSection: "", // 所属部门
                pureBelongsProject: "", // 所属项目
                pureExecutor: "", // 制单人员
                pureCheckagainStaff: "", // 复核人员
                pureHeaderProvision: "", // 表头条文
                pureEndClause: "", // 表尾条文
                pureRemark: "", // 备注
                pureAudition: "", // 是否审核
                pureYn: "", // 是否删除
                details: [], // 详表内容
            },
            rules: {
                require: [
                    {required: true, message: '请选择供应商', trigger: 'blur'}
                ],
                supplier: [
                    {required: true, message: '请选择供应商', trigger: 'blur'}
                ],
                supplierAddress: [
                    {required: true, message: '请输入供应商地址', trigger: 'change'}
                ],
                date: [
                    {type: 'date', required: false, message: '请选择日期', trigger: 'change'}
                ]
            },
            activeName: "first",
            tableData: [{
                date: '2016-05-03',
                name: '王小虎',
                address: '上海市普陀区金沙江路 1518 弄'
            }, {
                date: '2016-05-02',
                name: '王小虎',
                address: '上海市普陀区金沙江路 1518 弄'
            }, {
                date: '2016-05-04',
                name: '王小虎',
                address: '上海市普陀区金沙江路 1518 弄'
            }, {
                date: '2016-05-01',
                name: '王小虎',
                address: '上海市普陀区金沙江路 1518 弄'
            }, {
                date: '2016-05-08',
                name: '王小虎',
                address: '上海市普陀区金沙江路 1518 弄'
            }, {
                date: '2016-05-06',
                name: '王小虎',
                address: '上海市普陀区金沙江路 1518 弄'
            }, {
                date: '2016-05-07',
                name: '王小虎',
                address: '上海市普陀区金沙江路 1518 弄'
            }]
        }
    },
    methods: {
        submitForm(formName) {
            this.$refs[formName].validate((valid) => {
                if (valid) {
                    alert('submit!');
                } else {
                    console.log('error submit!!');
                    return false;
                }
            });
        },
        resetForm(formName) {
            this.$refs[formName].resetFields();
        },
        handleCommand(command) {
            this.$message('click on item ' + command);
        },
        handleClick(row) {
            console.log(row);
        }
    },
    created: function () {

    },
    watch: {}
});