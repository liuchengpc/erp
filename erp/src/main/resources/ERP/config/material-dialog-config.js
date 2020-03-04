export function materialDialogConfig() {
    return {
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
        singleValue: false,
        dialogVisible:false
    }
}
