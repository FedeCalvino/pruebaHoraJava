package com.example.pruebahora;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;

public class GetConexion {
    private static final String DRIVER="com.microsoft.sqlserve.amazonaws.com";
    private static final String connectionUrl = "jdbc:sqlserver://sqlserver.cz0se24qsz75.us-east-1.rds.amazonaws.com;user=SQLAnneDecor;password=SQLAnneDecor;databaseName=SistemaCortinas;encrypt=true;trustServerCertificate=true;";



    public static Connection GetConexion() throws Exception{
        Class.forName(DRIVER);
        return DriverManager.getConnection(connectionUrl);
    }


    public Date FindDate() {
        java.sql.Connection connection = null;
        Date newDate=null;
        try{
            connection = (java.sql.Connection) GetConexion();
            PreparedStatement statement = connection.prepareStatement("SELECT GETDATE()");
            ResultSet rs = statement.executeQuery();
            while(rs.next()){
                 newDate = rs.getDate(1);
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
