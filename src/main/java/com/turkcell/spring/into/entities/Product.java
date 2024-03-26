package com.turkcell.spring.into.entities;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "products")
public class Product {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @Column(name = "unit_price")
    private double unitPrice;



    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

}
