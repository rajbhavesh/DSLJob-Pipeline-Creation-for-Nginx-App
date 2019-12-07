pipelineJob('Job-NginxAppCreation') {
     description('This is the job for creating a single node kubernetes cluster.')
    definition {
        cpsScm {
            scm {
                git('https://github.com/rajbhavesh/linux_tweet_app.git', 'master')
            }
            scriptPath('jenkinsfile')
        }
    }
}
