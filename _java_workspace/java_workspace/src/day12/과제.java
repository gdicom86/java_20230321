package day12;

public class 과제 {

	public static void main(String[] args) {
		/* TV의 채널은 0~10까지있음. channel은 순환
		 * vol 0~20까지 있음. 0이되면 음소거출력
		 * vol 0이하 20이상으로 조정되지 않음
		 * 
		 * */
		Tv2 t = new Tv2();
		try{
			t.powerOff();
			t.powerOn();
			t.volUp();
			int volume = 20;
			t.volUp();
			t.channelUp();
			t.channelDown();
			t.volDown();
			t.volUp();
			t.volDown();
			t.volDown();
			t.volDown();
			t.volDown();
			t.powerOff();
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
interface remocon { //해야 될 것 
	void powerOn();
	void powerOff();
	void channelUp();
	void channelDown();
	void volUp();
	void volDown();
}

class Tv2 implements remocon{
	protected boolean power;
	protected int channel;
	protected int volume;
	public Tv2() {
		power = false;
		channel = 0;
		volume = 0;
	}
	@Override
	public void powerOn() {
		power = true;
		System.out.println("전원이 켜졌습니다.");
	}
	@Override
	public void powerOff() {
		power = false;
		System.out.println("전원이 꺼졌습니다.");
	}
	@Override
	public void channelUp() {
		if(power) {
			throw new RuntimeException("전원이 꺼져있습니다.");
		} else if(channel >= 20) {
			channel = 0;
		} else {
			channel+=1;
		}
		System.out.println("현재 채널: " + channel);
	}
	@Override
	public void channelDown() {
		if(!power) {
			throw new RuntimeException("전원이 꺼져있습니다.");
		} else if(channel <= 0) {
			channel = 20;
		} else {
			channel-=1;
		}
		System.out.println("현재 채널: " + channel);
	}
	@Override
	public void volUp() {
		if(!power) {
			throw new RuntimeException("전원이 꺼져있습니다.");
		}
		if(volume >= 20) {
			volume = 20;
		} else {
			volume+=1;
		}
		System.out.println("현재 볼륨: " + volume);
	}
	@Override
	public void volDown() {
		if(!power) {
			throw new RuntimeException("전원이 꺼져있습니다.");
		}
		if(volume <= 0) {
			volume = 0;
			throw new RuntimeException("볼륨0 음소거 모드");
		} else {
			volume-=1;
		}
		System.out.println("현재 볼륨: " + volume);
	}
	
}