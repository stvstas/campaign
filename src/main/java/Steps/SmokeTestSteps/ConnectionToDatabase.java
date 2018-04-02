package Steps.SmokeTestSteps;

import org.openqa.selenium.WebDriver;


import java.sql.*;
import java.sql.DriverManager;
import java.sql.Connection;

public class  ConnectionToDatabase{
    private WebDriver driver;

public  void connectToDatabaseUpdate(String sql) {
        //String sql="update tev set start_time = TODAY + 7";

    try {
        Class.forName("com.informix.jdbc.IfxDriver");
        Connection conn = DriverManager.getConnection("jdbc:informix-sqli://db03.openbet:1924/promotions_02_keystone_release:informixserver=db03_1170");
        Statement stmt = conn.createStatement();
        stmt.executeUpdate(sql);
        /*ResultSet resultSet= stmt.executeQuery(sql);
        while (resultSet.next()) {
          String a = resultSet.getString("class_name");
          String name = resultSet.getString("name");

      }*/
        stmt.close();
    }
    catch(Exception e){ System.out.println(e);


      }
    }
}