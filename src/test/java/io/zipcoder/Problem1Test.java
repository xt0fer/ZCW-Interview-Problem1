package io.zipcoder;

import static junit.framework.TestCase.assertEquals;

public class Problem1Test {

    public static void main(String[] args) {

        Problem1 foo = new Problem1();

        System.out.println(foo.convertToGibberish(Problem1.inputString));

        System.out.println(foo.recurseToGibberish(Problem1.inputString));

        assertEquals(foo.convertToGibberish(Problem1.inputString), Problem1.outputString);
        assertEquals(foo.recurseToGibberish(Problem1.inputString), Problem1.outputString);
    }
}
