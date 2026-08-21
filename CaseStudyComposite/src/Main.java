public class Main {
    static void main(String[] args) {

        MedicalUnit mainHospital = new Department("General Hospital");
        mainHospital.setStartDescription("General Hospital Master Division");
        mainHospital.setEndDescription("End of General Hospital\n");

        MedicalUnit surgeryDept = new Department("Surgery");
        surgeryDept.setStartDescription("Surgery Department");
        surgeryDept.setEndDescription("End of Surgery");

        mainHospital.addUnit(surgeryDept);

        MedicalUnit doc1 = new StaffMember("Dr. Adams");
        doc1.setStartDescription("  Doctor: Dr. Adams ");
        doc1.setEndDescription("    ");
        doc1.setSpecialty("(General Surgery)");
        surgeryDept.addUnit(doc1);

        MedicalUnit doc2 = new StaffMember("Dr. Smith");
        doc2.setStartDescription("  Doctor: Dr. Smith ");
        doc2.setEndDescription("");
        doc2.setSpecialty("(Anesthesiology)");
        surgeryDept.addUnit(doc2);

        mainHospital.printDetails();
    }
}