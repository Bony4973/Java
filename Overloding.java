public class Overloding {

    void display(){
        int ht=5, wt=4, lt=8;
        int area = ht*wt*lt;
        System.out.println(area);

    }

    static int area(int h, int w,int l){
        int area = h*w*l;
        return area;
    }
    static int area(int l, int w){
        int area = w*l;
        return area;
    }

    public static void main(String[] args) {
        int height=5, weigth=4, length=8;

        int a1 = area(length , weigth);
        System.out.println(a1);

        int a2 = area(height, weigth, length);
        System.out.println(a2);

        Overloding ob = new  Overloding();
        ob.display();

    }

}
