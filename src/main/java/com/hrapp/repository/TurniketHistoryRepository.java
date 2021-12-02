package com.hrapp.repository;


import com.hrapp.entity.Tourniquet;
import com.hrapp.entity.TurniketHistory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Timestamp;
import java.util.List;
import java.util.UUID;

public interface TurniketHistoryRepository extends JpaRepository<TurniketHistory, UUID> {
    List<TurniketHistory> findAllByTurniketAndTimeIsBetween(Tourniquet turniket, Timestamp time, Timestamp time2);
    List<TurniketHistory> findAllByTurniket(Tourniquet turniket);
}
