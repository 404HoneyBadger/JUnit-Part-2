import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UPractice1 {

    int x = 2;
    int y = 3;
    int z = 3;

    @Test
    public void pTestMethod(){
        assertEquals(y,z);
    }
    @Test
    public void pTestMethod2(){
        assertNotEquals(x,y);
    }
}

class UPractice2{

    int x = 2;
    int y = 3;
    int z = 3;

    boolean a = (x==y);
    boolean b = (y==z);

    @Test
    public void pTestMethod3(){
        assertTrue(b);
        assertFalse(a);
    }
}
