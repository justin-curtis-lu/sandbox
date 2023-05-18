/*
 * copyright
 */

/*
 * @test
 * @bug TODO
 * @summary TODO
 * @run junit TODO
 */

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TODO {

    @ParameterizedTest
    @MethodSource("todo")
    public void todo(String a, String b) {
        assertEquals(a, b);
    }

    private static Stream<Arguments> todo() {
        return Stream.of(
                Arguments.of("todo", "todo")
        );
    }
}
