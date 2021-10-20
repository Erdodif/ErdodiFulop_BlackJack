package hu.petrik.blackjack.kartya;

public enum Figura {
    KETTO("2"),
    HAROM("3"),
    NEGY("4"),
    OT("5"),
    HAT("6"),
    HET("7"),
    NYOLC("8"),
    KILENC("9"),
    TIZ("10"),
    JUMBO("J"),
    DAMA("D"),
    KIRALY("K"),
    ASZ("A");

    private String megjelenitendoErtek;

    Figura(String megjelenitendoErtek) {
        this.megjelenitendoErtek = megjelenitendoErtek;
    }

    public String getMegjelenitendoErtek() {
        return this.megjelenitendoErtek;
    }
}
