package com.example.application.views.helloworld;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;



public class DoctorService
{
    List <Doctors> doctor;
    Doctors doctors;

   // public List<Doctors> GetList() throws Exception {
   //     Doctors doctors;
   //     List<String> DocUserNames = GetDoctor();
     //   List<String> Passwords = GetPW();
   //



  //  }

    public ResultSet getData(String query) throws Exception
    {
        String dbUrl = "jdbc:postgresql://ec2-54-73-68-39.eu-west-1.compute.amazonaws.com:5432/dctpppdsoogu5e";
        Class.forName("org.postgresql.Driver");
        Connection conn = DriverManager.getConnection(dbUrl, "wtlubuspzbefzf", "6056c0cef2cfcbf15902982f17d7ba4a19158dd1087ecb110fce1aade0e0629b");
        Statement s = conn.createStatement();
        return s.executeQuery(query);

    }

    public List<String> GetDoctor() throws Exception
    {
        ArrayList<String> DocUserName = new ArrayList<>();

        ResultSet rs = getData("Select * from doctors");
        while (rs.next())
        {
            DocUserName.add(rs.getString("username"));
        }
        return DocUserName;
    }

    public List<String> GetPW() throws Exception
    {
        ArrayList<String> Password = new ArrayList<>();

        ResultSet rs = getData("Select * from doctors");
        while(rs.next())
        {
            Password.add(rs.getString("password"));
        }
        return Password;
    }
    
    

}
