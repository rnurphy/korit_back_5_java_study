package com.study.ch07;

public class User01 {
    final String username;
    final String password;
    String name;
    String email;

    //  RequiredArgsConstructor
    User01(String username, String password) {
        this.username = username;
        this.password = password;
    }
    //  AllArgsConstructor
    User01(String username, String password, String name, String email) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.email = email;
    }

    void setName(String name) {
        this.name = name;
    }

    void setEmail(String email) {
        this.email = email;
    }

    void showInfo() {
        System.out.println("username: " + username);
        System.out.println("password: " + password);
        System.out.println("name: " + name);
        System.out.println("email: " + email);
        System.out.println();
    }

    public static void main(String[] args) {
        User01 user1 = new User01("murphy123369", "8919");
        User01 user2 = new User01("is123369", "1234", "김상현2", "rhffoa207@naver.com");

        user1.showInfo();
        user2.showInfo();

        user1.setName("김상현1");
        user1.setEmail("ajvlzla0207@gmail.com");

        user1.showInfo();
    }
}
