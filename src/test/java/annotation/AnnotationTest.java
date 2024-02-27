package annotation;

import org.junit.jupiter.api.*;

public class AnnotationTest extends BaseTest {

    @Disabled
    @Test
    public void methodTest1() {
        System.out.println("@Test1 " + commonField);
    }

    @DisplayName("this method tests UI")
    @Test
    public void methodTest2() {
        System.out.println("@Test2 " + commonField);
    }

    @Test
    public void methodTest3() {
        System.out.println("@Test3 " + commonField);
    }
}

