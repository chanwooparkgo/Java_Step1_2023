package Chapter03.IF.SWITCH;

public class SwitchCase06 {

	public static void main(String[] args) {
		// 오전 9 ~ 오후 6
		int time= (int)(Math.random()*10)+9;
		System.out.println("[현재시간: "+ time+"시]");
		System.out.println("할 일 : ");
		switch (time) {
		case 9:
			System.out.println("출석체크");
			break;
		case 10:
			System.out.println("수업듣기");
			break;
		case 11:
			System.out.println("수업듣기");
			break;
		case 12:
			System.out.println("수업듣기");
			break;
		case 13:
			System.out.println("점심");
			break;
		case 14:
			System.out.println("중간체크");
			break;
		case 15:
			System.out.println("수업듣기");
			break;
		case 16:
			System.out.println("수업듣기");
			break;
		case 17:
			System.out.println("수업듣기");
			break;
		case 18:
			System.out.println("마지막수업후퇴실");
			break;
		default:
			System.out.println("쉬는시간");
			break;
		}
	}

}
