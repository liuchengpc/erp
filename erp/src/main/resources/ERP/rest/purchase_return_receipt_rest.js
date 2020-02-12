import rest from "../config/rest"

export function getPage(params) {
    return rest({
        url:"Purchase_returnsController/selectAllpage",
        method:"get",
        params: params
    });
}