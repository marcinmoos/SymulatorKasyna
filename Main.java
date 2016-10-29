package kasyno;

import java.util.Scanner;

public class Main {
    
        public static void main(String[] args){
        Scanner odczyt = new Scanner(System.in);
        Kasyno kasyno  = Kasyno.inst();
        kasyno.setKasa(10000);//poczatkowa pula 10000
        JednorekiBandyta graczBandyta = new JednorekiBandyta();
        BlackJack graczJack = new BlackJack();
        System.out.println("W kasie kasyna  " + kasyno.getKasa());
        
        int decyzja;
        do{      
        System.out.print("Wybierz grę: 1 - Jednoręki bandyta, 2 - Black Jack: ");
        int gra = odczyt.nextInt();
        System.out.print("Podaj Kwote zakladu: "); 
        int kwota = odczyt.nextInt();
        
        
        if(gra == 1){
            graczBandyta.setWartoscGry(kwota);
            graczBandyta.GrajWJednorekiegoBandyte(); 
            }
        
        else if(gra == 2){
            graczJack.setWartoscGry(kwota);
            graczJack.GrajWBlackJack();            
            }
        System.out.println("Kontynuowac (1/0)"); 
        decyzja = odczyt.nextInt();
        }while(decyzja == 1);
        System.out.println("W kasie kasyna  " + kasyno.getKasa());
    }
        
}
