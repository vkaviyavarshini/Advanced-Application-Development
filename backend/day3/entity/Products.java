package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "products")
public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long prod_id;

    @Column(name = "prod_name", nullable = false)
    private String prod_name;

    @Column(name = "prod_category", nullable = false)
    private String prod_category;

    @Column(name = "prod_price", nullable = false)
    private float prod_price;
    
    @Column(name = "prod_image", nullable = false)
    private String prod_image;

    
}
