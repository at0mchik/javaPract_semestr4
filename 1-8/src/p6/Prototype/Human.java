package p6.Prototype;

public abstract class Human implements Cloneable{
    protected String Color;

    abstract void addHuman();

    public Object clone()
    {
        Object clone = null;
        try
        {
            clone = super.clone();
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
        return clone;
    }
}
