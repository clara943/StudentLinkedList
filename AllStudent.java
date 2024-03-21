import java.util.Scanner;

public class AllStudent {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		StudentManagement stManagement = new StudentManagement();
		int num;
		
		while(true) {
			System.out.println("기능 입력 하세요(1.입력, 2.수정, 3.검색, 4.출력, 5.종료)");
			num = sc.nextInt();
			
			if(num == 1) {
				stManagement.input();
			}
			else if(num ==2) {
				stManagement.modify();
			}
			else if(num == 3) {
				stManagement.search();
			}
			else if(num == 4) {
				stManagement.printAll();
			}
			else if(num == 5) {
				break;
			}
			else {
				System.out.println("잘못된 번호를 입력했습니다");
			}
		}
	}

}
