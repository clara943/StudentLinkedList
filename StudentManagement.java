import java.util.Scanner;

public class StudentManagement {
	static StudentScoreHasA StudentList[];
	static int numOfStudent;
	Scanner sc = new Scanner(System.in);
	
	public StudentManagement() {
		this(0);
	}
	
	public StudentManagement(int numOfStudent) {
		StudentList = new StudentScoreHasA[numOfStudent];
	}
	
	public void input() {
		System.out.print("학생 수 입력 : ");
		numOfStudent = sc.nextInt();
		
		if(numOfStudent > 100)
		{
			System.out.println("100명 이하로 입력해주세요");
			return;
		}
	
		StudentList = new StudentScoreHasA[numOfStudent];
		
		for (int i = 0; i < numOfStudent; i++) {
			StudentList[i] = new StudentScoreHasA();
			
			StudentList[i].setName(sc.next());
			StudentList[i].setKor(sc.nextInt());
			StudentList[i].setEng(sc.nextInt());
			StudentList[i].setMat(sc.nextInt());
		}
		
		printAll();
	}
		
	public void modify() {
		String name;
		Boolean ret = false;
		int i;
		System.out.println("변경할 학생 이름 입력 : ");
		name = sc.next();
		
		for(i = 0; i < numOfStudent; i++) {
			if(name.equals(StudentList[i].getName()))
			{
				ret = true;
				break;
			}
		}
		if(ret == true) {
			System.out.println("점수를 입력해주세요");
			StudentList[i].setKor(sc.nextInt());
			StudentList[i].setEng(sc.nextInt());
			StudentList[i].setMat(sc.nextInt());
			
			print(i);
		}
		else {
			System.out.print("해당 학생이 없습니다");
		}
		
	}
	
	public void search() {
		int menu;
		String name;
		int score;
		
		System.out.println("1. 이름 검색, 2: 점수 검색");
		menu = sc.nextInt();
		
		if(menu == 1) {
			System.out.println("이름을 입력하세요");
			name = sc.next();
			
			for ( int i=0; i<numOfStudent; i++) {
				if(name.equals(StudentList[i].getName())) {
					print(i);
					return;
				}
			}
			
			System.out.println("해당 학생이 없습니다");
		}
		else if (menu == 2) {
			
			System.out.println("평균 점수를 입력하세요");
			score = sc.nextInt();
			
			for ( int i=0; i<numOfStudent; i++) {
				if(StudentList[i].getAvg() >= score) {
					print(i);
				}
			}	
		}
		else {
			System.out.println("잘못된 검색 방법 입니다");
		}
	}
	
	public void printAll() {
		for (int i = 0; i < numOfStudent; i++) {
			print(i);
		}
	}
	
	public void print(int num) {
		System.out.println(StudentList[num].getName());
		System.out.println(StudentList[num].getKor());
		System.out.println(StudentList[num].getEng());
		System.out.println(StudentList[num].getMat());
		System.out.println(StudentList[num].getTotal());
		System.out.println(StudentList[num].getAvg());
	}
}
