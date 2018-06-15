
public class Test {
	
	public static void main(String[] args) {
		String a ="hello";
		String b ="hello";
		String c =new String("hello");
		String d = new String("hello");
		String e = new String(b);

		System.out.println(a==b);//		true
		System.out.println(a=="hello");//		true
		System.out.println(a==c);//		false
		System.out.println(a==d);//		false
		System.out.println(c==d);//		false
		System.out.println(d==e);//		false
		System.out.println(e==b);//		false
	}
}
