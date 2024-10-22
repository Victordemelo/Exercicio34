package pessoa;

import javax.swing.JOptionPane;

public class Pessoa {

    public Pessoa() {
        this("", 0);
    }

    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void leitura() {
        setNome(JOptionPane.showInputDialog("Digite o nome: "));
        setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade: ")));
    }

    public void imprimir() {
        JOptionPane.showMessageDialog(null,"O nome da pessoa é: " + getNome());
        JOptionPane.showMessageDialog(null,"A idade da pessoa é: " + getIdade());

    }
}
