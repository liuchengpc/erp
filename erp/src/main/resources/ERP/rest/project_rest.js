import rest from "../config/rest-config.js"

export function getAllProject() {
    return rest({
        url:'http://localhost:8080/ProjectController/selectAll',
        method:'get'
    })
}