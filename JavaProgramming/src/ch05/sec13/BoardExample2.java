package ch05.sec13;

import java.util.Scanner;

public class BoardExample2 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); // 스캐너 import
		
		// 변수 선언
		String[][] boards = new String[100][4]; // 게시판 데이터가 들어갈 배열, null로 초기화 되어 있다.
		int num = 0; // 게시글이 추가 될 때 마다 1씩 증가할 변수 
		
		
		// while문 선언
		while(true) {
			
			System.out.println("-----------------------------------------");

			System.out.println(" 번호        제목                   글쓴이    ");

			System.out.println("-----------------------------------------");
			
			for (int i = num-1; i >= 0; i--) { // 게시글 목록을 출력 하는 for문
				// 게시글이 없으면 i는 -1이 되어 false가 되고 for문을 벗어난다 그러니까 처음엔 조건식에 false가 나오는게 맞다 
				// 글이 5개 생성되면 num에 5이 들어가고 i는 4으로 초기화 된다. 그럼 반복문이 실행 될 수록 i는 1씩 줄어들고 역순으로 출력하게 된다.
				if(boards[i][0] != null) {
					System.out.printf("%3s      %-20s %5s\n",boards[i][0],boards[i][1],boards[i][3]);
					// 번호 - boards[i][0]은 최소너비 3자, 제목 - boards[i][1]은 최소너비 20자에 왼쪽정렬, 글쓴이 - boards[i][3]은 최소 너비 5자
				}
			}
			System.out.println("-----------------------------------------");

			System.out.println("메뉴 : 1.생성 | 2.보기 | 3.수정 | 4.삭제 | 5.종료");			
			
			System.out.print("선택:"); // 작성값이 콘솔에 나란히 보이기 위해 print로 출력
			String menu = scanner.nextLine(); // 메뉴 선택 값 입력
			System.out.println();
			
			
			if(menu.equals("1")) { // 생성 기능
				System.out.println("[새글쓰기]");// 출력
				
				boards[num][0] = num+1+""; // num을 String으로 변환 후 배열 대입
				
				System.out.print("제목 : ");
				boards[num][1] = scanner.nextLine(); // num이 0이면 첫번째 글 작성하는거
				
				System.out.print("내용 : ");
				boards[num][2] = scanner.nextLine(); // num이 0이면 첫번째 글 작성하는거
				
				System.out.print("글쓴이 : ");
				boards[num][3] = scanner.nextLine(); // num이 0이면 첫번째 글 작성하는거
				// 알맞은 자리에 값 대입
				
				num++; // 글 작성하면 다음 글 작성을 위해 num 1씩 증가
				
			} else if (menu.equals("2")) { // 보기 기능
				System.out.print("볼 게시글 번호 : ");
				int watch = (Integer.parseInt(scanner.nextLine()))-1; // 게시물 번호를 입력받는 스캐너, 인덱스용 변수라서 -1한다.
				System.out.println();
				
				if (boards[watch][1] == null) { //[1]이 아니고 0~3까지 아무 인덱스로 해도 상관 없음
					System.out.println("삭제된 게시물 입니다.");
				} else {
					System.out.println("번호 : " + boards[watch][0]);
					System.out.println("제목 : " + boards[watch][1]);
					System.out.println("글쓴이 : " + boards[watch][3]);
					System.out.println("내용 : " + boards[watch][2]);
				}
				
				
			} else if(menu.equals("3")) { // 수정 기능
				System.out.print("수정할 게시글 번호 : ");
				int rewrite = (Integer.parseInt(scanner.nextLine()))-1; // 게시물 번호를 입력받는 스캐너
				System.out.println();
				System.out.println("[글 수정]");
				
				System.out.print("제목 : ");
				boards[rewrite][1] = scanner.nextLine(); // 수정할 제목 스캐너로 입력 받고 저장
				
				System.out.print("내용 : ");
				boards[rewrite][2] = scanner.nextLine(); // 수정할 내용 스캐너로 입력 받고 저장
				
				// 수정 다 하면 수정한 게시물 다시 보여주는 기능 추가
				System.out.println("수정한 글 보기");
				System.out.println("번호 : " + boards[rewrite][0]);
				System.out.println("제목 : " + boards[rewrite][1]);
				System.out.println("글쓴이 : " + boards[rewrite][3]);
				System.out.println("내용 : " + boards[rewrite][2]);
				
			} else if(menu.equals("4")) { // 삭제 기능
				System.out.print("삭제할 게시글 번호 : ");
				int delete = (Integer.parseInt(scanner.nextLine()))-1; // 게시물 번호 입력 받는 스캐너
				System.out.println();
				
				System.out.println("정말로 삭제하시겠습니까? 한번 삭제한 데이터는 되돌릴 수 없습니다.");
				System.out.print("삭제를 원하시면 Y, 처음으로 돌아가시려면 N을 입력해주세요 > ");
				
				while(true) {
					String yesOrNo = scanner.nextLine(); // 삭제 여부를 입력받을 변수

					System.out.println();
					
					if(yesOrNo.equals("Y") || yesOrNo.equals("y")) {
						
						boards[delete][0] = null;
						boards[delete][1] = null;
						boards[delete][2] = null;
						boards[delete][3] = null;
						
						
						System.out.println("삭제가 완료되었습니다.");
						break; //if문에 break해도 while문을 빠져나감
						
					} else if (yesOrNo.equals("N") || yesOrNo.equals("n")) {
						System.out.println("처음으로 돌아갑니다.");	
						break;
					
					} else {
						System.out.println("잘못 된 입력입니다. 다시 선택하세요");
						System.out.println();
						System.out.println();
						System.out.println("정말로 삭제하시겠습니까? 한번 삭제한 데이터는 되돌릴 수 없습니다.");
						System.out.print("삭제를 원하시면 Y, 처음으로 돌아가시려면 N을 입력해주세요 > ");
					}
				}
				
			} else if(menu.equals("5")) { // 종료 기능
				System.out.println("프로그램을 종료합니다.");
				break;
			} else { // 메뉴 선택 번호가 아닌 이외의 값 처리
				System.out.println("올바른 메뉴 번호를 입력하세요");
			}
			
		}
		
		//
		// 삭제한 게시글 보기하면 널이 뜨는데 어떻게 하지? 삭제된 게시물이라고 뜨는 문구 추가 하고 싶음
		// 삭제할 때 진짜 할거냐고 묻기
		
		
		
		
		
		
		
		
		
		
		
	}
}
