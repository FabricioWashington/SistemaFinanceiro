package DTO;


public class LoginDTO {
    private int idlogin;
    private String Login_Usuario, Login_Senha;

    /**
     * @return the idlogin
     */
    public int getIdlogin() {
        return idlogin;
    }

    /**
     * @param idlogin the idlogin to set
     */
    public void setIdlogin(int idlogin) {
        this.idlogin = idlogin;
    }

    /**
     * @return the Login_Usuario
     */
    public String getLogin_Usuario() {
        return Login_Usuario;
    }

    /**
     * @param Login_Usuario the Login_Usuario to set
     */
    public void setLogin_Usuario(String Login_Usuario) {
        this.Login_Usuario = Login_Usuario;
    }

    /**
     * @return the Login_Senha
     */
    public String getLogin_Senha() {
        return Login_Senha;
    }

    /**
     * @param Login_Senha the Login_Senha to set
     */
    public void setLogin_Senha(String Login_Senha) {
        this.Login_Senha = Login_Senha;
    }

    public void setSenha_Usuario(String Login_Usuario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

    