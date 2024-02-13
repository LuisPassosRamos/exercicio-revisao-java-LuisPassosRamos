import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Service {
    private List<Human> listArchitects;
    private List<Project> listProjects;
    private List<Item> listItems;
    private List<Human> listEngineer;

    public Service(){
        this.listArchitects = new ArrayList<>();
        this.listProjects = new ArrayList<>();
        this.listItems = new ArrayList<>();
        this.listEngineer = new ArrayList<>();
    }


    public void createProject(String nameProject) {
        Project myProject = new Project(listProjects.size()+1, nameProject);
        if (!listProjects.contains(myProject)){
            listProjects.add(myProject);
        }

    }

    public void createArchitect(String nameArchitect, long numberArchitect){
        Human myArchitect = new Human(nameArchitect, listArchitects.size()+1, "Arquiteto(a)", numberArchitect);
        if (!listArchitects.contains(myArchitect)){
            listArchitects.add(myArchitect);
        }
    }

    public void createEngineer(String nameEngineer, long numberEngineer){
        Human myEngineer = new Human(nameEngineer, this.listEngineer.size()+1, "Engenheiro(a)", numberEngineer);
        if (!this.listEngineer.contains(myEngineer)){
            this.listEngineer.add(myEngineer);
        }
    }

    public void createItem (String nameItem, float valueItem){
        Item myItem = new Item(this.listItems.size()+1, nameItem, valueItem);
        if (!this.listItems.contains(myItem)){
            this.listItems.add(myItem);
        }
    }

    public void assignArchitect(int idProject, int idArchitect){
        this.listProjects.get(idProject).setArquitectResponsible(this.listArchitects.get(idArchitect));
    }

    public void requestInspection(int idProject, int daysInspection){
        this.listProjects.get(idProject).taskInspectionSchedule(daysInspection);
    }

    public void assignEngineer(int idProject, int idEngineer){
        this.listProjects.get(idProject).setArquitectResponsible(this.listEngineer.get(idEngineer));
    }

    public List<Human> getListArchitects() {
        return Collections.unmodifiableList(listArchitects);
    }

    public List<Project> getListProjects() {
        return Collections.unmodifiableList(listProjects);
    }

    public List<Human> getListEngineer() {
        return Collections.unmodifiableList(listEngineer);
    }

    

}
