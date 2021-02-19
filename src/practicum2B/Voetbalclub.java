package practicum2B;

public class Voetbalclub {
    public String naam;
    public int aantalGewonnen;
    public int aantalGelijk;
    public int aantalVerloren;

    public Voetbalclub(String naam) {
        this.naam = naam;
    }

    public void verwerkResultaat(char ch) {
        if (ch == 'w')
            aantalGewonnen = aantalGewonnen + 1;
        if (ch == 'g')
            aantalGelijk = aantalGelijk + 1;
        if (ch == 'v')
            aantalVerloren = aantalVerloren + 1;
    }

    public int aantalPunten(){
        int punten = ((aantalGelijk) +(aantalGewonnen *3));
        return punten;
    }

    public int aantalGespeeld(){
        int gespeeld = aantalGelijk + aantalVerloren + aantalGewonnen;
        return gespeeld;
    }

    public String toString(){
        String str = String.format("%s %d %d %d %d %d", naam, aantalGespeeld(), aantalGewonnen, aantalGelijk, aantalVerloren, aantalPunten());
        return str;
    }

    public String getNaam() {
        return naam;
    }
}