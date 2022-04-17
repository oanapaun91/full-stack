package tema;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MyAspect {
    @Pointcut("execution(* run(..))")
    private void runMethodCall() {
    }

    @After(value = "runMethodCall()", argNames = "joinPoint")
    public void afterCall(JoinPoint joinPoint) {
        System.out.println("Run method was executed");
    }
}
