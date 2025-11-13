package demo.spring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class DieselEngine implements Engine
{
    public void start() {
        System.out.println("DieselEngine is started!");
    }

    public DieselEngine() {
        System.out.println("DieselEngine bean is created!");
    }
}
