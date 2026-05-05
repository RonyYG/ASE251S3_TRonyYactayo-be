package pe.edu.vallegrande.mybackend.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Data
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

    // Campos de Auditoría
    @Column(length = 1)
    private String status; // 'A' activo, 'I' inactivo

    private String userCreate;
    private LocalDateTime dateCreate;

    private String userUpdate;
    private LocalDateTime dateUpdate;
}