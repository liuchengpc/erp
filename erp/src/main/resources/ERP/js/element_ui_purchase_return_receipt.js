import {
    getLast,
    getPage,
    getFirst,
    getNext,
    getPrev,
    getPureId,
    insertWithDetails,
    updateWithDetails,
    deleteWithDetails
} from "../rest/purchase_return_receipt_rest.js";

let orderStatusMeta = {
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
const defaultOrderStatus = orderStatusMeta.browse;
Vue.directive("focus", {
    inserted: function (el) {
        let inputDom = el.getElementsByTagName("input")[0];
        inputDom.focus();
    },
    bind: function (el) {
        let inputDom = el.getElementsByTagName("input")[0];
        inputDom.focus();
    }
});
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
                supplierId: [
                    {required: true, message: '请选择供应商', trigger: 'blur'}
                ],
                pureEngname: [
                    {required: true, message: '请输入供应商地址', trigger: 'blur'}
                ],
                warehouseId: [
                    {required: true, message: '请选择仓库', trigger: 'blur'}
                ],
                pureSingleStatus: [
                    {required: true, message: '请输入凭证编号', trigger: 'blur'}
                ],
                pureDocumentDate: [
                    {type: 'date', required: true, message: '请选择日期', trigger: 'blur'}
                ],
                currencyId: [
                    {required: true, message: '请选择凭证编号', trigger: 'blur'}
                ],
                pureExchangeRate: [
                    {required: true, message: '请输入汇率', trigger: 'blur'}
                ]
            },
            activeName: "first",
            tableData: [{
                date: '2016-05-03',
                name: '王小虎',
                address: '上海市普陀区金沙江路 1518 弄'
            }],
            orderStatus: defaultOrderStatus,
            edit: true,
            test: '',
            dialogFormVisible: false,
            charLength: 1,
            check: false,
            options: [
                {
                    value: '1',
                    label: '是'
                },
                {
                    value: '0',
                    label: '否'
                }
            ],
            lineId: 2,
            watchKey: ['puredSingleStatus', 'puredDocumentDate', 'puredDocumentNumber', 'puredPrice', 'puredTaxRate'],
            watch: false,
            supplierConfig: {
                filterType: 'supplierName',
                suppliers: [],
                filterConfig: ['supplierId', 'supplierName', 'supplierEasyname', 'supplierEngname', 'supplierEasyengname', 'supplierAccountAttribution'],
                option: [
                    {
                        label: '供应商编号',
                        value: 'supplierId'
                    },
                    {
                        label: '供应商名称',
                        value: 'supplierName'
                    },
                    {
                        label: '供应商简称',
                        value: 'supplierEasyname'
                    },
                    {
                        label: '英文名称',
                        value: 'supplierEngname'
                    },
                    {
                        label: '英文简称',
                        value: 'supplierEasyengname'
                    },
                    {
                        label: '账款归属',
                        value: 'supplierAccountAttribution'
                    },
                    {
                        label: '类别',
                        value: 'supplierType'
                    }
                ],
                columns: [
                    {
                        label: '供应商编号',
                        prop: 'supplierId',
                        visible: true,
                        disabled: true
                    },
                    {
                        label: '供应商名称',
                        prop: 'supplierName',
                        visible: true,
                        disabled: true
                    },
                    {
                        label: '供应商简称',
                        prop: 'supplierEasyname',
                        visible: false,
                        disabled: false
                    },
                    {
                        label: '英文名称',
                        prop: 'supplierEngname',
                        visible: false,
                        disabled: false
                    },
                    {
                        label: '英文简称',
                        prop: 'supplierEasyengname',
                        visible: false,
                        disabled: false
                    },
                    {
                        label: '账款归属',
                        prop: 'supplierAccountAttribution',
                        visible: false,
                        disabled: false
                    },
                    {
                        label: '类别',
                        prop: 'supplierType',
                        visible: false,
                        disabled: false
                    },
                    {
                        label: '地区',
                        prop: 'supplierZone',
                        visible: false,
                        disabled: false
                    },
                    {
                        label: '负责人',
                        prop: 'supplierPrincipalman',
                        visible: false,
                        disabled: false
                    }
                ],
                title: '单选--供应商主文件设定',
                singleValue: true
            },
            warehouseConfig: {
                filterType: 'warehouseId',
                wareHouses: [],
                filterConfig: ['warehouseId', 'warehouseName', 'warehouseEasyName', 'warehouseEngname', 'warehouseLinkman', 'warehouseLinktel', 'warehouseAddress', 'warehouseDecoration'],
                option: [
                    {
                        label: '仓库编号',
                        value: 'warehouseId'
                    },
                    {
                        label: '仓库名称',
                        value: 'warehouseName'
                    },
                    {
                        label: '仓库简称',
                        value: 'warehouseEasyName'
                    },
                    {
                        label: '英文名称',
                        value: 'warehouseEngname'
                    },
                    {
                        label: '联系人员',
                        value: 'warehouseLinkman'
                    },
                    {
                        label: '联系电话',
                        value: 'warehouseLinktel'
                    },
                    {
                        label: '仓库地址',
                        value: 'warehouseAddress'
                    },
                    {
                        label: '备注',
                        value: 'warehouseDecoration'
                    }
                ],
                columns: [
                    {
                        label: '仓库编号',
                        prop: 'warehouseId',
                        visible: true,
                        disabled: true
                    },
                    {
                        label: '仓库名称',
                        prop: 'warehouseName',
                        visible: true,
                        disabled: true
                    },
                    {
                        label: '仓库简称',
                        prop: 'warehouseEasyName',
                        visible: false,
                        disabled: false
                    },
                    {
                        label: '英文名称',
                        prop: 'warehouseEngname',
                        visible: false,
                        disabled: false
                    },
                    {
                        label: '联系人员',
                        prop: 'warehouseLinkman',
                        visible: false,
                        disabled: false
                    },
                    {
                        label: '联系电话',
                        prop: 'warehouseLinktel',
                        visible: false,
                        disabled: false
                    },
                    {
                        label: '仓库地址',
                        prop: 'warehouseAddress',
                        visible: false,
                        disabled: false
                    },
                    {
                        label: '备注',
                        prop: 'warehouseDecoration',
                        visible: false,
                        disabled: false
                    }
                ],
                title: '单选--仓库设定',
                singleValue: true
            },
            currencyConfig: {
                filterType: 'currencyId',
                currencies: [],
                filterConfig: ['currencyId', 'currencyName', 'currencyEasyname', 'currencyEngname', 'currencyTransactionday', 'currencyStandardexchange', 'currencyInexchange', 'currencyOutexchange'],
                option: [
                    {
                        label: '币别编号',
                        value: 'currencyId'
                    },
                    {
                        label: '币别名称',
                        value: 'currencyName'
                    },
                    {
                        label: '币别简称',
                        value: 'currencyEasyname'
                    },
                    {
                        label: '英文名称',
                        value: 'currencyEngname'
                    },
                    {
                        label: '异动日期',
                        value: 'currencyTransactionday'
                    },
                    {
                        label: '固定汇率',
                        value: 'currencyTransactionday'
                    },
                    {
                        label: '买进汇率',
                        value: 'currencyInexchange'
                    },
                    {
                        label: '卖出汇率',
                        value: 'currencyOutexchange'
                    }
                ],
                columns: [
                    {
                        label: '币别编号',
                        prop: 'currencyId',
                        visible: true,
                        disabled: true
                    },
                    {
                        label: '币别简称',
                        prop: 'currencyEasyname',
                        visible: true,
                        disabled: true
                    },
                    {
                        label: '币别名称',
                        prop: 'currencyName',
                        visible: false,
                        disabled: false
                    },
                    {
                        label: '英文名称',
                        prop: 'currencyEngname',
                        visible: false,
                        disabled: false
                    },
                    {
                        label: '异动日期',
                        prop: 'currencyTransactionday',
                        visible: false,
                        disabled: false
                    },
                    {
                        label: '固定汇率',
                        prop: 'currencyStandardexchange',
                        visible: false,
                        disabled: false
                    },
                    {
                        label: '买进汇率',
                        prop: 'currencyInexchange',
                        visible: false,
                        disabled: false
                    },
                    {
                        label: '卖出汇率',
                        prop: 'currencyOutexchange',
                        visible: false,
                        disabled: false
                    }
                ],
                title: '单选--币别设定',
                singleValue: true
            },
            projectConfig: {
                filterType: 'projectId',
                projects: [],
                filterConfig: ['projectId', 'projectName', 'projectEnglishName', 'projectRemark', 'projectAbate'],
                option: [
                    {
                        label: '项目编号',
                        value: 'projectId'
                    },
                    {
                        label: '项目名称',
                        value: 'projectName'
                    },
                    {
                        label: '英文名称',
                        value: 'projectEnglishName'
                    },
                    {
                        label: '备注',
                        value: 'projectRemark'
                    },
                    {
                        label: '失效日期',
                        value: 'projectAbate'
                    }
                ],
                columns: [
                    {
                        label: '项目编号',
                        prop: 'projectId',
                        visible: true,
                        disabled: true
                    },
                    {
                        label: '项目名称',
                        prop: 'projectName',
                        visible: true,
                        disabled: true
                    },
                    {
                        label: '备注',
                        prop: 'projectRemark',
                        visible: false,
                        disabled: false
                    },
                    {
                        label: '失效日期',
                        prop: 'projectAbate',
                        visible: false,
                        disabled: false
                    }
                ],
                title: '单选--项目设定',
                singleValue: true
            },
            departmentConfig: {
                teams: [],
                filterType: "teamId",
                filterConfig: ["teamId", "teamName", "teamEnglishName", "teamRemark"],
                option: [
                    {
                        label: '类型编号',
                        value: 'teamId'
                    },
                    {
                        label: "类型名称",
                        value: "teamName"
                    },
                    {
                        label: "英文名称",
                        value: "teamEnglishName"
                    },
                    {
                        label: "备注",
                        value: "teamRemark"
                    }
                ],
                columns: [
                    {
                        label: '供应商编号',
                        prop: 'teamId',
                        visible: true,
                        disabled: true
                    },
                    {
                        label: '供应商名称',
                        prop: 'teamName',
                        visible: true,
                        disabled: true
                    },
                    {
                        label: '备注',
                        prop: 'teamRemark',
                        visible: false,
                        disabled: false
                    },
                    {
                        label: '英文名称',
                        prop: 'teamEnglishName',
                        visible: false,
                        disabled: false
                    }
                ],
                title: '单选--部门选定',
                singleValue: false
            },
            employeeConfig: {
                employees: [],
                filterType: 'staffId',
                filterConfig: ['staffId', 'teamId', 'teamName', 'staffName', 'staffEnglishName', 'staffIdnumber', 'staffGender', 'staffChineseposition', 'staffMobilephone'],
                option: [
                    {
                        label: '人员编号',
                        value: 'staffId'
                    },
                    {
                        label: '所属部门',
                        value: 'teamId'
                    },
                    {
                        label: '部门名称',
                        value: 'teamName'
                    },
                    {
                        label: '人员姓名',
                        value: 'staffName'
                    },
                    {
                        label: '英文名称',
                        value: 'staffEnglishName'
                    },
                    {
                        label: '身份证号',
                        value: 'staffIdnumber'
                    },
                    {
                        label: '性别',
                        value: 'staffGender'
                    },
                    {
                        label: '中文职务',
                        value: 'staffChineseposition'
                    },
                    {
                        label: '联系电话',
                        value: 'staffMobilephone'
                    }
                ],
                columns: [
                    {
                        label: '人员编号',
                        prop: 'staffId',
                        visible: true,
                        disabled: true
                    },
                    {
                        label: '人员姓名',
                        prop: 'staffName',
                        visible: true,
                        disabled: true
                    },
                    {
                        label: '所属部门',
                        prop: 'teamId',
                        visible: false,
                        disabled: false
                    },
                    {
                        label: '部门名称',
                        prop: 'teamName',
                        visible: false,
                        disabled: false
                    },
                    {
                        label: '英文名称',
                        prop: 'staffEnglishName',
                        visible: false,
                        disabled: false
                    },
                    {
                        label: '身份证号',
                        prop: 'staffIdnumber',
                        visible: false,
                        disabled: false
                    },
                    {
                        label: '性别',
                        prop: 'staffGender',
                        visible: false,
                        disabled: false
                    }
                ],
                title: '单选--人员主文件设定',
                singleValue: true
            },
            materialConfig: {
                materials: [],
                filterType: 'matterId',
                filterConfig: ['matterId', 'matterBarno', 'matterName', 'matterSize', 'matterEnglishName'],
                option: [
                    {
                        label: '物料编号',
                        value: 'matterId'
                    },
                    {
                        label: '条形码编号',
                        value: 'matterBarno'
                    },
                    {
                        label: '物料名称',
                        value: 'matterName'
                    },
                    {
                        label: '规格型号',
                        value: 'matterSize'
                    },
                    {
                        label: '英文品名',
                        value: 'matterEnglishName'
                    }
                ],
                columns: [
                    {
                        label: '物料编号',
                        prop: 'matterId',
                        visible: true,
                        disabled: true
                    },
                    {
                        label: '物料名称',
                        prop: 'matterName',
                        visible: true,
                        disabled: true
                    },
                    {
                        label: '条形码编号',
                        prop: 'matterBarno',
                        visible: false,
                        disabled: false
                    },
                    {
                        label: '规格型号',
                        prop: 'matterSize',
                        visible: false,
                        disabled: false
                    },
                    {
                        label: '标准进价',
                        prop: 'matterStandardPrice',
                        visible: false,
                        disabled: false
                    }
                ],
                title: '多选--物料主文件设定',
                singleValue: false
            }
        };
    },
    methods: {
        handleCurrentChange() {

        },
        submitForm(formName) {
            this.$refs[formName].validate((valid) => {
                if (valid) {
                    alert('submit!');
                } else {
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
        },
        getLast() {
            getLast().then(resp => {
                this.purechaseReturn = resp.data;
                this.lineId = resp.data.lineId;
            }).catch(error => {
            });
        },
        getPrev() {
            getPrev(this.lineId).then(resp => {
                this.purechaseReturn = resp.data;
                this.lineId = resp.data.lineId;
            }).catch(error => {
            });
        },
        getNext() {
            getNext(this.lineId).then(resp => {
                this.purechaseReturn = resp.data;
                this.lineId = resp.data.lineId;
            }).catch(error => {
            })
        },
        getFirst() {
            getFirst().then(resp => {
                this.purechaseReturn = resp.data;
                this.lineId = resp.data.lineId;
            }).catch(error => {
            })
        },
        insertOrder() {
            this.orderStatus = orderStatusMeta.insert;
            this.emptyPurchaseReturnProp();
            this.getPureId();
        },
        saveOrder() {
            if (this.orderStatus === orderStatusMeta.insert) {
                // 新增
                this.purechaseReturn.pureAudition = 0;
                insertWithDetails(JSON.stringify(this.purechaseReturn)).then(resp => {
                    this.orderStatus = orderStatusMeta.save;
                }).catch(error => {

                });
            } else if (this.orderStatus === orderStatusMeta.edit) {
                // 修改
                updateWithDetails(JSON.stringify(this.purechaseReturn)).then(resp => {
                    this.orderStatus = orderStatusMeta.save;
                }).catch(error => {

                });
            }
        },
        editOrder() {
            this.orderStatus = orderStatusMeta.edit;
        },
        deleteOrder() {
            deleteWithDetails(this.purechaseReturn.pureId).then(resp => {
                this.orderStatus = orderStatusMeta.browse;
                this.getLast();
            }).catch(error => {

            });
            // deleteWithDetails(JSON.stringify(this.purechaseReturn));
        },
        resetOrder() {
            this.orderStatus = orderStatusMeta.reset;
        },
        refreshOrder() {
            this.orderStatus = orderStatusMeta.refresh;
        },
        reviewOrder() {
            this.orderStatus = orderStatusMeta.review;
            this.purechaseReturn.pureAudition = "1";

        },
        unReviewOrder() {
            this.purechaseReturn.pureAudition = "0";
            this.orderStatus = orderStatusMeta.unReview;
        },
        getPureId() {
            getPureId().then(resp => {
                this.purechaseReturn.pureId = resp.data;
                this.purechaseReturn.pureDocumentNumber = resp.data;
            }).catch(error => {
            });
        },
        emptyPurchaseReturnProp() {
            this.purechaseReturn = {
                pureId: "",
                supplierId: "",
                pureEngname: "",
                puretId: "",
                purePriceIncludeTax: '',
                warehouseId: "",
                pureSingleStatus: "",
                pureDocumentDate: "",
                pureDocumentNumber: "",
                currencyId: "",
                pureExchangeRate: "",
                pureForeignTrade: '',
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
                pureYn: "",
                details: []
            };
        },
        addDetailsRow() {
            this.purechaseReturn.details.push({
                matterId: "1",
                pureId: "",
                puredAuditing: "",
                puredBatchNumber: "",
                puredDocumentDate: "",
                puredDocumentNumber: "",
                puredEngname: "",
                puredId: "",
                puredIfgift: "",
                puredIncludingTaxAmount: "",
                puredInvoiceDetails: "",
                puredMoney: "",
                puredPrice: '',
                puredPriceIncludeTax: "",
                puredRemark: "",
                puredRemarks: "",
                puredSingleStatus: "",
                puredSourceNo: "",
                puredSourceOrder: "",
                puredTaxAmount: "",
                puredTaxRate: "",
                puredYn: "",
            });
        },
        handlerChangeColumnValue(prop, value, index, watch) {
            let currentItem = this.purechaseReturn.details[index];
            currentItem[prop] = value;
            if (!watch) {
                return;
            }
            // Math.floor(parseFloat(price*100 * quantity))/100;
            // 重新计算

            // 计算单价:折扣前单价*折数

            //----------------------------------
            // 折扣前单价
            //----------------------------------
            let beforeDiscountPrice = currentItem['puredDocumentDate'];

            //----------------------------------
            // 折数
            //----------------------------------
            let discount = currentItem['puredDocumentNumber'];

            //----------------------------------
            // 单价
            //----------------------------------
            let price = (beforeDiscountPrice * (discount / 100)).toFixed(2);

            // 计算金额:单价 * 数量

            //----------------------------------
            // 数量
            //----------------------------------
            let quantity = currentItem['puredSingleStatus'];

            //----------------------------------
            // 金额
            //----------------------------------
            let amount = ((price * 100 * quantity) / 100).toFixed(2);

            // 计算税额:金额 * 税率

            //----------------------------------
            // 税率
            //----------------------------------
            let taxRate = currentItem['puredTaxRate'];

            //----------------------------------
            // 税额
            //----------------------------------
            let taxAmount = (amount * (taxRate / 100)).toFixed(2);

            // 计算含税金额:金额 + 税额

            //----------------------------------
            // 含税金额
            //----------------------------------
            let includeTaxAmount = (parseFloat(amount) + parseFloat(taxAmount)).toFixed(2);
            //
            // console.log("折扣前单价" + beforeDiscountPrice);
            // console.log("折数" + discount);
            // console.log("单价" + price);
            // console.log("数量" + quantity);
            // console.log("金额"+amount);
            // console.log("税率" + taxRate);
            // console.log("税额" + taxAmount);
            // console.log("含税金额" + includeTaxAmount);
            //
            // console.log(this.purechaseReturn.details[index]);
            // console.log(this.purechaseReturn.details[index].puredPrice);
            this.purechaseReturn.details[index].puredPrice = price;
            this.purechaseReturn.details[index].puredMoney = amount;
            this.purechaseReturn.details[index].puredTaxAmount = taxAmount;
            this.purechaseReturn.details[index].puredIncludingTaxAmount = includeTaxAmount;
        }
    },
    created: function () {
        this.getLast();
    },
    watch: {
        orderStatus: function (newOrderStatus, originalOrderStatus) {
            this.edit = newOrderStatus !== 0 && newOrderStatus !== 7;
            if (!this.edit) {

            }
        }/*,
        'purechaseReturn.details': {
            handler(newValue, originalValue) {
                if (!originalValue) {
                    return;
                }
                console.log("handlerChange");
                this.watchKey.forEach((value, index, array) => {
                    console.log(value);
                });
            },
            deep: true
        }*/
    }
});