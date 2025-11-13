package demo.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car
{
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Car() {
        System.out.println("Car bean is created!");
    }

    void drive() {
        engine.start();
        System.out.println("___________________________________________");
        System.out.println(engine.getClass().getName()+" Car is running..!");
    }
}
