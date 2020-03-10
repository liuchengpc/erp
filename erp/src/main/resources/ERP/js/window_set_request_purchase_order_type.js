import {
    getAll
} from '../rest/team_rest.js'

let vm = new Vue({
    el: "#app",
    data: function () {
        return {
            teams: [],
            charLength: 0,
            filteredArray: [],
            startWithArray: [],
            filterType: 'teamId'
        }
    },
    methods: {
        getAll() {
            getAll().then(resp => {
                this.teams = resp.data;
            }).catch(error => {
                console.log(error);
            });
        },
        charLengthAdd() {
            this.charLength = this.charLength + 1;
        },
        charLengthMinute() {
            if (this.charLength === 0) {
                return;
            }
            this.charLength = this.charLength - 1;
        },
        showWithStartArray(searchString) {
            this.startWithArray = this.teams.filter(value => {
                return value['teamId'].startsWith(searchString);
            });
        }
    },
    created: function () {
        this.getAll();
    },
    watch: {
        charLength: function (newValue, originalValue) {
            let repeatArray = [];
            this.teams.forEach(function (value, index, array) {
                repeatArray.push(value['teamId'].substr(0, newValue));
            });
            this.filteredArray = Array.from(new Set(repeatArray));
        }
    }
});