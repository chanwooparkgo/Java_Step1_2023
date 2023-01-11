package chapter06;

public class TakeTrans {

	public static void main(String[] args) {
		//학생 2명생성
		StdInfo studentJames = new StdInfo("James", 12000);
		StdInfo studentTomes = new StdInfo("Tom", 10000);
		
		// 버스 타기
		Bus bus100 = new Bus(100);

		studentJames.takeBus(bus100);
		//정보확인
		studentJames.showInfo();//지출
		bus100.showInfo();//수입증가인원수증가
		System.out.println("==============================");
		
		Bus bus987=new Bus(987);
		studentTomes.takeBus(bus987);
		studentTomes.showInfo();
		bus987.showInfo();
		System.out.println("==============================");
		//지하철타기
		Subway subwayGreen=new Subway("2호선");
		studentJames.takeSubway(subwayGreen);
		studentJames.showInfo();
		
		Subway subwayblue=new Subway("1호선"); 
		studentTomes.takeSubway(subwayblue);
		studentTomes.showInfo();
		subwayblue.showInfo();
	}

}
