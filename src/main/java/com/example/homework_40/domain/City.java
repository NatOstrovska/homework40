package com.example.homework_40.domain;

import jakarta.persistence.*;
import lombok.*;

@Data
@Table(name = "city")
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "city_name")
    private String cityName;

    @ManyToOne
    @JoinColumn(name = "country_id")
    @Getter(AccessLevel.NONE)
    private Country country;

}
