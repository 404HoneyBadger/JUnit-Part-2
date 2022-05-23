import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

 class Isosceles {

    static public int getParameter(int sideA, int sideB, int sideC){
        return sideA + sideB + sideC;
    }

    static boolean isIsosceles(int sideA, int sideB, int sideC){
        return sideA==sideB || sideA==sideC || sideB==sideC;
    }

    @Test
    public void testIsIsos(){
        int sideA=2;
        int sideB=3;
        int sideC=2;
        assertTrue(isIsosceles(sideA,sideB,sideC));

    }
}
