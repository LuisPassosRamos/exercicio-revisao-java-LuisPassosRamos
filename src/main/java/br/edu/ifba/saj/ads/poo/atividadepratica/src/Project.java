import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Project extends Entity {
    private List<Human> listWorkers;
    private List<Inspection> listInspections;
    private String nameProject;
    private List<Stage> stageProject;
    private Human arquitectResponsible;
    private Human engineerResponsible;

    public Project(int id, String nameProject) {
        super(id);
        this.stageProject = new ArrayList<>();
        this.stageProject.add(new Stage(1, "Planning"));
        this.nameProject = nameProject;
    }

    public Project(int id, String nameProject, Human arquitectResponsible, Human engineerResponsible) {
        super(id);
        this.stageProject = new ArrayList<>();
        this.stageProject.add(new Stage(1, "Planning"));
        this.nameProject = nameProject;
        setArquitectResponsible(arquitectResponsible);
        setEngineerResponsible(engineerResponsible);
    }

    public void taskHiring(String nameWorker, int ageWorker, int numberWorker) {
        Human newWorker = new Human(nameWorker, listWorkers.size(), "Worker", numberWorker);
        if (!this.listWorkers.contains(newWorker)) {
            this.listWorkers.add(newWorker);
        }
        super.setLastModification();
    }

    public void taskBuying(Item taskItem) {
        // Redireciona para uma pagina na web com o melhor valor do item correspondente
        super.setLastModification();
    }

    public void taskInspectionSchedule(LocalDateTime inspectionDate) {
        if (inspectionDate.isAfter(LocalDateTime.now())) {
            listInspections.add(new Inspection(listInspections.size(), inspectionDate));
        }
        super.setLastModification();
    }

    public void setStageDone(Stage myStage) {
        stageProject.get(stageProject.size()).setProgressStage(100);
        if (!stageProject.contains(myStage)) {
            stageProject.add(myStage);
            super.setLastModification();
        }
    }

    public void setArquitectResponsible(Human arquitectResponsible) {
        this.arquitectResponsible = arquitectResponsible;
        super.setLastModification();
    }

    public void setEngineerResponsible(Human engineerResponsible) {
        this.engineerResponsible = engineerResponsible;
        super.setLastModification();
    }

    public List<Human> getListWorkers() {
        return Collections.unmodifiableList(this.listWorkers);
    }

    public List<Inspection> getListInspections() {
        return Collections.unmodifiableList(this.listInspections);
    }

    public List<Stage> getStageProject() {
        return Collections.unmodifiableList(this.stageProject);
    }

    public String getNameProject() {
        return this.nameProject;
    }

    public Human getArquitectResponsible() {
        return this.arquitectResponsible;
    }

    public Human getEngineerResponsible() {
        return this.engineerResponsible;
    }

}
