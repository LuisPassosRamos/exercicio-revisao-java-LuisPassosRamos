import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Service {
    private static List<Human> listArchitects = new ArrayList<>();
    private static List<Project> listProjects = new ArrayList<>();
    private static List<Item> listItems = new ArrayList<>();
    private static List<Human> listEngineer = new ArrayList<>();
    private static List<Human> listWorkers = new ArrayList<>();

    public Service() {
    }

    public void createProject(String nameProject) throws DuplicatedObjException {
        Project myProject = new Project(listProjects.size() + 1, nameProject);
        if (!listProjects.contains(myProject) && nameProject != null) {
            listProjects.add(myProject);
        }else{
            throw new DuplicatedObjException("Objeto duplicado");
        }
    }

    public void createArchitect(String nameArchitect, long numberArchitect) throws DuplicatedObjException {
        Human myArchitect = new Human(nameArchitect, listArchitects.size() + 1, "Arquiteto(a)", numberArchitect);
        if (!listArchitects.contains(myArchitect)) {
            listArchitects.add(myArchitect);
        }else{
            throw new DuplicatedObjException("Objeto duplicado");
        }
    }

    public void createEngineer(String nameEngineer, long numberEngineer) throws DuplicatedObjException {
        Human myEngineer = new Human(nameEngineer, listEngineer.size() + 1, "Engenheiro(a)", numberEngineer);
        if (!listEngineer.contains(myEngineer)) {
            listEngineer.add(myEngineer);
        }else{
            throw new DuplicatedObjException("Objeto duplicado");
        }
    }

    public void createWorker(String nameWorker, long numberWorker, String roleWorker) throws DuplicatedObjException {
        Human myWorker = new Human(nameWorker, listWorkers.size() + 1, roleWorker, numberWorker);
        if (!listWorkers.contains(myWorker)) {
            listWorkers.add(myWorker);
        }else{
            throw new DuplicatedObjException("Objeto duplicado");
        }
    }

    public void createItem(String nameItem, float valueItem) throws DuplicatedObjException {
        Item myItem = new Item(listItems.size() + 1, nameItem, valueItem);
        if (!listItems.contains(myItem)) {
            listItems.add(myItem);
        }else{
            throw new DuplicatedObjException("Objeto duplicado");
        }
    }

    public void assignArchitect(int idProject, int idArchitect) throws DuplicatedObjException {
        try {
            listProjects.get(idProject).setArquitectResponsible(listArchitects.get(idArchitect));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Numero digitado excede o numero de objetos criados.");
        }
    }

    public void requestInspection(int idProject, LocalDate dateInspection) {
        try {
            listProjects.get(idProject).taskInspectionSchedule(dateInspection);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Numero digitado excede o numero de objetos criados.");
        }

    }

    public void assignEngineer(int idProject, int idEngineer) throws DuplicatedObjException {
        try {
            listProjects.get(idProject).setEngineerResponsible(listEngineer.get(idEngineer));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Numero digitado excede o numero de objetos criados.");
        }

    }

    public void taskProjectHiring(int idProject, int idWorker) {
        try {
            listProjects.get(idProject).taskHiring(listWorkers.get(idWorker));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Numero digitado excede o numero de objetos criados.");
        }

    }

    public void taskProjectBuying(int idProject, int idItem) {
        try {
            listProjects.get(idProject).taskBuying(listItems.get(idItem));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Numero digitado excede o numero de objetos criados.");
        }

    }

    public Human getEspecificArchitect(int idArchitect) {
        try {
            return listArchitects.get(idArchitect);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Numero digitado excede o numero de objetos criados.");
            return null;
        }

    }

    public Human getEspecificEngineer(int idEngineer) {
        try {
            return listEngineer.get(idEngineer);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Numero digitado excede o numero de objetos criados.");
            return null;
        }

    }

    public Project getEspecificProject(int idProject) {
        try {
            return listProjects.get(idProject);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Numero digitado excede o numero de objetos criados.");
            return null;
        }

    }

    public Human getEspecificWorker(int idWorker) {
        try {
            return listWorkers.get(idWorker);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Numero digitado excede o numero de objetos criados.");
            return null;
        }
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

    public List<Human> getListWorkers() {
        return Collections.unmodifiableList(listWorkers);
    }

    public List<Item> getListItems() {
        return Collections.unmodifiableList(listItems);
    }

    @Override
    public String toString() {
        return "Service [listArchitects=" + listArchitects + ", listProjects=" + listProjects + ", listItems="
                + listItems + ", listEngineer=" + listEngineer + ", listWorkers=" + listWorkers + "]";
    }

}
