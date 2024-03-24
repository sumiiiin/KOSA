package test.pb04;

import java.util.Scanner;

public class mh {
	public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);


        System.out.print("비밀번호를 입력하세요: ");
        String password = scanner.nextLine();

        for(int i = 0;i<password.length(); i++) {
            char ch = password.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                char convertCh = (char) (ch + 4);
                if (convertCh > 'z') {
                    convertCh -= 26;
                }
                System.out.print(convertCh); 
            }

            else if (ch >= 'A' && ch <= 'Z') {
                // 네 번째 뒤의 알파벳으로 변환
                char convertCh = (char) (ch + 4);
                // 만약 네 번째 뒤의 알파벳이 'Z'를 넘어가면 알파벳 순환 처리
                if (convertCh > 'Z') {
                    convertCh -= 26;
                }
                System.out.print(convertCh); 
            }

        }

    }

}
