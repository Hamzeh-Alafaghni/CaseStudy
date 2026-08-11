class StaffMember extends MedicalUnit {

    private String unitName;
    private String startDescription;
    private String endDescription;
    private String specialty;

    public StaffMember(String unitName) {
        this.unitName = unitName;
        this.startDescription = "";
        this.endDescription = "";
        this.specialty = "";
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
    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    @Override
    public void printDetails() {
        System.out.println(startDescription + specialty + endDescription);
    }
}