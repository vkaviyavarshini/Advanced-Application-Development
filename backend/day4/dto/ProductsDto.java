package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductsDto {
    private Long prod_id;
    private String prod_name;
    private String prod_category;
    private float prod_price;
    private String prod_image;
}

