/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package listaexercicios;
import java.time.*;
/**
 *
 * @author Win10
 */
public class Funcionario {
    private int codigo;
    private String nome;
    private double salario;
    private String cargo;
    private LocalDate dataAdmissao;
    
    
    public Funcionario() {
        
    }
    
    public Funcionario(int codigo, String nome, double salario, String cargo, LocalDate dataAdmissao) {
        if(codigo < 0 || salario < 0) {
            
        }
        else{
            if( (nome != null && cargo != null) && (cargo.equals("gerente") || cargo.equals("vendedor") || cargo.equals("motorista")) ) {
                this.cargo = cargo;
                this.codigo = codigo;
                this.nome = nome;
                this.salario = salario;
                this.dataAdmissao = dataAdmissao;
            }
        }
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }
    
     
    
    
}
