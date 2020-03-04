export function projectDialogConfig() {
    return {
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
        singleValue: true,
        dialogVisible:false
    }
}