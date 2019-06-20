package com.pasindu.emscloud.service;

import com.pasindu.emscloud.commons.model.Employee;
import com.pasindu.emscloud.repository.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findById(Employee employee) {
        Optional<Employee> optional = employeeRepository.findById(employee.getId());
        if (optional.isPresent()) {
            return optional.get();
        }
        return null;
    }

    @Override
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }
}
