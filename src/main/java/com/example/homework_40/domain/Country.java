package com.example.homework_40.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Table(name = "country")
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "country_name")
    private String countryName;
    @Column(name = "country_capital")
    private String countryCapital;

    @OneToMany(mappedBy = "country")
    private List<City> city;
}
