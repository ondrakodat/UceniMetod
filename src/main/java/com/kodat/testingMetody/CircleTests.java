package com.kodat.testingMetody;

import org.junit.Assert;
import org.junit.Test;

public class CircleTests {
    @Test
    public void TestCircleArea(){

        double expectedArea =  Math.PI *(5*5);
        double actualArea = Circle.calculateArea(5);
        System.out.printf("Aktualni : " + actualArea + "\nOcekavana : " + expectedArea);
        Assert.assertEquals(expectedArea, actualArea, 0.001);
    }

    @Test
    public void TestCircleObvod(){
        double expectedResult = Math.PI * 2 * 5;
        double actualResult = Circle.calculate(5);
        System.out.printf("Aktualni : " + actualResult + "\nOcekavana : " + expectedResult);
        Assert.assertEquals(actualResult, expectedResult, 0.01);
    }
}
