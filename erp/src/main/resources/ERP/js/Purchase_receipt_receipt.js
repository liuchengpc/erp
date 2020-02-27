import {
    getLast,
    getPrev,
    getNext,
    getFirst
} from '../rest/Purchase_receipt_receipt_rest.js';
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

let viewModel = new Vue({
    el: "#app",
    data() {
        return {
            lineId: 1,
            purchaseStorage:{

            }
        };
    },
    methods:{
        getLast(){
            getLast().then(resp => {
                console.log(resp.data);
            }).catch(error => {
                console.log(error);
            })
        },
        getPrev(){
            getPrev(this.lineId).then(resp => {
                console.log(resp.data);
            }).catch(error => {
                console.log(error);
            })
        },
        getNext(){
            getNext(this.lineId).then(resp => {
                console.log(resp.data);
            }).catch(error => {
                console.log(error);
            })
        },
        getFirst(){
            getFirst(this.lineId).then(resp => {
                console.log(resp.data);
            }).catch(error => {
                console.log(error);
            })
        },
        emptyPurchaseStorageProp() {

        }
    },
    created: function () {
        this.getLast();
    },
    watch: {}
});