import {getLast, getPage, getFirst, getNext, getPrev} from "../rest/purchase_return_receipt_rest.js";

layui.use('layer', function () {
    var layer = layui.layer;
});
const orderStatusMeta = {
    "insert": 0, // 新增
    "browse": 1, // 浏览
    "delete": 2, // 删除
    "review": 3, // 审核
    "change": 4, // 修改
    "unReview": 5, // 取消审核
    "save": 6, // 保存
    "edit": 7, // 编辑
    "reset": 8, // 重置
    "refresh": 9 // 刷新
};
// 默认订单状态为新增
const defaultOrderStatus = orderStatusMeta.insert;

let viewModel = new Vue({
    el: "#app",
    data() {
        return {
            orderStatus: defaultOrderStatus,
            supplier: "", // 供应商
            orderDate: "", // 订单日期
            supplierAddress: "", // 供应商地址
            orderNumber: "", // 订单号码
            priceIncludesTax: "", // 单价是否含税
            currencyType: "", // 货币类型
            enterWareHouse: "", // 重新入库
            buyer: "", // 采购人员
            executor: "", // 制单人员
            department: "", // 所属部门
            reviewer: "", // 审核人员
            project: "", //所属项目,
            lineId: 1,
            purchaseReturn:{

            }
        };
    },
    methods: {
        insertOrder() {
            this.orderStatus = orderStatusMeta.insert;
            this.emptyPurchaseReturnProp();
        },
        saveOrder() {
            this.orderStatus = orderStatusMeta.save;
        },
        editOrder() {
            this.orderStatus = orderStatusMeta.edit;
        },
        deleteOrder() {
            this.orderStatus = orderStatusMeta.delete;
        },
        resetOrder() {
            this.orderStatus = orderStatusMeta.reset;
        },
        refreshOrder() {
            this.orderStatus = orderStatusMeta.refresh;
        },
        reviewOrder() {
            this.orderStatus = orderStatusMeta.review;

        },
        unReviewOrder() {
            this.orderStatus = orderStatusMeta.unReview;
        },
        showSupplierWindow() {
            layer.open({
                type: 2,
                title: "单选--采购请购类型设定",
                content: "window_set_request_purchase_order_type.html",
                area: ['762px', '450px']
            })
        },
        getPage(pageNum) {

        },
        getLast() {
            getLast().then(resp => {
                this.purchaseReturn = resp.data;
            }).catch(error => {
                console.log(error);
            });
        },
        getPrev() {
            getPrev(this.lineId).then(resp => {
                console.log(resp);
            }).catch(error => {
                console.log(error);
            });
        },
        getNext() {
            getNext(this.lineId).then(resp => {
                console.log(resp);
            }).catch(error => {
                console.log(error);
            })
        },
        getFirst() {
            getFirst().then(resp => {
                console.log(resp);
            }).catch(error => {
                console.log(error);
            })
        },
        emptyPurchaseReturnProp(){
            this.purchaseReturn = {
                pureId: "",
                supplierId: "",
                pureEngname: "",
                puretId: "",
                purePriceIncludeTax: "",
                warehouseId: "",
                pureSingleStatus: "",
                pureDocumentDate: "",
                pureDocumentNumber: "",
                currencyId: "",
                pureExchangeRate: "",
                pureForeignTrade: "",
                pureSunnum: "",
                pureSunmoney: "",
                pureTax: "",
                pureIncludeTaxAmount: "",
                pureDeliveryAddress: "",
                pureBuyer: "",
                pureBelongsSection: "",
                pureBelongsProject: "",
                pureExecutor: "",
                pureCheckagainStaff: "",
                pureHeaderProvision: "",
                pureEndClause: "",
                pureRemark: "",
                pureAudition: "",
                pureYn: ""
            };
        }
    },
    created: function () {
        this.getLast();
    },
    watch: {
        orderStatus: function (newOrderStatus, originalOrderStatus) {
            console.log("newOrderStatus:" + newOrderStatus);
            console.log("originalOrderStatus:" + originalOrderStatus);
        }
    }
});