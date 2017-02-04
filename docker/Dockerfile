FROM java:openjdk-8-jdk
ADD DEMS-all.jar /app/DEMS-all.jar
ADD config.yml /app/config.yml

CMD java -jar /app/DEMS-all.jar server /app/config.yml

EXPOSE 8080
EXPOSE 8081