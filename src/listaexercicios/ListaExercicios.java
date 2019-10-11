/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaexercicios;
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

import  java.util.List;

public class ListaExercicios {

    
    public static void main(String[] args) {

        //LocalDate q = LocalDate.now();
        //System.out.println(ChronoUnit.DAYS.between(q, q.plusYears(2)));
        LocalDate agora = LocalDate.now();
        Funcionario func1 = new Funcionario(11, "e", 12, "motorista",agora );
        Funcionario func2 = new Funcionario(1111, "eeee", 1, "motorista", agora);
        ArrayList<Funcionario> lista = new ArrayList<>();
        lista.add(func2);
        lista.add(func1);
        SistemaRH.imprimirFolha(lista);
        
    }
}
