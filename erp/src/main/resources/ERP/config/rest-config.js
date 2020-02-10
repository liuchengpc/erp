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