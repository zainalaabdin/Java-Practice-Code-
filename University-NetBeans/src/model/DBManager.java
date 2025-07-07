/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.*;
import java.util.Vector;

/**
 *
 * @author DELL
 */
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
    
    
    public static Vector<FacultyBean> getFaculty()throws Exception{
        String sql = "Select * from faculty";
        
        Statement statement = null;
        ResultSet resultSet = null;
        
        try{
        
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            
            Vector<FacultyBean> faculty = new Vector<>();
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
    
    
    public static Vector<DepartmentBean> getDepartment(int facultyId) throws Exception{
    String sql = "SELECT * from department where faculty_id="+facultyId;
    
    Statement statement = null;
    ResultSet resultSet = null;
    
    try{
    
        statement = connection.createStatement();
        resultSet = statement.executeQuery(sql);
        
        Vector<DepartmentBean> department = new Vector<DepartmentBean>();
        
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
    
    
    public static Vector<BatchBean> getBatch(int DeptId) throws Exception{
    String sql = "SELECT * from batch WHERE dept_id = "+ DeptId;
    
    Statement statement = null;
    ResultSet resultSet = null;
    
    try{
    
        statement = connection.createStatement();
        resultSet = statement.executeQuery(sql);
        
        Vector<BatchBean> batch = new Vector<>();
        
        while(resultSet.next()){
        BatchBean bean = new BatchBean();
        
        bean.setId(resultSet.getInt("id"));
        bean.setName(resultSet.getString("name"));
        bean.setStartYear(resultSet.getString("start_year"));
        bean.setEndYear(resultSet.getString("end_year"));
        bean.setDeptId(resultSet.getInt("dept_id"));
        bean.setRemarks(resultSet.getString("remarks"));
        
        batch.add(bean);
        }
            return batch;
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
    
    
     
    public static Vector<StudentBean> getStudent(int batchId) throws Exception{
    String sql = "SELECT * from student WHERE batch_id = "+ batchId;
    
    Statement statement = null;
    ResultSet resultSet = null;
    
    try{
    
        statement = connection.createStatement();
        resultSet = statement.executeQuery(sql);
        
        Vector<StudentBean> Student = new Vector<>();
        
        while(resultSet.next()){
        StudentBean bean = new StudentBean();
        
        bean.setId(resultSet.getInt("id"));
        bean.setName(resultSet.getString("name"));
        bean.setRollNum(resultSet.getString("roll_num"));
        bean.setEmail(resultSet.getString("email"));
        bean.setPhone(resultSet.getString("phone"));
        bean.setGender(resultSet.getString("gender"));
        bean.setDateOfBirth(resultSet.getString("dob"));
        bean.setAddress(resultSet.getString("address"));
        bean.setAdmission(resultSet.getString("admission_date"));
        bean.setRemarks(resultSet.getString("remarks"));
        bean.setBatchId(resultSet.getInt("batch_id"));
        


        
        Student.add(bean);
        }
            return Student;
        }finally{
            if(statement != null)
                statement.close();
            if(resultSet != null)
                resultSet.close();
         }
       }
     
     
     public static int addStudent(StudentBean bean) throws Exception{
     String sql = "INSERT INTO student(name, roll_num, email, phone, gender, dob, address, admission_date, remarks, batch_id) " + "VALUES('" + bean.getName() + "', '" + bean.getRollNum() + "', '" + bean.getEmail() + "', '" + bean.getPhone() + "', '" + bean.getGender() + "', '" + bean.getDateOfBirth() + "', '" + bean.getAddress() + "', '" + bean.getAdmission() + "', '" + bean.getRemarks() + "', '" + bean.getBatchId() + "')";
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
     
     
     
     public static int UpdateStudent(StudentBean bean) throws Exception{
            String sql = "UPDATE student SET name = '"+bean.getName()+"', roll_num ='"+bean.getRollNum()+"', email ='"+bean.getEmail()+"', phone = '"+bean.getPhone()+"', gender = '"+bean.getGender()+"', dob ='"+bean.getDateOfBirth()+"', address ='"+bean.getAddress()+"', admission_date = '"+bean.getAdmission()+"', remarks = '"+bean.getRemarks()+"', batch_id= '"+bean.getBatchId()+"'";
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
     
     
    public static int DelStudent(int id) throws Exception{
         String sql = "DELETE FROM student WHERE id = " + id;
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


 

       
       

       