<template>
<div class="nav-wrapper">
    <div class="nav-inner">
        <div class="nav-left">
            <el-image fit="cover" style="height: 100%;" :src="LogoImg"/>
            <span class="ml-10 cs-header">Comic Store</span>
        </div>
        <div class="nav-menu">
            <nav-menu/>
        </div>
        <div class="nav-right">
            <nav-right/>
        </div>
    </div>
</div>
</template>

<script setup>
import LogoImg from '@/assets/logo.svg'
import NavMenu from './navMenu/index.vue'
import NavRight from './navRight/index.vue'
</script>

<style scoped>
.nav-wrapper {
    width: 100%;
    height: 60px;
    display: flex;
    align-items: center;
    position: fixed;
    background-color: var(--el-background-color);
    border-bottom: 1px solid var(--el-border-color);
}

.nav-inner {
    min-width: 1200px;
    margin: 0 auto;
    display: flex;
    align-items: center;
}

.nav-left {
    display: flex;
    align-items: center;
}

.nav-menu {
    margin-left: 16px;
    flex-grow: 1;
}
</style>