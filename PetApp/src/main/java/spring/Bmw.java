package spring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Bmw extends Car{

    private String model;

    private List<String> models = new ArrayList<>();
    {
        models.add("X");
        models.add("Gran Coupe");
        models.add("Cabrio");
        models.add("GT");
        models.add("Long");
        models.add("Roadster");
        models.add("iX");
    }
    public String getSlogan(){
        return "The Ultimate Driving Machine";
    }

    public Bmw(){
        this.model = models.get((int)(Math.random()*models.size()));
    }

    public String toString(){
        return "You won BMW model: "+ model +"\n(C)"+ getSlogan();
    }
}
