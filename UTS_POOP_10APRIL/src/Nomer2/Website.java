package Nomer2;

import java.util.Arrays;

public class Website {
    int index;
    private String[] usernames = new String[99];
    private String[] passwords = new String[99];

    // constructor

    public Website() {
        this.index = -1;
    }

    // method method

    // make account
    public Account addAccount(String nama, String password){
        for (int i = 0; i < this.index + 1; i++) {
            if (nama.equals(this.usernames[i])) {
                System.out.println("Mohon maaf username telah digunakan!");
                return null;
            }
        }
        this.index++;
        this.usernames[this.index] = new String(nama);
        this.passwords[this.index] = new String(password);
        System.out.println("Akun Berhasil ditambahkan");
        return new Account(nama, password);
    }

    public void login(String nama, String password){
        for (int i = 0; i < this.index + 1; i++) {
            if (nama.equals(this.usernames[i]) && password.equals(this.passwords[i])) {
                System.out.println("Login berhasil!!");
            } else {
                System.out.println("Akun tidak ditemukan!");
            }
        }
    }

    private String encrypt(String password){
        return password;
    }

    }

