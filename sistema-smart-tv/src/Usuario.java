public class Usuario {
    public static void main(String[] args) throws Exception {
        // Criação de um objeto SmartTv
        SmartTv smartTv = new SmartTv();

        // Chamando os métodos de instância corretamente
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        
        // Imprimindo o volume atual
        System.out.println("Volume Atual : " + smartTv.volume);

        // Imprimindo o estado da TV
        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal Atual : " + smartTv.canal);
        System.out.println("Volume Atual : " + smartTv.volume);

        // Ligando a TV e exibindo o novo status
        smartTv.ligar();
        System.out.println("Novo Status -> TV Ligada? " + smartTv.ligada);

        // Desligando a TV e exibindo o novo status
        smartTv.desligar();
        System.out.println("Novo Status -> TV Ligada? " + smartTv.ligada);

        // Exibindo o estado completo da TV usando o método exibirStatus
      
    }
}