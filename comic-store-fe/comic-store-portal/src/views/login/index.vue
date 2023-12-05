<template>
<div class="login-wrapper">
    <div class="cs-header login-header">Comic Store Login</div>
    <div class="login-container">
        <el-form :model="form">
            <div class="full-width my-16">
                <el-form-item prop="username">
                    <el-input v-model="form.username" type="text" size="large" placeholder="Username"/>
                </el-form-item>
            </div>
            <div class="full-width my-16">
                <el-form-item prop="password">
                    <el-input v-model="form.password" type="password" size="large" placeholder="Password" show-password/>
                </el-form-item>
            </div>
            <div class="full-width my-16 d-flex justify-between align-center">
                <div class="ml-5 cs-sub-content" style="color: gray;">
                    Don't have an account? 
                    <a href="/register">Register now</a>
                </div>
                <el-button type="primary" style="width: 200px;">Login</el-button>
            </div>
        </el-form>
    </div>
</div>    
</template>

<script lang="ts" setup>
import {reactive} from 'vue'

const form = reactive({
    username: null,
    password: null
})
</script>

<style scoped>
    .login-wrapper {
        width: 100vw;
        height: 100vh;
        display: flex;
        flex-direction: column;
        justify-content: center;
        align-items: center;
        background-color: aliceblue;
    }

    .login-container {
        background-color: white;
        width: 450px;
        border: 1px solid var(--el-border-color);
        border-radius: var(--el-border-radius-small);
        padding: 16px;
    }

    .login-container >>> .el-input__wrapper {
        box-shadow: none;
        border-radius: 0;
        border-bottom: 1px
         solid var(--el-border-color);
    }

    .login-header {
        margin: 16px 0;
    }
</style>