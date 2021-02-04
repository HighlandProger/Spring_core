package spring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Audi extends Car {
    private String model;

    private List<String> models = new ArrayList<>();
    {
        models.add("A3");
        models.add("A4");
        models.add("A5 Sportback");
        models.add("A6");
        models.add("S6");
        models.add("RS6");
        models.add("A7 Sportback");
        models.add("A8");
        models.add("S8");
    }
    public String getSlogan(){
        return "Being Ahead through Technology";
    }

    public Audi (){
        this.model = models.get((int)(Math.random()*models.size()));
    }

    public String toString(){
        return "You won BMW model: "+ model +"\n(C)"+ getSlogan();
    }

}
