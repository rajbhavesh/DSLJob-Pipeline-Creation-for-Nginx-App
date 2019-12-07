pipelineJob('Job-NginxAppCreation') {
     description('This is the job for creating a Pipeline Job for Simple Nginx based application Deployment.')
    definition {
        cpsScm {
            scm {
                git('https://github.com/rajbhavesh/linux_tweet_app.git', 'master')
            }
            scriptPath('jenkinsfile')
        }
    }
}
