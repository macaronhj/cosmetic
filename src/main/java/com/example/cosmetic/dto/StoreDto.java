package com.example.cosmetic.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class StoreDto {
    private Long s_seq;
    private String name;
    private String Location;
    private LocalDateTime create_at;
}
