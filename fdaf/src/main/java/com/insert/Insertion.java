package com.insert;
import java.sql.*;
public class Insertion {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    String url="jdbc:mysql://localhost:3306/sample";
      String usr="root";
      String pwd="2006";
      try {
       Connection con=DriverManager.getConnection(url, usr, pwd);
       System.out.println("Connection established");
       Statement st = con.createStatement();
       //create dept table
       String createDept = "create table if not exists dept1(" +
                   "dept_id INT PRIMARY KEY," +
                   "dept_name VARCHAR(50))";
           st.executeUpdate(createDept);
           System.out.println("Department Table created.");
            //create emp table
           String createEmp = "create table if not exists employee1 (" +
                   "emp_id INT PRIMARY KEY, " +
                   "emp_name VARCHAR(50), " +
                   "salary DOUBLE, " +
                   "dept_id INT, " +
                   "FOREIGN KEY (dept_id) REFERENCES dept1(dept_id))";
           st.executeUpdate(createEmp);
           System.out.println("Employee Table created.");
          //insert values into dept
           st.executeUpdate("INSERT INTO dept1 VALUES(11,'CSE')");
           st.executeUpdate("INSERT INTO dept1 VALUES(12,'ECE')");
           System.out.println("Successfully department values are inserted!");
           //insert values into emp
           st.executeUpdate("INSERT INTO employee1 VALUES(207,'CSE',5000,11)");
           st.executeUpdate("INSERT INTO employee1 VALUES(208,'ECE',7000,12)");
           System.out.println("Successfully Employee values are inserted!");
          con.close();
          System.out.println("Done and excuted");
      }
      catch(Exception e)
      {
       e.printStackTrace();
      }
     }
  }