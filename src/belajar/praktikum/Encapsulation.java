package belajar.praktikum;

class User {

    // harus private
    private String username;
    private String password;

    // ini method setter
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // ini method getter
    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        User yusman = new User();

        // menggunakan method setter
        yusman.setUsername("yusman");
        yusman.setPassword("SandiPassword");

        // menggunakan method getter
        System.out.println("Username: " + yusman.getUsername());
        System.out.println("Password: " + yusman.getPassword());
    }
}
