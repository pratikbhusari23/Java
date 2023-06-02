class Instrument {

    Instrument() {
        System.out.println("An Instrument");
    }

    void play() {
        System.out.println("Playing the instrument");
    }
}

class Guitar extends Instrument {

    Guitar() {
        System.out.println("Guitar Instrument");
    }
}
class Piano extends Instrument {

    Piano() {
        System.out.println("Piano Instrument");
    }
}

class Violin extends Instrument {

    Violin() {
        System.out.println("Violin Instrument");
    }
}

class Drum extends Instrument {

    Drum() {
        System.out.println("Drum Instrument");
    }
}

class Musician {

    public static void main(String[] args) {

        Instrument instrument1 = new Instrument();
        instrument1.play();

        Guitar instrument2 = new Guitar();
        instrument2.play();

        Instrument instrument3 = new Guitar();
        instrument3.play();

        Piano instrument4 = new Piano();
        instrument4.play();

        Violin instrument5 = new Violin();
        instrument5.play();

        Drum instrument6 = new Drum();
        instrument6.play();
    }
}
/*
An Instrument
Playing the instrument
An Instrument
Guitar Instrument
Playing the instrument
An Instrument
Guitar Instrument
Playing the instrument
An Instrument
Piano Instrument
Playing the instrument
An Instrument
Violin Instrument
Playing the instrument
An Instrument
Drum Instrument
Playing the instrument
 */