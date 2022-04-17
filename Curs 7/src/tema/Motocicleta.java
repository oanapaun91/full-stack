package tema;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tema.Automobil;

@Component
public class Motocicleta implements Automobil {
    private Motor motor;

    @Autowired
    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    @Override
    public String travel() {
        return "Calatoreste cu motocicleta";
    }

    @Override
    public int maxDrivingSpeed() {
        return 100;
    }
}
