## Application Setup Guide

### Backend:

1. **Configure Environment Variables:**

   Create a file named `env.properties` in the backend project and set the following variables:

   ```properties
   DB_DATABASE=link to your database (e.g., jdbc:postgresql://localhost:5432/[Database name])
   DB_USER=Username of your database
   DB_PASSWORD=Password of your database
   SERVER_PORT=Port to expose (e.g., 8081 will expose http://localhost:8081)
   DB_DRIVER=Your relational database manager driver (e.g., org.postgresql.Driver for PostgreSQL or com.mysql.cj.jdbc.Driver for MySQL)

   
2. **Launch Clean Install via Gradle\:**

   Run the following command to perform a clean install:

   ```bash
   ./gradlew clean install

### Database:

1. **Apply Database Script\:**

   Depending on your relational database manager, apply the script found in the `rapport.zip` file.

   - For MySQL: Replace `aaaaaaa` with your database name.
  
### Frontend:

1. **Configure API Endpoint\:**

   Search for all instances of `http://localhost:` in the frontend project and replace the port with the one you set up in the `env.properties` file.

2. **Install Dependencies\:**

   Run the following command to install frontend dependencies:

   ```bash
   npm install```

3. **Start the WebApp\:**

   Run the following command to run the server for the webapp:

   ```bash
   npm start```

4. **Accessing the WebApp\:**

   Check the url provided by React in the terminal and paste it in the search bar of your browser (should be `http://localhost:3000`)


### Login:

To log in as a student, use the first name and the last name from the database as the username (`firstname_lastname`) and the password as the password.

Example:

- **Login:** Kelly_Brock
- **Password:** magna
