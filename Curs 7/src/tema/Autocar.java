package tema;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Autocar implements Automobil {
    @Autowired private Motor motor;

    @Override
    public String travel() {
        return "Calatoreset cu autocarul.";
    }

    @Override
    public int maxDrivingSpeed() {
        return 80;
    }
}
