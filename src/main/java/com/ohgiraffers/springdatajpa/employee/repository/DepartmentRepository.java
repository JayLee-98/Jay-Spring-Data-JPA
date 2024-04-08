package com.ohgiraffers.springdatajpa.employee.repository;


import com.ohgiraffers.springdatajpa.employee.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {
    @Query(value = "SELECT dpt_no, dpt_name FROM tbl_department ORDER BY dpt_no", nativeQuery = true)
    List<Department> findAllDpt();
}
