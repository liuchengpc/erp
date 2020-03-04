export function employeeDialogConfig() {
    return {
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
        singleValue: true,
        dialogVisible:false
    }
}