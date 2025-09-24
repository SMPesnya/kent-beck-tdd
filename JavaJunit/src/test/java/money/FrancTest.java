package money;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class FrancTest {
  @Test
  public void testMulltiplication() {
      Money five = Money.franc(5);
      assertEquals(Money.franc(10), five.times(2));
      assertEquals(Money.franc(15), five.times(3));
  }
  @Test
  public void testEquality(){
      assertTrue(Money.franc(5).equals(Money.franc(5)));
      assertFalse(Money.franc(5).equals(Money.franc(6)));
  }
}

