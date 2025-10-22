package br.com.mandakaruconn.SIS.entity;

import br.com.mandakaruconn.SIS.embedded.Address;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "schools")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class School {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @NotBlank
    private String name;

    @NotBlank
    @Column(unique = true)
    private String cnpj;

    private String phone;

    @Embedded
    private Address address;


    @OneToMany(
            mappedBy = "school",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<User> users = new ArrayList<>();

    @OneToMany(
            mappedBy = "school",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Classroom> classrooms = new ArrayList<>();

    @OneToMany(
            mappedBy = "school",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Subject> subjects = new ArrayList<>();

}