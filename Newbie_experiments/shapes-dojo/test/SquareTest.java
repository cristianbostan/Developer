import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTest {

    private int length;
    private Rectangle square;

    @BeforeEach
    public void prepareSquare(){
        length = 2;
        square = new Rectangle(length);
    }

    @Test
    public void should_get_area_when_width_is_2() {
        assertEquals(length*length, square.getArea());
    }

    @Test
    public void should_get_perimeter_when_width_is_2(){
        assertEquals(2*(length+length), square.getPerimeter());
    }
}
