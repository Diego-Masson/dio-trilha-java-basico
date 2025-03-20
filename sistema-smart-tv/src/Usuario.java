public class Usuario {
    public static void main(String[] args) throws Exception {

       SmartTv smartTv = new SmartTv();

       SmartTv.diminuirVolume();
       SmartTv.diminuirVolume();
       SmartTv.diminuirVolume();
       SmartTv.aumentarVolume();;
       System.out.println("Volume Atual : " + smartTv.volume);


       System.out.println("Tv Ligada ?" + smartTv.ligada);
       System.out.println("Canal Atual : " + smartTv.canal);
       System.out.println("Volume Atual : " + smartTv.volume);

       public void aumentarVolume(){
        volume++;
       }

       public void diminuirVolume(){
        volume--;
       }
    
    
        smartTv.ligar ();
        System.out.println("Novo Statu -> Tv Ligada?" + smartTv.ligada);

        smartTv.desligar ();
        System.out.println("Novo Statu -> Tv Ligada?" + smartTv.ligada);

    }
}
