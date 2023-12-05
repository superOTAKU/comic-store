<template>
<div class="register-wrapper">
    <div class="cs-header register-header">Comic Store Register</div>
    <div class="register-container">
        <el-form :model="form">
            <div class="full-width my-16">
                <el-form-item prop="username">
                    <el-input v-model="form.username" type="text" size="large" placeholder="Username"/>
                </el-form-item>
            </div>
            <div class="full-width my-16">
                <el-form-item prop="password">
                    <el-input v-model="form.password" type="text" size="large" placeholder="Password" show-password/>
                </el-form-item>
            </div>
            <div class="full-width my-16">
                <el-form-item prop="passwordAgain">
                    <el-input v-model="form.passwordAgain" type="text" size="large" placeholder="Password Again" show-password/>
                </el-form-item>
            </div>
            <div class="full-width my-16 d-flex justify-between align-center">
                <div class="ml-5 cs-sub-content" style="color: gray;">
                    Already have an account? 
                    <a href="/login">Login now</a>
                </div>
                <el-button type="primary" style="width: 200px;">Register</el-button>
            </div>
        </el-form>
    </div>
</div>    
</template>

<script lang="ts" setup>
import {reactive} from 'vue'

const form = reactive({
    username: null,
    password: null,
    passwordAgain: null
})
</script>

<style scoped>
    .register-wrapper {
        width: 100vw;
        height: 100vh;
        display: flex;
        flex-direction: column;
        justify-content: center;
        align-items: center;
        background-color: aliceblue;
    }

    .register-container {
        background-color: white;
        width: 450px;
        border: 1px solid var(--el-border-color);
        border-radius: var(--el-border-radius-small);
        padding: 16px;
    }

    .register-container >>> .el-input__wrapper {
        box-shadow: none;
        border-radius: 0;
        border-bottom: 1px
         solid var(--el-border-color);
    }

    .register-header {
        margin: 16px 0;
    }
</style>