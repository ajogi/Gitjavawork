package codecamp;

public class Test1 {

	public static void main(String[] args) 
	{
		Test1 t=new Test1();
		long value=t.methodA((byte) 6, 2.2);
		System.out.println(value);
	}
		long methodA(byte x, double y)
		{
			return (long) (x / y * 2);
		}

	}


