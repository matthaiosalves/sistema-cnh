package fechamento.automatico;

import javax.swing.JOptionPane;

public class FechamentoAutomatico {
    
    public static void main(String[] args) {
        String resposta;
        int idade;
        String frase1 = "Você ainda pode dirigir";
        
        JOptionPane.showMessageDialog(null, "Olá, seja bem-vindo a CNH ON-LINE");
        resposta = JOptionPane.showInputDialog(null, "Insira sua idade");
        idade = Integer.parseInt(resposta);
        
        if (idade >= 65) {
            int id = JOptionPane.showConfirmDialog(null, "Voce ainda tem condições?");
            
            if (id == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, frase1);
            } else {
                JOptionPane.showMessageDialog(null, "Você não pode mais dirigir, está muito velho");
            }
        } else if (idade < 18){
            JOptionPane.showMessageDialog(null, "Você ainda não pode ter CNH");
        } else if (idade >= 18) {
            JOptionPane.showMessageDialog(null, "Você pode ter CNH");
        }    
    }   
}
