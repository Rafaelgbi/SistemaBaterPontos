package controller;

import cadastro.Usuario;
import dao.Conexao;
import dao.UsuarioDAO;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import views.cadastro;
import views.intADM;
import views.longin;

public class LoginController {

    private longin views;

    public LoginController(longin views) {
        this.views = views;
    }

    public void autenticar() throws SQLException {

        //Buscar o usuario da views
        String usuarios = views.getTxtUsu().getText();
        String senha = views.getPassSenh().getText();

        Usuario autenticarUsuario = new Usuario(usuarios, senha);
        //Verificar se exisate no banco de dados
        Connection conexao = new Conexao().getConnection();
        UsuarioDAO usuarioDAO = new UsuarioDAO(conexao);

        boolean existe = usuarioDAO.autenticarUsuario(autenticarUsuario);
        //Se existir direciona para o menu

        if (existe) {
            cadastro telaDeCadastro = new cadastro();
            new intADM().setVisible(true);
            
        }else{
            JOptionPane.showMessageDialog(null, "Usuario o senha Invalidos" );
        }

    }

}
