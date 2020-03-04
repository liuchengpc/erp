import rest from "../config/rest-config.js"

export function getAllDepartment() {
    return rest({
        url:"http://localhost:8080/TeamController/selectAll",
        method: "get"
    });
}