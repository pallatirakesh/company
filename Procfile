heroku ps:scale web=1
web: java $JAVA_OPTS -jar server/jetty-runner.jar --port $PORT target/*.war
