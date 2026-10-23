package problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProblemTest {

    @Test
    public void test() {
        Problem problem = new Problem("Loan", ProblemType.FINANCIAL);
        assertEquals("Loan", problem.getName());
    }
}
