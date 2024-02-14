public class Stage extends Entity {
    private float progressStage;
    private String nameStage;

    public Stage(int id, String nameStage) {
        super(id);
        this.nameStage = nameStage;
        this.progressStage = 0;
    }

    public float getProgressStage() {
        return this.progressStage;
    }

    public void setProgressStage(float progressStage) {
        this.progressStage = progressStage;
    }

    public String getNameStage() {
        return this.nameStage;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Float.floatToIntBits(progressStage);
        result = prime * result + ((nameStage == null) ? 0 : nameStage.hashCode());
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
        Stage other = (Stage) obj;
        if (Float.floatToIntBits(progressStage) != Float.floatToIntBits(other.progressStage))
            return false;
        if (nameStage == null) {
            if (other.nameStage != null)
                return false;
        } else if (!nameStage.equals(other.nameStage))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Etapa|Progresso da etapa: " + progressStage + ", Nome da etapa: " + nameStage;
    }

}
