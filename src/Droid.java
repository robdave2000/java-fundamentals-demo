public class Droid {
    public String serialNumber;
    public String modelType;
    public String purpose;

    public Droid (String droidSerialNumber, String droidModelType, String droidPurpose)
    {
        serialNumber = droidSerialNumber;
        modelType = droidModelType;
        purpose = droidPurpose;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModelType() {
        return modelType;
    }

    public void setModelType(String modelType) {
        this.modelType = modelType;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public void speak()
    {
        System.out.println("Beep Borp WHEEE");
    }

    @Override
    public String toString() {
        return "Droid{" +
                "serialNumber='" + serialNumber + '\'' +
                ", modelType='" + modelType + '\'' +
                ", purpose='" + purpose + '\'' +
                '}';
    }
}
