public class Human extends Entity {
    private String role;
    private String name;
    private long number;

    public Human(String name, int id, String role, long number) {
        super(id);
        this.name = name;
        this.role = role;
        this.number = number;
    }

    public Human(String name, int id, long number) {
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
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((role == null) ? 0 : role.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + (int) (number ^ (number >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Human other = (Human) obj;
        if (role == null) {
            if (other.role != null)
                return false;
        } else if (!role.equals(other.role))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (number != other.number)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "ID - " + super.getId().toString() + ", Nome: " + name + ", Numero: " + number
                + ", Função: " + role + "\n";
    }
}
