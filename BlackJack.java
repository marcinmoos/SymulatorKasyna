package kasyno;
import java.util.Random;
import java.util.Scanner;

public class BlackJack extends Gra{

    public BlackJack() {
    }
    
    void GrajWBlackJack(){
        Random generator = new Random();
        Scanner odczyt = new Scanner(System.in);
        Kasyno jack  = Kasyno.inst();
        int kartaKrupiera1 = generator.nextInt(10) + 1;
        int kartaKrupiera2 = generator.nextInt(10) + 1;
        int karta1 = generator.nextInt(10) + 1;
        int karta2 = generator.nextInt(10) + 1;
        int kartaDobrana = generator.nextInt(10) + 1;
        int suma = karta1 + karta2;
        int sumaKrupier = kartaKrupiera1 + kartaKrupiera2;

        System.out.println("karty: " + karta1 + ", " + karta2);
        System.out.println("suma: " + suma);
        System.out.println("Karta krupiera: " + kartaKrupiera1);
        System.out.print("Dobrac kolejne karty (1/0): ");
        int decyzja = odczyt.nextInt();
        if (decyzja == 1) {
        System.out.println("Dobrana karta: " + kartaDobrana);
        suma += kartaDobrana;
        System.out.println("suma:"+ suma);
        }
        System.out.print("Podwoic stawke (1/0): ");
        int decyzja2 = odczyt.nextInt();
        if (decyzja2 == 1) wartoscGry *= 2;
        
        
        if((suma == 21) && (sumaKrupier == 21)); //remis
        else if(((suma<=21) && (suma > sumaKrupier)) || sumaKrupier > 21){//wygrana
            if(suma == 21)wartoscGry = (int) (wartoscGry * 1.5);//wygrana blackjack
            jack.setKasa(jack.getKasa()-wartoscGry);
        }
        else if(suma < sumaKrupier || suma > 21){ //przegrana
            jack.setKasa(jack.getKasa()+wartoscGry);
        }
        System.out.println("W kasie kasyna  " + jack.getKasa());
    }
    
}
