package com.example.pruebahora;

import java.sql.*;
import java.util.Date;

public class GetConexion {
    private static final String DRIVER="com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static final String connectionUrl = "jdbc:sqlserver://annedecordatabase.database.windows.net:1433;database=AnneDecorDataBase;user=AnneDecor;password=anabistolfi1_;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;";



    public static Connection GetConexion() throws Exception{
        Class.forName(DRIVER);
        return DriverManager.getConnection(connectionUrl);
    }


    public Time FindDate() {
        java.sql.Connection connection = null;
        Time newDate=null;
        try{
            connection = (java.sql.Connection) GetConexion();
            PreparedStatement statement = connection.prepareStatement("SELECT GETDATE()");
            ResultSet rs = statement.executeQuery();
            while(rs.next()){
                 newDate = rs.getTime(1);
            }

        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                connection.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        return newDate;
    }
}
