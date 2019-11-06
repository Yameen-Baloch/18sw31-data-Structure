import sun.tools.tree.DoubleExpression;

class Courier{

    int poids = 0; 
    boolean aExpress;
    String address = null;
    boolean isNotValid;

    Courier(int poids, boolean aExpress, String address){
        this.poids = poids;
        this.aExpress = aExpress;
        this.address = address;
    }

    public boolean isExpress(){
        return aExpress;
    }


    public double affranchirCourier(){
        return 1.0;
    }

    public void affchar(){}
}
    // child class

class Publicit extends Courier{
    double prix = 0;

    public Publicit(int poids, boolean aExpress, String address) {
        super(poids, aExpress, address);
        
    }

    public double getPrix(){
        return poids;
    }

   public void affchar(){

    }

    public double affranchirCourier(){
        return 1.0;
    }
    
    
}


class Lattre extends Courier{
    String format = null;
    double prix = 0;
    Lettre(int poids, boolean isExpress, String address, String format){

    }
    double getPrix(){
        return 1.0;
    }

    void affcher(){

    }

    public double affranchirCourier(){
        return 1.0;
    }
}


class Colis extends Courier{
    double volume = 0;
    double prix = 0;

    Colis(int poids, boolean isExpress, String address, int volume){

    }
    double getPrix(){
        return poids;
    }

    void affcher(){

    }

    public double affranchirCourier() {
        return 1.0;
    }


}