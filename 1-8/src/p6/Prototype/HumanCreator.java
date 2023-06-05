package p6.Prototype;

import java.util.HashMap;
import java.util.Map;

public class HumanCreator {
    private static Map<String, Human> humanMap = new HashMap<String, Human>();

    static {
        humanMap.put("black", new BlackHuman());
        humanMap.put("asian", new AsianHuman());
    }

    public static Human getHuman(String humanColor){
        return (Human) humanMap.get(humanColor).clone();
    }
}
