package tema;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class DriveTest {
    Autocar autocar;
    Masina masina;
    @Autowired
    Motocicleta motocicleta;

    @Autowired
    public DriveTest(Masina masina) {
        this.masina = masina;
    }

    @Autowired
    public void setAutocar(Autocar autocar) {
        this.autocar = autocar;
    }
}
