package money;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class FrancTest {
  @Test
  public void testMulltiplication() {
      Franc five = new Franc(5);
      assertEquals(new Franc(10), five.times(2));
      assertEquals(new Franc(15), five.times(3));
  }
  @Test
  public void testEquality(){
      assertTrue(new Dollar(5).equals(new Dollar(5)));
      assertFalse(new Dollar(5).equals(new Dollar(6)));
      assertTrue(new Franc(5).equals(new Franc(5)));
      assertFalse(new Franc(5).equals(new Franc(6)));
  }
}

