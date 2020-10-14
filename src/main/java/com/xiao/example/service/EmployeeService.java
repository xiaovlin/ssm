package com.xiao.example.service;

import com.xiao.example.model.Employee;

import java.util.List;

/**
 * @date 10/13/2020 21:32
 */
public interface EmployeeService {
    Employee findEmployeeById(Long id);
    Integer addEmployee(Employee employee);
    Integer updateEmployee(Employee employee);
    Integer deleteEmployeeById(Long id);
    List<Employee> findAllEmployee();
    Integer deleteEmployeesById(Long[] id);
}
