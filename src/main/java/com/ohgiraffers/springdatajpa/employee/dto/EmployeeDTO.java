package com.ohgiraffers.springdatajpa.employee.dto;

public class EmployeeDTO {
    private int empNo;
    private String empName;

    private int dptNo;
    private String enrollDate;
    private char empGender;
    private String empPhone;
    private String empAddress;

    public EmployeeDTO() {
    }

    public EmployeeDTO(int empNo, String empName, int dptNo, String enrollDate, char empGender, String empPhone, String empAddress) {
        this.empNo = empNo;
        this.empName = empName;
        this.dptNo = dptNo;
        this.enrollDate = enrollDate;
        this.empGender = empGender;
        this.empPhone = empPhone;
        this.empAddress = empAddress;
    }

    public int getDptNo() {
        return dptNo;
    }

    public void setDptNo(int dptNo) {
        this.dptNo = dptNo;
    }



    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEnrollDate() {
        return enrollDate;
    }

    public void setEnrollDate(String enrollDate) {
        this.enrollDate = enrollDate;
    }

    public char getEmpGender() {
        return empGender;
    }

    public void setEmpGender(char empGender) {
        this.empGender = empGender;
    }

    public String getEmpPhone() {
        return empPhone;
    }

    public void setEmpPhone(String empPhone) {
        this.empPhone = empPhone;
    }

    public String getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }

    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "empNo=" + empNo +
                ", empName='" + empName + '\'' +
                ", dptNo=" + dptNo +
                ", enrollDate='" + enrollDate + '\'' +
                ", empGender=" + empGender +
                ", empPhone='" + empPhone + '\'' +
                ", empAddress='" + empAddress + '\'' +
                '}';
    }
}
