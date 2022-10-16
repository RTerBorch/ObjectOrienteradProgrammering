package ObjectOrienteradKurs.Sprint2.Övningsuppgifter.Övningsuppgift6;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class VäxlaPengar {
    private boolean jämnVäxel;
    private double pris;
    private double växel;

    public double getVäxel() {
        return växel;
    }

    public void setVäxel(double växel) {
        this.växel = växel;
    }

    public double getPris() {
        return pris;
    }

    public void setPris(double pris) {
        this.pris = pris;
    }

    public double getMottagenVäxel() {
        return mottagenVäxel;
    }

    public void setMottagenVäxel(double mottagenVäxel) {
        this.mottagenVäxel = mottagenVäxel;
    }

    private double mottagenVäxel;

    Scanner input = new Scanner(System.in);


    public boolean isJämnVäxel() {
        return jämnVäxel;
    }

    public double växelTillbaka() {
        setVäxel(mottagenVäxel - pris);
        if (mottagenVäxel - pris == 0) {
            jämnVäxel = true;
        }
        return växel;
    }

    public List<Valuta> ValutaArray() {
        Valuta enKrona = new Valuta(1, 0, false);
        Valuta femKrona = new Valuta(5, 0, false);
        Valuta tioKrona = new Valuta(10, 0, false);
        Valuta tjugoLapp = new Valuta(20, 0, true);
        Valuta femtioLapp = new Valuta(50, 0, true);
        Valuta hundraLapp = new Valuta(100, 0, true);
        Valuta femHundralapp = new Valuta(500, 0, true);
        Valuta tusenlapp = new Valuta(1000, 0, true);
        List<Valuta> moneyList = Arrays.asList(enKrona, femKrona, tioKrona, tjugoLapp, femtioLapp, hundraLapp, femHundralapp, tusenlapp);

        return moneyList;
    }


    public void ValörAntalTillbaka(List<Valuta> inLista) {

        List<Valuta> list = inLista;
        String mynt = "-Kronor";
        String sedel = "-Lapp";

        for (int i = 7; växel > 0; i--) {
            int antal = 1;
            while (växel >= list.get(i).Valör) {
                setVäxel(växel - list.get(i).Valör);
                list.get(i).setAntal(antal);
                antal++;
            }
        }

        if (isJämnVäxel()) {
            System.out.println("Det blev ingen växel");
        }else if (mottagenVäxel < pris){
            System.out.println("För lite har betalats");  //////////7 Dubbelkolla

        } else {

            for (int i = list.size() - 1; i >= 0; i--) {
                if (list.get(i).getAntal() > 0) {
                    if (list.get(i).Valör < 20) {
                        System.out.println(list.get(i).Valör +mynt + " \t= " + list.get(i).getAntal() + " st");
                    } else System.out.println(list.get(i).Valör + sedel + " \t= " + list.get(i).getAntal() + " st");

                }


            }
        }
    }
}




