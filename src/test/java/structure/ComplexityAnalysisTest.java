package structure;

import org.junit.Test;

import static org.junit.Assert.*;

public class ComplexityAnalysisTest {

    @Test
    public void cal() {
        int sum = 0;
        int n = 10;
        int i = 1;
        for (; i <= n; ++i) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}