<template>
    <div>
        <v-text-field 
        v-modal="varName"
        label="Email Address"
        placeholder="khushi@gmail.com"
        type="text"
        >
    </v-text-field>
    {{ varName }}
    </div>
</template>
<script lang="ts" setup>
import { onBeforeMount, onMounted, ref } from 'vue';

const props = withDefaults(defineProps<{
    title: string;
    count?: number;
}>(), {
    count: 0
});

const varName = ref<string>('Empty');
onMounted(() => {
    console.log('title onMounted ---->', props.title)
    varName.value = props.title;
});
onBeforeMount(() => {
    console.log('title onBeforeMount ---->', props.title)
});

const clickHere = (newTitle:string = '') => {
    console.log(newTitle)
    varName.value = newTitle
}
</script>

<!-- {{ props.title }}
        {{ count }}
        <input v-modal="varName">
        {{ varName }} -->
        <!-- {{ '------' }} -->
       <!-- <button @click="clickHere('EP New Title')">CLICK HERE</button>
        <label for="name">Enter Your name:</label>
        <input 
        v-modal="varName"
        type="text"
        @change="(event) => {
        console.log('event ----', event)
        }"
        >
        <p>Hello, {{ varName }}!</p> -->