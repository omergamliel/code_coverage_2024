package code_coverage_4.code_coverage_4;

public class Triangle_classification {

	// סוגי המשולשים
    enum TriangleTypes {
        equilateral, // משולש שווה צלעות
        isosceles,  // משולש שווה שוקיים
        scalene,    // משולש שונה צלעות
        notTriangle,// לא משולש
        ERROR       // שגיאה
    }
    
    public static String classifyTriangle(int a, int b, int c) {
        TriangleTypes triangle = TriangleTypes.notTriangle;

        if (c<a+b) {
        	
            if (b<a+c) {
                if (a<b+c) {
                    if (a==b) {
                        if (b==c) {
                            triangle = TriangleTypes.equilateral;
                            return triangle.toString();
                        }
                    }
                    if (a==b) {
                        triangle = TriangleTypes.isosceles;
                    } else if (b==c) {
                        triangle = TriangleTypes.isosceles;
                    } else if (a==c) {
                        triangle = TriangleTypes.isosceles;
                    } else {
                        triangle = TriangleTypes.scalene;
                    }
                }
            }
        }

        return triangle.toString();
    }
}