package hu.petrik.blackjack.kartya;

public enum Szin {
    PIKK('♠'),
    KOR('♥'),
    TREFF('♣'),
    KARO('♦');
    private Character megjelenitendoKarakter;

    Szin(Character megjelenitendoKarakter){
        this.megjelenitendoKarakter = megjelenitendoKarakter;
    }

    public String getkiirasSzine(){
        String ki = "\u001B[30m";
        if(this == KOR || this == KARO){
            ki = "\u001B[31m";
        }
        ki += megjelenitendoKarakter+"\u001B[0m";
        return ki;
    }
    public String getkiirasSzine(String szoveg){
        String ki = "\u001B[30m";
        if(this == KOR || this == KARO){
            ki = "\u001B[31m";
        }
        ki += szoveg+"\u001B[0m";
        return ki;
    }
}
