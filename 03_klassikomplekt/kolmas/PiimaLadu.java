public class PiimaLadu{
    int laokogus;
    Pood poekogus;
    
        public PiimaLadu(int ukogus, Pood upoekogus){
            laokogus = ukogus;
            poekogus = upoekogus;
        }

        public int kysiLaoKogus(){
            return laokogus;
        }

        public String kasPoodiVaja(){
            if(poekogus.kysiPoeKogus()>0){
                return "ei ole";
            } else {
                return "oleks juurde vaja viia";
            }
        }
    
}