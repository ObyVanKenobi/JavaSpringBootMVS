package com.mcb.creditfactory.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;



@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "AirPlane")
public class AirPlane {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String brand;
    private String model;
    private Double power;

    @Column(name = "year_of_issue")
    private Short year;

    @JoinColumn(name = "assessed_value")
    @OneToMany(cascade = CascadeType.ALL,  fetch = FetchType.LAZY)
    private List<Rate> rate;

}

