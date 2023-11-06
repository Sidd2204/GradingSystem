package gradingsystem;

import java.sql.*;

public class dbconn {
    public static Connection dblink(){
    //public static void main(String[] args){
        Connection conn = null;

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys","root","siddhesh@2204");
                        
            //System.out.println("Success");      
        } catch (SQLException e) {
            System.out.println(e);
            System.out.println("Failed");
        }
        
        return conn;
    }
}