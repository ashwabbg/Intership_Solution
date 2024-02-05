To launch the application :

Backend:
Set up your variable in the env.properties 
  DB_DATABASE= link to your database (ex: jdbc:postgresql://localhost:5432/[Database name])
  DB_USER= Username of your database
  DB_PASSWORD= Password of your database
  SERVER_PORT= port you want to expose (ex: 8081 will expose http://localhost:8081)
  DB_DRIVER= your relational database manager driver (ex: org.postgresql.Driver for Postgresql or com.mysql.cj.jdbc.Driver for MYSQL)

Launch a clean install via Gradle

Database:
Apply the script found in the rapport.zip file depending on your relational database manager.
MYSQL Script: replace aaaaaaa by your database name

Frontend:
search for all instances of http://localhost: and replace the port with the one you just set up in the env.properties.
Run ''npm i''
Run ''npm start'' 

Login:
To login as a student take the first name and the last name from the database as the username (firstname_lastname) and the password as the password
exemple : Login - Kelly_Brock
          Password - magna.
