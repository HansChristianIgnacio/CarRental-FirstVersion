# CarRental-NW1J-CTCC0323
### Ignacio, Hans Christian S.
### Leonida, Ramner M.

# How to use the code
Rename the vscode folder to .vscode to ensure proper functionality.

**MAKE SURE THAT THE mysql-connector-j-8.4.0.jar FILEPATH ARE CORRECTLY ENCODED IN "\COMPROG2 Finals \ .vscode\settings.json"**

Check if the version of your MYSQL is same to your mysql-connector

**I am using vscode for Java IDE**
**MySQL and SQLYOG for database**

RUN THIS IN SQLYOG:

### Query1:
CREATE DATABASE car_rental;

### Query2:
CREATE TABLE customers(
customer_id INT PRIMARY KEY AUTO_INCREMENT,
lname VARCHAR(50),
fname VARCHAR(50),
minitial VARCHAR(50),
age VARCHAR(50),
email VARCHAR(100) UNIQUE,
contact_no VARCHAR(50) UNIQUE,
username VARCHAR(50) UNIQUE,
pass VARCHAR(50),
signup_date DATETIME);

### Query3: 
CREATE TABLE car_types(
car_id INT PRIMARY KEY AUTO_INCREMENT,
car_name VARCHAR(50),
car_type VARCHAR(50),
price INT,
max_passengers INT,
maxlarge_bags INT,
maxsmall_bags INT,
doors INT,
air_conditioned VARCHAR(50)
);

### Query4:
INSERT INTO car_types(car_name, car_type, price, max_passengers, maxlarge_bags, maxsmall_bags, doors, air_conditioned)
VALUES ('Toyota Yaris', 'Economy Car', 1500, 5, 1, 2, 4, 'NO'),
('Hyundai Accent', 'Economy Car', 2000, 5, 1, 3, 4, 'YES'),
('Chevrolet Impala', 'Full-sized Car', 3000, 5, 4, 8, 4, 'YES'),
('Ford Taurus', 'Full-sized Car', 3500, 5, 5, 10, 4, 'YES'),
('Honda Odyssey', 'Van', 4500, 8, 6, 12, 4, 'YES'),
('Ford Transit', 'Van', 5000, 12, 8, 16, 5, 'YES');

Query5:
CREATE TABLE transactions(
transac_id INT  AUTO_INCREMENT PRIMARY KEY,
customer_id INT,
car_id INT,
loc VARCHAR(50),
rent_date DATE,
return_date DATE,
total_amount DECIMAL(10,2),
payment_method VARCHAR(50),
transac_status VARCHAR(50),
transac_date DATETIME,
FOREIGN KEY(customer_id) REFERENCES customers(customer_id),
FOREIGN KEY(car_id) REFERENCES car_types(car_id));

## Make the following changes to the Java file by replacing "username" and "password" with the appropriate credentials for your database before running the GUI.
Search for the "Connection con" in each Java file and update the "root" to your MySQL username and the "hansignacio" to your MySQL password.
### NOTE: All of the Java files contain "Connection con," while only PaymentMethod.java does not have it, some files have two
## Sign up an account first to be able to use the GUI
Run either loginForm.java and click sign-up or signupForm.java
