import java.util.List;

public class Service {
    private List<Human> listArchitects;
    private List<Project> listProjects;
    private List<Item> listItems;
    private List<Human> listEngineer;


    public void createProject(Stage stageProject, String nameProject){
        Project myProject = new Project(listProjects.size()+1, nameProject);
        if (!listProjects.contains(myProject)){
            listProjects.add(myProject);
        }
    }

    public void createArchitect(String nameArchitect, int numberArchitect){
        Human myArchitect = new Human(nameArchitect, listArchitects.size()+1, "Architect", numberArchitect);
        if (!listArchitects.contains(myArchitect)){
            listArchitects.add(myArchitect);
        }
    }

    public void createEngineer(String nameEngineer, int numberEngineer){
        Human myEngineer = new Human(nameEngineer, listEngineer.size()+1, "Engineers", numberEngineer);
        if (!listEngineer.contains(myEngineer)){
            listEngineer.add(myEngineer);
        }
    }

    

}
