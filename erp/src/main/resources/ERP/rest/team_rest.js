import rest from "../config/rest"

export function getAll() {
    return rest({
        url:"/TeamController/selectAll",
        method: "get"
    });
}