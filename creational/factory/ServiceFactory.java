package creational.factory;
public class ServiceFactory {

    public static Service createService(String type){

        if(type.equalsIgnoreCase("grooming"))
            return new GroomingService();

        if(type.equalsIgnoreCase("boarding"))
            return new BoardingService();

        if(type.equalsIgnoreCase("medical"))
            return new MedicalService();

        return null;
    }
}
