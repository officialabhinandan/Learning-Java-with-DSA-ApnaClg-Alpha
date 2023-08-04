package Funcsndmethods;

public class methodOvrLdng {
    public static void main(String args[]){
        System.out.println(sum(1, 7));
        System.out.println(sum(5, 7, 9));
        System.out.println(sum(5.3f, 7f));

    }

    public static int sum(int a, int b){
        return a+b;
    }

    public static int sum(int a, int b, int c){
        return a+b+c;
    }
    public static float sum(float a, float b){
        return a+b;
    }
    
}
