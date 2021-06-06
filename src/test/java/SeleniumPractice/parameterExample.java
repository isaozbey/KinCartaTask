package SeleniumPractice;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterExample {

    @Test(description = "parameterization")
    @Parameters({"name"})
    public void test1( String name){

        System.out.println("name = " + name);
    }

}
