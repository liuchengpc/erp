export function storeDialogConfig() {
    return {
        filterType: 'psDocumentNumber',
        stores: [],
        option: [
            {
                label: '单据号码',
                value: 'psDocumentNumber'
            },
            {
                label: '单据日期',
                value: 'psDocumentDate'
            },
            {
                label: '总数量',
                value: 'psSunnum'
            },
            {
                label: '所属部门',
                value: 'psBelongsSection'
            }
        ],
        columns: [
            {
                label: '单据号码',
                prop: 'psDocumentNumber',
                visible: true,
                disabled: true
            },
            {
                label: '单据日期',
                prop: 'psDocumentDate',
                visible: true,
                disabled: true
            },
            {
                label: '数量合计',
                prop: 'psSunnum',
                visible: false,
                disabled: false
            },
            {
                label: '总金额',
                prop: 'psSunmoney',
                visible: false,
                disabled: false
            },
            {
                label: '送货地址',
                prop: 'psDeliveryAddress',
                visible: false,
                disabled: false
            }
        ],
        title:'单选--采购入库单',
        singleValue: true,
        dialogVisible: false
    }
}