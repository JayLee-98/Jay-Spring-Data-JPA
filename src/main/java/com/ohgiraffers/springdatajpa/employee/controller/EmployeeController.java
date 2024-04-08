package com.ohgiraffers.springdatajpa.employee.controller;

import com.ohgiraffers.springdatajpa.employee.dto.DepartmentDTO;
import com.ohgiraffers.springdatajpa.employee.dto.EmployeeDTO;
import com.ohgiraffers.springdatajpa.employee.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/menu")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


    @GetMapping("/{empNo}")
    public String findEmployeeByNo(@PathVariable int empNo, Model model) {
        EmployeeDTO resultEmp = employeeService.findEmployeeByNo(empNo);
        model.addAttribute("emp", resultEmp);

        return "menu/employeeDetail";
    }

    @GetMapping("/employeeList")
    public String findEmployeeList(Model model) {

        List<EmployeeDTO> employeeList = employeeService.findEmployeeList();
        model.addAttribute("employeeList", employeeList);

        return "menu/employeeList";
    }

    @GetMapping("/departmentList")
    public String findDepartmentList(Model model) {
        List<DepartmentDTO> departmentList = employeeService.findDepartmentList();
        model.addAttribute("dptList", departmentList);

        return "menu/departmentList";
    }

    @GetMapping("/registEmp")
    public void registEmpPage() {}

    @PostMapping("/registEmp")
    public String registEmp(EmployeeDTO employeeDTO) {
        employeeService.registNewEmp(employeeDTO);
        return "redirect:/menu/employeeList";
    }

    @GetMapping(value = "/dptNo", produces = "application/json; charset=UTF-8")
    @ResponseBody
    public List<DepartmentDTO> findDptList() {
        return employeeService.findDptList();
    }

    @GetMapping("/registDpt")
    public void registDptPage() {}

    @PostMapping("/registDpt")
    public String registDpt(DepartmentDTO newDpt) {
        employeeService.registNewDpt(newDpt);
        return "redirect:/menu/departmentList";
    }

    @GetMapping("/updateEmp")
    public void updateEmpPage() {}

    @PostMapping("/updateEmp")
    public String updateEmp(EmployeeDTO updateEmp) {
        employeeService.updateEmp(updateEmp);
        return "redirect:/menu/employeeList";
    }

    @GetMapping("/deleteEmp")
    public void deleteEmpPage() {}

    @PostMapping("/deleteEmp")
    public String deleteEmp(@RequestParam Integer empNo) {
        employeeService.deleteEmp(empNo);
        return "redirect:/menu/employeeList";
    }


}
