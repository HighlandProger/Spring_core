package spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        Drive drive = context.getBean("drive", Drive.class);
        System.out.println(drive.toString());
        context.close();
    }
}
