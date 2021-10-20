package hu.petrik.blackjack.kartya;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pakli {
    private List<Kartya> kartyaPakli;

    public Pakli(){
        letrehoz();
        kever();
    }

    public List<Kartya> getKartyaPakli() {
        return kartyaPakli;
    }

    public void letrehoz(){
        kartyaPakli = new ArrayList<>();
        for (Szin szin : Szin.values()){
            for (Figura figura : Figura.values()){
                kartyaPakli.add(new Kartya(szin,figura));
            }
        }
    }

    public void kever(){
        Collections.shuffle(kartyaPakli);
    }
}
