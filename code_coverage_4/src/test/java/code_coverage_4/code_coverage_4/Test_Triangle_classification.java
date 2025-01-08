package code_coverage_4.code_coverage_4;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Test_Triangle_classification {
	
	//בדיקה שקוראת לייצור המשולש
	@Test
	public void testClassConstructor() {
	    new Triangle_classification();
	}


    @Test
    public void testTC1() {
        String result = Triangle_classification.classifyTriangle(3, 4, 8);
        assertEquals("notTriangle", result);
    }

    @Test
    public void testTC2() {
        String result = Triangle_classification.classifyTriangle(1, 5, 2);
        assertEquals("notTriangle", result);
    }

    @Test
    public void testTC3() {
        String result = Triangle_classification.classifyTriangle(10, 3, 5);
        assertEquals("notTriangle", result);
    }

    @Test
    public void testTC4() {
        String result = Triangle_classification.classifyTriangle(1, 1, 1);
        assertEquals("equilateral", result);
    }

    @Test
    public void testTC5() {
        String result = Triangle_classification.classifyTriangle(5, 5, 7);
        assertEquals("isosceles", result);
    }
    
    //מסלול שגוי לבדיקה
    @Test
    public void testTC6() {
        String result = Triangle_classification.classifyTriangle(5, 5, 3);
        assertEquals("isosceles", result);
    }

    @Test
    public void testTC7() {
        String result = Triangle_classification.classifyTriangle(6, 4, 3);
        assertEquals("scalene", result);
    }

    @Test
    public void testTC8() {
        String result = Triangle_classification.classifyTriangle(6, 4, 4);
        assertEquals("isosceles", result);
    }

    @Test
    public void testTC9() {
        String result = Triangle_classification.classifyTriangle(5, 3, 5);
        assertEquals("isosceles", result);
    }
}
