FROM tomcat:10
WORKDIR /app
COPY /target/orchestration-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/ROOT.war
EXPOSE 8080
ENTRYPOINT ["/bin/bash", "/usr/local/tomcat/bin/catalina.sh", "run"]