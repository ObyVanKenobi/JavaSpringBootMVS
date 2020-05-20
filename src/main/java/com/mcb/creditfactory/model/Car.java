package com.mcb.creditfactory.model;

import lombok.*;

import javax.persistence.*;
import java.util.*;


@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "CAR")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String brand;
    private String model;
    private Double power;


    @Column(name = "year_of_issue")
    private Short year;

    @JoinColumn(name = "assessed_value_id")
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Rate> rates;



}
