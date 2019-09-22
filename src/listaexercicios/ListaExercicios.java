/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaexercicios;
import java.time.*;
import java.time.temporal.ChronoUnit;

public class ListaExercicios {

    
    public static void main(String[] args) {

        LocalDate q = LocalDate.now();
        
        System.out.println(ChronoUnit.DAYS.between(q, q.plusYears(2)));
      
        
        
    }
}
