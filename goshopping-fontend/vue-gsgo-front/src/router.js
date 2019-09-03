import Vue from 'vue'
import Router from 'vue-router'
import Home from './views/Home.vue'

Vue.use(Router)

export default new Router({
  mode: 'history',
  base: process.env.BASE_URL,
  routes: [
    {
      path: '/',
      name: 'home',
      component: Home
    }
    ,{
      path: '/login',
      name: 'login',
      component: ()=> import('@/components/Login.vue')
    }
    ,{
      path: '/register',
      name: 'register',
      component: ()=> import('@/components/Register.vue')
    }
    ,{
      path: '/layout',
      name: 'layout',
      component: ()=> import('@/components/Layout.vue'),
      children:[
        {path:'usersm',name:'usersm',component: ()=> import('@/views/layout/management/UsersM.vue')},
        {path:'ordersm',name:'ordersm',component: ()=> import('@/views/layout/management/OrdersM.vue')},
        {path:'goodsm',name:'goodsm',component: ()=> import('@/views/layout/management/GoodsM.vue')},
        {path:'cardsm',name:'cardsm',component: ()=> import('@/views/layout/management/CardsM.vue')},
      ]
    }
  ]
})
