package com.lofhjann.opendatatask2019;

import com.lofhjann.opendatatask2019.domain.SensorData;
import com.lofhjann.opendatatask2019.repository.SensorDataRepository;
import com.lofhjann.opendatatask2019.service.SensorDataService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class OpendataTask2019ApplicationTests {



    @Autowired
    private SensorDataService sensorDataService;

    @Autowired
    private SensorDataRepository sensorDataRepository;

    @Test
    public void sensorDataIsCreated() {
        SensorData sensorData = sensorDataService.restGet();
        Assert.assertTrue(sensorData.getDate() != null
                && sensorData.getSensor1() != null
                && sensorData.getSensor2() != null
                && sensorData.getSensor3() != null
                && sensorData.getSensor4() != null);
    }

    @Test
    public void sensorDataIsAddedToDb() {
        long count = sensorDataRepository.count();

        sensorDataService.create();
        Assert.assertTrue(sensorDataRepository.count() > count);
    }
}