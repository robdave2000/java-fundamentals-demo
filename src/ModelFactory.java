import java.util.HashMap;
import java.util.Map;

public class ModelFactory
{
    public static Map<String, String> model;

    static
    {
        model = new HashMap<>();
        model.put("A", "Astromech,Starship repair/support");
        model.put("B", "Seeker,Follows clues/Detective");
        model.put("C", "Battle,Combat capable");
    }

    public static Map<String, String> getModel() {
        return model;
    }
}
