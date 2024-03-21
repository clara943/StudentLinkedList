import java.util.Scanner;
//https://cafe.naver.com/kbdigicampus/13

public class StudentFinal {

	private int index;
	private StudentScoreHasA[] stu;

	public StudentFinal() {
		// stu = new StudentScoreHasA[100];
		this(100);
	}

	public StudentFinal(int num) {
		stu = new StudentScoreHasA[num];
	}

	public int getIndex() {
		return index;
	}

	public StudentScoreHasA[] getStu() {
		return stu;
	}

	public static void main(String[] args) {
		/*
		 * 1. 학생정보입력 2. 학생정보수정 3. 학생정보검색 4. 학생전체출력
		 */
		StudentFinal stu = new StudentFinal();
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("1. 학생정보입력");
			System.out.println("2. 학생정보수정");
			System.out.println("3. 학생정보검색");
			System.out.println("4. 학생전체출력");
			System.out.println("5.  종료");

			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				stu.setStudent();
				break;
			case 2:
				stu.setModify();
				break;
			case 3:
				stu.setSearch();
				break;
			case 4:
				stu.setDisp();
				break;
			case 5:
				System.exit(0);
				;
				break;
			}

		} while (true);

	}

	private void setModify() {
		Scanner sc = new Scanner(System.in);
		System.out.println("누구의 점수를 수정할까요? ");
		String name = sc.next();

		int i = 0;
		while (true) {
			if (name.equals(stu[i].getName())) {
				System.out.println("찾았습니다. ");

				while (true) {
					System.out.println("1.국어점수수정");
					System.out.println("2.영어점수수정");
					System.out.println("3.수학점수수정");
					System.out.println("4.수정안함");

					int n = sc.nextInt();
					switch (n) {
					case 1:
						stu[i].setKor(sc.nextInt());
						break;
					case 2:
						stu[i].setEng(sc.nextInt());
						break;
					case 3:
						stu[i].setMat(sc.nextInt());
						break;

					}
					if (n == 4)
						break;
				}
				break;
			}
			i++;
		}

	}

	private void setSearch() {
		Scanner sc = new Scanner(System.in);
		System.out.println("누구 찾나요? ");
		String name = sc.next();

		for (StudentScoreHasA student : stu) {
			if (name.equals(student.getName())) {
				System.out.println("찾았습니다. ");

				System.out.print(student.getName() + "\t");
				System.out.print(student.getKor() + "\t");
				System.out.print(student.getEng() + "\t");
				System.out.print(student.getMat() + "\t");
				System.out.print(student.getTotal() + "\t");
				System.out.println(student.getAvg());

				break;

			}

		}

	}

	private void setDisp() {

		for (StudentScoreHasA student : stu) {
			System.out.print(student.getName() + "\t");
			System.out.print(student.getKor() + "\t");
			System.out.print(student.getEng() + "\t");
			System.out.print(student.getMat() + "\t");
			System.out.print(student.getTotal() + "\t");
			System.out.println(student.getAvg());
		}

	}

	private void setStudent() {

		StudentScoreHasA student = new StudentScoreHasA(); // 학생객체생성
		Scanner sc = new Scanner(System.in);

		student.setName(sc.next());
		student.setKor(sc.nextInt());
		student.setEng(sc.nextInt());
		student.setMat(sc.nextInt());
		student.getTotal();
		student.getAvg();

	}

}
