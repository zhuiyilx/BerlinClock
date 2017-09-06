package clone1;
class A implements Cloneable{
	public String name[];
	public A() {
		name = new String[2];
	}
	public A clone() {
		A o = null;
		try {
			o = (A) super.clone();
			o.name = (String[])name.clone();
		}catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return o;
	}
}

public class testClone {
	/* public void changeA(A a) {
		a.name = "b";
	}
	public void changeInt(int i) {
		i = i * 2 + 100;
	} */
	
	public static void main(String[] args){
		testClone test = new testClone();
		A a1 = new A();
		A a2 = new A();
		a1.name[0] = "a";
		a1.name[1] = "1";
		a2 = a1.clone();
		a2.name[0] = "A";
		a2.name[1] = "2";
		System.out.println("a1.name = " + a1.name);
		System.out.println("a1.name = " + a1.name[0] + a1.name[1]);
		System.out.println("a2.name = " + a2.name);
		System.out.println("a2.name = " + a2.name[0] + a2.name[1]);

	}
}
