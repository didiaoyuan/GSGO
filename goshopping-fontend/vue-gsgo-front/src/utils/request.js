// 统一访问请求配置

import axios from 'axios'

// 创建axios 实例
const user_service = axios.create({
    baseURL:'http://localhost:8003',
    timeout:5000
})

// 前端拦截器

// request拦截器
user_service.interceptors.request.use(config=>{
    console.log("请求拦截")
    return config
},error=>{
    return Promise.reject(error);
})


// response拦截器
user_service.interceptors.response.use(
    response=>{
    console.log("请求拦截")
    return response
},error=>{
    return Promise.reject(error.response.data);
})

export default user_service
