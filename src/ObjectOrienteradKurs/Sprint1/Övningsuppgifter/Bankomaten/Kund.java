package ObjectOrienteradKurs.Sprint1.Övningsuppgifter.Bankomaten;

import java.util.ArrayList;
import java.util.List;

public class Kund extends Person {

    public Kund(String namn, String adress, int ålder, String kön) {
        super(namn, adress, ålder, kön);

    }

    public void printKunduppgifter(ArrayList<Lån> arrayListFörKundensLån, ArrayList<Konto> arrayListFörKundensKonton) {
        System.out.println("Namn: " + getNamn() + ".\nAdress: " + getAdress() + ".\nÅlder: " +
                getÅlder() + ".\nKön: " + getKön() + ".\nLån: ");
        for (Lån element : arrayListFörKundensLån){
            System.out.println(element.toString());
        }
        System.out.println("Konton: ");
        for (Konto element : arrayListFörKundensKonton){
            System.out.println(element.toString());
        }
    }
}
