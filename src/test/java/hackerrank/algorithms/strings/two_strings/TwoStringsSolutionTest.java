package hackerrank.algorithms.strings.two_strings;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

class TwoStringsSolutionTest {

    private final TwoStringsSolution twoStringsSolution = new TwoStringsSolution();

    @Test
    void returnsYesWhenContainsSubstring() {
        String result = twoStringsSolution.containsSubstring("hello", "world");

        assertThat(result, equalTo("YES"));
    }

    @Test
    void returnsNoWhenDoesNotContainSubstring() {
        String result = twoStringsSolution.containsSubstring("hi", "world");

        assertThat(result, equalTo("NO"));
    }
}
