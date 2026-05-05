package pe.edu.vallegrande.mybackend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.vallegrande.mybackend.model.Employee;
import pe.edu.vallegrande.mybackend.repository.EmployeeRepository;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    public List<Employee> findAll() { return repository.findAll(); }

    public Employee save(Employee employee) { return repository.save(employee); }

    public void deleteLogical(Long id) {
        repository.findById(id).ifPresent(emp -> {
            emp.setStatus("I");
            repository.save(emp);
        });
    }

    public void restore(Long id) {
        repository.findById(id).ifPresent(emp -> {
            emp.setStatus("A");
            repository.save(emp);
        });
    }

    public void deletePhysical(Long id) { repository.deleteById(id); }
}