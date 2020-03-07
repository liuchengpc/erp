import rest from "../config/rest-config.js"

export function getAllSupplier() {
    return rest({
        url: 'http://localhost:8080/SupplierController/selectAll',
        method: 'get'
    });
}