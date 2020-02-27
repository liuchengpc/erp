let rest = axios.create({
    baseUrl: "http://localhost:8080/",
    timeout: 5000
});

rest.interceptors.request.use(requestMeta => {
    return requestMeta;
});

rest.interceptors.response.use(responseMeta => {
    return responseMeta;
});
export default rest;