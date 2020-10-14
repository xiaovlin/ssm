package com.xiao.example.controller;

import com.sun.xml.internal.bind.v2.TODO;
import com.xiao.example.model.Employee;
import com.xiao.example.model.RespBean;
import com.xiao.example.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @date 10/14/2020 07:08
 */
@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/")
    public List<Employee> findAllEmployee() {
        return employeeService.findAllEmployee();
    }

    @GetMapping("/{id}")
    public Employee findEmployeeById(@PathVariable Long id) {
        return employeeService.findEmployeeById(id);
    }

    @PostMapping("/")
    public RespBean addEmployee(@RequestBody Employee employee) {
        if (employeeService.addEmployee(employee) == 1) {
            return RespBean.ok("添加成功");
        }

        return RespBean.ok("添加失败");
    }

    @PutMapping("/")
    public RespBean updateEmployee(@RequestBody Employee employee) {
        if (employeeService.updateEmployee(employee) == 1) {
            return RespBean.ok("更新成功");
        }

        return RespBean.ok("更新失败");
    }

    @DeleteMapping("/{id}")
    public RespBean deleteEmployeeById(@PathVariable Long id) {
        if (employeeService.deleteEmployeeById(id) == 1) {
            return RespBean.ok("删除成功");
        }

        return RespBean.error("删除失败");
    }

//  TODO: 批量删除的接口失败
    @DeleteMapping("/select")
    public RespBean deleteEmployeesById(Long[] id) {
        if (employeeService.deleteEmployeesById(id) == id.length) {
            return RespBean.ok("删除成功");
        }

        return RespBean.error("删除失败");
    }
}
