import Layout from '@/layout/index.vue'
import Home from '@/views/home/index.vue'
import Category from '@/views/category/index.vue'
import Update from '@/views/update/index.vue'
import Ranking from '@/views/ranking/index.vue'
import {createRouter, createWebHistory} from 'vue-router'

const routes = [
    {
        path: '/',
        component: Layout,
        children: [
            {
                path: '/',
                component: Home
            },
            {
                path: '/category',
                component: Category
            },
            {
                path: '/update',
                component: Update
            },
            {
                path: '/ranking',
                component: Ranking
            }
        ]
    }
]

const router = createRouter({
    history: createWebHistory(),
    routes
})

export default router