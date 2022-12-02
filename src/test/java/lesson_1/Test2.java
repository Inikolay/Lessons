package lesson_1;

import lesson_1.listener.MyListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
//@Listeners(MyListener.class)
public class Test2 {
    @Test
    public void test2(){
        System.out.println("Тест 2");
    }
}
