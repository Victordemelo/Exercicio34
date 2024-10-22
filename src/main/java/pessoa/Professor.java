package pessoa;

import javax.swing.JOptionPane;

public class Professor extends Pessoa {

    private double salario;
    private String Titulo;
    private static final String TITULO = "DOUTOR";

    public Professor() {
        this(0.0, "", "", 0);
    }

    public Professor(double salario, String Titulo, String nome, int idade) {
        super(nome, idade);
        this.salario = salario;
        this.Titulo = Titulo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public void leitura() {
        super.leitura();
        setSalario(Integer.parseInt(JOptionPane.showInputDialog("Digite o salário do professor: ")));
        setTitulo(JOptionPane.showInputDialog(null, "Digite o titulo do professor: ", TITULO));
    }

    public void imprimir() {
        super.imprimir();
        JOptionPane.showMessageDialog(null,"O Titulo do professor é: " + getTitulo());
        JOptionPane.showMessageDialog(null,"O salário do professo é: " + getSalario());
    }
}
