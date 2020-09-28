/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primegit;

/**
 *
 * @author anel
 */
public class EratosthenesPrimeSieve implements PrimeSieve{
anel    
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
    public void printPrimes() {
        for (int i = 0; i < ober; i++) {
             if(i%2!=0||i%3!=0){
                 System.out.println(i);;
             }
        }
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
