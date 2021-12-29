public class DroidFactory {
    public String serialNumber;
    public String modelType;
    public String purpose;

    Model models = new Model();

    public DroidFactory (String droidSerialNumber)
    {
        serialNumber = droidSerialNumber;
        modelType = "Undefined";
        purpose = "Undefined";
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

    public void setModelType(String answer) {
        models.setModelTypeDroid(answer);
        modelType = models.modelTypeDroid;
        purpose = models.purposeDroid;
    }

    public String getPurpose() {
        return purpose;
    }

    public void speak()
    {
        System.out.println(serialNumber + ": Beep Borp WHEEE");
    }

    @Override
    public String toString() {
        return "DroidFactory{" +
                "serialNumber='" + serialNumber + '\'' +
                ", modelType='" + modelType + '\'' +
                ", purpose='" + purpose + '\'' +
                '}';
    }
}
