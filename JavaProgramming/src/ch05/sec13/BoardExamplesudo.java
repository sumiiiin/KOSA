//package ch05.sec13;
//
//public class BoardExample {
//
//
//
//	public static void main(String[] args) {
//
//		
//
//		while문 시작 전에 String[][] boards 배열 생성; ([100][4])
//
//		스캐너 임포트하고 선언하기
//
//		int num = 0; // String 배열 안에 자동 증가되는 번호(순서)를 위한 변수
//
//		// scanner를 사용해 입력받는 값의 타입은 모두 String으로 받기
//
//		
//
//		while ( true ) {
//
//			
//
//			System.out.println("-----------------------------------------");
//
//			System.out.println(" 번호        제목                   글쓴이    ");
//
//			System.out.println("-----------------------------------------");
//
//			for (int i = num - 1; i >= 0 ; i--) { // 
//
//				if ( boards[i][0] != 널) {
//
//					// 배열 게시글 보여지게하는 용도의 for문
//
//				}
//
//			}
//
//				
//
//			System.out.println("-----------------------------------------");
//
//			System.out.println("메뉴 : 1.생성 | 2.보기 | 3.수정 | 4.삭제 | 5.종료");
//
//			
//
//			
//
//			사용자 선택을 입력받는 스캐너 변수 1개 값 입력받기
//
//			
//
//			if ( 선택 == 1 ) {
//
//				// 출력 [새글쓰기]
//
//				배열의 [num][0] = num+1;
//
//				// 출력 제목 :
//
//				스캐너로 제목 입력받아서 배열의 [num][1] = scanner.nextLine()
//
//				// 출력 글쓴이 :
//
//				스캐너로 글쓴이 입력받아서 배열의 [num][2] = scanner.nextLine()
//
//				// 출력 내용 :
//
//				스캐너로 내용 입력받아서 배열의 [num][3] = scanner.nextLine()
//
//				num++;
//
//			} else if ( 선택 == 2 ) {
//
//				int watch = 게시물 번호를 입력받는 스캐너 변수 1개 (보기 시) 사용해서 값 입력받기 - 1
//
//				syso(번호 : + boards[watch][0])
//
//				syso( 제목 : + boards[watch][1]);
//
//				syso( 글쓴이 : + boards[watch][2]);
//
//				syso( 내용 : +boards[watch][3]);
//
//			} else if ( 선택 == 3 ) {
//
//				int rewrite = 게시물 번호를 입력받는 스캐너 변수 1개 (수정 시) - 1
//
//				System.out.println("[글 수정]");
//
//				System.out.println("제목 : ");
//
//				boards[delete][1] = 수정할 제목 내용 스캐너로 입력받고 저장
//
//				System.out.println("내용 : ");
//
//				boards[delete][2] = 수정할 내용 내용 스캐너로 입력받고 저장
//
//
//
//				// 수정이 다 끝나고 나면 수정한 게시글 다시 보여주기 (리팩토링)
//
//				syso("[수정한 글 보기]")
//
//				syso(번호 : + boards[rewrite][0])
//
//				syso(제목 : + boards[rewrite][1]);
//
//				syso(글쓴이 : + boards[rewrite][2]);
//
//				syso(내용 : +boards[rewrite][3]);
//
//						
//
//			} else if ( 선택 == 4) {
//
//				int delete = 게시물 번호를 입력받는 스캐너 변수 1개 (삭제 시) - 1
//
//				
//
//				boards[delete][0] = null;
//
//				boards[delete][1] = null;
//
//				boards[delete][2] = null;
//
//				boards[delete][3] = null;
//
//				
//
//				syso("삭제가 완료되었습니다.");
//
//			} else if ( 선택 == 5 ) {
//
//				syso("프로그램을 종료합니다.");
//
//				break;
//
//			} else {
//
//				syso("올바른 번호를 입력하세요.");
//
//			}
//
//			
//
//		}
//
//	}
//
//
//
//}
