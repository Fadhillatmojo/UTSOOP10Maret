package Nomer2;

public class Account{
    private String username;
    private String password;

    //constructor

    public Account(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // getter and setter

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // to string account

    @Override
    public String toString() {
        return "Account{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
