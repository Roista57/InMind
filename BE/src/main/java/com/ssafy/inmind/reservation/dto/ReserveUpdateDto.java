package com.ssafy.inmind.reservation.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@AllArgsConstructor
public class ReserveUpdateDto {

    private Long reserveInfoIdx;
}
