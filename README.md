# Retailmanager
requirement: 
java 1.8 
Maven 3.3+

STEPS:
i Copy project and to local disc
ii open cmd prompt and navigate to project location
iii run command: mvn spring-boot:run
iv Test with postman:
    -for adding shop: issue below url with json data(attached in shopList-Sample-Json.txt) 
URL http://localhost:8080/addShops

- To find nearest adresses issue below url by changing lat/lon for different location
URL http://localhost:8080/findShops?currentLat=32.2030373&currentLon=-98.2097649

For running in STS:
import existing project in sts and run as spring boot application
