package temaAdnotari;

import org.springframework.stereotype.Component;

@Component
public class JavaTeacher implements ITeacher {

    @Override
    public String getHomeWork() {
        return "Java homework";
    }
}
