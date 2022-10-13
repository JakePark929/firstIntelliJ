package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class UserTest {
    @DisplayName("패스워드를 초기화한다.")
    @Test // alt+insert
    void passwordTest() {
        // given
        User user = new User();

        // when
        user.initPassword(()->"abcdefgh");
//        user.initPassword(new CorrectFixedPasswordGenerator());
//        user.initPassword(new RandomPasswordGenerator());

        // then
        assertThat(user.getPassword()).isNotNull();
    }

    @DisplayName("패스워드가 요구사항에 부합하지 않아 초기화가 되지 않는다.")
    @Test // alt+insert
    void passwordTest2() {
        // given
        User user = new User();

        // when
        user.initPassword(()->"ab");
//        user.initPassword(new WrongFixedPasswordGenerator());
//        user.initPassword(new RandomPasswordGenerator());

        // then
        assertThat(user.getPassword()).isNull();
    }
}