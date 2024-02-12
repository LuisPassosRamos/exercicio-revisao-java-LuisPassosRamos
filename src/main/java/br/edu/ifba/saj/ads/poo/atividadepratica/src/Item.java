public class Item extends Entity{

    private String nameItem;
    private float valueItem;

    public Item(int id, String nameItem, float valueItem) {
        super(id);
        this.nameItem = nameItem;
        this.valueItem = valueItem;
    }

    public String getNameItem() {
        return nameItem;
    }

    public void setNameItem(String nameItem) {
        this.nameItem = nameItem;
        super.setLastModification();
    }

    public float getValueItem() {
        return valueItem;
    }

    public void setValueItem(float valueItem) {
        this.valueItem = valueItem;
        super.setLastModification();
    }

    
    
}
