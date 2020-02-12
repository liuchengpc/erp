/*
* ret-config.js
* author:dev-shaw
* data:2020-2-10 22:35:26
* */
import axios from "js/axios"
let rest = axios.create({
    baseUrl: "http://localhost:8080/",
    timeout: 5000
});
// 请求拦击
rest.interceptors.request.use(requestMeta => {
    return requestMeta;
});

// 响应拦截
rest.interceptors.response.use(responseMeta => {
    return responseMeta;
});
export default rest;