var curRow, curCol, loading, SYSTEM = system = parent.SYSTEM,
	billRequiredCheck = system.billRequiredCheck,
	requiredMoney = system.requiredMoney,
	taxRequiredCheck = system.taxRequiredCheck,
	taxRequiredInput = system.taxRequiredInput,
	hiddenAmount = !1,
	urlParam = Public.urlParam(),
	disEditable = urlParam.disEditable,
	qtyPlaces = Number(parent.SYSTEM.qtyPlaces),
	pricePlaces = Number(parent.SYSTEM.pricePlaces),
	amountPlaces = Number(parent.SYSTEM.amountPlaces),
	defaultPage = Public.getDefaultPage(),
	THISPAGE = {

		init: function(a) {

			this.mod_PageConfig = Public.mod_PageConfig.init("salesOrder"), SYSTEM.isAdmin !== !1 || SYSTEM.rights.AMOUNT_OUTAMOUNT || (hiddenAmount = !0, $("#amountArea").hide()), this.initDom(a), this.loadGrid(a), this.initCombo(), a.id > 0 && a.checked ? this.disableEdit() : (this.editable = !0, $("#grid").jqGrid("setGridParam", {

				cellEdit: !0
			
})), this.addEvent(), setTimeout(function() {