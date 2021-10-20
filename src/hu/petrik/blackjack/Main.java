package hu.petrik.blackjack;

import hu.petrik.blackjack.kartya.Kartya;
import hu.petrik.blackjack.kartya.Pakli;

import java.util.concurrent.ExecutionException;

public class Main {

    public static void Feladatok(){
        Pakli p = new Pakli();
        for (Kartya kartya: p.getKartyaPakli()) {
            System.out.println(kartya.toString());
        }
    }

    public static void main(String[] args) {
        try {
            System.out.print("\u001B[47m\u001B[30m");
            Feladatok();
        } catch (Error e) {
            System.out.print(e + "\u001B[40m");
        }
        System.out.print("\u001B[40m");
    }
}
