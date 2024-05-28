Q1] Design a java application to demonstrate the use of Core Java fundamentals: 
a) Constructor       b) Inheritance               c) Polymorphism

a] Constructor:
Source Code:

public class ass1 {
    String firstname,lastname;
    int age;
    public ass1() {   //default
        firstname="vishwakarma";
        lastname="university";
        age=19;
    }
    public ass1(String firstname, String lastname, int age)//parameterised
    {
        this.firstname=firstname;
        this.lastname=lastname;
        this.age=age;
    }

    public static void main(String[] args) {
        ass1 obj1 = new ass1();
        ass1 obj2 = new ass1("vishwakarma", "university", 20);
        System.out.println(obj1.firstname);
        System.out.println(obj1.lastname);
        System.out.println(obj1.age);
        System.out.println(obj2.firstname);
        System.out.println(obj2.lastname);
        System.out.println(obj2.age);
    }

}





b] Inheritance:
Source Code:
class Base {
    String firstName = "Vishwakarma";
}
class Child1 extends Base{
    String lastName = "university";
}
class Child2 extends Child1{
    int rollNo = 48;
}
class Child3 extends Base{
    String role = "Student";
}

public class inher {
    public static void main(String a[])
    {
        Child2 obj = new Child2();
        Child3 obj2 = new Child3();
        System.out.println(obj.firstName);//Single
        System.out.println(obj.lastName);//Single
        System.out.println(obj.rollNo);//Multilevel
        System.out.println(obj2.firstName +" is a " + obj2.role);//Hierarchical
    }
}




C] Polymorphism:

Source Code:

class Animal {
    public void makeSound() {
        System.out.println("Some generic sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("hii! hii!");
    }

    // Overloaded method for demonstrating compile-time polymorphism
    public void makeSound(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("hello");
        }
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("hey! hey!");
    }

    // Overloaded method for demonstrating compile-time polymorphism
    public void makeSound(String emotion) {
        System.out.println("i m vishwarkama " + emotion);
    }
}

public class poly {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        // Calls the overridden makeSound method based on the actual object type
        myDog.makeSound();  // Output: Bark! Bark!
        myCat.makeSound();  // Output: Meow! Meow!

        // Calls the overloaded makeSound method based on the actual object type
        ((Dog) myDog).makeSound(3);  // Output: Bark! Bark! Bark!
        ((Cat) myCat).makeSound("happy");  // Output: Purr... Feeling happy
    }
}


-----------------------------------------------------------------------------------------------------------------------------------------------------------------------


Q2] Design a java application to demonstrate the use of Core Java fundamentals: 
a) Constructor       b) Inheritance               c) Polymorphism

a] Constructor:
Source Code:

public class ass1 {
    String firstname,lastname;
    int age;
    public ass1() {   //default
        firstname="vishwakarma";
        lastname="university";
        age=19;
    }
    public ass1(String firstname, String lastname, int age)//parameterised
    {
        this.firstname=firstname;
        this.lastname=lastname;
        this.age=age;
    }

    public static void main(String[] args) {
        ass1 obj1 = new ass1();
        ass1 obj2 = new ass1("vishwakarma", "university", 20);
        System.out.println(obj1.firstname);
        System.out.println(obj1.lastname);
        System.out.println(obj1.age);
        System.out.println(obj2.firstname);
        System.out.println(obj2.lastname);
        System.out.println(obj2.age);
    }

}





b] Inheritance:
Source Code:
class Base {
    String firstName = "Vishwakarma";
}
class Child1 extends Base{
    String lastName = "university";
}
class Child2 extends Child1{
    int rollNo = 48;
}
class Child3 extends Base{
    String role = "Student";
}

public class inher {
    public static void main(String a[])
    {
        Child2 obj = new Child2();
        Child3 obj2 = new Child3();
        System.out.println(obj.firstName);//Single
        System.out.println(obj.lastName);//Single
        System.out.println(obj.rollNo);//Multilevel
        System.out.println(obj2.firstName +" is a " + obj2.role);//Hierarchical
    }
}




C] Polymorphism:

Source Code:

class Animal {
    public void makeSound() {
        System.out.println("Some generic sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("hii! hii!");
    }

    // Overloaded method for demonstrating compile-time polymorphism
    public void makeSound(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("hello");
        }
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("hey! hey!");
    }

    // Overloaded method for demonstrating compile-time polymorphism
    public void makeSound(String emotion) {
        System.out.println("i m vishwarkama " + emotion);
    }
}

public class poly {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        // Calls the overridden makeSound method based on the actual object type
        myDog.makeSound();  // Output: Bark! Bark!
        myCat.makeSound();  // Output: Meow! Meow!

        // Calls the overloaded makeSound method based on the actual object type
        ((Dog) myDog).makeSound(3);  // Output: Bark! Bark! Bark!
        ((Cat) myCat).makeSound("happy");  // Output: Purr... Feeling happy
    }
}


-----------------------------------------------------------------------------------------------------------------------------------------------------------------------


Q3] Create a Java class named "Reservation" to manage hotel room reservations. Develop methods to the reservation details from the user and print it. 
a)	Implement a try-and-catch block to handle potential errors that may arise during reservation initialization and display, such as negative guest numbers or null reservation dates. Print relevant error messages. 
b)	Use multiple catch statements to handle distinct types of exceptions, like negative room numbers or null guest names. Handle these exceptions separately during both initialization and display operations. 
c)	Introduce a finally block to ensure cleanup operations, guaranteeing proper resource management regardless of whether an exception occurred. Verify the class by testing instances created using each constructor to confirm correct exception handling and resource cleanup in a hotel room reservation system. 
 
Source Code: 
class Reservation 
{    
     private int roomNumber;   
       private String guestName;   
         private Date reservationDate; 
 
    public Reservation(int roomNumber, String guestName, Date reservationDate) {     
            try { 
            if (roomNumber <= 0) { 
                throw new IllegalArgumentException("Room number must be a positive integer.");            
                4 } 
            if (guestName == null || guestName.trim().isEmpty()) {          
                       throw new IllegalArgumentException("Guest name cannot be null or empty.");       
                             } 
            if (reservationDate == null) { 
                throw new IllegalArgumentException("Reservation date cannot be null."); 
            } 
             this.roomNumber = roomNumber;           
               this.guestName = guestName; 
            this.reservationDate = reservationDate;  
        } catch (IllegalArgumentException e) { 
            System.out.println("Error during reservation initialization: "+ e.getMessage()); 
        } 
    }  
    public void displayReservationDetails() {       
          try { 
            if (roomNumber <= 0) { 
                throw new IllegalArgumentException("Room number must be a positive integer.");         
                    } 
            if (guestName == null || guestName.trim().isEmpty()) {               
                  throw new IllegalArgumentException("Guest name cannot be null or empty.");        
                       } 
            if (reservationDate == null) { 
                throw new IllegalArgumentException("Reservation date cannot be null.");       
                      } 
 
            System.out.println("Reservation Details:"); 
            System.out.println("Room Number: " + roomNumber); 
            System.out.println("Guest Name: " + guestName); 
            System.out.println("Reservation Date: " + reservationDate);  
        } catch (IllegalArgumentException e) { 
            System.out.println("Error during displaying reservation details: " + e.getMessage()); 
        } finally { 
            // Cleanup operations (if any) 
            System.out.println("Cleaning up resources..."); 
        } 
    }  
    public static void main(String[] args) { 
        // Test cases 
        Reservation validReservation = new Reservation(101, "John Doe", new Date()); 
        validReservation.displayReservationDetails(); 
 
        Reservation invalidRoomNumber = new Reservation(-1, "Jane Doe", new Date()); 
        invalidRoomNumber.displayReservationDetails();  
        Reservation invalidGuestName = new Reservation(102, null, new Date()); 
        invalidGuestName.displayReservationDetails();  
        Reservation invalidReservationDate = new Reservation(103, "Alice", null); 
        invalidReservationDate.displayReservationDetails(); 
    } 
} 


-----------------------------------------------------------------------------------------------------------------------------------------------------------------------


Q4] Develop a Java Application using Multithreading  
   
public class main {
    public static void main(String[] args) {       
   int maxCount = 30; // Define the maximum number to count     
   int numThreads = 3; // Define the number of threads to use   
        // Create and start threads  
        CounterThread[] threads = new 
CounterThread[numThreads];      
   int countPerThread = maxCount / numThreads;      
      int start = 1;        
        int end = countPerThread;   
             for (int i = 0; i < numThreads; i++) {      
                       threads[i] = new CounterThread(start, end);    
                                threads[i].start();        
                                     start = end + 1;     
                                             end += countPerThread;    
                                                 if (i == numThreads - 2) {  
                end = maxCount; // Adjust the last thread's end value   
                       }  
        }  
  
        // Wait for all threads to finish       
          for (CounterThread thread : threads) {        
                 try {  
                thread.join();  
            } catch (InterruptedException e) {     
                             e.printStackTrace();  
            }  
        }

    System.out.println("Counting completed.");
}}

class CounterThread extends Thread {
    private int start;
    private int end;

    public CounterThread(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}


-----------------------------------------------------------------------------------------------------------------------------------------------------------------------



Q5] Develop an application to demonstrate the use of Java Collections Framework: ArrayList.

import java.util.*;
class ArrayListDemo {
 public static void main(String args[]) {

 ArrayList<String> al = new ArrayList<String>();
 System.out.println("Initial size of ArrayList: " +
 al.size());

 al.add("1");
 al.add("2");
 al.add("3");
 al.add("4");
 al.add("5");
 al.add("6");
 
 System.out.println("Size of ArrayList before additions: " +
 al.size());
 
 System.out.println("Contents of ArrayList: " + al);
 al.add(1, "12");
 
 System.out.println("Size of ArrayList after additions: " +
 al.size());
 
 System.out.println("Contents of ArrayList: " + al);
 
 al.remove("3");
 al.remove(2);
 
 System.out.println("Size of ArrayList after deletions: " +
 al.size());
 
 System.out.println("Contents of ArrayList: " + al);
 }
}


-----------------------------------------------------------------------------------------------------------------------------------------------------------------------


Q6] JDBC Connectivity: Develop an application to demonstrate JDBC connectivity


import java.sql.*;

public class vishwakarma{
   static final String DB_URL = "jdbc:mysql://localhost/college";
   static final String USER = "root";
   static final String PASS = "root";
   static final String CREATE_TABLE_QUERY = "CREATE TABLE IF NOT EXISTS jdbc_test (id INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(255), street VARCHAR(255), city VARCHAR(255), state VARCHAR(255), zip VARCHAR(10))";
   static final String INSERT_QUERY = "INSERT INTO jdbc_test (name, street, city, state, zip) VALUES ('Vishwakarma', 'Kondwa', 'pune', 'MH', '001')";
   static final String SELECT_QUERY = "SELECT * FROM jdbc_test";

   public static void main(String[] args) {
      // Open a connection
      try (Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = con.createStatement();) {
         // Create table if not exists
         stmt.executeUpdate(CREATE_TABLE_QUERY);
         System.out.println("Table created successfully.");

         // Insert sample data
         int rowsAffected = stmt.executeUpdate(INSERT_QUERY);
         System.out.println(rowsAffected + " row(s) inserted.");

         // Execute select query
         ResultSet rs = stmt.executeQuery(SELECT_QUERY);
         // Extract data from result set
         while (rs.next()) {
            // Retrieve by column name
            System.out.print("ID: " + rs.getInt("id"));
            System.out.print(", Name: " + rs.getString("name"));
            System.out.print(", Street: " + rs.getString("street"));
            System.out.println(", City: " + rs.getString("city"));
            System.out.println(", State: " + rs.getString("state"));
            System.out.println(", ZIP: " + rs.getString("zip"));
         }

      } catch (SQLException e) {
         e.printStackTrace();
      }
   }
}

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------


Q7] Create a JSP page that generate a random number  each time it is accessed.


<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Random Number Generator</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f0f0f0;
        margin: 0;
        padding: 0;
    }
    .container {
        max-width: 600px;
        margin: 50px auto;
        padding: 20px;
        background-color: #fff;
        border-radius: 8px;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    }
    h1 {
        color: #333;
        text-align: center;
    }
    p {
        color: #666;
        text-align: center;
    }
    .random-number {
        color: #ff5733;
        font-size: 36px;
        text-align: center;
        margin-top: 20px;
    }
</style>
</head>
<body>
    <div class="container">
        <h1>Welcome to the Random Number Generator!</h1>
        <p>Here is your random number:</p>
        <div class="random-number">
            <%= Math.random() %>
        </div>
    </div>
</body>
</html>


-----------------------------------------------------------------------------------------------------------------------------------------------------------------------

Q8] Develop a Hibernate-based application to manage student records.
attributes:
student_id
first name
last name
Age
email ID


Code : 


Pom.xml:

<project xmlns="http://maven.apache.org/POM/4.0.0"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>

	<groupId>smeet</groupId>
	<artifactId>MyHiber</artifactId>
	<version>0.0.1-SNAPSHOT</version>
	<packaging>jar</packaging>

	<name>MyHiber</name>
	<url>http://maven.apache.org</url>

	<properties>
		<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
	</properties>

	<dependencies>
		<!-- https://mvnrepository.com/artifact/org.hibernate/hibernate-core -->
		<dependency>
			<groupId>org.hibernate</groupId>
			<artifactId>hibernate-core</artifactId>
			<version>5.6.7.Final</version>
		</dependency>
		<!-- https://mvnrepository.com/artifact/mysql/mysql-connector-java -->
		<dependency>
			<groupId>mysql</groupId>
			<artifactId>mysql-connector-java</artifactId>
			<version>8.0.28</version>
		</dependency>
		<dependency>
			<groupId>junit</groupId>
			<artifactId>junit</artifactId>
			<version>3.8.1</version>
			<scope>test</scope>
		</dependency>
	</dependencies>
</project>

Hibernate.cfg.xml

<?xml version='1.0' encoding='utf-8'?>
<!DOCTYPE hibernate-configuration PUBLIC
    "-//Hibernate/Hibernate Configuration DTD//EN"
    "http://hibernate.sourceforge.net/hibernate-configuration-3.0.dtd">

<hibernate-configuration>

    <session-factory>
        <!-- properties -->
        <property name="hibernate.connection.driver_class">com.mysql.cj.jdbc.Driver</property>
        <property name="hibernate.connection.url">jdbc:mysql://localhost:3306/JavaHibernateTest</property>
        <property name="hibernate.connection.username">root</property>
        <property name="hibernate.connection.password">root</property>
        <property name="hibernate.dialect">org.hibernate.dialect.MySQL8Dialect</property>
        <property name="hibernate.hbm2ddl.auto">create</property>
        <property name="hibernate.show_sql">true</property>
        <property name="hibernate.format_sql">true</property>
        <mapping class=smeet.Student"/>
     </session-factory>

</hibernate-configuration>
Student.java

package smeet;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	public int student_id;
	public String firstName;
	public String lastName;
	public int age;
	public String email_id;
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
}


App.java

package smeet;

import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for student information
        System.out.println("Enter Student ID:");
        int studentId = scanner.nextInt();

        System.out.println("Enter First Name:");
        String firstName = scanner.next();

        System.out.println("Enter Last Name:");
        String lastName = scanner.next();

        System.out.println("Enter Age:");
        int age = scanner.nextInt();

        System.out.println("Enter Email ID:");
        String email_Id = scanner.next();

        // Create a Student object with user input
        Student student = new Student();
        student.setStudent_id(studentId);
        student.setFirstName(firstName);
        student.setLastName(lastName);
        student.setAge(age);
        student.setEmail_id(email_Id);

        // Hibernate configuration and database interaction
        Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml");
        SessionFactory factory = config.buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        // Save the student object to the database
        session.save(student);
        tx.commit();
        session.close();
        System.out.println("Record Saved Successfully");

        // Close scanner
        scanner.close();
    }
}
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
