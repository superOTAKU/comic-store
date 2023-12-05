import { createApp } from 'vue'
import ElementPlus from 'element-plus'
import 'element-plus/dist/index.css'
import './styles/common.scss'
import './styles/element.scss'
import './styles/theme/light.scss'
import './styles/theme/dark.scss'
import '@mdi/font/css/materialdesignicons.css';
import 'element-plus/theme-chalk/dark/css-vars.css'
import App from './App.vue'
import router from './router'
import stores from './stores'
createApp(App)
.use(ElementPlus)
.use(router)
.use(stores)
.mount('#app')
