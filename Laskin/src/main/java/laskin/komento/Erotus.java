package laskin.komento;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import laskin.Sovelluslogiikka;
import laskin.komento.Komento;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author daniel
 */
public class Erotus implements Komento {

    TextField tuloskentta;
    TextField syotekentta;
    Button nollaa;
    Button undo;
    Sovelluslogiikka sovellus;
    int viimeisin;

    public Erotus(TextField tuloskentta, TextField syotekentta, Button nollaa, Button undo, Sovelluslogiikka sovellus) {
        this.tuloskentta = tuloskentta;
        this.syotekentta = syotekentta;
        this.nollaa = nollaa;
        this.undo = undo;
        this.sovellus = sovellus;
        this.viimeisin = 0;
    }

    @Override
    public void suorita() {
        int luku1 = sovellus.tulos();
        int luku2 = Integer.parseInt(syotekentta.getText());
        int tulos = luku1 - luku2;
        sovellus.setTulos(tulos);
        viimeisin = luku2;
        tuloskentta.setText("" + tulos);
    }

    @Override
    public void peru() {
        sovellus.setTulos(sovellus.tulos()+viimeisin);
        viimeisin = 0;
        tuloskentta.setText(sovellus.tulos()+"");
    }

}
