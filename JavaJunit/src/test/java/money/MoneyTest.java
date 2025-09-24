package money;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class MoneyTest {
    @Test
    public void testEquality(){
        assertFalse(Money.franc(5).equals(Money.dollar(5)));
    }
}
