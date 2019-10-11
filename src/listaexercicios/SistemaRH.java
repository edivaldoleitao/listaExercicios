
package listaexercicios;
import java.util.List;
/**
 *
 * @author Win10
 */
public class SistemaRH {

private GerenciadorFuncioanarios repositorio;

public SistemaRH() {
    this.repositorio  = new GerenciadorFuncioanarios();
}
    
    public  boolean inserirFuncionario(Funcionario funcionario) {
        return this.repositorio.inserir(funcionario);
    }

    public Funcionario buscarFuncionario(int codigo) {
        return this.repositorio.buscar(codigo);
    }

    public static void imprimirFolha(List<Funcionario> funcionario) {
        System.out.println("Nome:\t\tSalario :\tCargo :");
        for(Funcionario func : funcionario) {
            System.out.println(func.getNome() + "\t\t" + func.getSalario() + "\t\t" + func.getCargo());
        }
    }
    
}
