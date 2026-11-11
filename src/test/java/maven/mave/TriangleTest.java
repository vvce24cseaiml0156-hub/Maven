package maven.mave;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleTest {

    @Test
    public void testCalculateArea() {

        Triangle t = new Triangle();

        double result = t.calculateArea(10, 5);

        assertEquals(25.0, result, 0.001);
    }
}