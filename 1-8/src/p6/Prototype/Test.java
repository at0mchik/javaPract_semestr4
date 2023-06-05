package p6.Prototype;

public class Test {
    public static void main(String[] args){
        HumanCreator.getHuman("black").addHuman();
        HumanCreator.getHuman("asian").addHuman();
        HumanCreator.getHuman("asian").addHuman();
        HumanCreator.getHuman("black").addHuman();
    }
}
