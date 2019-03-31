package com.lofhjann.opendatatask2019.repository;

import com.lofhjann.opendatatask2019.domain.SensorData;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface SensorDataRepository extends JpaRepository<SensorData, Long> {
    List<SensorData> findByDate(LocalDateTime date);
}
