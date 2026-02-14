package structural.decorator;

public class GroomingDecorator implements Grooming {

    protected Grooming grooming;

    public GroomingDecorator(Grooming grooming){
        this.grooming = grooming;
    }

    public void cost(){
        grooming.cost();
    }
}
