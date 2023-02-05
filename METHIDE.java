public class METHIDE {

    static int met(int x){

        System.out.println("Hello, World");
        return x+10;
    }
    public double methode(int y){
        System.out.println("Hello, World");
        return y+20;
    }

    public static void main(String[] args) {

        int a = 5,j,k;

        System.out.println(j = met(a));
        METHIDE x = new METHIDE();
        System.out.println(x.methode(a));
    }
}
