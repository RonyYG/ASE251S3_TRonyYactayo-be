package pe.edu.vallegrande.mybackend.rest; // O la carpeta donde esté

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.vallegrande.mybackend.model.Employee;
import pe.edu.vallegrande.mybackend.service.EmployeeService;
import java.util.List;

@RestController
@RequestMapping("/employees") // <--- ESTO ES LO QUE BUSCA POSTMAN
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @GetMapping
    public List<Employee> findAll() {
        return service.findAll();
    }

    @PostMapping
    public Employee save(@RequestBody Employee employee) {
        return service.save(employee);
    }
}