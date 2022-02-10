package example;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

// @RunWith attaches a runner with the test class to initialize the test data
@RunWith(MockitoJUnitRunner.class)
public class CarTest {

  @InjectMocks
  example.service.CarService service = new example.service.CarServiceImpl();

    @Test
    public void createCar_getPrice() {
      example.model.Car o = service.createCar();
      double expected = 0;
      assertEquals(o.getPrice(), expected);
    }

    @Test
    public void createCar_getYear() {
      example.model.Car o = service.createCar();
      int expected = 0;
      assertEquals(o.getYear(), expected);
    }

    @Test
    public void createCar_getMake() {
      example.model.Car o = service.createCar();
      String expected = "test";
      assertEquals(o.getMake(), expected);
    }

    @Test
    public void createCar_getModel() {
      example.model.Car o = service.createCar();
      String expected = "test";
      assertEquals(o.getModel(), expected);
    }

    @Test
    public void createCar_objectNotNull() {
      example.model.Car o = service.createCar();
      assertNotNull(o);
    }

    @Test
    public void createRandomCar_objectNotNull() {
      example.model.Car o = service.createRandomCar();
      assertNotNull(o);
    }

    @Test
    public void findAll_sizeIsThree() {
      List<example.model.Car> lst = service.findAll();
      int expected = 3;
      assertEquals(lst.size(), expected);
    }

    @Test
    public void addCar_sizeIsFour() {
      List<example.model.Car> lst = service.addCar();
      int expected = 4;
      assertEquals(lst.size(), expected);
    }

    @Test
    public void deleteCar_sizeIsTwo() {
      List<example.model.Car> lst = service.deleteCar();
      int expected = 2;
      assertEquals(lst.size(), expected);
    }
}
