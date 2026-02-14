package behavioral.observer;
public class UserNotification implements Observer {

    public void update(String message){
        System.out.println("User notified: " + message);
    }
}
