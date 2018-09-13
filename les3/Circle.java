public class Circle
{
    public double radius;

    public void showArea(){
        double area = radius * radius * Math.PI;
        System.out.println("Area: " + area);
    }

    public void setRadius(double r){
        radius = r;
    }

    public static void main(String[] args){
        Circle c = new Circle();
        c.setRadius(2.4);
        c.showArea();
    }
}