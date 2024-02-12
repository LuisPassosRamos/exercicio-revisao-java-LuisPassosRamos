public class Human extends Entity{
    private String role;
    private String name;
    private int number;
    

    public Human(String name, int id, String role, int number){
        super(id);
        this.name = name;
        this.role = role;
        this.number = number;
    }

    public Human(String name, int id,  int number){
        super(id);
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
        super.setLastModification();
    }

    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
        super.setLastModification();
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
        super.setLastModification();
    }

     
}
