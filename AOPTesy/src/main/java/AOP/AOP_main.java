package AOP;

import service.FactoryService;
import service.Shapeservice;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOP_main {
    public static void main(String[] args) {
//        ApplicationContext ctx =new ClassPathXmlApplicationContext("spring.xml");
//        Shapeservice shapeservice =ctx.getBean("service", Shapeservice.class);
//        System.out.println(shapeservice.getTriangle().getName());

        FactoryService factoryService=new FactoryService();
        Shapeservice shapeservice = (Shapeservice) factoryService.getBean("shapeservice");
        shapeservice.getCircle();
    }
}
