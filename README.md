
# JDBC Project

This repository contains a basic project structure for working with JDBC (Java Database Connectivity) and implements a standard manual DAO (Data Access Object) pattern using JDBC. The project includes demos for retrieving, inserting, updating, and deleting data from a database, as well as working with transactions.

## Project Structure

The project follows a standard structure for a Java application:

- **src**: Contains the source code files.
  - **com.example.project**: Main package for the project.
    - **dao**: Contains the DAO interfaces and implementations.
      - **DepartmentDao.java**: Interface for Department data access operations.
      - **SellerDao.java**: Interface for Seller data access operations.
      - **SellerDaoJDBC.java**: Implementation of SellerDao using JDBC.
    - **db**: Contains classes related to the database connection.
      - **DB.java**: Provides utility methods for database operations.
      - **DbIntegrityException.java**: Custom exception for database integrity errors.
      - **DaoFactory.java**: Factory class for creating DAO instances.
    - **entities**: Contains entity classes representing database tables.
      - **Seller.java**: Entity class for Sellers.
    - **exceptions**: Contains custom exceptions used in the project.
    - **Program.java**: Main program class.

- **sql**: Contains SQL scripts for database setup.
  - **create_database.sql**: Script to create the "coursejdbc" database.

- **README.md**: This readme file.

## Getting Started

To get started with this project, follow the checklist below:

1. Use the `create_database.sql` script to create the "coursejdbc" database in your preferred database management system.

2. Run the small program to retrieve departments from the database.

3. In the `DB` class, there are static helper methods for closing `ResultSet` and `Statement` objects. Make sure to use these methods to properly release database resources.

## Demos

### Demo: Retrieving Data

The project includes a demo to retrieve department data from the database. This demo showcases the usage of JDBC APIs such as `Statement` and `ResultSet`.

### Demo: Inserting Data

The project includes a demo to insert data into the database. It demonstrates the usage of JDBC's `PreparedStatement`, `executeUpdate`, `Statement.RETURN_GENERATED_KEYS`, and `getGeneratedKeys` APIs.

### Demo: Updating Data

The project includes a demo to update data in the database. This demonstrates how to modify existing records using JDBC.

### Demo: Deleting Data

The project includes a demo to delete data from the database. This demonstrates how to remove records from the database using JDBC.

### Demo: Transactions

The project includes a demo for working with transactions. It shows how to manage transactional operations using JDBC's `setAutoCommit(false)`, `commit()`, and `rollback()` methods.

## Seller Entity Class

The `Seller` class is an entity class representing the Sellers table in the database. It contains properties and methods related to Sellers.

## DAO Interfaces and Implementations

The project provides DAO interfaces and their corresponding JDBC implementations:

- `DepartmentDao` interface: Defines methods for department-related data access operations.
- `SellerDao` interface: Defines methods for seller-related data access operations.

The implementations for these interfaces are located in the `SellerDaoJDBC` class.

## DepartmentDao Implementation and Test

The project includes an implementation of the `DepartmentDao` interface for working with department data. You can find the implementation in the `SellerDaoJDBC` class.

To test the `DepartmentDao` implementation, you can run the corresponding test cases.

## Contributing

Feel free to contribute to this project by submitting bug reports, feature requests, or pull requests. Your contributions are highly appreciated.

## License

This project is licensed under

 the [MIT License](LICENSE).