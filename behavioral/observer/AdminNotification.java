package behavioral.observer;
public class AdminNotification implements Observer {

    public void update(String message){
        System.out.println("Admin notified: " + message);
    }
}
