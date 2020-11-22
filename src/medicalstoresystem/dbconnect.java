package medicalstoresystem;
import java.sql.*;

public class dbconnect {
    Connection con;
    public dbconnect() throws ClassNotFoundException, SQLException
    {
        Class.forName("com.mysql.jdbc.Driver");
          con=DriverManager.getConnection("jdbc:mysql://localhost:3306/medicalstoresystem","root","");
    
    }
    
}


