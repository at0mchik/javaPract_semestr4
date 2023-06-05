package p6.Fabric;

public abstract class Factory {
    protected abstract Human createHuman();

    public Human say(){
        Human human = createHuman();
        human.say();
        return human;
    }
}
