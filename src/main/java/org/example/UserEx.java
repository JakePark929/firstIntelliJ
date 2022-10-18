package org.example;

public class UserEx {
    private String password;

//    public void initPassword(RandomPasswordGenerator passwordGenerator) {
    public void initPassword(PasswordGenerator passwordGenerator) {
        // as-is
//        RandomPasswordGenerator randomPasswordGenerator = new RandomPasswordGenerator();
//        String randomPassword = PasswordGenerator.generatePassword();

        // to-be
        String password = passwordGenerator.generatePassword();

        /**
         * 비민번호는 최소 8자 이상 12자 이하여야 한다.
         */
        if(password.length() >= 8 && password.length() <= 12) {
            this.password=password;
            System.out.println(this.password);
        }
    }

    public String getPassword() {
        return this.password;
    }
}
