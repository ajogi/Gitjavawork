package box;

public class Hdfc implements Notification {

	@Override
	public void notificationBySms() {
		System.out.println("Notification By SMS");
		
	}

	@Override
	public void notificationByEmail() {
		System.out.println("Notification By Mail");
		
	}

	@Override
	public void notificationByCourier() {
		System.out.println("Notification By Courier");
		
	}

}