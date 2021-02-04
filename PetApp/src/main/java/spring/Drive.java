package spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

@Component
public class Drive {
    private Car car;

    @PostConstruct
    public void initMethod(){
        System.out.println("It says: \"You never know, what is going to happen\"\n\n");
    }

    @PreDestroy
    public void destroyMethod(){
        System.out.println("But whatever would happen, you have to always stay human");
    }


    //If you want to win other model, change "@Qualifier" here.
    @Autowired
    public Drive(@Qualifier("bmw") Car car){
        this.car = car;
    }
    public void saySlogan(){
        System.out.println(car.getSlogan());
    }
    public String toString(){
        return "Congratulations!!! "+car.toString()+"\n\n";
    }

}
