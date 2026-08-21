import java.util.ArrayList;
import java.util.List;

abstract class MedicalUnit {

    public abstract String getUnitName();

    public abstract void setStartDescription(String description);

    public abstract void setEndDescription(String description);

    public void setSpecialty(String specialty) {
        throw new UnsupportedOperationException("Current operation is not support for this object");
    }

    public void addUnit(MedicalUnit unit) {
        throw new UnsupportedOperationException("Current operation is not support for this object");
    }

    public void removeUnit(MedicalUnit unit) {
        throw new UnsupportedOperationException("Current operation is not support for this object");
    }

    public List<MedicalUnit> getChildUnits() {
        throw new UnsupportedOperationException("Current operation is not support for this object");
    }

    public abstract void printDetails();
}
