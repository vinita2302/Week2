package main.hospital_patient_management;

class MedicalHistory implements MedicalRecord {
    private StringBuilder records;

    public MedicalHistory() {
        this.records = new StringBuilder();
    }

    @Override
    public void addRecord(String record) {
        records.append(record).append("\n");
    }

    @Override
    public String viewRecords() {
        return records.toString();
    }
}
