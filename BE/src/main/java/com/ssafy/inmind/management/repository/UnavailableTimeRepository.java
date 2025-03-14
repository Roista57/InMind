package com.ssafy.inmind.management.repository;


import com.ssafy.inmind.management.entity.UnavailableTime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Optional;

public interface UnavailableTimeRepository extends JpaRepository<UnavailableTime, Long> {
    @Query("SELECT u FROM UnavailableTime u WHERE u.user.id = :counselorId " +
            "AND u.date = :date " +
            "AND (u.startTime = :startTime)")
    List<UnavailableTime> findConflictingUnavailableTimes(@Param("counselorId") Long counselorId,
                                                          @Param("date") LocalDate date,
                                                          @Param("startTime") LocalTime startTime);

    List<UnavailableTime> findByUserId(long counselorId);
    List<UnavailableTime> findByUserIdAndDate(Long userId, LocalDate date);
    Optional<UnavailableTime> findByUserIdAndDateAndStartTime(Long userId, LocalDate date, LocalTime startTime);
}
