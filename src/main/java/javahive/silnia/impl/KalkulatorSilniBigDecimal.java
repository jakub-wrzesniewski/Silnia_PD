package javahive.silnia.impl;


import javahive.silnia.KalkulatorSilni;
//import sun.reflect.generics.reflectiveObjects.NotImplementedException;
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
        //throw new NotImplementedException();
    	//String stringArg = ""+arg;
    	BigDecimal BDWynik = BigDecimal.ONE;
    	for(int i=1; i<=arg; i++){
    		BDWynik = BDWynik.multiply(new BigDecimal(i));
    	}
    	return BDWynik.toString();
    }
}
