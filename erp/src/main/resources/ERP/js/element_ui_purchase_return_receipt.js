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

import {
    currencyDialogConfig
} from "../config/current-dialog-config.js"
import {
    getAllCurrency
} from "../rest/currency_rest.js"

import {
    departmentDialogConfig
} from "../config/department-dialog-config.js"
import {
    getAllDepartment
} from "../rest/team_rest.js"

import {
    employeeDialogConfig
} from "../config/employee-dialog-config.js"
import {
    getAllEmployee
} from "../rest/employee_rest.js"

import {
    materialDialogConfig
} from "../config/material-dialog-config.js"
import {
    getAllMaterial
} from "../rest/material_rest.js"

import {
    projectDialogConfig
} from "../config/project-dialog-config.js"
import {
    getAllProject
} from "../rest/project_rest.js"

import {
    supplierDialogConfig
} from "../config/supplier-dialog-config.js"
import {
    getAllSupplier
} from "../rest/supplier_rest.js"

import {
    warehouseDialogConfig
} from "../config/warehouse-dialog-config.js"
import {
    getAllWarehouse
} from "../rest/warehouse_rest.js"

import {
    orderStatusConfig
} from "../config/orderStatusConfig.js"

let orderStatusMeta = orderStatusConfig();
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
            supplierDialogConfig: supplierDialogConfig(),
            warehouseDialogConfig: warehouseDialogConfig(),
            currencyDialogConfig: currencyDialogConfig(),
            projectDialogConfig: projectDialogConfig(),
            departmentDialogConfig: departmentDialogConfig(),
            employeeDialogConfig: employeeDialogConfig(),
            materialDialogConfig: materialDialogConfig()
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
        },
        getAllDepartment() {
            getAllDepartment().then(resp => {
                this.departmentDialogConfig.teams = resp.data;
            }).catch(error => {

            })
        },
        getAllEmployee() {
            getAllEmployee().then(resp => {
                this.employeeDialogConfig.employees = resp.data;
            }).catch(error => {

            });
        },
        getAllMaterial() {
            getAllMaterial().then(resp => {
                this.materialDialogConfig.materials = resp.data;
            }).catch(error => {

            })
        },
        getAllProject() {
            getAllProject().then(resp => {
                this.projectDialogConfig.projects = resp.data
            }).catch(error => {

            });
        },
        getAllSupplier() {
            getAllSupplier().then(resp => {
                this.supplierDialogConfig.suppliers = resp.data;
            }).catch(error => {

            })
        },
        getAllWarehouse() {
            getAllWarehouse().then(resp => {
                this.warehouseDialogConfig.wareHouses = resp.data;
            }).catch(error => {

            })
        }
    },
    created: function () {
        this.getLast();
        this.getAllDepartment();
        this.getAllEmployee();
        this.getAllMaterial();
        this.getAllProject();
        this.getAllSupplier();
        this.getAllWarehouse();
    },
    watch: {
        orderStatus: function (newOrderStatus, originalOrderStatus) {
            this.edit = newOrderStatus !== 0 && newOrderStatus !== 7;
            if (!this.edit) {

            }
        }
    }
});