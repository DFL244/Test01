/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hola;

/**
 *
 * @author DFL244 y adicional sumo mas cosas para saber si esta funcionando bien
 */
public class primo {

 
    public static void main(String[] args) {

        int n=455;
        int pru=n%5;
        int varpri = 2;
        for (int i=2;i<n;i++){

            if(n%i==0){
                varpri=1;
                  System.out.println("No es primo es divisible por "+i);// No es in primo diisible no es.
                  break;
            }

            if(n%i!=0){
                 varpri=0;
            }
        }

        if(varpri==0){
                System.out.println(n+" Es primo");

            }

        //System.out.println(pru+"");
        
        
        // TODO code application logic here
    }

}
