export function supplierDialogConfig() {
    return {
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
        singleValue: true,
        dialogVisible:false
    }
}