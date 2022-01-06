package org.classes;

public class Car {
    Body body = new Body();
    Engine engine = new Engine();
    Transmision transimission = new Transmision();

    String carGetInfo(){
        return "1. BODY\n " + body.bodyInfo() + ";\n" +
               "2. ENGINE\n " + engine.engineInfo() + ";\n" +
               "3. TRANSMISSION\n " + transimission.TransmissionInfo();
    }
}
// body of car
class Body{
    private String type = "Type";
    private String material = "Material";

    public Body(){
        this.type = type;
        this.material = material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMaterial() {
        return material;
    }

    public String getType() {
        return type;
    }

    String bodyInfo(){
        return "Material of car body: " + getMaterial() + "\nType of car body: " + getType();
    }
}


// engine of car

class Engine{

    private String fuel = "fuel";
    private String coolingMethod = "stock coolingMethod";
    private int cylindersAmount = 0;
    private String cylindersArrangment = "stock cylindersArrangment";
    private String combustibleMixtureIgnition = "combustibleMixtureIgnition";

    public Engine(){
        this.fuel = fuel;
        this.coolingMethod = coolingMethod;
        this.cylindersAmount = cylindersAmount;
        this.cylindersArrangment = cylindersArrangment;
        this.combustibleMixtureIgnition = combustibleMixtureIgnition;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public void setCoolingMethod(String coolingMethod) {
        this.coolingMethod = coolingMethod;
    }

    public void setCylindersAmount(int cylindersAmount) {
        this.cylindersAmount = cylindersAmount;
    }

    public void setCylindersArrangment(String cylindersArrangment) {
        this.cylindersArrangment = cylindersArrangment;
    }

    public void setCombustibleMixtureIgnition(String combustibleMixtureIgnition) {
        this.combustibleMixtureIgnition = combustibleMixtureIgnition;
    }

    public String getFuel() {
        return fuel;
    }

    public String getCoolingMethod() {
        return coolingMethod;
    }

    public String getCylindersArrangment() {
        return cylindersArrangment;
    }

    public int getCylindersAmount() {
        return cylindersAmount;
    }

    public String getCombustibleMixtureIgnition() {
        return combustibleMixtureIgnition;
    }

    String engineInfo(){
        return "Type of fuel: " + getFuel() + "\n Cooling method: " + getCoolingMethod() +
                "\n cylindersArrangment: " + getCylindersArrangment() +
                "\n amount of cylinders: " + getCylindersAmount() +
                "\n combustible mixture ignition: " + getCombustibleMixtureIgnition();
    }
}

// transmission of car

class Transmision{
        private String driveType = "default drive type";
        private String gearboxType = "deafault gearbox type";

        Transmision(){
            this.driveType = driveType;
            this.gearboxType = gearboxType;
        }

    public void setDriveType(String driveType) {
        this.driveType = driveType;
    }

    public void setGearboxType(String gearboxType) {
        this.gearboxType = gearboxType;
    }

    public String getDriveType() {
        return driveType;
    }

    public String getGearboxType() {
        return gearboxType;
    }

    String TransmissionInfo(){
            return "Drive type of a car: " + getDriveType() + "\nZType of car gearbox: " + getGearboxType();
    }
}