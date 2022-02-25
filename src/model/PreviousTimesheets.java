/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.*; 
/**
 *
 * @author Group 1 HRM
 */
public class PreviousTimesheets {
    private Integer prevTotalHoursWorked; 
    private Date startTimeFrame; 
    private Date endTimeFrame; 
    
    private Employee employee; 
   
    /**
     * This is the default constructor for this class 
     * @param totalHoursWorked
     * @param startTimeFrame
     * @param endTimeFrame
     * @param employee
     */
    public PreviousTimesheets(Integer totalHoursWorked, Date startTimeFrame, Date endTimeFrame, Employee employee) {        
        this.prevTotalHoursWorked = totalHoursWorked;
        this.startTimeFrame = startTimeFrame;
        this.endTimeFrame = endTimeFrame;
        this.employee = employee;
    }
    
    /** 
     * This is an empty constructor that sets all attributes to default values
     */
    public PreviousTimesheets() {
        this.prevTotalHoursWorked = 0;
        this.startTimeFrame = new Date();
        this.endTimeFrame = new Date();
        this.employee = new Employee("First Name", "Last Name", "username",  "password", "department", 0, 0);
    }
    
    public Integer getPrevTotalHoursWorked() {
        return prevTotalHoursWorked;
    }

    public void setPrevTotalHoursWorked(Integer prevTotalHoursWorked) {
        this.prevTotalHoursWorked = prevTotalHoursWorked;
    }

    public Date getStartTimeFrame() {
        return startTimeFrame;
    }

    public void setStartTimeFrame(Date startTimeFrame) {
        this.startTimeFrame = startTimeFrame;
    }

    public Date getEndTimeFrame() {
        return endTimeFrame;
    }

    public void setEndTimeFrame(Date endTimeFrame) {
        this.endTimeFrame = endTimeFrame;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }    
}
