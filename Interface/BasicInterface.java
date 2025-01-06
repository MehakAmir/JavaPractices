package Interface;

interface Mathematic {
	public int AddNum (int a,int b);
}



class Sum implements Mathematic{
	public int AddNum (int a,int b) {
	return (a+b);
	}
}


public class BasicInterface {
public static void main(String[] args) {
	Sum s = new Sum();
	int result=s.AddNum(2, 4);
	System.out.println("sum is "+result);
	}
}
