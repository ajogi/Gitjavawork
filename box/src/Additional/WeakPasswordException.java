package Additional;


public class WeakPasswordException extends Exception {
	    
		String msg;             
		public WeakPasswordException(String msg) {           
			super();
			this.msg = msg;
		}	

	}
