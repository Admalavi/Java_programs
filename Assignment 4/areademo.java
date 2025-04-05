interface area {
public static final double PI= 3.14; 
public double compute (double length, double height);    
}
class Rect implements area {
 @Override   
public double compute (double d1, double d2){
    return d1 * d2;
}
}
class circle implements area{
    @Override
public double compute (double r1, double unused){
    return PI * r1 * r1;
}  
}
class triangle implements area {
    @Override
public double compute (double s1, double h1){
return 0.5 * s1 * h1;
} 
}
public class areademo {
    public static void main(String[] args){
        area a;
        Rect r = new Rect();
        circle c = new circle();
        triangle t = new triangle();
        a = r;
        System.out.println("rectangle area="+ r.compute(10, 5));
        System.out.println("circle area= "+ c.compute(5,0));
        System.out.println("triangle area = " + t.compute(10,5));
    }
}
