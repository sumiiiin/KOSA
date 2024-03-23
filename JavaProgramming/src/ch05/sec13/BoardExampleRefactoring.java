package ch05.sec13;

import java.util.Scanner;

public class BoardExampleRefactoring {

	public static void main(String[] args) {
		String[][] boards = new String[100][4];
		int	index = 0;
		int number = 1;
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			for(String[] arr : boards) {
				for(String ar:arr) {
					System.out.print(ar + " ");
				}
			System.out.println();
			}
			
			System.out.println("------------------------------------");
			System.out.println("번호 제목                  글쓴이  ");
			System.out.println("------------------------------------");
			for (int i = index - 1; i >= 0 ; i--) { 
				if ( boards[i][0] != null) {
					System.out.printf("%3s%-20s%5s\n",boards[i][0],boards[i][1],boards[i][3] );
				}

			}
			System.out.println("------------------------------------------");
			System.out.println("메뉴 : 1.생성 | 2.보기 | 3.수정 | 4.삭제 | 5.종료");
			System.out.println("선택>");
			String choice = scanner.nextLine();
			
			if(choice.equals("1")) {
				System.out.println("[새글쓰기]");
				boards[index][0] = number + "";
				System.out.print("제목: ");
				boards[index][1] = scanner.nextLine(); 
				System.out.print("글쓴이: ");
				boards[index][3] = scanner.nextLine(); 
				System.out.print("내용: ");
				boards[index][2] = scanner.nextLine();
				index++;
				number++;
			}else if(choice.equals("2")) {
				System.out.println("선택>");
				int select = Integer.parseInt(scanner.nextLine());
				
				for(int i=0;i<boards.length;i++) {
					if(Integer.parseInt(boards[i][0]) == select) {
						select = i;
						break;
					}
				}
				
				System.out.println("[글 보기]");
				System.out.println("번호:" + boards[select][0]);
				System.out.println("제목:" + boards[select][1]);
				System.out.println("글쓴이:" + boards[select][3]);
				System.out.println("내용:" + boards[select][2]);
			}else if(choice.equals("3")) {
				System.out.println("선택>");
				int edit = Integer.parseInt(scanner.nextLine());
				
				for(int i=0;i<boards.length;i++) {
					if(Integer.parseInt(boards[i][0]) == edit) {
						edit = i;
						break;
					}
				}
				
				System.out.println("[글 수정]");
				System.out.print("제목: ");
				boards[edit][1] = scanner.nextLine(); 
				System.out.print("내용: ");
				boards[edit][2] = scanner.nextLine(); 
			}else if(choice.equals("4")){
				System.out.println("선택>");
				int delete =  Integer.parseInt(scanner.nextLine());
				
				for(int i=0;i<boards.length;i++) {
					if( Integer.parseInt(boards[i][0]) == delete) {
						boards[i] = new String[4];
						delete = i;
						break;
					}
				}
				
				for(int i=delete; i<boards.length-1;i++) {
					if(boards[i+1][0] == null) {
						index = i;
						break;
					}
					String[] tmp = boards[i];
					boards[i] = boards[i+1];
					boards[i+1] = tmp; 
				}
				
			}else if(choice.equals("5")) {
				break;
			}
		}
		for(String[] arr : boards) {
			for(String ar:arr) {
				System.out.print(ar + " ");
			}
			System.out.println();
		}
		System.out.println("프로그램을 종료합니다");
		scanner.close();
	}

}
