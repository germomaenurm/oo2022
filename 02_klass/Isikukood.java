public class Isikukood{
	private String kood;
	public Isikukood(String uusKood){
		kood=uusKood;
	}
	
	public String sugu(){
		return(Integer.parseInt(kood.substring(0, 1)) %2 == 0 ? "naine" : "mees");
	}
	public String aastakakstahte(){
		//if(kood.substring(0, 1).equals("1")){return "18";}
		return(String.valueOf(18+(Integer.parseInt(kood.substring(0, 1))-1)/2));
	}
	public String sünniaasta(){
		return aastakakstahte()+kood.substring(1, 3);
	}
	public String päev(){
		return kood.substring(5, 7);
	}
	public String kuu(){
		if(kood.substring(3, 5).equals("01")){return "Jaanuar";}
		if(kood.substring(3, 5).equals("02")){return "Veebruar";}
		if(kood.substring(3, 5).equals("03")){return "Märts";}
		if(kood.substring(3, 5).equals("04")){return "Aprill";}
		if(kood.substring(3, 5).equals("05")){return "Mai";}
		if(kood.substring(3, 5).equals("06")){return "Juuni";}
		if(kood.substring(3, 5).equals("07")){return "Juuli";}
		if(kood.substring(3, 5).equals("08")){return "August";}
		if(kood.substring(3, 5).equals("09")){return "September";}
		if(kood.substring(3, 5).equals("10")){return "Oktoober";}
		if(kood.substring(3, 5).equals("11")){return "November";}
		else{return "Detsember";}
	}
	public String vanus(){
		return(String.valueOf(2022-(Integer.parseInt(sünniaasta()))));
	}
}
