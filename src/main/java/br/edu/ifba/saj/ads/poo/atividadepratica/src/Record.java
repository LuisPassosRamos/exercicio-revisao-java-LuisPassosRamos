public class Record extends Entity {
    private String subjectRecord;
    private TypeRecord typeRecord;

    public Record(String subjectRecord, int idRecord, TypeRecord typeRecord){
        super(idRecord);
        this.subjectRecord = subjectRecord;
        this.typeRecord = typeRecord;
    }

    public String getSubjectRecord() {
        return this.subjectRecord;
    }
    
    public TypeRecord getTypeRecord() {
        return this.typeRecord;
    }

    public void setSubjectRecord(String subjectRecord) {
        this.subjectRecord = subjectRecord;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((subjectRecord == null) ? 0 : subjectRecord.hashCode());
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
        Record other = (Record) obj;
        if (subjectRecord == null) {
            if (other.subjectRecord != null)
                return false;
        } else if (!subjectRecord.equals(other.subjectRecord))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Record [subjectRecord=" + subjectRecord + "]";
    }

}
