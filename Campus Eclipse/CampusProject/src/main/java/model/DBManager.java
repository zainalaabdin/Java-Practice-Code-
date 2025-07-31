package model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class DBManager {
    
    private static Connection connection;
    
    
    static{
        
        try{
         Class.forName("org.postgresql.Driver");
         connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/university", "postgres", "DELL123");
        
         if(connection == null)
             System.out.println("Connection failed");
         
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    
    public static List<FacultyBean> getFaculty()throws Exception{
        String sql = "Select * from faculty order by id ASC";
        
        Statement statement = null;
        ResultSet resultSet = null;
        
        try{
        
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            
            List<FacultyBean> faculty = new ArrayList<>();
            while(resultSet.next()){
                FacultyBean bean = new FacultyBean();
                
                bean.setId(resultSet.getInt("id"));
                bean.setName(resultSet.getString("name"));
                bean.setRemarks(resultSet.getString("remarks"));
                
                faculty.add(bean);
            }
            
            return faculty;
            
        }finally{
            if(statement != null)
                statement.close();
            if(resultSet != null)
                resultSet.close();
        }
    }
    
    public static FacultyBean getFacultyById(int id) throws Exception{
    	String sql = "Select * from faculty WHERE id = " + id;
    	Statement statement = null;
    	ResultSet resultSet = null;
    	try {
    		 statement = connection.createStatement();
             resultSet = statement.executeQuery(sql);
             
             FacultyBean bean = new FacultyBean();
             
             while(resultSet.next()){
                
                 
                 bean.setId(resultSet.getInt("id"));
                 bean.setName(resultSet.getString("name"));
                 bean.setRemarks(resultSet.getString("remarks"));
                
             }
             
             return bean;
    		
    	}finally{
    		if(statement != null)
                statement.close();
            if(resultSet != null)
                resultSet.close();
    	}
    }
    
    public static int addFaculty(FacultyBean bean)throws Exception{
        String sql = "Insert into faculty(name, remarks) values('"+bean.getName()+"', '"+bean.getRemarks()+"')";
        
        Statement statement = null;
        ResultSet resultSet = null;
        
        try{
        
            statement = connection.createStatement();
            return statement.executeUpdate(sql);
            
        }finally{
            if(statement != null)
                statement.close();
            if(resultSet != null)
                resultSet.close();
        }
    }
    
    
    public static int updateFaculty(FacultyBean bean) throws Exception{
    String sql = "UPDATE faculty SET name = '" +bean.getName()+ "', remarks = '"+ bean.getRemarks() +"' WHERE id = '"+ bean.getId() +"'";
    
        Statement statement = null;
        ResultSet resultSet = null;
        
        try{
            
            statement = connection.createStatement();
            return statement.executeUpdate(sql);
        }finally{
            if(statement != null)
                statement.close();
            if(resultSet != null)
                resultSet.close();
        }
    }  
            
            
    public static int delFaculty(int id) throws Exception{
        String sql = "DELETE FROM faculty Where id = '" + id + "'";
        
        Statement statement = null;
        ResultSet resultSet = null;
        
        try{
        
            statement = connection.createStatement();
            return statement.executeUpdate(sql);
        }finally{
            if(statement != null)
                statement.close();
            if(resultSet != null)
                resultSet.close();
        }
    }
    
}