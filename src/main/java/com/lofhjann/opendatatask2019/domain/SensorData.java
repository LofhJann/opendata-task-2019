package com.lofhjann.opendatatask2019.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity

@JsonIgnoreProperties(ignoreUnknown = true)
public class SensorData extends AbstractPersistable<Long> {

    private LocalDateTime date;
    private Double sensor1;
    private Double sensor2;
    private Double sensor3;
}
