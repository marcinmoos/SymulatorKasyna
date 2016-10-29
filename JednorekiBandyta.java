package kasyno;

import java.util.Random;
import java.util.Scanner;

public class JednorekiBandyta extends Gra {

    public JednorekiBandyta() {
    }

    void GrajWJednorekiegoBandyte(){
        Scanner odczyt = new Scanner(System.in);
        System.out.print("Podaj liczbe gier: "); 
        int liczbaGier = odczyt.nextInt();
        for(;liczbaGier>0;liczbaGier--){
            Random generator = new Random();
            Kasyno bandyta  = Kasyno.inst();
            int symbol1 = generator.nextInt(5);
            int symbol2 = generator.nextInt(5);
            int symbol3 = generator.nextInt(5);
            if((symbol1 == symbol2)&&(symbol1 == symbol3)){
                bandyta.setKasa(bandyta.getKasa()-wartoscGry*5);
            }
            else bandyta.setKasa(bandyta.getKasa()+wartoscGry);
            System.out.println("W kasie kasyna  " + bandyta.getKasa());  
        }
    } 
}
