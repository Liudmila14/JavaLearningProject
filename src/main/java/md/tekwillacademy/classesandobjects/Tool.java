package md.tekwillacademy.classesandobjects;

public class Tool {
    double price;
    String nameOfTheTool;
    String matereal;

    public Tool (String nameOfTheTool){
        this.nameOfTheTool=nameOfTheTool;
        System.out.println("Un obiect de tip tool a fost creat, numele lui este: " + nameOfTheTool);

    }
    public Tool(){
        System.out.println("A new tool was created. We don't know about it's detals. Pentru detalii numele este: "+ this.nameOfTheTool +" "+ this.matereal);
    }

}
