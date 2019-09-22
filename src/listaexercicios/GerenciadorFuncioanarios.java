
package listaexercicios;
import java.time.*;
import java.util.ArrayList;
import java.util.List;


public class GerenciadorFuncioanarios {

    private  ArrayList<Funcionario> funcionarios;

   
    public GerenciadorFuncioanarios() {
        this.funcionarios = new ArrayList<>(50);
    }

    
    public  boolean inserir(Funcionario funcionario) {
        boolean retorno = false;
        if(funcionario != null) {
            for(int i = 0; i < this.funcionarios.size(); i++) {
                if(!(this.funcionarios.get(i).getCodigo() == funcionario.getCodigo())){
                    retorno = true;
                    this.funcionarios.add(funcionario);
                }
            }
        }    
        return retorno;
    }
    
    
    public Funcionario  buscar(int codigo) {
       Funcionario funcionario = null;
       for(Funcionario func : this.funcionarios) {
           if(func.getCodigo() == codigo)
               funcionario = func;
       }
       return funcionario;
   } 
    
    public boolean remover(Funcionario funcionario) {
        boolean retorno = false;
        if(funcionario != null) {
            for(Funcionario func : this.funcionarios) {
                if(func.getCodigo() == funcionario.getCodigo()) {
                    this.funcionarios.remove(func);
                    retorno = true;
                }    
            }
        }
        return retorno;
    }
    
    public boolean atualizar(int codigo, Funcionario funcionario) {
        boolean retorno = false;
        if(funcionario != null) {
            for(int i = 0; i < this.funcionarios.size(); i++) {
                if(this.funcionarios.get(i).getCodigo() == codigo) {
                    this.funcionarios.add(i, funcionario);
                    retorno = true;
                }
            }
        }
        return retorno;
    }
    
    public List<Funcionario> listarPorCargo(String cargo) {
        ArrayList<Funcionario> cargos = new  ArrayList<>();
        
        for(Funcionario func : this.funcionarios) {
            if(func.getCargo().equals(cargo))
                cargos.add(func);
        }
        return (List<Funcionario>)cargos;
    }
    
    public double calcularMediaSalarialPorCargo(String cargo){
        int total = 0;
        double salario = 0;
        double media;
        
        for(Funcionario func : this.funcionarios) {
            if(func.getCargo().equals(cargo)){
                salario = salario + func.getSalario();
                total = total + 1;
            }
        }
        if(total >= 1)
            media = salario/total ;
        else
            media = 0;
        return media;
    }
    
    public List<Funcionario> ganhamAcimaDe(double salario) {
        List<Funcionario> lista = new ArrayList<>();
        
       for(Funcionario func : this.funcionarios) {
         if(func.getSalario() > salario)
             lista.add(func);
       }   
        return lista;
    }
    
    public Funcionario obterFuncionarioMaisAntigo() {
        
        Funcionario funcionario = this.funcionarios.get(0);
        long antigo = funcionario.getTempoAdmissao();
        
        for(Funcionario func : this.funcionarios) {
            if(func.getTempoAdmissao() > antigo) {
                funcionario = func;
                antigo = funcionario.getTempoAdmissao();
            }
        }
        return funcionario;
    }
    
    public Funcionario obterFuncionarioMaisNovo() {
        Funcionario funcionario = this.funcionarios.get(0);
        long antigo = funcionario.getTempoAdmissao();
        
        for(Funcionario func : this.funcionarios) {
            if(func.getTempoAdmissao() < antigo) {
                funcionario = func;
                antigo = funcionario.getTempoAdmissao();
            }
        }
        return funcionario;   
    }
        
    public double calcularMediaSalarialPorPeriodo(LocalDate inicio, LocalDate fim) {
        double soma = 0;
        int i = 0;
        double media;
        for(Funcionario func : this.funcionarios)  {
            if(inicio.isEqual(func.getDataAdmissao()) || fim.isEqual(func.getDataAdmissao()) || (func.getDataAdmissao().isAfter(inicio) && func.getDataAdmissao().isBefore(fim) ) ) {
                soma = soma + func.getSalario();
                i = i + 1;
            }
        }
        if(i >= 1)
            media = soma/i;
        else 
            media = 0;
 
        return media;
    }
        
    
    
    
}