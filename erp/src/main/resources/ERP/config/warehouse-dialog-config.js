export function warehouseDialogConfig() {
    return {
        filterType: 'warehouseId',
        wareHouses: [],
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
        singleValue: true,
        dialogVisible:false
    }
}