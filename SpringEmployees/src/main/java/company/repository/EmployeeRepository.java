package company.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import company.beans.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
