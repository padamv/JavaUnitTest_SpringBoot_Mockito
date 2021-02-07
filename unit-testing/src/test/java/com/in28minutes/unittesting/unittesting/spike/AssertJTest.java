package com.in28minutes.unittesting.unittesting.spike;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


public class AssertJTest {

    @Test
    public void learning(){
        List<Integer> numbers = Arrays.asList(12, 15, 45);

        //assertThat(numbers, hasSize(3));
        assertThat(numbers)
                .hasSize(3)
                .contains(12, 45)
                .allMatch(x -> x > 10)
                .allMatch(x -> x < 100)
                .noneMatch((x -> x < 0));

        //assertThat(numbers, hasItems(12, 45));
        //assertThat(numbers, everyItem(greaterThan(10)));
        //assertThat(numbers, everyItem(lessThan(100)));

        assertThat("").isEmpty();
        //assertThat("", is(emptyString()));

        assertThat("ABCDE")
                .contains("BC")
                .startsWith("AB")
                .endsWith("DE");
        //assertThat("ABCDE", containsString("BCD"));
        //assertThat("ABCDE", startsWith("AB"));
        //assertThat("ABCDE", endsWith("DE"));

    }
}
