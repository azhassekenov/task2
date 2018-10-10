package javatest;

import org.junit.*;

import static org.junit.Assert.*;

/**
 * Created by A.ZHASEKENOV on 10.10.2018.
 */
public class Task2Test {
    private Task2 task;

    @BeforeClass
    public static void beforeClass() {
        System.out.println(" Before Task2.class");
    }

    @AfterClass
    public  static void afterClass() {
        System.out.println(" After Task2.class");
    }

    @Before
    public void initTest() {
        task = new Task2();
    }

    @After
    public void afterTest() {
        task = null;
    }

    @Test
    public void testSummaVsehChisel() throws Exception {

        assertEquals((Object)23, (Object)task.summaVsehChisel(34268));
}
}