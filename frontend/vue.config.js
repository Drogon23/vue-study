module.exports = {
    devServer: {
        port: 8081,
        proxy: {
            '^/test': {
                target: 'http://localhost:8080',
                changeOrigin: true
            },
        }
    }
}