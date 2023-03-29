package com.orkun.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class StudentUpdateRequestDto {
    Long id;
    String name;
    String surname;

}

/*
public class ComputerUpdateRequestDto {
    private Integer id;
    private String computerBrand;
    private Double computerPrice;
}*/
