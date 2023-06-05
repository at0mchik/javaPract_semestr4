package p1;

public class Main implements Consumer {
    public void changeStroke(String s){
        for(int i = 2; i < s.length(); i+=3){
            if(Character.isLowerCase(s.charAt(i)))
                s = s.substring(0, i) + Character.toUpperCase(s.charAt(i)) + s.substring(i+1);
        }

        System.out.println(s);
    }

    public static void main(String[] args) {
        Main a = new Main();

        a.changeStroke("abcabcfghjhg");
    }
}