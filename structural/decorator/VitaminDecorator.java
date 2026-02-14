package structural.decorator;
public class VitaminDecorator extends GroomingDecorator {

    public VitaminDecorator(Grooming grooming){
        super(grooming);
    }

    public void cost(){
        super.cost();
        System.out.println("+ Vitamin treatment");
    }
}
