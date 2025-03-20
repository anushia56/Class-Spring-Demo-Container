package bt.edu.gcit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // System.out.println("Hello world!");
        // Alien obj = new Alien();
        // obj.code();
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); //creates a ioc container

        //bean scope

        Alien obj = (Alien) context.getBean("alien"); //give var to store the ojb not create obj
        // obj.code();
        // Alien obj1 = (Alien) context.getBean("alien"); //creates
        // obj.code();

        //DI Setters injection
        // Alien obj = (Alien) context.getBean("alien"); //creates
        // System.out.println(obj.getAge());

    }
}