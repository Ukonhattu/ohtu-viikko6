package laskin;

public class Sovelluslogiikka {
 
    private int tulos;
 
    public void setTulos(int uusi) {
        tulos = uusi;
    }
 
    public void nollaa() {
        tulos = 0;
    }
 
    public int tulos() {
        return tulos;
    }
}