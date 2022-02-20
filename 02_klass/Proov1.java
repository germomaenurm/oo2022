public class Proov1{
	public static void main(String[] arg){
		Isikukood germo=new Isikukood("50201154220");
		Isikukood mari=new Isikukood("47108010033");
		System.out.println("______________________________");
		System.out.println("Germo, "+germo.sugu());
		System.out.println("Sündinud: "+germo.päev()+" "+germo.kuu()+" "+germo.sünniaasta());
		System.out.println("Vanus: "+germo.vanus());
		System.out.println("______________________________");
		System.out.println("Mari, "+mari.sugu());
		System.out.println("Sündinud: "+mari.päev()+" "+mari.kuu()+" "+mari.sünniaasta());
		System.out.println("Vanus: "+mari.vanus());
	}
}
