package oop;

public class WiFi {
    String password = "password";
    boolean isAuthenticated;

    boolean authenticate(String password) {
        return isAuthenticated = this.password.equals(password);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAuthenticated(boolean authenticated) {
        isAuthenticated = authenticated;
    }

    boolean isAuthenticated() {
        return this.isAuthenticated;
    }
}
