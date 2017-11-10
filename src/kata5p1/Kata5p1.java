package kata5p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Kata5p1 {

    public static void main(String[] args) 
            throws ClassNotFoundException, SQLException {
        Class.forName("org.sqlite.JDBC");
        Connection cm = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\usuario\\Downloads\\SQLiteDatabaseBrowserPortable\\Data\\Kata5.db");
        Statement st = cm.createStatement();
        
        ResultSet executeQuery = st.executeQuery("create table a ('Id' integer primary key autoincrement, 'Mail' text not null);");
    }
}
