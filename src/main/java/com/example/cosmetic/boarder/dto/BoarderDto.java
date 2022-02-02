package com.example.cosmetic.boarder.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoarderDto {
    private Long seq;
    private String name;
    private Long count;
    private String company;
    private int sale;
}
