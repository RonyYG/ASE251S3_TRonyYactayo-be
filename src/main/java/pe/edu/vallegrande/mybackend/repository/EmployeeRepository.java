package pe.edu.vallegrande.mybackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.vallegrande.mybackend.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}