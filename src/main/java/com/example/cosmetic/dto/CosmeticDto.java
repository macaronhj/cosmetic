package com.example.cosmetic.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CosmeticDto {
    private Long seq;
    private String name;
    private Long count;
    private String company;
    private int sale;
}
