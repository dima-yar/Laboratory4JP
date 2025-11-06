public class Car {
    private String __model;
    private String __brand;
    private String __color;
    private int __year;
    private double __price;
    private int __quantity;

    public Car(String M, String B, String C, int Y, double P, int Q) {
        setModel(M);
        setBrand(B);
        setColor(C);
        setYear(Y);
        setPrice(P);
        setQuantity(Q);

    }


    public String getModel(){
        return __model;
    }
    public void setModel(String M){
        this.__model = M.substring(0, 1).toUpperCase() + M.substring(1);
    }

    public String getBrand(){
        return __brand;
    }
    public void setBrand(String B){
        this.__brand = B.substring(0, 1).toUpperCase() + B.substring(1);
    }

    public String getColor(){
        return __color;
    }
    public void setColor(String C){
        this.__color = C.substring(0, 1).toUpperCase() + C.substring(1);
    }

    public int getYear(){
        return __year;
    }
    public void setYear(int Y){
        this.__year = Y;
    }

    public int getQuantity(){
        return __quantity;
    }
    public void setQuantity(int Q){
        this.__quantity = Q;
    }

    public double getPrice(){
        return __price;
    }
    public void setPrice(double P){
        this.__price = P;
    }

    public void devilery(int numberOfDeliveredCars){
        this.__quantity += numberOfDeliveredCars;
    }
    public void sell(int numberOfSoldCars){
        if(__quantity >= 1) this.__quantity -= numberOfSoldCars;
    }

    public String toString(){
        return getModel() + " " + getBrand() + " " + getColor() + " " + getYear() + " " + getQuantity() + " " + getPrice();
    }

    // model, brand,
    //year, price, color, quantity.
}
