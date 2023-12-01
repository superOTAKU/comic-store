<template>
<div class="app-container">
    <app-header></app-header>
    <div class="app-main">
        <router-view/>
    </div>
    <app-footer></app-footer>
</div>
</template>

<script setup>
import AppHeader from './header/index.vue'
import AppFooter from './footer/index.vue'
</script>

<style>
.app-container {
    display: flex;
    flex-direction: column;
    flex: auto;
    min-height: 100vh;
}

.app-main {
    margin-top: 61px;
    flex-grow: 1;
}

</style>