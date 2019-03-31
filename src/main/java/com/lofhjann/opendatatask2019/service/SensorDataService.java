package com.lofhjann.opendatatask2019.service;

import com.lofhjann.opendatatask2019.domain.SensorData;
import com.lofhjann.opendatatask2019.repository.SensorDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SensorDataService {

    @Autowired
    private SensorDataRepository sensorDataRepository;

    private SensorData restGet() {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("Authorization", "Bearer " + System.getenv("accessToken"));
        HttpEntity entity = new HttpEntity(headers);

        return restTemplate.exchange("https://opendata.hopefully.works/api/events", HttpMethod.GET, entity, SensorData.class).getBody();
    }

    public void create() {
        SensorData sensorData = restGet();
        if (sensorDataRepository.findByDate(sensorData.getDate()).isEmpty()) {
            sensorDataRepository.save(sensorData);
        }
    }
}
