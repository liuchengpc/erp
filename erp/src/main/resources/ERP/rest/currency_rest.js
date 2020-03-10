import rest from "../config/rest-config.js"

export function getAllCurrency() {
    return rest({
        url:'http://localhost:8080/CurrencyController/selectAll',
        method:'get'
    })
}