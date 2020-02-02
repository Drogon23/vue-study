<template>
    <div>
        <span v-bind:title="message">
    내 위에 잠시 마우스를 올리면 동적으로 바인딩 된 title을 볼 수 있습니다!
  </span>

    </div>
</template>

<script>

    import axios from "axios";

    export default {
        name: "Message",
        created() {
            axios.get('http://localhost:8081/test')
                .then(res => {
                    this.message = res.data
                })

        },
        data() {
            return  {
                message: 'Hello world '
            }
        }
    }
</script>

<style scoped>

</style>