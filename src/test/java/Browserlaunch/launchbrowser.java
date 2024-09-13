package Browserlaunch;


public  class launchbrowser  extends Baseclass {
 
	public static void main(String[] args)  {
        
		launchbrowser("chrome");
		
		//get
		//launchbrowser("Chrome");
		
		urllaunch("https://www.facebook.com/");
		implicitlyWait(10);
		
		LoginPage l =new LoginPage();
		sendkeys(l.gettxtuser(),"pavithran");
		sendkeys(l.gettxtpass(),"77hdg");
		click(l.getbtn());
		
		
	}
	}