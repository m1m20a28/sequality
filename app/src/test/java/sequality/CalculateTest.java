package sequality;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {

@Test
 public void testSum() {
   Calculate calculate = new Calculate();
   int expected = 5;
   assertEquals(expected, calculate.sum(2, 3));
 }

 @Test
 public void testave() {
   Calculate calculate = new Calculate();
   double expected = 2.5;
   assertEquals(expected, calculate.ave(5.0, 2.0), 0.0);
   expected = 5.5;
   assertEquals(expected, calculate.ave(55.0, 10.0), 0.0);
 }

 public void testatoz() {
   Calculate calculate = new Calculate();
   int expected = 55;
   assertEquals(expected, calculate.atoz(1, 10));
   assertEquals(expected, calculate.atoz(10, 1));
 }

 public void testodd() {
   Calculate calculate = new Calculate();
   int expected = 25;
   assertEquals(expected, calculate.odd(1, 10));
   assertEquals(expected, calculate.odd(10, 1));
 }

 public void testeven() {
   Calculate calculate = new Calculate();
   int expected = 30;
   assertEquals(expected, calculate.even(1, 10));
   assertEquals(expected, calculate.even(10, 1));
 }
}
