public class Human extends Entity{
    private String role;
    private String name;
    private long number;
    

    public Human(String name, int id, String role, long number){
        super(id);
        this.name = name;
        this.role = role;
        this.number = number;
    }

    public Human(String name, int id, long number){
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

    public long getNumber() {
        return this.number;
    }

    public void setNumber(long number) {
        this.number = number;
        super.setLastModification();
    }

    @Override
    public String toString() {
        return "ID - " + super.getId().toString() + ", Nome: "+ name + ", Numero: " + number 
        + ", Função: " + role + "\n";
    }
}
