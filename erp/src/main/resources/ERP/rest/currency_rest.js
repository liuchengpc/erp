import rest from "../config/rest-config.js"

export function getAll() {
    return rest({
        url:'http://localhost:8080/CurrencyController/selectAll',
        method:'get'
    })
}