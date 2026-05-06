public class Car {

    //    these are fields of the class
    private String make;
    private String model;
    private String color;
    private int doors;
    private boolean convertible;

    public void describeCar() {
        System.out.println(doors + "-door" +
                color + " " +
                make + " " +
                model +
                (convertible ? " (convertible)" : "")
        );
    }
}
