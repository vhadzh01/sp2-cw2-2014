package sp2.cw2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Before;
import org.junit.Test;

public class FractionTest {

	private Fraction f;
	private Fraction g;
	private Fraction h;

	@Before
	public void setUp() {

		f = new Fraction(3, 10);
		g = new Fraction(1, 2);
		h = new Fraction(3, 5);
	}

	@Test
	public void testConstructorDivideByZeroShouldPrintAnErrorAndExit() {

		new Fraction(1, 0);
	}

	@Test
	public void testMultiplySuccess() {

		Fraction result = g.multiply(h);

		assertEquals("Multiply failed", result, f);
	}

	@Test
	public void testConstructorFails1() {

		Fraction fraction1 = new Fraction(1, 2);
		Fraction fraction2 = new Fraction(1, 2);

		assertEquals("error test 1", fraction1, fraction2);
	}

	@Test
	public void testConstructorFails2() {

		Fraction fraction1 = new Fraction(1, 2);
		Fraction fraction2 = new Fraction(3, 6);

		assertEquals("error test 2", fraction1, fraction2);
	}

	@Test
	public void testConstructorFails3() {

		Fraction fraction1 = new Fraction(-1, 2);
		Fraction fraction2 = new Fraction(1, -2);

		assertEquals("error test 3", fraction1, fraction2);
	}

	@Test
	public void testConstructorFails4() {

		Fraction fraction1 = new Fraction(-1, -2);
		Fraction fraction2 = new Fraction(1, 2);

		assertEquals("error test 4", fraction1, fraction2);
	}

	@Test
	public void testConstructorFails5() {

		Fraction fraction1 = new Fraction(4, -8);
		Fraction fraction2 = new Fraction(1, 2);

		assertFalse("error test 5", fraction1.equals(fraction2));
	}

	@Test
	public void testAddSuccess() {

		Fraction fraction1 = new Fraction(1, 2);
		Fraction fraction2 = new Fraction(3, 7);
		Fraction expectedFraction = new Fraction(13, 14);

		Fraction result = fraction1.add(fraction2);

		assertEquals("Add failed", result, expectedFraction);

	}

	@Test
	public void testSubtractSuccess() {

		Fraction fraction1 = new Fraction(1, 2);
		Fraction fraction2 = new Fraction(3, 7);
		Fraction expectedFraction = new Fraction(1, 14);

		Fraction result = fraction1.subtract(fraction2);

		assertEquals("Subtract failed", result, expectedFraction);

	}

	@Test
	public void testDivideSuccess() {

		Fraction fraction1 = new Fraction(1, 2);
		Fraction fraction2 = new Fraction(3, 7);
		Fraction expectedFraction = new Fraction(7, 6);

		Fraction result = fraction1.divide(fraction2);

		assertEquals("Divide failed", result, expectedFraction);
	}

	@Test
	public void testAbsValueWhenNumeratorIsNegativeAndDenomiratorIsPositive() {

		Fraction fraction = new Fraction(-1, 12);
		Fraction expectedFraction = new Fraction(1, 12);

		Fraction result = fraction.absValue();

		assertEquals("AbsValue failed", result, expectedFraction);
	}

	@Test
	public void testAbsValueWhenNumeratorIsPositiveAndDenomiratorIsPositive() {

		Fraction fraction = new Fraction(1, 12);
		Fraction expectedFraction = new Fraction(1, 12);

		Fraction result = fraction.absValue();

		assertEquals("AbsValue pass", result, expectedFraction);
	}

	@Test
	public void testAbsValueWhenNumeratorIsPositiveAndDenomiratorIsNegative() {

		Fraction fraction = new Fraction(1, -12);
		Fraction expectedFraction = new Fraction(1, 12);

		Fraction result = fraction.absValue();

		assertEquals("AbsValue failed", result, expectedFraction);
	}

	@Test
	public void testAbsValueWhenNumeratorIsNegativeAndDenomiratorIsNegative() {

		Fraction fraction = new Fraction(-1, -12);
		Fraction expectedFraction = new Fraction(1, 12);

		Fraction result = fraction.absValue();

		assertEquals("AbsValue failed", result, expectedFraction);
	}

	@Test
	public void testNegateWhenFractionIsPositive() {

		Fraction fraction = new Fraction(1, 12);
		Fraction expectedFraction = new Fraction(-1, 12);

		Fraction result = fraction.negate();

		assertEquals("Negate failed", result, expectedFraction);
	}

	@Test
	public void testNegateWhenFractionIsNegative() {

		Fraction fraction = new Fraction(-1, 12);
		Fraction expectedFraction = new Fraction(1, 12);

		Fraction result = fraction.negate();

		assertEquals("Negate failed", result, expectedFraction);
	}

	@Test
	public void testToStringWhenDenomiratorIsEqualToOne() {

		Fraction fraction = new Fraction(12, 1);

		String result = fraction.toString();

		assertEquals("toString failed", result, "12");
	}

	@Test
	public void testToStringWhenDenomiratorIsNotEqualToOne() {

		Fraction fraction = new Fraction(12, 11);

		String result = fraction.toString();

		assertEquals("toString failed", result, "12/11");
	}
}