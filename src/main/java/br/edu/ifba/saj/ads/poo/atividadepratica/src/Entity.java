import java.time.LocalDateTime;

public abstract class Entity {
    private int id;
    private LocalDateTime criationTime;
    private LocalDateTime lastModification;

    public Entity(int id){
        this.id = id;
        this.criationTime = LocalDateTime.now();
        this.lastModification = null;
    }

    public LocalDateTime getCriationTime() {
        return this.criationTime;
    }

    public LocalDateTime getLastModification() {
        return this.lastModification;
    }

    protected void setLastModification(LocalDateTime lastModification) {
        this.lastModification = lastModification;
    }

    public int getId() {
        return this.id;
    }

    protected void setId(int id) {
        this.id = id;
    }

}
