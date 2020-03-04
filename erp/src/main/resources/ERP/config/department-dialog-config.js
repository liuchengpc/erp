export function departmentDialogConfig() {
    return {
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
        singleValue: true,
        dialogVisible: false
    }
}