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
    
    
    public static List<DepartmentBean> getDepartmentById(int facultyId) throws Exception{
        String sql = "SELECT * from department where faculty_id="+facultyId;
        
        Statement statement = null;
        ResultSet resultSet = null;
        
        try{
        
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            
            List<DepartmentBean> department = new ArrayList<>();
            
            while(resultSet.next()){
            DepartmentBean bean = new DepartmentBean();
            
            bean.setId(resultSet.getInt("id"));
            bean.setName(resultSet.getString("name"));
            bean.setCode(resultSet.getString("code"));
            bean.setEmail(resultSet.getString("email"));
            bean.setPhone(resultSet.getString("phone"));
            bean.setFacultyId(resultSet.getInt("faculty_id"));
            
            department.add(bean);
            }
                return department;
            }finally{
                if(statement != null)
                    statement.close();
                if(resultSet != null)
                    resultSet.close();
            }
           }
    
    public static DepartmentBean getDepartment(int id) throws Exception{
    	String sql = "Select * from department WHERE id = " + id;
    	Statement statement = null;
    	ResultSet resultSet = null;
    	try {
    		 statement = connection.createStatement();
             resultSet = statement.executeQuery(sql);
             
             DepartmentBean bean = new DepartmentBean();
             
             while(resultSet.next()){
                
            	 bean.setId(resultSet.getInt("id"));
                 bean.setName(resultSet.getString("name"));
                 bean.setCode(resultSet.getString("code"));
                 bean.setEmail(resultSet.getString("email"));
                 bean.setPhone(resultSet.getString("phone"));
                 bean.setFacultyId(resultSet.getInt("faculty_id"));
                
             }
             
             return bean;
    		
    	}finally{
    		if(statement != null)
                statement.close();
            if(resultSet != null)
                resultSet.close();
    	}
    }
    
    
    public static int addDepartment(DepartmentBean bean) throws Exception{
        String sql = "INSERT into department(name, code, email, phone, faculty_id) VALUES('"+ bean.getName() +"', '"+ bean.getCode() +"', '"+ bean.getEmail() +"', '"+ bean.getPhone() +"', " + bean.getFacultyId() + ")";
        
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
    
    
    public static int updateDepartment(DepartmentBean bean) throws Exception{
        String sql = "UPDATE department SET name = '"+ bean.getName() +"', code = '"+ bean.getCode() +"', email = '"+ bean.getEmail() +"', phone = '"+ bean.getPhone() +"', faculty_id = "+ bean.getFacultyId() +" WHERE id = "+ bean.getId();
    
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
    
    
    public static int delDepartment(int id) throws Exception{
    String sql = "DELETE FROM department WHERE id = " + id;
    
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
    
    
    public static List<BatchBean> getBatchById(int deptId) throws Exception {
        String sql = "SELECT * FROM batch WHERE dept_id = " + deptId;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);

            List<BatchBean> batchList = new ArrayList<>();

            while (resultSet.next()) {
                BatchBean bean = new BatchBean();
                bean.setId(resultSet.getInt("id"));
                bean.setName(resultSet.getString("name"));
                bean.setStartYear(resultSet.getString("start_year"));
                bean.setEndYear(resultSet.getString("end_year"));
                bean.setDeptId(resultSet.getInt("dept_id"));
                bean.setRemarks(resultSet.getString("remarks"));

                batchList.add(bean);
            }

            return batchList;

        } finally {
            if (resultSet != null) resultSet.close();
            if (statement != null) statement.close();
        }
    }

    public static BatchBean getBatch(int id) throws Exception{
    	String sql = "Select * from batch WHERE id =" + id;
    	Statement statement = null;
    	ResultSet resultSet = null;
    	try {
    		 statement = connection.createStatement();
             resultSet = statement.executeQuery(sql);
             BatchBean bean = new BatchBean();
             while(resultSet.next()) {
            	 bean.setId(resultSet.getInt("id"));
                 bean.setName(resultSet.getString("name"));
                 bean.setStartYear(resultSet.getString("start_year"));
                 bean.setEndYear(resultSet.getString("end_year"));
                 bean.setDeptId(resultSet.getInt("dept_id"));
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
    
    public static int addBatch(BatchBean bean)throws Exception{
        String sql = "INSERT INTO batch(name, start_year, end_year, remarks, dept_id) " + "VALUES('" + bean.getName() + "', '" + bean.getStartYear() + "', '" + bean.getEndYear() + "', '" + bean.getRemarks() + "', " + bean.getDeptId() + ")";
       
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
      
    
    public static int updateBatch(BatchBean bean) throws Exception{
        String sql = "UPDATE batch SET name = '" + bean.getName() + "', start_year = '" + bean.getStartYear() + "', end_year = '" + bean.getEndYear() + "', remarks = '" + bean.getRemarks() + "', dept_id = " + bean.getDeptId() + " WHERE id = " + bean.getId();    
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
    
    
    public static int deleteBatch(int id) throws Exception{
        
        String sql = "DELETE FROM batch Where id = " + id;
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