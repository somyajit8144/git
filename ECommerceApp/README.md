# E-Commerce Web Application

## Overview
A Java-based e-commerce platform using JSP, Servlets, JDBC, and MySQL.

## Features
- User registration and login
- Product catalog with search and filters
- Shopping cart with add/update/remove
- Checkout and order tracking
- Admin dashboard for managing products and orders

## Technologies
- JSP, Servlets
- JDBC for database interaction
- MySQL for data storage
- Apache Tomcat for deployment

## Setup Instructions
1. Import the `ecommerce.sql` into MySQL.
2. Update `DBConnection.java` with your database credentials.
3. Place the project in the `webapps` folder of Tomcat.
4. Add `mysql-connector-java.jar` in `WEB-INF/lib/`.
5. Deploy and access via `http://localhost:8080/ECommerceApp`.

## Future Enhancements
- Real payment integration
- Shipping API
- Recommendation system
