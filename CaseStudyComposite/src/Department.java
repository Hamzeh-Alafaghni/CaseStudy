import java.util.ArrayList;
import java.util.List;

class Department extends MedicalUnit {

    private String unitName;
    private String startDescription;
    private String endDescription;
    private List<MedicalUnit> childrenUnits;

    public Department(String unitName) {
        this.unitName = unitName;
        this.startDescription = "";
        this.endDescription = "";
        this.childrenUnits = new ArrayList<>();
    }

    @Override
    public String getUnitName() {
        return unitName;
    }

    @Override
    public void setStartDescription(String description) {
        this.startDescription = description;
    }

    @Override
    public void setEndDescription(String description) {
        this.endDescription = description;
    }

    @Override
    public void addUnit(MedicalUnit unit) {
        childrenUnits.add(unit);
    }

    @Override
    public void removeUnit(MedicalUnit unit) {
        childrenUnits.remove(unit);
    }

    @Override
    public List<MedicalUnit> getChildUnits() {
        return childrenUnits;
    }

    @Override
    public void printDetails() {
        System.out.println(startDescription);
        for(MedicalUnit unit : childrenUnits) {
            unit.printDetails();
        }
        System.out.println(endDescription);
    }
}