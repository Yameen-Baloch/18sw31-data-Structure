class Area{
    double length = 0;
    double breadth = 0;
    double area = 0;
    Area(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public double printArea(){
        area = breadth*length;
        return area;
    }
}

class PrintArea{
    public static void main(String[] args) {
        Area a = new Area(20.5, 30);
        System.out.println(a.printArea());
    }
}