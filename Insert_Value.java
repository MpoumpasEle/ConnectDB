package mypackage;

import java.sql.Connection;
import java.sql.Statement;

public class Insert_Value {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ConnectDb obj_ConnectDB = new ConnectDb();
        connection = obj_ConnectDB.get_connection();

        try{
            /* kathe fora poy to trexo tha eisagei tin eggrafi opote an allakso ta
            values eisagei diaforetiki.
            i parakato grammi kodika einai gia INPUT

             */

            String query = "insert into employee(name,address) values('Hans', 'Germany')";
            statement = connection.createStatement();
            statement.executeUpdate(query);
            System.out.println("Value inserted successfully");

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
