/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Gerente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author aluno
 */
public class GerenteDAO extends ExecuteSQL {
    public GerenteDAO (Connection con) {
      super(con);
      
    }
    public boolean Logar(String login, String senha){
    boolean finalResult = false;
        try{
        String consulta = "select login, senha from gerente where nome = '"+login+"' and senha = '"+senha+"'";
        PreparedStatement ps = getCon().prepareStatement(consulta);
        ResultSet rs = ps.executeQuery();

            if(rs != null){
                while (rs.next()){
                    Gerente a = new Gerente();
                    a.setLogin(rs.getString(1));
                    a.setSenha(rs.getString(2));
                    finalResult = true;
                }
            }
        } catch(SQLException ex){
        ex.getMessage();
        }
        return finalResult;
    }
}
 

