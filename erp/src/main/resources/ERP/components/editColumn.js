Vue.component('editColumn', {
    template: `
        <div @click.self="handlerClick()" style="min-height: 23px">
            <span v-show="show">{{childData}}</span>
            <el-input v-show="!show" 
                v-focus
                v-model="childData" 
                @blur="handlerBlur()" 
                @keyup.enter.native="handlerEnter()"
                ref="input">    
            </el-input>
        </div>
    `,
    props: ['data','prop','index','edit'],
    data(){
        return {
            show: true,
            childData: '',
            watch: false,
            watchKey: ['puredSingleStatus', 'puredDocumentDate', 'puredDocumentNumber', 'puredPrice', 'puredTaxRate']
        };
    },
    methods: {
        handlerClick(){
            this.show = this.edit;
            this.$refs.input.focus();
        },
        handlerEnter(){
            this.show = !this.show;
            this.$emit("handler-change", this.prop, this.childData, this.index, this.watch);
        },
        handlerBlur(){
            this.handlerEnter();
        }
    },
    created: function () {
        this.childData = this.data;
    },
    watch: {
        childData: function (newValue, originalValue) {
            this.watchKey.forEach((value, index, array) => {
                if(value === this.prop) {
                    this.watch = true;
                }
            });
        },
        data: function (newValue,originalValue) {
            this.childData = newValue;
        }
    }
});