package Main;

import Fruits.*;
import Vegetables.*;
import Flowers.*;

import java.util.ArrayList;

public class Lager {
    ArrayList<Varer> vareLager = new ArrayList<Varer>();

    public void fyldOp() {
        for (int i = 0; i < 10; i++) {
            vareLager.add(new Peas());
        }
        for (int i = 0; i < 5; i++) {
            vareLager.add(new Cucumber());
        }
        for (int i = 0; i < 10; i++) {
            vareLager.add(new Apple());
        }
        for (int i = 0; i < 11; i++) {
            vareLager.add(new Peach());
        }
        for (int i = 0; i < 3; i++) {
            vareLager.add(new Rose());
        }
        for (int i = 0; i < 8; i++) {
            vareLager.add(new Sunflower());
        }

    }

    public int antalVarer() {
        return vareLager.size();
    }

    public void visVarer() {
        for (Varer varer : vareLager){
            System.out.println(varer);
        }
    }

    public int antalAf(String type) {
        return 0;
    }

}
