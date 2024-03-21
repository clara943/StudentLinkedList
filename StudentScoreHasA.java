//성적처리클래스

import java.util.ArrayList;

public class StudentScoreHasA {
	Name name;
	Subject kor;
	Subject eng;
	Subject mat;

	int total;
	float avg;

	public StudentScoreHasA() {
		name = new Name();
		kor = new Subject();
		eng = new Subject();
		mat = new Subject();
	}

	public StudentScoreHasA(Name name, Subject kor, Subject eng, Subject mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;

	}

	public void setName(String name) {
		this.name.setName(name);
	}

	public void setKor(int kor) {
		this.kor.setSubject(kor);
	}

	public void setEng(int eng) {
		this.eng.setSubject(eng);
	}

	public void setMat(int mat) {
		this.mat.setSubject(mat);
	}

	public String getName() {
		return name.getName();
	}

	public int getKor() {
		return kor.getSubject();
	}

	public int getEng() {
		return eng.getSubject();
	}

	public int getMat() {
		return mat.getSubject();
	}

	public int getTotal() {
		return total = getKor() + getEng() + getMat();
	}

	public float getAvg() {
		return (getTotal()) / 3.f;
	}

}
