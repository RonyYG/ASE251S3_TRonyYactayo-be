package pe.edu.vallegrande.mybackend.rest;
import pe.edu.vallegrande.mybackend.model.Customer;
import pe.edu.vallegrande.mybackend.repository.CustomerRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/customer")
public class CustomerRest {
    private final CustomerRepository repository;
    public CustomerRest(CustomerRepository repository) { this.repository = repository; }
    @GetMapping
    public List<Customer> getAll() { return repository.findAll(); }
}