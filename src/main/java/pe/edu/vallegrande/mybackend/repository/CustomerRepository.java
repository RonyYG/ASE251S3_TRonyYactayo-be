package pe.edu.vallegrande.mybackend.repository;
import pe.edu.vallegrande.mybackend.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}