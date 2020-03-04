package project.learningcoding;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Employee {

    private String empId;
    private String empName;
    private Enum empposition;
    protected int empsalary;
    private Date createdDate;
    private Date hireDate;
    private Scanner scn;
    private int year, month, dayOfMonth;
    public int val;

    public Employee(String empId, String empName, Enum empposition, int empsalary, Date createdDate, Date hireDate) {
        this.empId = empId;
        this.empName = empName;
        this.empposition = empposition;
        this.empsalary = empsalary;
        this.createdDate = createdDate;
        this.hireDate = hireDate;
    }

    public Employee(int c){
    this.val= 10;

    }
public void printEmployee(){
    System.out.println("Employee" );
}

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Enum getEmpposition() {
        return empposition;
    }

    public void setEmpposition(Enum empposition) {
        this.empposition = empposition;
    }

    public int getEmpsalary() {
        int salary = 0;
        if (salary < 0) {
            System.out.println("The Salary is less than 0");
        } else if (salary > 50000) {
            System.out.println("The salary is greater than 50000");

        } else {

        }
        return empsalary;
    }



    public void setEmpsalary(int empsalary) {
        this.empsalary = empsalary;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDayOfMonth() {
        return dayOfMonth;
    }

    public void setDayOfMonth(int dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int c) {
        this.val = c +2;
    }
    public void Foo(){
        this.val = 10 * 10;
    }
}



