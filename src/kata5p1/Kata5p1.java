package kata5p1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Kata5p1 {

    public static void main(String[] args) 
            throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {
        Class.forName("org.sqlite.JDBC");
        Connection cm = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\usuario\\Downloads\\SQLiteDatabaseBrowserPortable\\Data\\Kata5.db");
        Statement st = cm.createStatement();
        
        //ResultSet executeQuery = st.executeQuery("create table a ('Id' integer primary key autoincrement, 'Mail' text not null);");
        BufferedReader reader = new BufferedReader(new FileReader(new File("emails.txt")));
        /*
        String leido;
        while((leido =reader.readLine())!=null){
            st.executeUpdate("insert into a (Mail) values ('" +leido+ "');");
        }
        */
        System.out.println(st.executeQuery("select count(*) from a").getInt(1));
        
    }
}
