import {
    getLast,
    getPage,
    getFirst,
    getNext,
    getPrev,
    getPureId,
    insertWithDetails
}from "../rest/purchase_return_receipt_rest.js";
layui.use(['form', 'layedit', 'laydate','layer'], function () {
    var form = layui.form
        ,layer = layui.layer
        ,layedit = layui.layedit
        ,laydate = layui.laydate;
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
const defaultOrderStatus = orderStatusMeta.browse;

let viewModel = new Vue({
    el: "#app",
    data() {
        return {
            orderStatus: defaultOrderStatus, // 订单状态
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
            purechaseReturn: {

            },
            edit: true
        };
    },
    methods: {
        /**
         *
         */
        insertOrder() {
            console.log(orderStatusMeta.insert);
            this.orderStatus = orderStatusMeta.insert;
            this.emptyPurchaseReturnProp();
            this.getPureId();
        },
        /**
         *
         */
        saveOrder() {
            // this.orderStatus = orderStatusMeta.save;
            if(this.orderStatus === orderStatusMeta.browse
             || this.orderStatus === orderStatusMeta.edit){
                // 修改
            }else if(this.orderStatus === orderStatusMeta.insert){
                // 新增
            }
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
        /**
         * 审核订单
         */
        reviewOrder() {
            this.orderStatus = orderStatusMeta.review;
            this.purechaseReturn.pureAudition = "1";

        },
        unReviewOrder() {
            this.purechaseReturn.pureAudition = "0";
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
                this.purechaseReturn = resp.data;
                this.addProp(this.purechaseReturn.details);
                console.log(resp);
            }).catch(error => {
                console.log(error);
            });
        },
        getPrev() {
            getPrev(this.lineId).then(resp => {
                this.purechaseReturn = resp.data;
                console.log(resp);
            }).catch(error => {
                console.log(error);
            });
        },
        getNext() {
            getNext(this.lineId).then(resp => {
                this.purechaseReturn = resp.data;
                console.log(resp);
            }).catch(error => {
                console.log(error);
            })
        },
        getFirst() {
            getFirst().then(resp => {
                this.purechaseReturn = resp.data;
                console.log(resp);
            }).catch(error => {
                console.log(error);
            })
        },
        emptyPurchaseReturnProp(){
            this.purechaseReturn = {
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
        },
        getPureId(){
            getPureId().then(resp => {
                this.purechaseReturn.pureId = resp.data;
            }).catch(error => {
                console.log(error);
            });
        },
        editColumn(enableEdit,index) {
            // console.log(enableEdit);
            // console.log(typeof enableEdit); // boolean
            console.log(enableEdit);
            console.log(index);
            this.$set(this.purechaseReturn.details[index], "enableEdit", !enableEdit);
        },
        addProp(details) {
            let self = this;
            details.forEach(function (value, index, array) {
                self.$set(self.purechaseReturn.details[index], "enableEdit", false);
            });
        }
    },
    created: function () {
        this.getLast();
    },
    watch: {
        orderStatus: function (newOrderStatus, originalOrderStatus) {
            console.log("newOrderStatus:" + newOrderStatus);
            console.log("originalOrderStatus:" + originalOrderStatus);
            this.edit = newOrderStatus !== 0 && newOrderStatus !== 7;
            if(!this.edit){
                console.log("render");
                layui.form.render();
            }
            console.log(this.edit);
        }
    }
});

layui.use(['form', 'layedit', 'laydate','layer'], function () {
    var form = layui.form
        ,layer = layui.layer
        ,layedit = layui.layedit
        ,laydate = layui.laydate;

    //日期
    laydate.render({
        elem: '#date'
    });

    //自定义验证规则
    form.verify({
        title: function(value){
            if(value.length < 5){
                return '标题至少得5个字符啊';
            }
        }
        ,pass: [
            /^[\S]{6,12}$/
            ,'密码必须6到12位，且不能出现空格'
        ]
        ,content: function(value){
            layedit.sync(editIndex);
        }
    });

    //监听提交
    form.on('submit(demo1)', function(data){
        layer.alert(JSON.stringify(data.field), {
            title: '最终的提交信息'
        });
        if(viewModel.$data.orderStatus === orderStatusMeta.browse
            || viewModel.$data.orderStatus === orderStatusMeta.edit){
            // 修改
            console.log("update");
        }else if(viewModel.$data.orderStatus === orderStatusMeta.insert){
            // 新增
            let data = form.val('pure-form');
            insertWithDetails(JSON.stringify(data)).then(resp => {
                console.log(resp);
            }).catch(error => {
                console.log(error);
            });
            console.log("insert");
        }
        return false;
    });
});