package principal;

import pessoa.Aluno;
import pessoa.Professor;

public class Principal {

    public static void main(String[] args) {
        Aluno victor = new Aluno();
        victor.leitura();
        victor.imprimir();
        
        Professor osmar = new Professor();
        osmar.leitura();
        osmar.imprimir();   
    }
}
