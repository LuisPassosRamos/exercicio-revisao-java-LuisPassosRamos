import java.time.LocalDateTime;

public class Inspection extends Entity {
    private LocalDateTime dateInspection;
    private State stateInspection;

    public Inspection(int id, LocalDateTime dateInspection) {
        super(id);
        if (dateInspection.isAfter(LocalDateTime.now())) {
            this.dateInspection = dateInspection;
        }
        this.stateInspection = State.OPEN;
    }

    public void doneInspection(){
        this.stateInspection = State.CLOSED;
        super.setLastModification();
    }

    public LocalDateTime getDateInspection() {
        return this.dateInspection;
    }

    public void setDateInspection(LocalDateTime dateInspection) {
        this.dateInspection = dateInspection;
    }

    public State getStateInspection() {
        return this.stateInspection;
    }    
    
}
