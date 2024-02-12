import java.time.LocalDateTime;

public abstract class Entity {
    private int id;
    private LocalDateTime criationTime;
    private LocalDateTime lastModification;

    public Entity(int id){
        this.id = id;
        this.criationTime = LocalDateTime.now();
        this.lastModification = LocalDateTime.now();
    }

    public LocalDateTime getCriationTime() {
        return this.criationTime;
    }

    public LocalDateTime getLastModification() {
        return this.lastModification;
    }

    protected void setLastModification() {
        this.lastModification = LocalDateTime.now();
    }

    public int getId() {
        return this.id;
    }

    protected void setId(int id) {
        this.id = id;
        this.setLastModification();
    }

}
