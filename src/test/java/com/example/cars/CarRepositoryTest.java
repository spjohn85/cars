package com.example.cars;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;


import static org.assertj.core.api.Assertions.*;

@RunWith(SpringRunner.class)
@DataJpaTest
public class CarRepositoryTest {

    @Autowired
    private CarRepository repository;

    @Autowired
    TestEntityManager testEntityManager;

    @Test
    public void getCarDetails() {
        //Cars savedCar = testEntityManager.persistAndFlush(new Cars("prius", "hybrid"));
        Cars c=repository.findByName("prius");
        assertThat(c.getName()).isEqualTo("prius");
        //assertThat(c.getType()).isEqualTo(savedCar.getType());
    }
}