package classes;

public class Car {

    private String model;

    public Car(int doors, int wheels, String engine, String colour) {
    }

    public void setModel(String model){
        String validModel = model.toLowerCase();
        if (validModel.equals("carrera") || validModel.equals("commodore")){
            this.model = model;
        } else {
            this.model = "Unknown";
        }

    }

    public String getModel(){
        return this.model;
    }
}
