package temaAdnotari;

import org.springframework.stereotype.Component;

@Antet(school = "Caragiale", name = "Oana")
@Component
public class WebDevTeacher implements ITeacher {
    private WisdomService wisdomService;

    public WebDevTeacher(WisdomService wisdomService){
        this.wisdomService = wisdomService;
    }

   @Override
    public String getHomeWork(){
        return "WebDev homework";
    }
}
