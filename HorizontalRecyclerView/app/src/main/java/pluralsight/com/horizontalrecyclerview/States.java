package pluralsight.com.horizontalrecyclerview;

public class States {
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    String code=null;
    String name=null;
    boolean selected= false;
    public States(String code, String name, boolean selected) {
        this.code = code;
        this.name = name;
        this.selected = selected;
    }


}
