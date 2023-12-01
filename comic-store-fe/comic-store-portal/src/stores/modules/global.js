import { defineStore } from "pinia"
import { ref } from "vue"

export const useGlobalStore = defineStore('global', () => {
    const skinMode = ref('LIGHT')
    const toggleSkinMode = () => {
        if (skinMode.value === 'LIGHT') {
            skinMode.value = 'DARK'
        } else {
            skinMode.value = 'LIGHT'
        }
    }

    return {
        skinMode,
        toggleSkinMode
    }
})