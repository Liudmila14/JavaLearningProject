package md.tekwillacademy.classesandobjects;

public class Car {
    String plateNumber;
    int kmWhenEnteredTheService;
    String color;
    String make;
    String model;

    public Car (String colorParametruDeIntrarea, String makeFormalParameter,String modelLocalVariable) {
        color=colorParametruDeIntrarea;
        make=makeFormalParameter;
        model=modelLocalVariable;
    }
    public Car(String plateNumber){
        this.plateNumber=plateNumber;
    }


}
