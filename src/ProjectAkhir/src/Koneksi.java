import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author R-PC
 */
public class Koneksi {
    public Connection connection;
    public Statement statement;
    public ResultSet result; 
    public void data(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            //connection = DriverManager.getConnection("jdbc:mysql://localhost/kamarkost","root","");
            connection = DriverManager.getConnection("jdbc:mysql://sql7.freesqldatabase.com:3306/sql7124908","sql7124908","6qfKUsBk1c");
            System.out.println("Koneksi Sukses");
        }
        catch(Exception e){
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Tidak ada koneksi internet!");
        }
    }
}