import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Project extends Entity {
    private String nameProject;
    private List<Human> listWorkers;
    private List<Inspection> listInspections;
    private List<Stage> stageProject;
    private Human arquitectResponsible;
    private Human engineerResponsible;
    private List<Record> listRecords;

    public Project(int id, String nameProject) {
        super(id);
        this.listInspections = new ArrayList<>();
        this.listInspections.add(new Inspection(1));
        this.listRecords = new ArrayList<>();
        this.listWorkers = new ArrayList<>();
        this.stageProject = new ArrayList<>();
        this.stageProject.add(new Stage(1, "Planning"));
        this.nameProject = nameProject;
        this.arquitectResponsible = null;
        this.engineerResponsible = null;
    }

    public Project(int id, String nameProject, Human arquitectResponsible, Human engineerResponsible)
            throws DuplicatedObjException {
        super(id);
        this.listInspections = new ArrayList<>();
        this.listInspections.add(new Inspection(1));
        this.listRecords = new ArrayList<>();
        this.listWorkers = new ArrayList<>();
        this.stageProject = new ArrayList<>();
        this.stageProject.add(new Stage(1, "Planning"));
        this.nameProject = nameProject;
        setArquitectResponsible(arquitectResponsible);
        setEngineerResponsible(engineerResponsible);
    }

    public void taskHiring(Human newWorker) {
        if (!this.listWorkers.contains(newWorker)) {
            this.listWorkers.add(newWorker);
            super.setLastModification();
        }
    }

    public void taskBuying(Item taskItem) {
        // Redireciona para uma pagina na web com o melhor valor do item correspondente
        super.setLastModification();
    }

    public void taskInspectionSchedule(LocalDate inspectionDate) {
        if (inspectionDate.isAfter(LocalDate.now())) {
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

    }

    public void setArquitectResponsible(Human arquitectResponsible) throws DuplicatedObjException {
        if (this.arquitectResponsible == null || !this.arquitectResponsible.equals(arquitectResponsible)) {
            this.arquitectResponsible = arquitectResponsible;
            super.setLastModification();
        } else {
            throw new DuplicatedObjException("Objeto duplicado");
        }
    }

    public void setEngineerResponsible(Human engineerResponsible) throws DuplicatedObjException {
        if (this.engineerResponsible == null || !this.engineerResponsible.equals(engineerResponsible)) {
            this.engineerResponsible = engineerResponsible;
            super.setLastModification();
        } else {
            throw new DuplicatedObjException("Objeto duplicado");
        }
    }

    public void setListRecord(String subjectRecord, TypeRecord typeRecord) throws DuplicatedObjException {
        Record myRecord = new Record(subjectRecord, this.listRecords.size() + 1, typeRecord);
        if (!this.listRecords.contains(myRecord)) {
            this.listRecords.add(myRecord);
        } else {
            throw new DuplicatedObjException("Arquiteto duplicado");
        }

    }

    public void removeRecord(int idRecord) {
        try {
            this.listRecords.remove(idRecord);
            super.setLastModification();
        } catch (IndexOutOfBoundsException e) {

        }

    }

    public Inspection getLastInspectionDate() {
        for (Inspection inspection : listInspections) {
            if (inspection.getStateInspection() == State.CLOSED
                    && inspection.getDateInspectionNoFormatter().isBefore(LocalDate.now())) {
                return inspection;
            }
        }

        return this.listInspections.get(1);
    }

    public List<Record> getListRecords() {
        return Collections.unmodifiableList(this.listRecords);
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
        int result = super.hashCode();
        result = prime * result + ((listWorkers == null) ? 0 : listWorkers.hashCode());
        result = prime * result + ((listInspections == null) ? 0 : listInspections.hashCode());
        result = prime * result + ((nameProject == null) ? 0 : nameProject.hashCode());
        result = prime * result + ((stageProject == null) ? 0 : stageProject.hashCode());
        result = prime * result + ((arquitectResponsible == null) ? 0 : arquitectResponsible.hashCode());
        result = prime * result + ((engineerResponsible == null) ? 0 : engineerResponsible.hashCode());
        result = prime * result + ((listRecords == null) ? 0 : listRecords.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
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
        if (listRecords == null) {
            if (other.listRecords != null)
                return false;
        } else if (!listRecords.equals(other.listRecords))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Projeto|ID: " + super.getId() + ", Nome do projeto: " + nameProject + "\n";
    }

}
