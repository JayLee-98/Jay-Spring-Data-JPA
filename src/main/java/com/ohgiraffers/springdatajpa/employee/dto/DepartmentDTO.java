package com.ohgiraffers.springdatajpa.employee.dto;

import jakarta.persistence.Column;

import java.util.List;

public class DepartmentDTO {

    private int dptNo;

    private String dptName;

//    private List<EmployeeDTO> employeeDTOList;


    public DepartmentDTO() {
    }

//    public DepartmentDTO(int dptNo, String dptName, List<EmployeeDTO> employeeDTOList) {
//        this.dptNo = dptNo;
//        this.dptName = dptName;
//        this.employeeDTOList = employeeDTOList;
//    }


    public DepartmentDTO(int dptNo, String dptName) {
        this.dptNo = dptNo;
        this.dptName = dptName;
    }

    public int getDptNo() {
        return dptNo;
    }

    public void setDptNo(int dptNo) {
        this.dptNo = dptNo;
    }

    public String getDptName() {
        return dptName;
    }

    public void setDptName(String dptName) {
        this.dptName = dptName;
    }

//    @Override
//    public String toString() {
//        return "DepartmentDTO{" +
//                "dptNo=" + dptNo +
//                ", dptName='" + dptName + '\'' +
//                ", employeeDTOList=" + employeeDTOList +
//                '}';
//    }


    @Override
    public String toString() {
        return "DepartmentDTO{" +
                "dptNo=" + dptNo +
                ", dptName='" + dptName + '\'' +
                '}';
    }
}
