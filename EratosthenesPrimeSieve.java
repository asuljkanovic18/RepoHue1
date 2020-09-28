/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primegit.RepoHue1;

/**
 *
 * @author anel
 */
public class EratosthenesPrimeSieve implements PrimeSieve{
  
    int ober;
    
    public EratosthenesPrimeSieve(int N){
        this.ober = N;
    }

    @Override
    public boolean isPrime(int p) {
        if(p%2!=0||p%3!=0){
            return true;
        }
        return false;
    }

    @Override
    public int[] eratosthenes(int max) {
      final int maxprim = (int)Math.sqrt(max)+2;
      boolean[] zahlen = new boolean[max]; 
      for (int i = 0; i < max; i++)
         zahlen[i] = i%2 == 1;
      for (int prim = 3; prim < maxprim; prim += 2) 
         if (zahlen[prim]) { 
            for (int i = prim; i <= max / prim; i++) {
               final int zahl = i*prim;
               if (zahl < max)
                  zahlen[zahl] = false; 
         }
      }

      int anzahl = 1;
      for (boolean istPrim : zahlen)
        if (istPrim)
          anzahl++;
      int[] primzahlen = new int[anzahl];
      int index = 0;
      for (int i = 0; i < zahlen.length; i++)
        if (zahlen[i])
          primzahlen[index++] = i;
      primzahlen[0] = 2;
      return primzahlen;
   }
    
    public void Primerechner(int grenze){
        int j = 2;
        int h = 3;
        for (int i = 3; i < grenze; i++) {
            if(i%2 == 0){
                if(isPrime(i-j)==true){
                    int y = i-j;
                    System.out.println( i +" summe: " + i + " = " + j +" + " + y);
                }else if(isPrime(i-h)==true){
                int y = i-j;
                System.out.println( i +" summe: " + i + " = " + j +" + " + y);
                }
            }
        }
        
    }
    
    
    
    
    
}
