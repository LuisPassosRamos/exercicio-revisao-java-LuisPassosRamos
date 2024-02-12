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
    
}
