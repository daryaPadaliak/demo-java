package collection;

import java.util.Objects;

public class Account {
    private String login;
    private String password;
    private boolean isAdmin;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public Account(String login, String password) {
        this.login = login;
        this.password = password;
        this.isAdmin = false;
    }

    @Override
    public String toString() {
        return "Account{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", isAdmin=" + isAdmin +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return isAdmin == account.isAdmin && Objects.equals(login, account.login) && Objects.equals(password, account.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password, isAdmin);
    }
}
