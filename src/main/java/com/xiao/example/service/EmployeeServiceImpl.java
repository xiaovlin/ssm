package com.xiao.example.service;

import com.xiao.example.dao.EmployeeMapper;
import com.xiao.example.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @date 10/13/2020 21:37
 */
public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeMapper employeeMapper;

    public void setEmployeeMapper(EmployeeMapper employeeMapper) {
        this.employeeMapper = employeeMapper;
    }

    public List<Employee> findAllEmployee() {
        return employeeMapper.findAllEmployee();
    }
}
