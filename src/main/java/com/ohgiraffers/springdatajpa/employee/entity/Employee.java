package com.ohgiraffers.springdatajpa.employee.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tbl_employee")
public class Employee {

    @Id
    @Column(name = "emp_no")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int empNo;
    @Column(name = "emp_name")
    private String empName;
//    @Column(name = "dpt_no")
//    private int dptNo;
    @Column(name = "enroll_date")
    private String enrollDate;
    @Column(name = "emp_gender")
    private char empGender;
    @Column(name = "emp_phone")
    private String empPhone;
    @Column(name = "emp_address")
    private String empAddress;


    // Entity 클래스 내부에 builder 패턴 구현
    public Employee empName(String val) {
        this.empName = val;
        return this;
    }

//    public Employee dptNo (int val) {
//        this.dptNo = val;
//        return this;
//    }

    public Employee enrollDate(String val) {
        this.enrollDate = val;
        return this;
    }

    public Employee empGender (char val) {
        this.empGender = val;
        return this;
    }


    public Employee empPhone (String val) {
        this.empPhone = val;
        return this;
    }

    public Employee empAddress (String val) {
        this.empAddress = val;
        return this;
    }

//    public Employee builder() {
//        return new Employee(empNo, empName,  dptNo, enrollDate, empGender, empPhone, empAddress);
//    }
    public Employee builder() {
        return new Employee(empNo, empName, enrollDate, empGender, empPhone, empAddress);
    }

    protected Employee() {
    }

    public Employee(int empNo, String empName, String enrollDate, char empGender, String empPhone, String empAddress) {
        this.empNo = empNo;
        this.empName = empName;
        this.enrollDate = enrollDate;
        this.empGender = empGender;
        this.empPhone = empPhone;
        this.empAddress = empAddress;
    }

//    public Employee(int empNo, String empName, int dptNo, String enrollDate, char empGender, String empPhone, String empAddress) {
//        this.empNo = empNo;
//        this.empName = empName;
//        this.dptNo = dptNo;
//        this.enrollDate = enrollDate;
//        this.empGender = empGender;
//        this.empPhone = empPhone;
//        this.empAddress = empAddress;
//    }


//    public int getDptNo() {
//        return dptNo;
//    }

    public int getEmpNo() {
        return empNo;
    }

    public String getEmpName() {
        return empName;
    }

    public String getEnrollDate() {
        return enrollDate;
    }

    public char getEmpGender() {
        return empGender;
    }

    public String getEmpPhone() {
        return empPhone;
    }

    public String getEmpAddress() {
        return empAddress;
    }

//    @Override
//    public String toString() {
//        return "Employee{" +
//                "empNo=" + empNo +
//                ", empName='" + empName + '\'' +
//                ", dptNo=" + dptNo +
//                ", enrollDate='" + enrollDate + '\'' +
//                ", empGender=" + empGender +
//                ", empPhone='" + empPhone + '\'' +
//                ", empAddress='" + empAddress + '\'' +
//                '}';
//    }


    @Override
    public String toString() {
        return "Employee{" +
                "empNo=" + empNo +
                ", empName='" + empName + '\'' +
                ", enrollDate='" + enrollDate + '\'' +
                ", empGender=" + empGender +
                ", empPhone='" + empPhone + '\'' +
                ", empAddress='" + empAddress + '\'' +
                '}';
    }
}
