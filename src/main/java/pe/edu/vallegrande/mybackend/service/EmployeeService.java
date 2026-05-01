package pe.edu.vallegrande.mybackend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.vallegrande.mybackend.model.Employee;
import pe.edu.vallegrande.mybackend.repository.EmployeeRepository;
import java.time.LocalDateTime;
import java.util.List; // <--- No olvides este import

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    // Método para listar (El que te falta)
    public List<Employee> findAll() {
        return repository.findAll();
    }

    public Employee save(Employee employee) {
        employee.setStatus("A");
        employee.setUserCreate("RONY_ADMIN");
        employee.setDateCreate(LocalDateTime.now());
        return repository.save(employee);
    }

    public Employee findById(Long id) {
        return repository.findById(id).orElse(null);
    }
}