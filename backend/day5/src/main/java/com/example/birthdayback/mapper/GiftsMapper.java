package com.example.birthdayback.mapper;

import com.example.birthdayback.dto.GiftsDto;
import com.example.birthdayback.entity.Gifts;

public class GiftsMapper {
    
    public static GiftsDto mapToCakeDto(Gifts cake)
    {
        return new  GiftsDto(
            cake.getId(),
            cake.getName(),
            cake.getAmount(),
            cake.getCategory(),
            cake.getImageUrl()
        );
    }

    public static Gifts mapToCake(GiftsDto cakeDto)
    {
        return new Gifts(
            cakeDto.getId(),
            cakeDto.getName(),
            cakeDto.getAmount(),
            cakeDto.getCategory(),
            cakeDto.getImageUrl()
        );
    }
}
