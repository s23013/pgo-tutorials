import javax.naming.Name;

public class User {

    public String Name, Surename, Email, Password;
    boolean Guess = true;

    public User(String email) {
        this.Email = email;
    }

    public User(String name, String surename, String email, String password, boolean guess) {
        this.Name = name;
        this.Surename = surename;
        this.Email = email;
        this.Password = password;
        this.Guess = guess;
    }

    public void changeStatus(String Name,String Surename, String Password, boolean Guess) {
        this.Name = Name;
        this.Surename = Surename;
        this.Password = Password;
        this.Guess = false;

    }

    @Override
    public String toString() {
        return "User{" +
                "Name='" + Name + '\'' +
                ", Surename='" + Surename + '\'' +
                ", Email='" + Email + '\'' +
                ", Password='" + Password + '\'' +
                ", Guess=" + Guess +
                '}';
    }
}
