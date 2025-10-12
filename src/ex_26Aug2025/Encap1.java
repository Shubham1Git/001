package ex_26Aug2025;

public class Encap1 {
    private String name;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.startsWith("S")){
            this.name = name;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
