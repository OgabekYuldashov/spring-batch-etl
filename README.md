# About project

## Overview

This is a demo spring boot application implementing a simple ETL process using Spring Batch. The main process involves:
- Reading student information from a CSV file;
- Transforming "age" values into approximate birth dates;
- Writing to a MySQL database.

There is Authentication and Authorization in place using Spring Security. The project uses Docker.

## Available Endpoints
- `/` - home page. No authentication/authorization is required. Shows a table of students if any. 
- `/secured/load` - runs the batch process to transfer students information from the CSV file to the database. Requires "ADMIN" role

## Login credentials
Two users have been predefined:
- Admin
    - Username: admin
    - Password: admin
    - Role: ADMIN
- User
    - Username: user
    - Password: user
    - Role: USER
    
# Run the project
## Prerequisites
- Installed and running docker
- Installed and running docker-compose
- Project code
- Istalled maven `sudo apt install maven`

## Configure
1. Run terminal from the project root folder
2. Build project. Run command `mvn install`
    > It will create a `target` folder with a jar file to run
3. Run project in docker. Run command `docker-compose up`
    > - It will pull mysql and openjdk images to the local machine and run a mysql container;
    > - `start.sh` and `wait-for-it.sh` scripts will prevent the spring application from running until mysql is up an running
    > - `610109-spring-batch` application will start on PORT 8081

# Explore the project
1. Navigate to url http://localhost:8081 to access home page without Authentication
2. Click "Login" button and login as "ADMIN"
3. Perform the ETL operation by clicking "Load Students" button
4. Logout by clicking "Logout" button
5. Try to login as a "USER" and explore the limitation implemented

# Stop the project
1. Run the terminal in the project root folder
2. Stop project. Run `docker-compose down`
3. Remove installed image. Run command `docker rmi 610109-spring-batch -f`