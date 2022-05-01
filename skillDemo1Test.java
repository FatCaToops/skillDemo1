// windows:
// javac -cp ".;libs\junit-4.12.jar;libs\hamcrest-core-1.3.jar" skillDemo1Test.java
// java -cp ".;libs\junit-4.12.jar;libs\hamcrest-core-1.3.jar" org.junit.runner.JUnitCore skillDemo1Test 

// javac -cp libs/junit-4.12.jar:libs/hamcrest-core-1.3.jar:. skillDemo1Test.java
// java -cp libs/junit-4.12.jar:libs/hamcrest-core-1.3.jar:. org.junit.runner.JUnitCore skillDemo1Test

import static org.junit.Assert.*;
import org.junit.*;

public class skillDemo1Test {
    @Test
    public void testSubstraction(){
        assertEquals(4, skillDemo1.substraction(7, 2));
    }
}
