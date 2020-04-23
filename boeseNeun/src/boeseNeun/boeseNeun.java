package boeseNeun;

public class boeseNeun {
	public static boolean uberspringen(int zahl)
	{
		++zahl;
		if(zahl%9==0)
			return true;
		while(zahl>=9)
		{
			if(zahl%10==9)
			return true;
			zahl=zahl/10;
		}
		return false;
	}
	public static void main(String[] args) {
		
		System.out.println(uberspringen(80));
	}

}
