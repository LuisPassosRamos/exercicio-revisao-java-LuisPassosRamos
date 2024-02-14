public class Item extends Entity {

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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((nameItem == null) ? 0 : nameItem.hashCode());
        result = prime * result + Float.floatToIntBits(valueItem);
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
        Item other = (Item) obj;
        if (nameItem == null) {
            if (other.nameItem != null)
                return false;
        } else if (!nameItem.equals(other.nameItem))
            return false;
        if (Float.floatToIntBits(valueItem) != Float.floatToIntBits(other.valueItem))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Item [nameItem=" + nameItem + ", valueItem=" + valueItem + "]";
    }

}
