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
        this.listWorkers = new ArrayList<>();
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
            for (Human human : listArchitects) {
                if (human.getName() == myArchitect.getName() && human.getNumber() == myArchitect.getNumber()) {
                    return;
                }
            }
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

    public void taskProjectBuying(int idProject, int idItem) {
        this.listProjects.get(idProject).taskBuying(this.listItems.get(idItem));
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

    public List<Item> getListItems() {
        return Collections.unmodifiableList(this.listItems);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((listArchitects == null) ? 0 : listArchitects.hashCode());
        result = prime * result + ((listProjects == null) ? 0 : listProjects.hashCode());
        result = prime * result + ((listItems == null) ? 0 : listItems.hashCode());
        result = prime * result + ((listEngineer == null) ? 0 : listEngineer.hashCode());
        result = prime * result + ((listWorkers == null) ? 0 : listWorkers.hashCode());
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
        Service other = (Service) obj;
        if (listArchitects == null) {
            if (other.listArchitects != null)
                return false;
        } else if (!listArchitects.equals(other.listArchitects))
            return false;
        if (listProjects == null) {
            if (other.listProjects != null)
                return false;
        } else if (!listProjects.equals(other.listProjects))
            return false;
        if (listItems == null) {
            if (other.listItems != null)
                return false;
        } else if (!listItems.equals(other.listItems))
            return false;
        if (listEngineer == null) {
            if (other.listEngineer != null)
                return false;
        } else if (!listEngineer.equals(other.listEngineer))
            return false;
        if (listWorkers == null) {
            if (other.listWorkers != null)
                return false;
        } else if (!listWorkers.equals(other.listWorkers))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Service [listArchitects=" + listArchitects + ", listProjects=" + listProjects + ", listItems="
                + listItems + ", listEngineer=" + listEngineer + ", listWorkers=" + listWorkers + "]";
    }

}
