package com.pasindu.emscloud.service;

import com.pasindu.emscloud.commons.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    Employee save(Employee employee);
    Employee findById(Employee employee);
    List<Employee> findAll();

}
