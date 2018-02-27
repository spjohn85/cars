package com.example.cars;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.mockito.BDDMockito.given;

@RunWith(MockitoJUnitRunner.class)
public class CarServiceTest {

    @Mock
    CarRepository carRepository;

    private CarService carService;

    @Before
    public void setUp() throws Exception {
        carService=new CarService(carRepository);
    }

    @Test
    public void getCarDetails() {
        given(carRepository.findByName("prius")).willReturn(new Cars("prius", "hybrid"));

        Cars cars=carService.getCarDetails("prius");
        assertThat(cars.getName()).isEqualTo("prius");
        assertThat(cars.getType()).isEqualTo("hybrid");
    }

    @Test (expected = CarNotFoundException.class)
    public void getCarDetails_NotFound() {
        given(carRepository.findByName("prius")).willReturn(null);
        carService.getCarDetails("prius");
    }
}