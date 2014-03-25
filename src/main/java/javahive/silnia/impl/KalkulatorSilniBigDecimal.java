package javahive.silnia.impl;


import javahive.silnia.KalkulatorSilni;
import java.math.BigDecimal;

/**
 *
 * @author Marcin Grabowiecki
 * 
 * proszę zaimplementować algorytm analogiczny jak dla SzybkaSilnia
 * jednak należy się oprzeć na na typie BigDecimal
 * 
 */

public class KalkulatorSilniBigDecimal implements KalkulatorSilni{
    public String licz(int arg) {
        BigDecimal bDWynik = BigDecimal.ONE;
        for(int i=1; i<=arg; i++){
            bDWynik = bDWynik.multiply(new BigDecimal(i));
        }
        return bDWynik.toString();
    }
}
