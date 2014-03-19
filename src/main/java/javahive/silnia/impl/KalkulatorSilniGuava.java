package javahive.silnia.impl;

import java.math.BigInteger;

import com.google.common.math.BigIntegerMath;

import javahive.silnia.KalkulatorSilni;

/**
 *
 * @author mgr
 */
public class KalkulatorSilniGuava implements KalkulatorSilni{

    public String licz(int arg) {
        
        /*
         * 
         * żeby użyć biblioteki Guava do liczenia silni wystarczy dodać
         *     <dependency>
         *       <groupId>com.google.guava</groupId>
         *       <artifactId>guava</artifactId>
         *       <version>14.0.1</version>
         *       <type>jar</type>
         *     </dependency>
         * do pliku pom.xml
         * 
         */
    	return BigIntegerMath.factorial(arg).toString();
        //throw new NotImplementedException();
    }
}
