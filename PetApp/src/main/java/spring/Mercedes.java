package spring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Mercedes extends Car{
    private String model;

    private List<String> models = new ArrayList<>();
    {
        models.add("A-Class");
        models.add("CLA-Class");
        models.add("C-Class");
        models.add("E-Class");
        models.add("S-Class");
        models.add("Maybach S-Class");
        models.add("AMG GT");
    }
    public String getSlogan(){
        return "The best or nothing";
    }

    public Mercedes (){
        this.model = models.get((int)(Math.random()*models.size()));
    }

    public String toString(){
        return "You won Mercedes-Benz model: "+ model +"\n(C)"+ getSlogan();
    }

}
