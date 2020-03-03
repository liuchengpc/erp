Vue.component('retrieve-dialog', {
    template: `
        <div>
            <el-dialog :title="title" :visible.sync="dialogFormVisible">
                <el-row>
                    <el-col :span="24">
                        <el-form :inline="true" class="demo-form-inline">
                            <el-form-item>
                                <el-select v-model="filterType" @change="handleChange()">
                                    <el-option v-for="item in option"
                                               :key="item.value"
                                               :label="item.label"
                                               :value="item.value">
                                    </el-option>
                                </el-select>
                            </el-form-item>
                            <el-form-item>
                                <template>
                                    <el-input-number v-model="charLength" @change="handleChange" :min="1"
                                                     label="描述文字"></el-input-number>
                                </template>
                            </el-form-item>
                            <el-form-item>
                                <template>
                                    <!-- \`checked\` 为 true 或 false -->
                                    <el-checkbox v-model="check">备选项</el-checkbox>
                                </template>
                            </el-form-item>
                            <el-form-item>
                                <el-autocomplete
                                  class="inline-input"
                                  v-model="searchKeyWord"
                                  :fetch-suggestions="querySearch"
                                  placeholder="请输入内容"
                                  :trigger-on-focus="false"
                                  @select="handleSelect">
                                  <i slot="prefix" class="el-input__icon el-icon-search"></i>
                                  <template slot-scope="{ item }">
                                    <span class="name">{{ item.teamName }}</span>
                                    <span class="addr">{{ item.teamId }}</span>
                                  </template>
                                </el-autocomplete>
                            </el-form-item>
                            <el-form-item>
                                <el-button type="primary" @click="retrieve">取回</el-button>
                            </el-form-item>
                            <el-form-item>
                                <el-button type="primary" 
                                           :disabled="singleValue || selectedContent.length === startWithArray.length" 
                                           @click="selectAll">
                                           全选
                                </el-button>
                                <el-button type="primary" 
                                           :disabled="singleValue || !selectedContent.length" 
                                           @click="clearAll">
                                           全清
                               </el-button>
                                <el-button type="primary" :disabled="singleValue" @click="selectBelowAll">以下全选</el-button>
                                <el-button type="primary" :disabled="singleValue" @click="clearBelowAll">以下全清</el-button>
                                <el-button type="primary">新增记录</el-button>
                            </el-form-item>
                        </el-form>
                        <el-row style="margin-bottom: 22px;">
                            <el-col :span="5">
                                <template>
                                    <el-table
                                            ref="searchStringList"
                                            :data="filteredArray"
                                            highlight-current-row
                                            @cell-click="handleCurrentChange"
                                            tooltip-effect="dark"
                                            border
                                            style="width: 100%"
                                            height="193">
                                        <el-table-column
                                                label="---"
                                                prop="key">
                                        </el-table-column>
                                    </el-table>
                                </template>
                            </el-col>
                            <el-col :span="19">
                                <template>
                                    <el-table
                                            ref="searchResultTable"
                                            :data="startWithArray"
                                            border
                                            height="193"
                                            @selection-change="handleClick">
                                        <el-table-column type="selection"></el-table-column>
                                        <el-table-column v-for="item in visibleColumn"
                                                :label="item.label"
                                                :prop="item.prop"
                                                :key="item.prop">
                                        </el-table-column>
                                    </el-table>
                                </template>
                            </el-col>
                        </el-row>
                        <el-row>
                            <el-button type="primary" @click="dialogColumnVisible = true">显示字段设置</el-button>
                        </el-row>
                    </el-col>
                </el-row>
                <div slot="footer" class="dialog-footer">
                    <el-button @click="dialogFormVisible = false">取 消</el-button>
                    <el-button type="primary" @click="dialogFormVisible = false">确 定</el-button>
                    <el-button type="primary" @click="toggleSelectionFirst()">选中第一行</el-button>
                </div>
                <dialog-column :dialog-column-visible.sync="dialogColumnVisible"
                               :columns.sync="columns"
                               :visible-column.sync="visibleColumn"
                               @handlerVisibleColumnChange="handlerVisibleColumnChange"
                               @closeColumnDialo="closeColumnDialog">
                </dialog-column>
            </el-dialog>
        </div>
    `,
    props: ['data', 'filterConfig', 'option', 'columns', 'title', 'singleValue'],
    data() {
        return {
            dialogFormVisible: true,
            charLength: 1,
            check: true,
            searchKeyWord: '',
            filteredArray: [],
            startWithArray: [],
            selectedContent: {},
            filterType: '',
            visibleColumn: [],
            dialogColumnVisible: false,
            currentRow: {}
        };
    },
    methods: {
        handleChange(charLength) {
            this.filteredArray = [];
            let repeatArray = [];
            this.data.forEach((value, index, array) => {
                this.filterConfig.forEach((item) => {
                    if (this.filterType === item) {
                        repeatArray.push(value[this.filterType].substr(0, this.charLength));
                    }
                });
            });
            repeatArray = Array.from(new Set(repeatArray));
            repeatArray.forEach((value, index, array) => {
                this.filteredArray.push({key: value})
            });
            this.handleCurrentChange(this.filteredArray[0]);
            this.setCurrent('searchStringList', this.filteredArray[0]);
        },
        handleCurrentChange: function (searchString) {
            this.startWithArray = this.data.filter(value => {
                let bol;
                this.filterConfig.forEach(item => {
                    if (item === this.filterType) {
                        bol = value[this.filterType].startsWith(searchString.key);
                    }
                });
                return bol;
            });
        },
        handleClick(row, column, event) {
            this.selectedContent = row;
        },
        retrieve() {
            this.filterConfig.forEach((value, index, array) => {
                console.log(this.selectedContent[value]);
            });
        },
        querySearch(searchString, callback) {
            let data = this.data;
            let searchResult = searchString ? data.filter(this.matchSearchString(searchString)) : data;
            // console.log(searchResult.map(element => element[this.filterType]));
            // callback(searchResult.map(element => {return {value: element[this.filterType]}}));
            // console.log(searchResult);
            callback(searchResult);
        },
        matchSearchString(searchString) {
            return (element) => {
                return (element[this.filterType].toLowerCase().indexOf(searchString.toLowerCase()) !== -1);
            }
        },
        handleSelect(item) {
            this.filteredArray.forEach((value, index, array) => {
                if (item[this.filterType].indexOf(value['key']) !== -1) {
                    this.setCurrent('searchStringList', this.filteredArray[index]);
                    this.handleCurrentChange(this.filteredArray[index]);
                    this.startWithArray.forEach((element, i) => {
                        if (element === item) {
                            this.toggleSelection([this.startWithArray[i]]);
                        }
                    });
                }
            });
        },
        setCurrent(refName, row) {
            this.$refs[refName].setCurrentRow(row);
        },
        toggleSelection(rows){
            if(rows){
                rows.forEach(row => {
                    console.log(row);
                    this.$refs.searchResultTable.toggleRowSelection(row);
                });
            }else{
                this.$refs.searchResultTable.clearSelection();
            }
        },
        toggleSelectionFirst(){
            this.toggleSelection([this.startWithArray[0]]);
        },
        handlerVisibleColumnChange(changedVisibleColumn) {
            this.visibleColumn = changedVisibleColumn;
            this.closeColumnDialog(false);
        },
        closeColumnDialog(visible) {
            this.dialogColumnVisible = visible;
        },
        selectAll() {
            this.toggleSelection(this.startWithArray);
        },
        clearAll() {
            this.toggleSelection();
        },
        selectBelowAll() {
            this.toggleSelection(this.startWithArray.slice(this.startWithArray.indexOf(this.selectedContent[0])));
        },
        clearBelowAll() {

        }
    },
    created: function () {
        this.filterType = this.filterConfig[0];
        this.visibleColumn = this.columns.filter(element => {
            return element['visible'];
        });
    },
    mounted: function () {
        // this.handleChange();
    },
    components: {
        'dialog-column': {
            template: `
                <div>
                    <el-dialog title="" :visible.sync="dialogColumnVisible">
                        <el-row>
                            <el-col :span="24">
                                <el-transfer v-model="value"
                                             :data="columns"
                                             :props="{key: 'prop',label: 'label',disabled:'disabled'}"
                                             :titles="['隐藏字段','显示字段']">
                                </el-transfer>
                            </el-col>
                        </el-row>
                        <div slot="footer" class="dialog-footer">
                            <el-button type="primary" @click="handlerChange()">确 定</el-button>
                        </div>
                    </el-dialog>
                </div>
            `,
            props: ['columns', 'dialogColumnVisible', 'visibleColumn'],
            data() {
                return {
                    value: []
                };
            },
            methods: {
                handlerChange: function () {
                    let changedVisibleColumn = this.columns.filter(element => {
                        return this.value.indexOf(element['prop']) !== -1;
                    });
                    // this.$emit('closeColumnDialog',false);
                    this.$emit('handlerVisibleColumnChange', changedVisibleColumn);
                }
            },
            created: function () {
                this.visibleColumn.forEach(element => {
                    if (this.columns.indexOf(element) !== -1) {
                        this.value.push(element['prop']);
                    }
                });
            }
        }
    }
});