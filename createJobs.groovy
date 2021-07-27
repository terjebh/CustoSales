pipelineJob('CustoSales-jobb') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/terjebh/CustoSales.git'
                    }
                    branch 'master'
                }
            }
        }
    }
}