import rest from '../config/rest-config.js'

export function getPage(params) {
    return rest({
        url: "Purchase_returnsController/selectAllpage",
        method: "get",
        params: params
    });
}

export function getLast() {
    return rest({
        url: "http://localhost:8080/Purchase_storageController/selectLast",
        method: "get"
    });
}


export function getPrev(lineId) {
    return rest({
        url: "http://localhost:8080/Purchase_storageController/selectPrev",
        method: "get",
        params: {
            lineId: lineId
        }
    });
}

export function getNext(lineId) {
    return rest({
        url: "http://localhost:8080/Purchase_storageController/selectNext",
        method: "get",
        params: {
            lineId: lineId
        }
    })
}

export function getFirst() {
    return rest({
        url: "http://localhost:8080/Purchase_storageController/selectFirst",
        method: "get"
    });
}

export function getPureId() {
    return rest({
        url: "http://localhost:8080/Purchase_storageController/selectPureId",
        method: "get"
    });
}

export function insertWithDetails(data) {
    console.log(typeof data);
    return rest({
        url: "http://localhost:8080/Purchase_storageController/insertWithDetails",
        method: "post",
        data: data,
        headers:{
            'Content-Type': 'application/json'
        }
    })
}