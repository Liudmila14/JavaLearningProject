package md.tekwillacademy.classesandobjects;


public class ManageAutoService {
    public static void main(String[] args) {
        Garage masterLuxObject=new Garage("Str. Calea Orheiului 147",3,220);
        System.out.println(masterLuxObject.address);

        Garage autoLuxObject=new Garage();
        System.out.println(autoLuxObject.numberOfBoxes);
        autoLuxObject.address="Str. Stefan cel Mare";
        autoLuxObject.dimensionSqFt=250.6;
        autoLuxObject.numberOfBoxes=5;

        System.out.println("Informatii despre obiectul Autolux de pe adresa: " + autoLuxObject.address + " Cu numarul de boxe: " + autoLuxObject.numberOfBoxes + " si dimensiunea:  " +  autoLuxObject.dimensionSqFt);

        Car myCar=new Car("White","BMW","X5");
        Car hisCar=new Car("LWQ 257");

        System.out.println("I love driving my " + myCar.color+" " + myCar.make +" " +myCar.model);

        Tool tool1=new Tool("CarSocket");
        System.out.println(tool1.nameOfTheTool);

        Tool tool2=new Tool();
        tool2.nameOfTheTool="CarJack";
        tool2.matereal="plastic";
        System.out.println("The tool2 is: " + tool2.nameOfTheTool +" and it was made from: "+ tool2.matereal);

        Worker worker1=new Worker("Ivanov");
        worker1.yearsOfExperiance=16;
        System.out.println(worker1.name +" has "+worker1.yearsOfExperiance+" years Of Experiance");

        Worker worker2=new Worker();

        Car masinaNicoletei=new Car("red","Ferrari","M25");
        System.out.println(masinaNicoletei.make+" "+masinaNicoletei.color + " "+ masinaNicoletei.model);

        Car masinaLuiAdrian=new Car("Black","Mercedes","306");
        System.out.println(masinaLuiAdrian.color);

    }
}
