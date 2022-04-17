package animals;

import org.springframework.core.env.SystemEnvironmentPropertySource;

public class Cat implements IAnimal {
    private String animalName;

    public Cat(String name) {
        this.animalName = name;
    }

    public Cat() {
    }

    @Override
    public String makeSound() {
        return "Miau";
    }
}
