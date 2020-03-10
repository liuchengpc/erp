export function currencyDialogConfig() {
    return {
        filterType: 'currencyId',
        currencies: [],
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
        singleValue: true,
        dialogVisible:false
    }
}