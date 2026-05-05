package pe.edu.vallegrande.mybackend.repository;

import pe.edu.vallegrande.mybackend.model.Employee; // Asegúrate que el import también sea mybackend
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}