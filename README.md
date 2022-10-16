# one-to-many-mapping

Problem Statement :

 Design a web app ( backend only) using the spring boot application.
 Requirements are as below-
 
 1. Use the H2 database for persistence storage
 
 2. Create tables as below:  a. User Table   i. First Name   ii. Last name   iii. Email address   iv. phone number 
    b. Email Table   i. From   ii. To   iii. Subject   iv. Body
    
 3. Create Below rest Endpoints  POST /user ( Creates a new user)  GET /users ( Returns list of users)  GET /user/{id} (Return user by id) 
    POST /email (Create an email in DB)  GET /emails/count?user={userID} (Returns number of email send by a user) 
 
 4. Add appropriate unit and integration test .
 
 Answer:
 
 I have used OnetoMany relationship such that User contains list of emails sent .
 
 First add users and then add email , it will automatically add the emails in the list of the particular user.
 
 In a separate table user_id and e_id are present which will represent one to many mapping and the solution to the
 problem statement.
 
 
# Screenshots:
 
 ![image](https://user-images.githubusercontent.com/113827619/196053238-ed6bd4e5-43d0-490b-987e-fe271b7ac171.png)



![image](https://user-images.githubusercontent.com/113827619/196053375-b51a3c0f-21df-435a-8741-37affdfef2bb.png)


![image](https://user-images.githubusercontent.com/113827619/196053422-e02f551f-5fc0-450b-bc85-4104235e7eca.png)


![image](https://user-images.githubusercontent.com/113827619/196053440-e8a4ece0-c88f-49ae-a9c6-8e39fdb8f186.png)

![image](https://user-images.githubusercontent.com/113827619/196055547-8578c967-50c5-4fb5-a84a-542eb0feeeec.png)


# HOW TO EXECUTE:
-Download the maven project from git
-open project in IDE
-run the springbootapplication annotated class
-use the url mappings from the controller in a 
 client to check different functionalities.
 
 Thank You
