package AbstractEncapsuleGenralise;

public class TestGenralization 

{
  public static void main(String[] args) 
  
  {
	 System.out.println("@@@@@@@@@Specification of JIO@@@@@@@@@");
	        Ambanijio x = new Ambanijio();
	        x.Audiocalling();
	        x.Textmessage();
	        x.Internet();
	        x.Newfeature();
	        System.out.println();

	        
	        System.out.println("@@@@@@@@@Specification of VI@@@@@@@@@");
	        BirlaVI y = new BirlaVI();
	        y.Audiocalling();
	        y.Textmessage();
	        y.Internet();
	        y.Newfeature1();
	        System.out.println();
	        
	        System.out.println("@@@@@@@@@Specification of BSNL@@@@@@@@@");
	        GovtBSNL z = new GovtBSNL();
	        z.Audiocalling();
	        z.Textmessage();
	        z.Internet();
	        z.Newfeature2();
	 		

  }
  
  
}
