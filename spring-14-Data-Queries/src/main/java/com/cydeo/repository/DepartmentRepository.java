package com.cydeo.repository;

import com.cydeo.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DepartmentRepository extends JpaRepository<Department, String> { //String because in our table department is a primary key

    //display all departments in the Furniture department
    List<Department> findByDepartment(String departmentName);

    //display all departments in the Health division
    List<Department> findDepartmentByDivision(String division);
    List<Department> findByDivisionIs(String division);
    List<Department> findByDivisionEquals(String division);

    //display all departments with division name ends with "ics"
    List<Department> findByDivisionEndingWith(String pattern);

    //display top 3 departments with division name includes "hea" without duplicates
    List<Department> findDistinctTop3ByDivisionContains(String pattern);
}
