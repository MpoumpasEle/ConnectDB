package mypackage;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectDb {

    public static void main(String[] args) {
        ConnectDb obj_ConnectDB = new ConnectDb();
        System.out.println(obj_ConnectDB.get_connection());
        /*
        otan to trexo tha epistrepsei to connection ok me ena String
        me plirofories tis sindesis
         */
    }

    public Connection get_connection() {
        /*to allazo apo psvm se connection gia na paro to connection Obj
        tis vasis
         */

        Connection connection = null;
        try{
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/mytest","postgres","postgres");

            if(connection != null){
                System.out.println("Connection ok");
            }else{
                System.out.println("connection Failed");
            }



        }catch (Exception e){
            System.out.println(e);
        }
        return connection;

    }

    }

