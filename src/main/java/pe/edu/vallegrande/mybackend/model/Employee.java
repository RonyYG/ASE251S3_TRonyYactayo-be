package pe.edu.vallegrande.mybackend.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String dni;
    private String names;
    private String lastNames;
    private String email;
    private String phone;
    private String position;
    private Double salary;
    private String department;
    private String status;
    private String userCreate;
    private LocalDateTime dateCreate;
    private LocalDateTime dateUpdate;

    // --- GETTERS Y SETTERS MANUALES (Para que Maven no de error) ---
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getUserCreate() { return userCreate; }
    public void setUserCreate(String userCreate) { this.userCreate = userCreate; }

    public LocalDateTime getDateCreate() { return dateCreate; }
    public void setDateCreate(LocalDateTime dateCreate) { this.dateCreate = dateCreate; }

    // (Agrega los demás si quieres, pero estos 3 son los que te bloquean el Build)
    public String getNames() { return names; }
    public void setNames(String names) { this.names = names; }
}