package tema;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tema.Automobil;

@Component
public class Masina implements Automobil {
    private Motor motor;

    @Autowired
    public Masina (Motor motor){
        this.motor = motor;
    }

    @Override
    public String travel() {
        return "Calatoreste cu Masina";
    }

    @Override
    public int maxDrivingSpeed() {
        return 50;
    }
}
