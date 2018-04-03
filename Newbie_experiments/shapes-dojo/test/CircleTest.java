import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CircleTest {

    Circle circle;
    private final double delta = 0.1;
    private final double pi = Math.PI;

    @BeforeEach
    public void prepareCircle(){
        circle = new Circle(5);
    }

    @org.testng.annotations.Test
    public void should_get_perimeter_31point4_when_radius_is_5(){
        assertEquals(31.4, circle.getPerimeter(), delta);
    }

    @Test
    public void should_get_area_when_radius_is_5(){
        assertEquals(78.5,circle.getArea(), delta);
    }

    @Test
    public void should_not_get_area_when_radius_is_0() {
        Circle anotherCircle = new Circle(0);
        assertEquals(0,anotherCircle.getArea());
    }
}
