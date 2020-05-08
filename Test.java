class Box {
    private int l,b,h;
    public Box(int L ,int B, int H){
        l=L;
        b=B;
        h=H;
    }
    public void  show()
    {
        System.out.println(l +" "+ b+" " +h);
    }
}

public class Test{
    public static void main(String [] args)
    {
        Box box = new Box(23,34,45);
        box.show();
        System.out.printf("%d %d\n",23,23);
        System.out.printf("%-20s %s\n","mahesh","suresh");
    }

}