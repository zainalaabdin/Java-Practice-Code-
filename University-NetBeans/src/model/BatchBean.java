/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author DELL
 */
public class BatchBean {
    private int id;
    private String name;
    private String start_year;
    private String end_year;
    private String remarks;
    private int deptId;
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStartYear() {
        return start_year;
    }

    public void setStartYear(String start_year) {
        this.start_year = start_year;
    }
    
    public String getEndYear() {
        return end_year;
    }

    public void setEndYear(String end_year) {
        this.end_year = end_year;
    }
    
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
    
    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }
    
    @Override
    public String toString() {
        return name;
    }

}
