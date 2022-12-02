package lesson_1;


import jdk.jfr.Description;
import org.testng.annotations.*;


public class MyTest {

    @BeforeClass
    public void beforeClassTest(){
        System.out.println("перед классом");
    }

    @BeforeTest
    public void test(){
        System.out.println("перед тестом");
    }

    @BeforeMethod
    public void beforeTestMethod(){
        System.out.println("выполнить перед методом");
    }

    @DataProvider(name = "myDp")
    public Object [][] dataProvider() {
         return new Object[][] {
                 {"qw@gmail.com", "qaw"},
                 {"1qw@gmail.com", "1qaw"},
                 {"2qw@gmail.com", "2qaw"}
         };
    }

    @Test(dataProvider = "myDp")
    @Description("Выводит первый тест")
    public void firstTest(String login, String pasword){
        System.out.println(login);
        System.out.println(pasword);
    }

    @Test()
    public void secondTest(){
        System.out.println("Второй тест");
    }

    @AfterMethod
    public void afterMethodTest(){
        System.out.println("выполить поле выполнения метода");
    }

    @AfterTest
    public void after(){
        System.out.println("после теста");
    }


}
