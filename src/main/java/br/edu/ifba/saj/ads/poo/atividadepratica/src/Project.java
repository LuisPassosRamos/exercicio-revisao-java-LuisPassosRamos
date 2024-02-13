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

    public void taskHiring(String nameWorker, int ageWorker, long numberWorker) {
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

    public void taskInspectionSchedule(int inspectionDate) {
        if (inspectionDate.isAfter(LocalDateTime.now())) {
            listInspections.add(new Inspection(listInspections.size(), inspectionDate));
        }
        super.setLastModification();
    }

    public void setPlanningDone() {
        stageProject.get(0).setProgressStage(100);
        stageProject.add(new Stage(2, "Foundation"));
        super.setLastModification();
    }

    public void setFoundationDone() {
        stageProject.get(1).setProgressStage(100);
        stageProject.add(new Stage(3, "Construction"));
        super.setLastModification();
    }

    public void setConstructionDone() {
        stageProject.get(2).setProgressStage(100);
        stageProject.add(new Stage(3, "Finishing"));
        super.setLastModification();
    }

    public void setFinishingDone() {
        stageProject.get(3).setProgressStage(100);
        super.setLastModification();
    }

    public void setArquitectResponsible(Human arquitectResponsible) {

        if (this.arquitectResponsible == null || !this.arquitectResponsible.equals(arquitectResponsible)) {
            this.arquitectResponsible = arquitectResponsible;
            super.setLastModification();
        }

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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((listWorkers == null) ? 0 : listWorkers.hashCode());
        result = prime * result + ((listInspections == null) ? 0 : listInspections.hashCode());
        result = prime * result + ((nameProject == null) ? 0 : nameProject.hashCode());
        result = prime * result + ((stageProject == null) ? 0 : stageProject.hashCode());
        result = prime * result + ((arquitectResponsible == null) ? 0 : arquitectResponsible.hashCode());
        result = prime * result + ((engineerResponsible == null) ? 0 : engineerResponsible.hashCode());
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
        Project other = (Project) obj;
        if (listWorkers == null) {
            if (other.listWorkers != null)
                return false;
        } else if (!listWorkers.equals(other.listWorkers))
            return false;
        if (listInspections == null) {
            if (other.listInspections != null)
                return false;
        } else if (!listInspections.equals(other.listInspections))
            return false;
        if (nameProject == null) {
            if (other.nameProject != null)
                return false;
        } else if (!nameProject.equals(other.nameProject))
            return false;
        if (stageProject == null) {
            if (other.stageProject != null)
                return false;
        } else if (!stageProject.equals(other.stageProject))
            return false;
        if (arquitectResponsible == null) {
            if (other.arquitectResponsible != null)
                return false;
        } else if (!arquitectResponsible.equals(other.arquitectResponsible))
            return false;
        if (engineerResponsible == null) {
            if (other.engineerResponsible != null)
                return false;
        } else if (!engineerResponsible.equals(other.engineerResponsible))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Projeto|ID: " + super.getId() + ", Lista de trabalhadores: " + this.listWorkers 
                +", Lista de inspecoes: " + this.listInspections
                +", Nome do projeto: " + nameProject + ", Etapa do projeto:" + stageProject 
                + ", Arquiteto responsavel:" + arquitectResponsible + ", Engenheiro responsavel: " 
                + engineerResponsible + ", Ultima modificacao: " + super.getLastModification() + "\n";
    }

}
