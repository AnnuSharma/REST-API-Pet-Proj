rm -rf /Users/annusharma/Documents/petProj/Backend/apache-tomcat-8.5.20/webapps/Backend
cp /Users/annusharma/Documents/petProj/Backend/build/libs/Backend.war /Users/annusharma/Documents/petProj/apache-tomcat-8.5.20/webapps/Backend.war
sh /Users/annusharma/Documents/petProj/apache-tomcat-8.5.20/bin/catalina.sh jpda start
