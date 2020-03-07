import rest from "../config/rest-config.js"

export function getAllMaterial() {
    return rest({
        url:'http://localhost:8080/wdMatterController/selectAll',
        method:'get'
    })
}