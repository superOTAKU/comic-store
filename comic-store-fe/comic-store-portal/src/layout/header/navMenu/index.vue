<template>
<div class="nav-menu-wrapper">
    <el-menu mode="horizontal" :router="true">
        <el-menu-item v-for="(item, i) in menus" :route="item.path" :index="i + ''">{{ item.title }}</el-menu-item>
    </el-menu>
</div>
</template>

<script setup>
const menus = [
    {
        path: '/',
        title: 'Home'
    },
    {
        path: '/category',
        title: 'Category'
    },
    {
        path: '/update',
        title: 'Update'
    },
    {
        path: '/ranking',
        title: 'Ranking'
    }
]
</script>

<style scoped>
.nav-menu-wrapper >>> .el-menu--horizontal.el-menu {
    border-bottom: none !important;
}
.nav-menu-wrapper >>> .el-menu--horizontal .el-menu-item:not(.is-disabled):hover {
    background-color: white !important;
}
</style>