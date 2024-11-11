package ua.edu.ucu.apps.demo.flowerStore.model;
import java.time.LocalDate;
import java.time.Period;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class AppUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private LocalDate dob;

    @Column
    @Transient
    private Integer age;

    public Integer getAge() {
        return Period.between(this.dob, LocalDate.now()).getYears();
    }

    public AppUser(String email, LocalDate dob) {
        this.email = email;
        this.dob = dob;
    }
}
