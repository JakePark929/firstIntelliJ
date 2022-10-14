package org.example;

public class PasswordValidator {

    private static final String WRONG_PASSWORD_LENGTH_EXCEPTION_MESSAGE = "비밀번호는 최소 8자 이상 12자 이하여야 한다."; // ctrl+alt+c 로 static final 변수 생성가능

    public static void validate(String password) {
        int length = password.length(); // ctrl+alt+v 로 중복 변수생성가능
        if(length < 8 || length > 12) {
            throw new IllegalArgumentException(WRONG_PASSWORD_LENGTH_EXCEPTION_MESSAGE);
        }
        // int length=password.length();
    }
}
