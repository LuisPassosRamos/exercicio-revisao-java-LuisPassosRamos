public class Project extends Entity{
    private String nameProject;
    private Stage stageProject;


    public Project(int id, Stage stageProject, String nameProject){
        super(id);
        this.stageProject = stageProject;        
        this.nameProject = nameProject;
    }

    

}
