<template>
<div class="d-flex align-center nav-right-scope">
   <el-dropdown>
      <template #default>
         <el-button text size="small">
            <div class="d-flex cs-content">
               <div class="mdi mdi-translate"></div>
               <div class="mdi mdi-chevron-down"></div>
            </div>
         </el-button>
      </template>
      <template #dropdown>
         <el-dropdown-menu>
            <el-dropdown-item>English</el-dropdown-item>
            <el-dropdown-item>简体中文</el-dropdown-item>
         </el-dropdown-menu>
      </template>
   </el-dropdown>
   <el-divider direction="vertical"/>
   <el-button ref="toggleBtnRef" size="small" text :icon="skinBtnIcon" class="cs-content" @click="handleToggleSkin()"></el-button>
   <el-divider direction="vertical"/>
   <el-button text @click="router.push('/login')">Login</el-button>
   <el-divider direction="vertical"/>
   <el-button text @click="router.push('/register')">Register</el-button>
</div>    
</template>

<script setup>
import { useGlobalStore } from '@/stores/modules/global';
import {Sunny, Moon} from '@element-plus/icons-vue'
import {computed, ref} from 'vue'
import {useRouter} from 'vue-router'

const router = useRouter()
const toggleBtnRef = ref()

const globalStore = useGlobalStore()

const skinBtnIcon = computed(() => {
   if (globalStore.skinMode === 'LIGHT') {
      return Sunny
   } else {
      return Moon
   }
})

const handleToggleSkin = () => {
   globalStore.toggleSkinMode()
   toggleBtnRef.value.ref.blur()
}

</script>