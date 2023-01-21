package com.example.demotutorial.repository;


import com.example.demotutorial.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

    public Department findByDepartmentName(String departmentName);

    public Department findByDepartmentNameIgnoreCase(String departmentName);

  public Department findByDepartmentCode(String departmentCode);

  @Query("FROM Department D Where D.departmentName like %:departmentName%")
    public Department searchDepartment(@Param("departmentName") String departmentName);



}
