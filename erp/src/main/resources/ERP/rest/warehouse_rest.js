import rest from "../config/rest-config.js"

export function getAll() {
    return rest({
        url:'http://localhost:8080/WarehouseController/selectAll',
        method:'get'
    })
}