package com.ohgiraffers.springdatajpa.employee.service;

import com.ohgiraffers.springdatajpa.employee.dto.DepartmentDTO;
import com.ohgiraffers.springdatajpa.employee.dto.EmployeeDTO;
import com.ohgiraffers.springdatajpa.employee.entity.Department;
import com.ohgiraffers.springdatajpa.employee.entity.Employee;
import com.ohgiraffers.springdatajpa.employee.repository.DepartmentRepository;
import com.ohgiraffers.springdatajpa.employee.repository.EmployeeRepository;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    private final ModelMapper modelMapper;

    private final DepartmentRepository departmentRepository;

    public EmployeeService(EmployeeRepository employeeRepository, ModelMapper modelMapper, DepartmentRepository departmentRepository) {
        this.employeeRepository = employeeRepository;
        this.modelMapper = modelMapper;
        this.departmentRepository = departmentRepository;
    }

    public EmployeeDTO findEmployeeByNo(int empNo) {
        Employee selectedEmp = employeeRepository.findById(empNo).orElseThrow(IllegalArgumentException::new);
        return modelMapper.map(selectedEmp, EmployeeDTO.class);
    }

    public List<EmployeeDTO> findEmployeeList() {
        List<Employee> employeeList = employeeRepository.findAll(Sort.by("empNo"));
        return employeeList.stream().map(employee -> modelMapper.map(employee, EmployeeDTO.class)).collect(Collectors.toList());
    }

    public List<DepartmentDTO> findDepartmentList() {
        List<Department> departmentList = departmentRepository.findAll(Sort.by("dptNo"));
        return departmentList.stream().map(department -> modelMapper.map(department, DepartmentDTO.class)).collect(Collectors.toList());
    }

    @Transactional
    public void registNewEmp(EmployeeDTO newEmp) {
        System.out.println("newEmp = " + newEmp);
        employeeRepository.save(modelMapper.map(newEmp, Employee.class));
    }

    @Transactional
    public void registNewDpt(DepartmentDTO newDpt) {
        departmentRepository.save(modelMapper.map(newDpt, Department.class));
    }

    @Transactional
    public void updateEmp(EmployeeDTO updateEmp) {
        System.out.println("updateEmp = " + updateEmp);
        Employee selectedEmp = employeeRepository.findById(updateEmp.getEmpNo()).orElseThrow(IllegalArgumentException::new);

        selectedEmp = selectedEmp.empName(updateEmp.getEmpName()).builder();
        employeeRepository.save(selectedEmp);
        System.out.println("selectedEmp = " + selectedEmp);
    }

    @Transactional
    public void deleteEmp(Integer empNo) {
        employeeRepository.deleteById(empNo);
    }


    public List<DepartmentDTO> findDptList() {
        List<Department> departmentList = departmentRepository.findAllDpt();
        return departmentList.stream().map(department -> modelMapper.map(department, DepartmentDTO.class)).collect(Collectors.toList());
    }
}
