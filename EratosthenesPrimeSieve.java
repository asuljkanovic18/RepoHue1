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
    
    public EratosthenesPrimeSieve(){}
    
    public static void main(String[] args) {
        EratosthenesPrimeSieve er = new EratosthenesPrimeSieve();
        int a = 1657;
        er.PrintPrimes(a);
        
        
    }

    @Override
    public boolean isPrime(int p) {
        boolean erg = true;
        if(p==0||p==1){
            erg = false;
        }
        if(p==2||p==3){
            erg = true;
        }
        for (int i = 2; i < p; i++) {
            if(i*i==p||p%i==0){
                erg= false;
            }
            
        }  
        return erg;
    }

    @Override
    public void PrintPrimes(int max) {
        int[] primzahlen = new int[max];
        for (int i = 0; i <= max; i++) {
            if(isPrime(i)==true)
            {
                System.out.println(i);
            }
        }
        
   }
    
    public void Primerechner(int grenze){
        int j = 2;
        int h = 3;
        int z = 5;
        int b = 7;
        for (int i = 3; i < grenze; i++) {
            if(i%2 == 0){
                if(isPrime(i-j)==true){
                    int y = i-j;
                    System.out.println( i +" summe: " + i + " = " + j +" + " + y);
                }else if(isPrime(i-h) == true){
                int y = i-h;
                System.out.println( i +" summe: " + i + " = " + h +" + " + y);
                }else if(isPrime(i-z)==true){
                    int y = i-z;
                    System.out.println( i +" summe: " + i + " = " + z +" + " + y);
                }else if(isPrime(i-b)==true){
                    int y = i-b;
                    System.out.println( i +" summe: " + i + " = " + b +" + " + y);
                }
            }
        }
        
    }
    
    
    
    
    
}
