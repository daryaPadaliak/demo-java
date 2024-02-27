package user;

public class User {
    private String name;
    private String password;
    private int age;

    public void setName(String newName) {
        name = newName;
    }

    public void setPassword(String newPassword) {
        password = newPassword;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public String getName(){
        return name;
    }

    public String getPassword(){
        return password;
    }

    public int getAge(){
        return age;
    }
}
