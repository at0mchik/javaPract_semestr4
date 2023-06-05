package p6.AbstractFactory;

public class Test {
    public static void main(String[] args){
        AbstractFactory asianFactory = new AsianFactory();
        AbstractFactory blackFactory = new BlackFactory();

        Man man1 = asianFactory.createMan();
        Man man2 = blackFactory.createMan();
        Woman woman1 = asianFactory.createWoman();
        Woman woman2 = blackFactory.createWoman();

        man1.say();
        man2.say();
        woman1.say();
        woman2.say();

    }
}
