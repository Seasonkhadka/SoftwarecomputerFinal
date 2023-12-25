

 
import java.sql.*;
import javax.swing.JOptionPane;



public class db {
    public static Connection mycon(){
        Connection con =null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/softwareregistration","root","");
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showConfirmDialog(null, e);
            
          
        }return con;
    }
    
}
