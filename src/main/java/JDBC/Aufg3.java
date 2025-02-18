package JDBC;

import java.sql.*;
import java.util.Properties;

public class Aufg3 {
    public static void main(String[] args) {
        try {
            Class.forName("org.relique.jdbc.csv.CsvDriver");

            Properties props = new Properties();
            props.put("separator",";");
            props.put("suppressHeaders","false");
            props.put("fileExtension",".csv");

            Connection con = DriverManager.getConnection("jdbc:relique:csv:./src/main/resources/csv", props);

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select id from realtime");

            while (rs.next()) {
                System.out.println("id= " + rs.getInt("id"));
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
