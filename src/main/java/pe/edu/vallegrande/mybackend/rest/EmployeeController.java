package pe.edu.vallegrande.mybackend.rest; // <-- Asegúrate que diga mybackend

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.vallegrande.mybackend.model.Employee;    // <-- Import correcto
import pe.edu.vallegrande.mybackend.service.EmployeeService; // <-- Import correcto

import java.util.List;

@RestController
@RequestMapping("/employees")
@CrossOrigin(origins = "*")
public class EmployeeController {
    @Autowired
    private EmployeeService service;

    @GetMapping
    public List<Employee> list() { return service.findAll(); }

    @PostMapping
    public Employee create(@RequestBody Employee employee) { return service.save(employee); }

    @PutMapping("/{id}")
    public Employee update(@PathVariable Long id, @RequestBody Employee employee) {
        employee.setId(id);
        return service.save(employee);
    }

    @PatchMapping("/delete/{id}")
    public void deleteLogical(@PathVariable Long id) { service.deleteLogical(id); }

    @PatchMapping("/restore/{id}")
    public void restore(@PathVariable Long id) { service.restore(id); }

    @DeleteMapping("/{id}")
    public void deletePhysical(@PathVariable Long id) { service.deletePhysical(id); }
}