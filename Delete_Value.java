package mypackage;

import java.sql.Connection;
import java.sql.Statement;

public class Delete_Value {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ConnectDb obj_ConnectDB = new ConnectDb();
        connection = obj_ConnectDB.get_connection();

        try{
            String query = "delete from employee where sl_no='3'";
            statement = connection.createStatement();
            statement.executeUpdate(query);
            System.out.println("Value deleted");

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
