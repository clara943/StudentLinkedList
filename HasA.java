//데이터클래스
class A{
	private int a;
	
	public A() {
		System.out.println("A");
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getA() {
		return a;
	}
}
//데이터관리클래스	
public class HasA {
	
	private String name;
	private A age;
	//생성자
	public HasA() {
		System.out.println("HasA");
		name = "";
		age = new A();
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age.setA(age); //this.age = age; //this.age.a = age; public이면 가능하지만 private이기 때문에 에러남
	}
	public String getName( ) {
		return name;
	}
	public int getAge() {
		return this.age.getA();
	}
//사용자
	public static void main(String[] args) {
		HasA has = new HasA();
		has.setName("Superman");
		has.setAge(10000);
		
		System.out.println(has.getName());
		System.out.println(has.getAge());
	}
}
