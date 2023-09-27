package com.driver;

public class Email {

    private String emailId;
    private String password;

    public Email(String emailId){
        this.emailId = emailId;
        this.password = "Accio@123";
    }

    public Email(String emailId, String password) {
        this.emailId = emailId;
        this.password = password;
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
    }

    public void changePassword(String oldPassword, String newPassword){
        //Change password only if the oldPassword is equal to current password and the new password meets all of the following:
        // 1. It contains at least 8 characters
        // 2. It contains at least one uppercase letter
        // 3. It contains at least one lowercase letter
        // 4. It contains at least one digit
        // 5. It contains at least one special character. Any character apart from alphabets and digits is a special character
        if(newPassword.length()>=8){
            int upperCaseCount=0;
            for(int i=0;i<newPassword.length();i++){
                if(newPassword.charAt(i)>='A' && newPassword.charAt(i)<='Z'){
                    upperCaseCount++;
                }
            }
            if(upperCaseCount>=1){
                int lowerCaseCount=0;
                for(int i=0;i<newPassword.length();i++){
                    if(newPassword.charAt(i)>='a' && newPassword.charAt(i)<='z'){
                        lowerCaseCount++;
                    }
                }
                if(lowerCaseCount>=1){
                    int digitCount=0;
                    for(int i=0;i<newPassword.length();i++){
                        if(newPassword.charAt(i)>='0' && newPassword.charAt(i)<='9'){
                            digitCount++;
                        }
                    }
                    if(digitCount>=1){
                        int specialCharacter=0;
                        for(int i=0;i<newPassword.length();i++){
                            if(!(newPassword.charAt(i)>='0' && newPassword.charAt(i)<='9') &&!(newPassword.charAt(i)>='a' && newPassword.charAt(i)<='z') && !(newPassword.charAt(i)>='A' && newPassword.charAt(i)<='Z')){
                                specialCharacter++;
                            }
                        }
                        if(specialCharacter>=1){
                            if(oldPassword.equals(password)){
                                password=newPassword;
                            }
                        }
                    }
                }
            }
        }
    }
}

