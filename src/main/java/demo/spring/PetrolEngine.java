package demo.spring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class PetrolEngine implements Engine
{
    public void start() {
        System.out.println("PetrolEngine is started!");
    }

    public PetrolEngine() {
        System.out.println("PetrolEngine bean is created!");
    }
}
