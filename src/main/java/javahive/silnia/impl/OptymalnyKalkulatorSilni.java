package javahive.silnia.impl;

import javahive.silnia.KalkulatorSilni;




public class OptymalnyKalkulatorSilni implements KalkulatorSilni{
    
    private static final int MAKSYMALNYARGUMENTDLALONG=12;
    
    public String licz(int podstawa){
        KalkulatorSilni i=null;
        if(podstawa > MAKSYMALNYARGUMENTDLALONG){
            i = new KalkulatorSilniBigDecimal();
        }
        else{
            i = new SzybkiKalkulatorSilni();
        }
        return i.licz(podstawa);
        //w zależności od rozmiaru argumentu powinniśmy użyć algorytmu SzybkaSilnia lub BigDecimalSilnia
        //TODO - zaimplementować to tutaj.
    }
}
