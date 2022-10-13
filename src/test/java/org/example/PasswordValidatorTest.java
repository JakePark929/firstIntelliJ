package org.example;

/**
 * • 비밀번호는 최소 8자 이상 12자 이하여야 한다.
 * • 비밀번호가 8자 미만 또는 12자 초과인 경우 IllegalArgumentException 예외를 발생시킨다.
 * • 경계조건에 대해 테스트 코드를 작성해야 한다.
 */

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThatCode;

public class PasswordValidatorTest {

    // assertThatCode : 코드의 가독성을 위한 기능들을 가진 객체, assertj 코어에 있음

    @DisplayName("비밀번호가 최소 8자이상, 12자 이하면 예외가 발생하지 않는다.")
    @Test // alt+insert test
    void validatorPasswordTest() {
        assertThatCode(() ->PasswordValidator.validate("serverwizard")) // 비밀번호
                .doesNotThrowAnyException();
    }

    @DisplayName("비밀번호가 8자 미만 또는 12자 초과하는 경우 IllegalArgumentException 예외가 발생한다.")
    @ParameterizedTest // 값을 자동으로 넣어줌 value, csv, enum 실무에서 자주쓰임
    @ValueSource(strings={"aabbcce","aabbccddeeffg"})
    void validatePasswordTest2(String password) {
        assertThatCode(() ->PasswordValidator.validate(password))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("비밀번호는 최소 8자 이상 12자 이하여야 한다.");
    }
}
