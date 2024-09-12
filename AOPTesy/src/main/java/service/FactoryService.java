package service;

public class FactoryService {

    public Object getBean(String beanType){
        if(beanType.equals("shapeservice"))return new Shapeservice();
        if(beanType.equals("circle"))return new Shapeservice();
        if(beanType.equals("triangle"))return new Shapeservice();
        return null;
    }
}
