import java.util.HashMap;

public class Model
{
    public String modelTypeDroid;
    public String purposeDroid;
    ModelFactory models = new ModelFactory();

    public Model ()
    {
        this.modelTypeDroid = "Undefined";
        this.purposeDroid = "Undefined";
    }

    public String getModelTypeDroid() {
        return modelTypeDroid;
    }

    public void setModelTypeDroid(String modelInfo) {
        HashMap<String, String> model = (HashMap<String, String>) models.getModel();

        if (modelInfo.equals("A") || modelInfo.equals("a"))
        {
            String temp = model.get("A");
            String[] tempArr = temp.split(",");
            this.modelTypeDroid = tempArr[0];
            this.purposeDroid = tempArr[1];
        }
        else if (modelInfo.equals("B") || modelInfo.equals("b"))
        {
            String temp = model.get("B");
            String[] tempArr = temp.split(",");
            this.modelTypeDroid = tempArr[0];
            this.purposeDroid = tempArr[1];
        }
        else if (modelInfo.equals("C") || modelInfo.equals("c"))
        {
            String temp = model.get("C");
            String[] tempArr = temp.split(",");
            this.modelTypeDroid = tempArr[0];
            this.purposeDroid = tempArr[1];
        }
    }

    public String getPurposeDroid() {
        return purposeDroid;
    }
}
