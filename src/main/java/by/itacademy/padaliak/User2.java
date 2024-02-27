package by.itacademy.padaliak;

public class User2 {
    private String name;
    private String password;

    public void setName(String newName) {
        name = newName;
    }

    public void setPassword(String newPassword) {
        password = newPassword;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String toString(){
        String result;
        //result =  "User2 { name = \"" + getName() + "\", password = \"" + getPassword() + "\" }";
        result = String.format("User { name : %s , password : %s )", getName(), getPassword());
        return result;
    }
}
