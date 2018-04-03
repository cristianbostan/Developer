import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {

    Rectangle rectangle;

    @BeforeEach
    public void prepare_rectangle(){
        rectangle = new Rectangle(2, 3);
    }

    @Test
    public void should_get_perimeter_for_rectangle() {
        assertEquals(10, rectangle.getPerimeter());
    }

    @Test
    public void should_get_area_for_rectangle() {
        assertEquals(6, rectangle.getArea());
    }
}
