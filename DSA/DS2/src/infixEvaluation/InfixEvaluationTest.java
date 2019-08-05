package infixEvaluation;

import static org.junit.Assert.*;

import org.junit.Test;

public class InfixEvaluationTest {
	InfixEvaluation evaluation;

	@Test
	public void testEvaluateShouldReturnResultForValidExpression() {
		String infixExpression = "(7 * 8 ) - 7 * ( 10 / 2 )";
		evaluation = new InfixEvaluation();
		int actualOutput = evaluation.evaluate(infixExpression);
		int expectedOutput = 21;
		assertEquals(expectedOutput, actualOutput, 0);
	}
	
	@Test(expected=AssertionError.class)
    public void testEvaluateShouldThrowExceptionWhenOpeartorsMoreThanNeeded() {
		String infixExpression = "2 * / (5 *(3+6))/15-2";
		evaluation = new InfixEvaluation();
		evaluation.evaluate(infixExpression);
	}
		
	@Test(expected=AssertionError.class)
	public void testEvaluateShouldThrowExceptionForDivisionByZero() {
		String infixExpression = "2 * / (5 *(3+6))/15-2 /";
		evaluation = new InfixEvaluation();
		evaluation.evaluate(infixExpression);
	}
	
	@Test(expected=AssertionError.class)
    public void testEvaluateShouldThrowExceptionWhenOpeartorsLessThanNeeded() {
		String infixExpression = "2 * / (5 *(3 6))/15-2 /";
		evaluation = new InfixEvaluation();
		evaluation.evaluate(infixExpression);
	}
}
