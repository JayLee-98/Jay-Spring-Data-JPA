package com.ohgiraffers.springdatajpa.employee.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tbl_department")
public class Department {

    @Id
    @Column(name = "dpt_no")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int dptNo;

    @Column(name = "dpt_name")
    private String dptName;

    @OneToMany(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "dpt_no")
    private List<Employee> employeeList;

    protected Department() {
    }

    public Department(int dptNo, String dptName, List<Employee> employeeList) {
        this.dptNo = dptNo;
        this.dptName = dptName;
        this.employeeList = employeeList;
    }

    public int getDptNo() {
        return dptNo;
    }

    public String getDptName() {
        return dptName;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    @Override
    public String toString() {
        return "Department{" +
                "dptNo=" + dptNo +
                ", dptName=" + dptName +
                ", employeeList=" + employeeList +
                '}';
    }
}
