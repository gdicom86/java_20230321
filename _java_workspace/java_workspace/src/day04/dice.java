package day04;

public class dice {

	public static void main(String[] args) {
		/* 주사위를 던져서 총 30칸을 이동하면 완주
		 * 주사위 1~6까지의 랜덤수
		 * 주사위: 3
		 * 3칸 전진 => 27칸 남았습니다.
		 * 
		 * 도착  총 이동횟수: ??번
		 * */
		int num = 0;
		int count = 30; 
		while(count > 0) {
			int random = (int)((Math.random()*6)+1);
			System.out.println(random + "이(가) 나왔습니다." + random + "전진!");
			count = count - random;
			System.out.println(count + "칸 남았습니다.");
			num++;
			
		}
		System.out.println("도착! " + num + "만큼 이동했습니다.");
	}

}
