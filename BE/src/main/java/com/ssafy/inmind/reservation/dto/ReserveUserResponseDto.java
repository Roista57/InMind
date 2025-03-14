package com.ssafy.inmind.reservation.dto;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class ReserveUserResponseDto {
    private Long reserveInfoIdx;
    private Long coIdx;
    private Long reportIdx;
    private String coName;
    private String childName;
    private LocalDate reserveInfoDate;
    private LocalTime reserveInfoStartTime;
    private LocalTime reserveInfoEndTime;
    private LocalDateTime reserveInfoCreateTime;
    private String isEnd;
}
