public class Car {
    String brand;
    String modell;
    String color;
    int constructionYear;
    boolean started;
    int speed;

    public Car(){
        this.started = false;
        this.speed = 0;
    }
    public Car(String brand){
        this.started = false;
        this.speed = 0;
        this.brand = brand;
    }

    public Car(String brand, String modell){
        this.started = false;
        this.speed = 0;
        this.brand = brand;
        this.modell = modell;
    }

    public Car(String brand, String modell, int constructionYear){
        this.started = false;
        this.speed = 0;
        this.brand = brand;
        this.modell = modell;
        this.constructionYear = constructionYear;
    }

    public Car(String brand, String modell, String color){
        this.started = false;
        this.speed = 0;
        this.brand = brand;
        this.modell = modell;
        this.color = color;
    }

    public Car(String brand, String modell, String color, int constructionYear){
        this.started = false;
        this.speed = 0;
        this.brand = brand;
        this.modell = modell;
        this.color = color;
        this.constructionYear = constructionYear;
    }

    public void startCar(){
        this.started = true;
        System.out.println("Auto ist gestartet!");
    }

    public void accelerateCar(int acceleration){
        if(this.started){
            this.speed = this.speed + acceleration;
        } else{
            System.out.println("Starte zu erst das Auto");
        }
    }

    public void brakeCar(int brake){
        if(this.started){
            this.speed = Math.max(this.speed - Math.abs(brake), 0);
        } else{
            System.out.println("Das Auto ist nicht gestartet. Du brauchst nicht zu bremsen");
        }
    }

    public void getSpeed(){
        System.out.println("Du fährst " + this.speed + "km/h");
    }

    @Override
    public String toString(){
        String data =   "Marke: " + this.brand +
                        "\nModel: " + this.modell +
                        "\nFarbe: " + this.color +
                        "\nBaujahr: " + this.constructionYear +
                        "\nGeschwindigkeit: " + this.speed + "km/h";

        return data;
    }
}
