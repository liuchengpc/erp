/*
 * 模态框工具
 * 在导入该js后，会在页面最后位置默认创建2个模态框
 * $windowDialogDom 为窗体模态框(支持远程页面加载)
 * $alertDialogDom 为消息模态框(主要用于消息信息提醒)
 */
$(function(){
	//创建窗体对话框
	var $windowDialogDom = $('<div id="windowDialog" class="modal fade" data-backdrop="static" data-keyboard="false"><div class="modal-dialog modal-lg"><div class="modal-content"><div class="modal-header"><button class="close" data-dismiss="modal">&times;</button><h5 class="modal-title">模块提示</h5></div><div class="modal-body"></div></div></div></div>');
	$("body").append($windowDialogDom);
	//创建消息对话框
	var $alertDialogDom = $('<div id="alertDialog" class="modal fade" data-backdrop="static" data-keyboard="false"><div class="modal-dialog modal-sm"><div class="modal-content"><div class="modal-header"><button class="close" data-dismiss="modal">&times;</button><h5 class="modal-title">系统提示</h5></div><div class="modal-body"><h3 class="text-center">message</h3></div><div class="modal-footer" style="text-align: center;"><button class="btn btn-info" data-dismiss="modal">确认</button></div></div></div></div>');
	$("body").append($alertDialogDom);
});

//显示窗体模态框
function showWindowDialog(url, title) {
	$("#windowDialog").find(".modal-title").text(title);
	$("#windowDialog").modal();
	$("#windowDialog").on('shown.bs.modal', function (e) {
 		$("#windowDialog").find(".modal-body").load(url); //ajax加载页面
	});
}

//关闭窗体模态框
function closeWindowDialog() {
	$("#windowDialog").modal('hide');
}

//显示提示模态框
function showAlertDialog(msg) {
	$("#alertDialog").find(".modal-body h3").text(msg);
	$("#alertDialog").modal(); //显示
}

//关闭提示模态框
function closeAlertDialog() {
	$("#alertDialog").modal('hide');
}