package mypackage;

import java.sql.Connection;
import java.sql.Statement;

public class Edit_value {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ConnectDb obj_ConnectDB = new ConnectDb();
        connection = obj_ConnectDB.get_connection();

        try{
            String query = "update employee set name='juan' where sl_no='2'";
            statement=connection.createStatement();
            statement.executeUpdate(query);
            System.out.println("update");

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
