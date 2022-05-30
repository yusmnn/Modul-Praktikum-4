package belajar.praktikum;

class Pengguna {

    public String username;
    public String email;
    private String password = "Sandi Password";

    // setter
    public void setUsername(String username) {
        this.username = username;
    }

    // getter
    public String getPasswordPrivate() {
        return this.password;
    }
}

public class KegiatanPraktikumB {
    public static void main(String[] args) {

        Pengguna yus = new Pengguna();

        // write
        yus.username = "Yusman";
        yus.email = "yusmnn@email.com";

        // Read
        System.out.println("\nPublic Atribut :");
        System.out.println("Username :" + yus.username);
        System.out.println("Username :" + yus.email);

        // menggunakan method getter
        System.out.println("\nRead only Atribut :");
        System.out.println("Password: " + yus.getPasswordPrivate());

    }
}