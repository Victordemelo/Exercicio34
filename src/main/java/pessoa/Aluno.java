package pessoa;

import javax.swing.JOptionPane;

public class Aluno extends Pessoa {

    public Aluno() {
        this("", "", 0);
    }

    public String curso;
    private static final String CURSO = "Engenharia da computação";

    public Aluno(String curso, String nome, int idade) {
        super(nome, idade);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void leitura() {
        super.leitura();
        setCurso(JOptionPane.showInputDialog("O nome do curso é: ", CURSO));
    }

    public void imprimir() {
        super.imprimir();
        JOptionPane.showMessageDialog(null, "O curso do aluno é: " + getCurso());

    }
}
