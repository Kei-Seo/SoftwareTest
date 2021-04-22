import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomCalculatorTest {

    private CustomCalculator customCalculator;

    //더하기 테스트
    @Test
    public void addTest(){
        customCalculator = new CustomCalculator();
        int result = customCalculator.add(10, 10);
        //데스트 코드 입력
        assertTrue(result == 20);
    }

    @Test
    public void subTest(){
        customCalculator = new CustomCalculator();
        int result = customCalculator.subtract(10, 3);
        assertTrue(result == 7);
    }

    @Test
    public void mulTest(){
        customCalculator = new CustomCalculator();
        int result = customCalculator.multiply(3, 10);
        assertTrue(result == 30);
    }

    @Test
    public void divTest(){
        customCalculator = new CustomCalculator();
        int result = customCalculator.divide(30 , 10);
        assertTrue(result == 3);
    }

}