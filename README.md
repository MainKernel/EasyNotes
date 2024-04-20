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