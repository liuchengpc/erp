var orderStatusMeta = {
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
var defaultOrderStatus = orderStatusMeta.insert;

let viewModel = new Vue({
    el: "#app",
    data() {
        return {
            orderStatus: defaultOrderStatus
        };
    },
    methods: {
        insertOrder() {
            this.orderStatus = orderStatusMeta.insert;
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
        }
    },
    watch: {
        /**
         *
         * @param newOrderStatus 新状态
         * @param originalOrderStatus 原来的状态
         */
        orderStatus: function (newOrderStatus, originalOrderStatus) {
            console.log("newOrderStatus:" + newOrderStatus);
            console.log("originalOrderStatus:" + originalOrderStatus);
        }
    }
});