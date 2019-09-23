package democompositekey;

public class Empdept implements java.io.Serializable {

    private EmpdeptId id;
    private String role;

    public Empdept() {
    }

    public EmpdeptId getId() {
        return this.id;
    }

    public void setId(EmpdeptId id) {
        this.id = id;
    }

    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}