package ch12.check.no08;

public class nanotime {

	public static void main(String[] args) {
		
		long time1= System.nanoTime();
		int[] scores = new int[1000];
		
		for (int i =0; i<scores.length; i++) {
			scores[i] = i;
		}
		
		int sum = 0;
		for (int score : scores) {
			sum +=score;
		}
		
		double avg = sum / scores.length;
		System.out.println(avg);
		
		long time2= System.nanoTime();
		System.out.println("전체 코드 실행하는데 걸린 나노초: " + (time2 - time1));

	}

}
