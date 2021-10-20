package hu.petrik.blackjack.kartya;

import java.util.ArrayList;
import java.util.List;

public class Kartya {
    private Szin szin;
    private Figura figura;

    public Kartya(Szin szin, Figura figura) {
        this.szin = szin;
        this.figura = figura;
    }

    public Szin getSzin() {
        return szin;
    }

    public Figura getFigura() {
        return figura;
    }

    public List<String> getKartya() {
        Character kar = this.getSzin().getMegjelenitendoKarakter();
        String Szam = this.getFigura().getMegjelenitendoErtek();
        if (Szam.length() < 2) {
            Szam += " ";
        }
        List<String> sorok = new ArrayList<String>();
        sorok.add(this.getSzin().getkiirasSzine("█████████████"));
        sorok.add(this.getSzin().getkiirasSzine("█ " + kar + "       " + kar + " █"));
        sorok.add(this.getSzin().getkiirasSzine("█           █"));
        sorok.add(this.getSzin().getkiirasSzine("█     " + Szam + "    █"));
        sorok.add(this.getSzin().getkiirasSzine("█           █"));
        sorok.add(this.getSzin().getkiirasSzine("█ " + kar + "       " + kar + " █"));
        sorok.add(this.getSzin().getkiirasSzine("█████████████"));
        return sorok;
    }

    @Override
    public String toString() {
        StringBuilder ki = new StringBuilder();
        for (String sor : this.getKartya()) {
            ki.append(this.getSzin().getkiirasSzine(sor) + '\n');
        }
        return ki.toString();
    }
}
