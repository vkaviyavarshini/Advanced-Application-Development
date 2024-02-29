package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CartDto {
    private Long prod_id;
    private String prod_name;
    private String prod_category;
    private float prod_price;
    private int prod_quantity;
    private String text_link;
    private float prod_total_price;
    private String prod_image;
}

