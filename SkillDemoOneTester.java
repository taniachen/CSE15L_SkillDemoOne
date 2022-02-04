import org.junit.Test;
import static org.junit.Assert.*;

public class SkillDemoOneTester {
    
    @Test
    public void testSquareNumber(){
        assertEquals("this is failing test", 48, SkillDemoOne.squareNumber(7));
    }
}
