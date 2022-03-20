package tema;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter

public class Motor {
    private int putere;
    private String nume;
    private int numarCilindri;

}
