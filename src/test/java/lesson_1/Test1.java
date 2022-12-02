package lesson_1;

import org.testng.annotations.Test;

public class Test1 {
    @Test(groups = {"basket"})
    public void test1(){
        System.out.println("Тест 1");
    }
}
