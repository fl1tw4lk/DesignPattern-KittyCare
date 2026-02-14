package structural.decorator;
public class StylingDecorator extends GroomingDecorator {

    public StylingDecorator(Grooming grooming){
        super(grooming);
    }

    public void cost(){
        super.cost();
        System.out.println("+ Styling treatment");
    }
}
