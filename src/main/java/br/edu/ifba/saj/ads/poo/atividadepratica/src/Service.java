import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Service {
    private List<Human> listArchitects;
    private List<Project> listProjects;
    private List<Item> listItems;
    private List<Human> listEngineer;
    private List<Human> listWorkers;

    public Service() {
        this.listArchitects = new ArrayList<>();
        this.listProjects = new ArrayList<>();
        this.listItems = new ArrayList<>();
        this.listEngineer = new ArrayList<>();
    }

    public void createProject(String nameProject) {
        Project myProject = new Project(listProjects.size() + 1, nameProject);
        if (!listProjects.contains(myProject)) {
            listProjects.add(myProject);
        }

    }

    public void createArchitect(String nameArchitect, long numberArchitect) {
        Human myArchitect = new Human(nameArchitect, listArchitects.size() + 1, "Arquiteto(a)", numberArchitect);
        if (!listArchitects.contains(myArchitect)) {
            listArchitects.add(myArchitect);
        }
    }

    public void createEngineer(String nameEngineer, long numberEngineer) {
        Human myEngineer = new Human(nameEngineer, this.listEngineer.size() + 1, "Engenheiro(a)", numberEngineer);
        if (!this.listEngineer.contains(myEngineer)) {
            this.listEngineer.add(myEngineer);
        }
    }

    public void createWorker(String nameWorker, long numberWorker, String roleWorker) {
        Human myWorker = new Human(nameWorker, this.listWorkers.size() + 1, roleWorker, numberWorker);
        if (!this.listWorkers.contains(myWorker)) {
            this.listWorkers.add(myWorker);
        }
    }

    public void createItem(String nameItem, float valueItem) {
        Item myItem = new Item(this.listItems.size() + 1, nameItem, valueItem);
        if (!this.listItems.contains(myItem)) {
            this.listItems.add(myItem);
        }
    }

    public void assignArchitect(int idProject, int idArchitect) {
        this.listProjects.get(idProject).setArquitectResponsible(this.listArchitects.get(idArchitect));
    }

    public void requestInspection(int idProject, LocalDate dateInspection) {
        this.listProjects.get(idProject).taskInspectionSchedule(dateInspection);
    }

    public void assignEngineer(int idProject, int idEngineer) {
        this.listProjects.get(idProject).setArquitectResponsible(this.listEngineer.get(idEngineer));
    }

    public void taskProjectHiring(int idProject, int idWorker) {
        this.listProjects.get(idProject).taskHiring(this.listWorkers.get(idWorker));
    }

    public Project getEspecificArchitect(int idArchitect) {
        return this.listProjects.get(idArchitect);
    }

    public Project getEspecificEngineer(int idEngineer) {
        return this.listProjects.get(idEngineer);
    }

    public Project getEspecificProject(int idProject) {
        return this.listProjects.get(idProject);
    }

    public Project getEspecificWorker(int idWorker) {
        return this.listProjects.get(idWorker);
    }

    public List<Human> getListArchitects() {
        return Collections.unmodifiableList(this.listArchitects);
    }

    public List<Project> getListProjects() {
        return Collections.unmodifiableList(this.listProjects);
    }

    public List<Human> getListEngineer() {
        return Collections.unmodifiableList(this.listEngineer);
    }

    public List<Human> getListWorkers() {
        return Collections.unmodifiableList(this.listWorkers);
    }

}
