package Chapter04;

public class EnhancedForLoop01 {

	public static void main(String[] args) {
		
		String strArray[]= { "java", "oracle", "html5","css","js","JQ","JSP","spring","pythanCamp" };
		for(int i=0; i<strArray.length; i++) {
			System.out.print(strArray[i]);
		}
		
		System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
		//확장 for
		for(String lang: strArray) {//String lang=strArray
			System.out.println(lang);
		}//for
	}

}
