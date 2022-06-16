public class Proov{
    public static void main(String[] arg){
        Pood piimapood = new Pood(20);
        PiimaLadu piimaladu = new PiimaLadu(50, piimapood);
        

        System.out.println("Piimalaos on " + piimaladu.kysiLaoKogus() + " pakki piima ja piimapoes on " + piimapood.kysiPoeKogus() + " pakki.");
        System.out.println("Osteti ära 5 pakki piima, poodi jäi alles " + piimapood.lahuta(5) + " piima.");
        System.out.println("Kas poodi oleks piima juurde vaja?: " + piimaladu.kasPoodiVaja());
    }

}

/*
Piimalaos on 50 pakki piima ja piimapoes on 20 pakki.
Osteti ära 5 pakki piima, poodi jäi alles 15 piima.
Kas poodi oleks piima juurde vaja?: ei ole
*/