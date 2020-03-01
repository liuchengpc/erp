Vue.component('editColumn', {
    template: `
        <div @click.self="handlerClick()" style="min-height: 23px">
            <span v-show="show">{{childData}}</span>
            <el-input v-show="!show" v-focus v-model="childData" @keyup.enter.native="handlerEnter()"></el-input>
        </div>
    `,
    props: ['data','prop','index'],
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
            this.show = !this.show;
        },
        handlerEnter(){
            this.show = !this.show;
            this.$emit("handler-change", this.prop, this.childData, this.index, this.watch);
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
        }
    }
});