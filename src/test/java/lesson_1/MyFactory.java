package lesson_1;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class MyFactory {
    @Factory
    @Test
    public Object[] getAllTest(){
        Object[] test = new Object[3];
        test[0] = new Test1();
        test[1] = new Test2();
        test[2] = new Test3();
        return test;
    }
}
