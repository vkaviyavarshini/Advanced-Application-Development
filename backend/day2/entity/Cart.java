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
@Table(name = "cart")
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cart_id;

    @Column(name = "_id", nullable = false)
    private String prod_id;

    @Column(name = "prod_name", nullable = false)
    private String prod_name;

    @Column(name = "prod_category", nullable = false)
    private String prod_category;

    @Column(name = "prod_price", nullable = false)
    private float prod_price;

    @Column(name = "prod_quantity", nullable = false)
    private int prod_quantity;

    @Column(name = "text_link", nullable = false)
    private String text_link; 

    @Column(name = "prod_total_price", nullable = false)
    private float prod_total_price;
    
    @Column(name = "prod_image", nullable = false)
    private String prod_image;

    
}
