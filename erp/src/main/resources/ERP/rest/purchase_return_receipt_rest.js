import rest from "../config/rest-config.js"

export function getPage(params) {
    return rest({
        url: "Purchase_returnsController/selectAllpage",
        method: "get",
        params: params
    });
}

export function getLast() {
    return rest({
        url: "http://localhost:8080/Purchase_returnsController/selectLast",
        method: "get"
    });
}

export function getPrev(lineId) {
    return rest({
        url: "http://localhost:8080/Purchase_returnsController/selectPrev",
        method: "get",
        params: {
            lineId: lineId
        }
    });
}

export function getNext(lineId) {
    return rest({
        url: "http://localhost:8080/Purchase_returnsController/selectNext",
        method: "get",
        params: {
            lineId: lineId
        }
    })
}

export function getFirst() {
    return rest({
        url: "http://localhost:8080/Purchase_returnsController/selectFirst",
        method: "get"
    });
}

export function getPureId() {
    return rest({
        url: "http://localhost:8080/Purchase_returnsController/selectPureId",
        method: "get"
    });
}

export function insertPure() {
    return rest({
        url: "",
        method: "post"
    })
}

export function updatePure() {
    return rest({
        url: "",
        method: "put"
    })
}

export function deletePure() {
    return rest({
        url: "",
        method: "delete"
    });
}