package week1.day1;

public class TypeCasting {

	public static void main(String[] args) {
		byte b = 12;
		short s = 168;
		int i;
		long l;
		float f;
		double d;
		
		i = b + s;
		System.out.println(i);
		
		l = s + i;
		System.out.println(l);
		
		f = i + l;
		System.out.println(f);
		
		d = f + l;
		System.out.println(d);
	}

}
