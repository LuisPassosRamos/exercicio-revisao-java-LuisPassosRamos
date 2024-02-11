import java.util.List;

public class Service {
    private List<Project> listProjects;

    public void createProject(Stage stageProject, String nameProject){
        Project myProject = new Project(listProjects.size(), stageProject, nameProject);
        if (!listProjects.contains(myProject)){
            listProjects.add(myProject);
        }
    }
}
