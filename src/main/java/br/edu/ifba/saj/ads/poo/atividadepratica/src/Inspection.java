import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Inspection extends Entity {
    private LocalDate dateInspection;
    private State stateInspection;

    public Inspection(int id, LocalDate dateInspection) {
        super(id);
        if (dateInspection.isAfter(LocalDate.now())) {
            this.dateInspection = dateInspection;
        }
        this.stateInspection = State.OPEN;
    }

    public void doneInspection() {
        this.stateInspection = State.CLOSED;
        super.setLastModification();
    }

    public String getDateInspection() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return this.dateInspection.format(formatter);
    }

    public void setDateInspection(LocalDate dateInspection) {
        this.dateInspection = dateInspection;
    }

    public State getStateInspection() {
        return this.stateInspection;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((dateInspection == null) ? 0 : dateInspection.hashCode());
        result = prime * result + ((stateInspection == null) ? 0 : stateInspection.hashCode());
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
        Inspection other = (Inspection) obj;
        if (dateInspection == null) {
            if (other.dateInspection != null)
                return false;
        } else if (!dateInspection.equals(other.dateInspection))
            return false;
        if (stateInspection != other.stateInspection)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Inspecao|Data da inspecao: " + this.getDateInspection()
                + ", Estado da inspecao: " + stateInspection + "\n";
    }

}
