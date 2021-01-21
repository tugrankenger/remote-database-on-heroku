# remote-database-on-heroku
Remote database on heroku with spring boot


Go to ```https://elements.heroku.com/ ``` for add a remote database and select ClearDB MySQL then click the Install ClearDB MySQL.

* You will have a connection address like the one below:

![Slayt1](https://user-images.githubusercontent.com/56650527/105412070-4381a200-5c45-11eb-9dd3-d8b62a3b3248.PNG)

* Then you can set the application.properties file as follows:

![mysql_application_properties](https://user-images.githubusercontent.com/56650527/105412403-bdb22680-5c45-11eb-8764-65299a3240a1.png)

* Next, open MySQL Workbench and add something:

![mysql_insert_values](https://user-images.githubusercontent.com/56650527/105412904-682a4980-5c46-11eb-9ab8-91ba3260efff.png)

* As a result, our application is working localhost and on heroku 

![localhost](https://user-images.githubusercontent.com/56650527/105413325-01596000-5c47-11eb-902b-655cdc09af31.png)
