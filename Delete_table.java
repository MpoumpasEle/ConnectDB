package mypackage;

import java.sql.Connection;
import java.sql.Statement;

public class Delete_table {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ConnectDb obj_ConnectDB = new ConnectDb();
        connection = obj_ConnectDB.get_connection();

        try{
            String query = "drop table employee";
            statement = connection.createStatement();
            statement.executeUpdate(query);
            System.out.println("Table deleted");

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
