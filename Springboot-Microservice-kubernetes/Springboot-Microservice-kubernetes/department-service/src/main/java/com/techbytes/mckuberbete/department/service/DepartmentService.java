package com.techbytes.mckuberbete.department.service;

import com.techbytes.mckuberbete.department.entity.Department;
import com.techbytes.mckuberbete.department.repository.DepartmentRepository;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
       
        return departmentRepository.save(department);
    }

    public Department findDepartmentById(Long departmentId) {
        
        return departmentRepository.findByDepartmentId(departmentId);
    }
}
