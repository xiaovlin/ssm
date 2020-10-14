package com.xiao.example.service;

import com.xiao.example.dao.EmployeeMapper;
import com.xiao.example.model.Employee;

import java.util.List;

/**
 * @date 10/13/2020 21:37
 */
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeMapper employeeMapper;

    public void setEmployeeMapper(EmployeeMapper employeeMapper) {
        this.employeeMapper = employeeMapper;
    }

    public Employee findEmployeeById(Long id) {
        return employeeMapper.selectByPrimaryKey(id);
    }

    public Integer addEmployee(Employee employee) {
        return employeeMapper.insertSelective(employee);
    }

    public Integer updateEmployee(Employee employee) {
        return employeeMapper.updateByPrimaryKeySelective(employee);
    }

    public Integer deleteEmployeeById(Long id) {
        return employeeMapper.deleteByPrimaryKey(id);
    }

    public List<Employee> findAllEmployee() {
        return employeeMapper.findAllEmployee();
    }

    public Integer deleteEmployeesById(Long[] id) {
        return employeeMapper.deleteEmployeesById(id);
    }
}
