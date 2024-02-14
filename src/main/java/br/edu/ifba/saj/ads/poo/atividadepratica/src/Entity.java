import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class Entity {
    private Integer id;
    private LocalDateTime criationTime;
    private LocalDateTime lastModification;

    public Entity(int id) {
        this.id = id;
        this.criationTime = LocalDateTime.now();
        this.lastModification = LocalDateTime.now();
    }

    public LocalDateTime getCriationTime() {
        return this.criationTime;
    }

    public String getLastModification() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return this.lastModification.format(formatter);
    }

    protected void setLastModification() {
        this.lastModification = LocalDateTime.now();
    }

    public Integer getId() {
        return this.id;
    }

    protected void setId(int id) {
        this.id = id;
        this.setLastModification();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((criationTime == null) ? 0 : criationTime.hashCode());
        result = prime * result + ((lastModification == null) ? 0 : lastModification.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Entity other = (Entity) obj;
        if (id != other.id)
            return false;
        if (criationTime == null) {
            if (other.criationTime != null)
                return false;
        } else if (!criationTime.equals(other.criationTime))
            return false;
        if (lastModification == null) {
            if (other.lastModification != null)
                return false;
        } else if (!lastModification.equals(other.lastModification))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Entity [id=" + id + ", criationTime=" + criationTime + ", lastModification=" + lastModification + "]";
    }

}
