package com.ohgiraffers.springdatajpa.employee.repository;

import com.ohgiraffers.springdatajpa.employee.entity.Employee;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    List<Employee> findAll(Sort empNo);
}
