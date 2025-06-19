
import java.util.ArrayList; 
public class Project {
    public static void main(String[] args) {
        CustomizeSuperCar customizer = new CustomizeSuperCar();
        customizer.selectCar();
    }
}

class CustomizeSuperCar {
    private ArrayList<SportsCar> sportsCarList;
    private ArrayList<LuxurySUV> luxurySUVList;
    public CustomizeSuperCar() {
        sportsCarList = new ArrayList<>();
        luxurySUVList = new ArrayList<>();

        sportsCarList.add(new SportsCar("Ferrari", "488 GTB", 262000, 330, "Rosso Corsa", "Nero", 3.0));
        sportsCarList.add(new SportsCar("Porsche", "911 Turbo S", 207000, 330, "Guards Red", "Black Leather", 2.6));
        sportsCarList.add(new SportsCar("McLaren 720S", "720S", 315000, 341, "Mclaren Orange", "Black Leather", 2.7));

        luxurySUVList.add(new LuxurySUV("Bentley", "Bentayga", 245000, 305, "Ice White", "Beluga Leather", "Diamond-Quilted Leather", true));
        luxurySUVList.add(new LuxurySUV("Land Rover", "Range Rover Autobiography", 155000, 250, "Santorini Black", "Ebony/Ebony", "Semi-Aniline Leather", true));
        luxurySUVList.add(new LuxurySUV("Mercedes-Benz", "G-Class (G 550)", 130900, 209, "Polar White", "Black Nappa Leather", "Nappa Leather", true));
    } 
    public void selectCar() {
        while(true) {
            System.out.println("<Select either Sports Car or Luxury SUV>");
            System.out.println("A: Customize Sports Car");
            System.out.println("B: Customize Luxury SUV");
            System.out.print("Your selection: ");
            String selectCarType = In.nextLine();
        
            if (selectCarType.equals("A")) {
                selectSportsCar();
                break;
            }
            else if (selectCarType.equals("B")) {
                selectLuxurySUV();
                break;
            }
            else {
                System.out.println("You should type A or B. Try again -> ");
                System.out.println();
            }
        }
    }
    public void selectSportsCar() {
        System.out.println();
        System.out.println("<Select one Car that you will customize>");
        System.out.println("-Default settings before customizing-");
        for (int i = 0; i < sportsCarList.size(); i++) {
            System.out.println((i + 1) + ") " + sportsCarList.get(i));
        }
        while(true){
            System.out.print("Your selection: ");
            int selection = In.nextInt() -1;
            if (selection >= 0 && selection < sportsCarList.size()) {
                SportsCar selectedCar = sportsCarList.get(selection);
                customizeSportsCar(selectedCar);
                break;
            }
            else {
                System.out.println("Invalid selection. You should enter only 1, 2, or 3.");  
                System.out.print("Choose car again -> ");
            } 
        }
    }
    public void selectLuxurySUV() {
        System.out.println();
        System.out.println("<Select one Car that you will customize>");
        System.out.println("-Default settings before customizing-");
        for (int i = 0; i < luxurySUVList.size(); i++) {
            System.out.println((i + 1) + ") " + luxurySUVList.get(i));
        }
        while(true){
            System.out.print("Your selection: ");
            int selection = In.nextInt() -1;
            if (selection >= 0 && selection < luxurySUVList.size()) {
                LuxurySUV selectedCar = luxurySUVList.get(selection);
                customizeLuxurySUV(selectedCar);
                break;
            }
            else {
                System.out.println("Invalid selection. You should enter only 1, 2, or 3.");
                System.out.print("Choose car again -> ");
            }   
        }
    }

    public void customizeSportsCar(SportsCar sportsCar) {
        System.out.println();
        System.out.println("Current selected sports car details) ");
        System.out.println(sportsCar);
        System.out.println("~What would you like to customize?~");
        System.out.println("0. Stop customizing");
        System.out.println("1. Change exterior color");
        System.out.println("2. Change interior color");
        System.out.println("3. Change top speed");
        System.out.println("4. Change acceleration");
        
        boolean againCustom = true;
        while(againCustom) {
            System.out.print("Enter your choice: ");
            int customSelection = In.nextInt();
            switch (customSelection) {
                case 0: 
                    againCustom = false;
                    break;
                case 1: 
                    System.out.print("Enter new exterior color: ");
                    String newExteriorColor = In.nextLine();
                    sportsCar.setExteriorColor(newExteriorColor);
                    break;
                case 2:
                    System.out.print("Enter new interior color: ");
                    String newInteriorColor = In.nextLine();
                    sportsCar.setExteriorColor(newInteriorColor);
                    break;
                case 3:
                    while(true){
                        System.out.print("Enter new top speed: ");
                        int newTopSpeed = In.nextInt();
                        if(newTopSpeed>=200 && newTopSpeed<=350) {
                            sportsCar.setTopSpeed(newTopSpeed); 
                            break;
                        }
                        else {
                            System.out.println("You should enter custom top speed between 200 and 350.");
                            System.out.print("Try again -> ");
                        }
                    }
                    break;
                case 4:
                    while(true){
                        System.out.print("Enter new acceleration: ");
                        double newAcceleration = In.nextDouble();
                        if(newAcceleration>=2.0 && newAcceleration<=5.0) {
                            sportsCar.setAcceleration(newAcceleration);
                            break;
                        }
                        else {
                            System.out.println("You should enter custom acceleration between 2.0 and 5.0.");
                            System.out.print("Try again -> ");
                        }
                    }
                    break;
                default: 
                    System.out.println("Invalid choice!");
            }
            System.out.println("Enter 0 if you want to stop customizing or continuing customizing");
        }
        System.out.println("Your customized car details) " + sportsCar);
    }
    public void customizeLuxurySUV(LuxurySUV luxurySUV) {
        System.out.println();
        System.out.println("Current selected luxury SUV details) " );
        System.out.println(luxurySUV);
        System.out.println("~What would you like to customize?~");
        System.out.println("0. Stop customizing");
        System.out.println("1. Change exterior color");
        System.out.println("2. Change interior color");
        System.out.println("3. Change top speed");
        System.out.println("4. Change interior material");
        System.out.println("5. Toggle advanced safety features");
        
        boolean againcustom = true;
        while(againcustom) {
            System.out.print("Enter your choice: ");
            int customSelection = In.nextInt();
            switch (customSelection) {
                case 0: 
                    againcustom = false;
                    break;
                case 1: 
                    System.out.print("Enter new exterior color: ");
                    String newExteriorColor = In.nextLine();
                    luxurySUV.setExteriorColor(newExteriorColor);
                    break;
                case 2:
                    System.out.print("Enter new interior color: ");
                    String newInteriorColor = In.nextLine();
                    luxurySUV.setExteriorColor(newInteriorColor);
                    break;
                case 3:
                    while(true){
                        System.out.print("Enter new top speed: ");
                        int newTopSpeed = In.nextInt();
                        if(newTopSpeed>=180 && newTopSpeed<=300) {
                            luxurySUV.setTopSpeed(newTopSpeed); 
                            break;
                        }
                        else {
                            System.out.println("You should enter top speed between 180 and 300.");
                            System.out.print("Try again -> ");
                        }
                    }
                    break;
                case 4:
                    System.out.print("Enter new interior material: ");
                    String newInteriorMaterial = In.nextLine();
                    luxurySUV.setInteriorMaterial(newInteriorMaterial);
                    break;
                case 5:
                    boolean currentStatus = luxurySUV.getHasAdvancedSafetyFeatures();
                    luxurySUV.setHasAdvancedSafetyFeatures(!currentStatus);
                    System.out.print("Advanced safety features set to: " + !currentStatus);
                    break;
                default: 
                    System.out.println("Invalid choice!");
            }
            System.out.println("Enter 0 if you want to stop customizing or continuing customizing");

        }
        System.out.println("Your customized car details) " + luxurySUV);
    }
}

class SuperCar{
    protected String exteriorColor;
    protected String interiorColor;
    protected String brand;
    protected String model;
    protected int topSpeed;
    protected double price;
    SuperCar(String brand, String model, double price, int topSpeed, String exteriorColor, String interiorColor){
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.topSpeed = topSpeed;
        this.exteriorColor = exteriorColor;
        this.interiorColor = interiorColor;
    }
    public String toString(){
        return "Brand name: " + brand + "/ Model Name: " + model + "/ Price: $" + price + "/ Top Speed: " + topSpeed +"km/h" + " /Painted Color: " + exteriorColor + "/ Carbin Color: " + interiorColor;
    }
    
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getTopSpeed() {
        return topSpeed;
    }
    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }
    public String getExteriorColor() {
        return exteriorColor;
    }
    public void setExteriorColor(String exteriorColor){
        this.exteriorColor = exteriorColor;
    }
    public String getInteriorColor() {
        return interiorColor;
    }
    public void setInteriorColor(String interiorColor){
        this.interiorColor = interiorColor;
    }

}

class SportsCar extends SuperCar{
    private double acceleration;
    SportsCar(String brand, String model, double price, int topSpeed, String exteriorColor, String interiorColor, double acceleration){
        super(brand, model, price, topSpeed, exteriorColor, interiorColor);
        this.acceleration = acceleration;
    }
    @Override
    public String toString(){
        return super.toString() + "/ Acceleration: " + acceleration + "km/h/s";
    }
    public double getAcceleration() {
        return acceleration;
    }
    public void setAcceleration(double acceleration){
        this.acceleration = acceleration;
    }
}

class LuxurySUV extends SuperCar{
    private String interiorMaterial;
    private boolean hasAdvancedSafetyFeatures;
    LuxurySUV(String brand, String model, double price, int topSpeed, String exteriorColor, String interiorColor, String interiorMaterial, boolean hasAdvancedSafetyFeatures) {
        super(brand, model, price, topSpeed, exteriorColor, interiorColor);
        this.interiorMaterial = interiorMaterial;
        this.hasAdvancedSafetyFeatures = hasAdvancedSafetyFeatures;
    }
    @Override
    public String toString(){
        return super.toString() + "/ Interior Material: " + interiorMaterial + "/ Has Advanced Safety Features?: " + hasAdvancedSafetyFeatures;
    }
    public String getInteriorMaterial() {
        return interiorMaterial;
    }
    public void setInteriorMaterial(String interiorMaterial) {
        this.interiorMaterial = interiorMaterial;
    }
    public boolean getHasAdvancedSafetyFeatures() {
        return hasAdvancedSafetyFeatures;
    }
    public void setHasAdvancedSafetyFeatures(boolean hasAdvancedSafetyFeatures) {
        this.hasAdvancedSafetyFeatures = hasAdvancedSafetyFeatures;
    }
    
}

