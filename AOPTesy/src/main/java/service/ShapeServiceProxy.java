package service;

import AOP.Circle;
import aspect.LoggingAspect;

public class ShapeServiceProxy extends Shapeservice{
    @Override
    public Circle getCircle() {
        new LoggingAspect().loggingAdvice();
        return super.getCircle();
    }
}
