package Chapter04;

public class BookArray02 {

	public static void main(String[] args) {
		
		Book library[] =new Book[5];
		
		library[0] = new Book("대미안","헤르만헤세");                    
		library[1] = new Book("빨간머리엔","몽고메리");                    
		library[2] = new Book("백설공주","그림형제");                    
		library[3] = new Book("카산드라이","베르나르");                    
		library[4] = new Book("그리스","톨핀");                    
		/*
		library[0].showBookinfo();
		library[1].showBookinfo();
		library[2].showBookinfo();
		library[3].showBookinfo();
		library[4].showBookinfo();
		*/
		for(int i=0; i<library.length; i++)
		{
			library[i].showBookinfo();
			System.out.println();
		}
	}

}
