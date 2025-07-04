package org.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC_Connection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("oracle.jdbc.driver.OracleDriver");

		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "7094");

		/*
		String create_table_Student_Details = "CREATE TABLE Student_Details ( student_id NUMBER(10), student_name VARCHAR2(50), course_id NUMBER(5), CONSTRAINT s1 PRIMARY KEY (student_id))";
		PreparedStatement query1 = connection.prepareStatement(create_table_Student_Details);
		query1.executeUpdate();

		String Student_Details_Row_1 = "INSERT INTO Student_Details (student_id, student_name, course_id) VALUES (221003106, 'Vignesh Raja', 101)";
		PreparedStatement query2 = connection.prepareStatement(Student_Details_Row_1);
		query2.executeUpdate();

		String Student_Details_Row_2 = "INSERT INTO Student_Details (student_id, student_name, course_id) VALUES (221002070, 'Raghavan', 102)";
		PreparedStatement query3 = connection.prepareStatement(Student_Details_Row_2);
		query3.executeUpdate();

		String Student_Details_Row_3 = "INSERT INTO Student_Details (student_id, student_name, course_id) VALUES (221001036, 'Saravanan', 103)";
		PreparedStatement query4 = connection.prepareStatement(Student_Details_Row_3);
		query4.executeUpdate();

		String Student_Details_Row_4 = "INSERT INTO Student_Details (student_id, student_name, course_id) VALUES (221004001, 'Viswa', NULL)";
		PreparedStatement query5 = connection.prepareStatement(Student_Details_Row_4);
		query5.executeUpdate();
		*/

		String view_table_Student_Details = "select * from Student_Details";
		PreparedStatement query6 = connection.prepareStatement(view_table_Student_Details);
		ResultSet table_Student_Details = query6.executeQuery();

		while (table_Student_Details.next()) {

			String student_id = table_Student_Details.getString("student_id");
			String student_name = table_Student_Details.getString("student_name");
			String course_id = table_Student_Details.getString("course_id");
			System.out.println(" | " + student_id + " | " + student_name + " | " + course_id + " | ");

		}

		connection.close();

	}

}
