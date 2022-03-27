import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WisdomWordsService {

    private String message = "Hard work pays off";

    public void setMessage(String message) {
        this.message = message;
    }

}