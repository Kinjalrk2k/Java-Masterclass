public class Car {

    //    these are fields of the class
    private String make = "Tesla";
    private String model = "Model X";
    private String color = "Gray";
    private int doors = 2;
    private boolean convertible = true;

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void describeCar() {
        System.out.println(doors + "-door " +
                color + " " +
                make + " " +
                model +
                (convertible ? " (convertible)" : "")
        );
    }
}
