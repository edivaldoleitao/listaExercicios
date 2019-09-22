
package listaexercicios;
import com.sun.org.apache.bcel.internal.generic.AALOAD;
import java.util.ArrayList;
import java.util.Arrays;
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
    
    public double f(){
        return 1;
    }
    
    
    
    
    
    
    
    
}