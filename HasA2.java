class AA {
	int aa;

	public int getAa() {
		return aa;
	}

	public void setAa(int aa) {
		this.aa = aa;
	}

}

class BB {
	int aa;

	public int getAa() {
		return aa;
	}

	public void setAa(int aa) {
		this.aa = aa;
	}

}

class CC {
	int aa;

	public int getAa() {
		return aa;
	}

	public void setAa(int aa) {
		this.aa = aa;
	}

}

public class HasA2 {
	
	private AA aa;
	private BB bb;
	private CC cc;

	void setAA(AA aa) {
		this.aa = aa;//외부에서 객체를 가져다가 쓰는거, 객체주입
		bb = new BB();//내가 직접 만든거
		cc = new CC();
	}
	public static void main(String[] args) {

		HasA2 hasa2 = new HasA2();
		AA a = new AA();
		
		hasa2.setAA(a);//hasa2.aa = a;
	}

}
