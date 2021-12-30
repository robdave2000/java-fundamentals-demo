public class Tool {
    public String toolType;
    public int durability;

    public Tool(String toolType)
    {
        this.toolType = toolType;
        this.durability = 3;
    }

    public String getToolType() {
        return toolType;
    }

    public void setToolType(String toolType) {
        this.toolType = toolType;
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    @Override
    public String toString() {
        return "Tool{" +
                "toolType='" + toolType + '\'' +
                ", durability=" + durability +
                '}';
    }
}
