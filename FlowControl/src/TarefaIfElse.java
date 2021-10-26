
public class TarefaIfElse {
	
	public static void main(String[] args) {
		
		int math= 44;
		int physics= 99;
		int chemistry= 80;

		
		if (math < 35 || physics < 35 || chemistry < 35 ) {
			System.out.println("ERRO");
		}else {
			float resul= (float)((physics+math+chemistry) /3.5);
			System.out.println(resul);
			if (resul > 69) {
				System.out.println("A");
			}else if (resul < 60) {
				System.out.println("C");
			}else {
				System.out.println("B");
			}
		
			
		}
	}
	
}
