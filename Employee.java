

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Employee {
	public static void main(String[] args)
	{
		Connection connection;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost/emp","root","Ayushi@123");
			
			Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from employee");

            while(resultSet.next()) {
                System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getString(3));
          
			System.out.println(connection);
            }

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



	}
	

}
