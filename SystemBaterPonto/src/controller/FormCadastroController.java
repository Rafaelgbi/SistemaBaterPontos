    package controller;

import cadastro.Usuario;
import dao.Conexao;
import dao.UsuarioDAO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import views.cadastro;

public class FormCadastroController {

    private cadastro views;

    public FormCadastroController(cadastro views) {
        this.views = views;
    }

    public void salvaUsuario() {
        

        String nome = views.getTxtNome().getText();
        String usuarios = views.getTxtUsu().getText();
        String senha = views.getPassSenh().getText();
        String cpf = views.getForCpf().getText();
        String rg = views.getForRg().getText();
        String cargo = views.getTxtCargo().getText();
        String dataNasc = views.getForData().getText();
        String id = views.getTxtId().getText();
        String telefone = views.getTxtTele().getText();
        String estado = views.getTxtEsta().getText();
        String cidade = views.getTxtCidade().getText();
        String bairro = views.getTxtBairro().getText();
        String rua = views.getTxtRua().getText();
        String referencia = views.getTxtRefe().getText();
        String complemento = views.getTxtComple().getText();
        String numero = views.getTxtNum().getText();
        String cep = views.getForCep().getText();

        Usuario usuario = new Usuario(nome, usuarios, senha, cpf, rg, cargo, dataNasc, id, telefone, estado, cidade, bairro, rua, referencia, complemento, numero, cep);

        try {
            Connection conexao = new Conexao().getConnection();
            UsuarioDAO usuarioDAO = new UsuarioDAO(conexao);
            usuarioDAO.insert(usuario);
            JOptionPane.showMessageDialog(null, "            Dados do Usuário Salvo Com Sucessor!", "Salvos...", JOptionPane.PLAIN_MESSAGE);

        } catch (SQLException ex) {
            Logger.getLogger(cadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
