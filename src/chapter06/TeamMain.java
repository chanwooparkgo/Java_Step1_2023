package chapter06;

public class TeamMain {

	public static void main(String[] args) {
		
		TeamGroup team = new TeamGroup();
		TeamMember tm=new TeamMember();
		//메소드를 통해서 팀명을 초기화
		
		tm.setTeamName("7전8D");
		System.out.println("팀명:" +tm.getTeamName());
		System.out.println("----------[팀원명단]-------------");
		
		team.init();
		team.Disp();
		System.out.println();
		tm.setmName("박창훈");
		System.out.println("팀장:"+ tm.getmName());
		tm.setmPhone("01091860744");
		System.out.println("팀장전화번호: "+tm.getmPhone());
		tm.setsName("이석진");
		System.out.println("부팀장명: "+ tm.getsName());
		
			

	}

}
