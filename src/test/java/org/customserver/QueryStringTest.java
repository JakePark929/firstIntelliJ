package org.customserver;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class QueryStringTest {

    // operand1=11
    // List<QueryString>
    @Test
    void createTest() {
        QueryString queryString = new QueryString("operand", "11");

        assertThat(queryString).isNotNull();
    }
}
