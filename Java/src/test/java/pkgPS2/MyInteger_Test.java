package pkgPS2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


import static org.junit.Assert.*;

public class MyInteger_Test {
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    @BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}
    
    @AfterClass
	public static void tearDownAfterClass() throws Exception {
	}


    @Test
    public void isEven() throws Exception {
        MyInteger i = new MyInteger(10);
        boolean expectedValue = true;

        assertEquals(i.isEven(), expectedValue);
    }

    @Test
    public void isOdd() throws Exception {
        MyInteger i = new MyInteger(13);
        boolean expectedValue = true;

        assertEquals(i.isOdd(), expectedValue);
    }

    @Test
    public void isPrime() throws Exception {
        MyInteger i = new MyInteger(3);
        boolean expectedValue = true;

        assertEquals(i.isPrime(), expectedValue);
    }

    @Test
    public void isEven1() throws Exception {
        MyInteger i = new MyInteger(10);
        int x = 5;
        boolean expectedValue = false;

        assertEquals(i.isEven(x), expectedValue);
    }

    @Test
    public void isOdd1() throws Exception {
        MyInteger i = new MyInteger(10);
        int x = 6;
        boolean expectedValue = false;

        assertEquals(i.isOdd(x), expectedValue);
    }

    @Test
    public void isPrime1() throws Exception {
        MyInteger i = new MyInteger(10);
        int x = 4;
        boolean expectedValue = false;

        assertEquals(i.isPrime(x), expectedValue);
    }

    @Test
    public void isEven2() throws Exception {
        MyInteger i1 = new MyInteger(10);
        MyInteger i2 = new MyInteger(20);
        boolean expectedValue = true;

        assertEquals(i1.isEven(i2), expectedValue);
    }

    @Test
    public void isOdd2() throws Exception {
        MyInteger i1 = new MyInteger(10);
        MyInteger i2 = new MyInteger(9);
        boolean expectedValue = true;

        assertEquals(i1.isOdd(i2), expectedValue);
    }

    @Test
    public void isPrime2() throws Exception {
        MyInteger i1 = new MyInteger(10);
        MyInteger i2 = new MyInteger(7);
        boolean expectedValue = true;

        assertEquals(i1.isPrime(i2), expectedValue);
    }

    @Test
    public void isEquals() throws Exception {
        MyInteger i = new MyInteger(10);
        int x = 10;
        boolean expectedValue = true;

        assertEquals(i.isEquals(x), expectedValue);
    }

    @Test
    public void isEquals1() throws Exception {
        MyInteger i1 = new MyInteger(10);
        MyInteger i2 = new MyInteger(10);
        boolean expectedValue = true;

        assertEquals(i1.isEquals(i2), expectedValue);
    }

}