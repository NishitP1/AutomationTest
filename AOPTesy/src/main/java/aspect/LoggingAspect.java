package aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class LoggingAspect {
//    @Before("allCircleMethods()")
//    public void LoggingAdvice(JoinPoint joinPoint) {
//    }
//    // If the advised method doesn't return a value
//    @AfterReturning(pointcut = "args(name)")
//    public void stringArgumentMethods(String name) {
//        System.out.println("A method that takes String arguments has been called. The value is " + name);
//    }

//    // If the advised method returns a value with a different name
//    @AfterReturning(pointcut = "args(name)", returning = "actualReturnParameterName")
//    public void stringArgumentMethods(String name, Object actualReturnParameterName) {
//        System.out.println("A method that takes String arguments has been called. The value is " + name +
//                " The output value is " + actualReturnParameterName);
//    }

//    @AfterThrowing(pointcut = "args(name)", throwing = "ex")
//    public void exceptionAdvice(String name, Exception ex) {
//        System.out.println("An exception has been thrown: " + ex);
//    }

    public Object myAroundAdvice(ProceedingJoinPoint proceedingJoinPoint) {
        Object returnValue = null;
        try {
            System.out.println("Before advice");
            returnValue = proceedingJoinPoint.proceed();
            System.out.println("After Returning");
        } catch (Throwable e) {
            System.out.println("After Throwing");
        } finally {
            System.out.println("After Finally");
        }
        return returnValue;
    }
   public void loggingAdvice(){
       System.out.println("logging from the the advice");
   }
}
