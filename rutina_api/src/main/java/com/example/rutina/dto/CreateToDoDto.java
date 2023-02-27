package com.example.rutina.dto;

import lombok.Data;

@Data
public class CreateToDoDto {
    private String name;
    private Boolean completed;
}