public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    // Turn the TV on
    public void ligar() {
        ligada = true;
        System.out.println("A TV foi ligada.");
    }

    // Turn the TV off
    public void desligar() {
        ligada = false;
        System.out.println("A TV foi desligada.");
    }

    // Increase the volume with a limit
    public void aumentarVolume() {
        if (volume < 100) {
            volume++;
            System.out.println("Aumentando o volume para: " + volume);
        } else {
            System.out.println("O volume já está no máximo.");
        }
    }

    // Decrease the volume with a limit
    public void diminuirVolume() {
        if (volume > 0) {
            volume--;
            System.out.println("Diminuindo o volume para: " + volume);
        } else {
            System.out.println("O volume já está no mínimo.");
        }
    }

    // Increase the channel number
    public void aumentarCanal() {
        if (canal < 100) { // Assuming there are 100 channels
            canal++;
            System.out.println("Mudando para o canal: " + canal);
        } else {
            System.out.println("Você já está no canal máximo.");
        }
    }

    // Decrease the channel number
    public void diminuirCanal() {
        if (canal > 1) {
            canal--;
            System.out.println("Mudando para o canal: " + canal);
        } else {
            System.out.println("Você já está no canal mínimo.");
        }
    }

    // Print the current TV state
    public void status() {
        if (ligada) {
            System.out.println("A TV está ligada.");
        } else {
            System.out.println("A TV está desligada.");
        }
        System.out.println("Canal: " + canal + " | Volume: " + volume);
    }
}
