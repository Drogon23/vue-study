<template>
    <div>
        <h1> {{ message }} </h1>
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