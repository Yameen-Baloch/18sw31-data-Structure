class shape{
    public void drawShape(){
        System.out.println("Draw Shape of the Shape");
    }
    public void eraseShape(){
        System.out.println("EraseShape of the Shape");
    }
}

class square extends shape{
    public void drawShape(){
        System.out.println("Draw Shape of the Square");
    }
    public void eraseShape(){
        System.out.println("EraseShape of the Square");
    }

}

class triangle extends shape{
    public void drawShape(){
        System.out.println("Draw Shape of the trianlge");
    }
    public void eraseShape(){
        System.out.println("EraseShape of the triangle");
    }
    
}

class ShapeClass{
    public static void main(String[] args) {
        triangle obj = new triangle();
        obj.drawShape();
        obj.eraseShape();
    }
}