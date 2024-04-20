# EASY NOTES

## Key features
***
### Tech News
#### News about bleeding-edge technologies
***
### Reminds on email
#### Flexible event reminds through email service
***
### Notes service
#### Allow you to store and manage your notes
***
### URL manager
#### Useful feature to store all your services and links in one place

***
### Authorization
#### Easy and simple authorization system for more flexibility
* * GitHub's authorization feature
* * Google's authorization feature
* * Built in authorization through the user system
***

### Supported database: PostgreSQL
## Project configuration
## Environment variables 
### FOR DATASOURCE
* DATASOURCE_URL = url for postgresql server
* DATASOURCE_USERNAME = database username
* DATASOURCE_PASSWORD = your user password
### FOR MAIL SENDER
* MAIL_HOST = your email provider host (example for google.com: smtp.gmail.com)
* MAIL_PORT = email host port (example for google.com: 587)
* MAIL_USERNAME = email username
* MAIL_PASSWORD = email password
### FOR OAUTH2
* GOOGLE_CLIENT_ID = client id for Google oauth2 authentication
* GOOGLE_CLIENT_SECRET = secret for Google oauth2 authentication
* GITHUB_CLIENT_ID = client id for GitHub oauth2 authentication
* GITHUB_CLIENT_SECRET = secret for GitHub oauth2 authentication

***
# FOR DEVELOPMENT

* Create application-dev.properties in src/main/resources/
###  ***and copy-past all below and change credentials for yours***
***
>spring.application.name=EasyNotes


>######## POSTGRES DATABASE CONFIGURATION #############\
#Using docker postgresql container through docker compose config file "compose.yaml"\
spring.datasource.driver-class-name=org.postgresql.Driver\
spring.datasource.url=jdbc:postgresql://localhost:32111/mydatabase\
spring.datasource.username=myuser\
spring.datasource.password=secret

>######## HIBERNATE CONFIGURATION ##################\
spring.jpa.hibernate.ddl-auto=none\
spring.jpa.properties.hibernate.hbm2ddl.auto=none

>######## LIQUIBASE CONFIGURATION ##################\
spring.liquibase.url=jdbc:postgresql://localhost:32111/mydatabase\
spring.liquibase.user=myuser\
spring.liquibase.password=secret

>######## VAADIN CONFIGURATION #####################\
spring.mustache.check-template-location = false\
#lounching browser\
vaadin.launch-browser = true\
vaadin.allowed-packages = com.vaadin,org.vaadin,dev.hilla,com.example.application\
vaadin.blocked-packages=com.simplenotes.model, com.simplenotes.model

>######## JAVA MAIL SENDER CONFIGURATION ############\
spring.mail.host=smtp.gmail.com\
spring.mail.port=587\
spring.mail.username=<login user to smtp server>\
spring.mail.password=<login password to smtp server>\
spring.mail.properties.mail.smtp.auth=true\
spring.mail.properties.mail.smtp.starttls.enable=true

>######## OAUTH2 CONFIGURATION #####################\
#configuration for Google auth\
#spring.security.oauth2.client.registration.google.client-id=\
#spring.security.oauth2.client.registration.google.client-secret=\
#configuration for GitHub auth\
#spring.security.oauth2.client.registration.github.client-id=\
#spring.security.oauth2.client.registration.github.client-secret=
***