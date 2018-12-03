/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Funcionario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aluno
 */

    public class FuncionarioDAO extends ExecuteSQL {
    public FuncionarioDAO(Connection con) {
      super(con);
      
    }
    public boolean Logar(String login, String senha){
    boolean finalResult = false;
        try{
        String consulta = "select login, senha from funcionario where login = '"+login+"' and senha = '"+senha+"'";
        PreparedStatement ps = getCon().prepareStatement(consulta);
        ResultSet rs = ps.executeQuery();

            if(rs != null){
                while (rs.next()){
                    Funcionario a = new Funcionario();
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
 
    public String Inserir_Funcionario(Funcionario a){
     String sql = "insert into funcionario values (0,?,?,?,?,?,?,?,?,?,?)";
            try{
                PreparedStatement ps = getCon().prepareStatement(sql);
                
                ps.setString(1,a.getNome());
                ps.setString(2,a.getEmail());
                ps.setString(3,a.getRG());
                ps.setString(4,a.getCPF());
                ps.setString(5,a.getTelefone());
                 ps.setString(6,a.getNascimento());
                 ps.setString(7,a.getRua());
                  ps.setInt(8,a.getNumero());
                ps.setString(9,a.getBairro());
                ps.setString(10,a.getCEP());
               
                
                    if(ps.executeUpdate () > 0){
                        return "Inserifo com sucesso.";

                    }else{
                        return "Erro ao inserir";

                    }
                   
            }catch (SQLException e){
            return e.getMessage();
            }
    }
//   listar cliente 
   public List<Funcionario> ListarFuncionario(){
   String sql = "select * from funcionario";
   List<Funcionario> lista = new ArrayList<>();
   try{
   PreparedStatement ps = getCon().prepareStatement(sql);
   ResultSet rs = ps.executeQuery();
   
       if (rs != null) {
           while (rs.next()) {
              Funcionario a = new Funcionario();
              a.setCodigo(rs.getInt(1));
              a.setNome(rs.getString(2));
              a.setNascimento(rs.getString(3));
              a.setRG(rs.getString(3));
              a.setCPF(rs.getString(4));
              a.setEmail(rs.getString(5));
              a.setTelefone(rs.getString(6));
              a.setBairro(rs.getString(8));
              a.setRua(rs.getString(9));
              a.setNumero(rs.getInt(10));
              a.setCEP(rs.getString(11));
             
              lista.add(a);
           }
           return lista;
       }else{
        return null;
       }
   }catch (SQLException e){
   return null;
   }
   
   
   
   }
   
  public List<Funcionario> Pesquisar_Nome_Funcionario(String nome){  
  String sql = "select * from funcionario where nome LIKE '%"+ nome +"%'";
   List<Funcionario> lista = new ArrayList<>();
   try{
   PreparedStatement ps = getCon().prepareStatement(sql);
   ResultSet rs = ps.executeQuery();
   
       if (rs != null) {
           while (rs.next()) {
              Funcionario a = new Funcionario();
              
              a.setCodigo(rs.getInt(1));
              a.setNome(rs.getString(2));
              a.setRG(rs.getString(3));
              a.setCPF(rs.getString(4));
              a.setTelefone(rs.getString(5));
              a.setEmail(rs.getString(6));
              
             
              lista.add(a);
           }
           return lista;
       }else{
        return null;
       }
   }catch (SQLException e){
   return null;
   }
  
  }
  
   public List<Funcionario> Pesquisar_Cod_Funcionario(int cod){
     String sql = "select idcod, nome,rg,cpf,telefone,email from cliente where idcod = '"+cod+"'";
   List<Funcionario> lista = new ArrayList<>();
   try{
   PreparedStatement ps = getCon().prepareStatement(sql);
   ResultSet rs = ps.executeQuery();
   
       if (rs != null) {
           while (rs.next()) {
             Funcionario a = new Funcionario();
              a.setCodigo(rs.getInt(1));
              a.setNome(rs.getString(2));
              a.setRG(rs.getString(3));
              a.setCPF(rs.getString(4));
              a.setTelefone(rs.getString(5));
              a.setEmail(rs.getString(6));
             
              lista.add(a);
           }
           return lista;
       }else{
        return null;
       }
   }catch (SQLException e){
   return null;
   }
  
  
  
  }
  
   public boolean Testar_Funcionario(int cod){
   boolean Resultado = false;
            try{
                String sql = "select * from funcionario where idcod = "+cod+"";
                PreparedStatement ps = getCon().prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                
                if(rs != null){
                   while (rs.next()){
                   Resultado = true;
                   }
                }
            }catch (SQLException ex){
            ex.getMessage();
            
            }
   return Resultado;
   
   }
   
   public List<Funcionario> CapturarFuncionario(int cod){
       String sql = "select * from funcionario where idcod ="+cod+"";
       List<Funcionario> lista = new ArrayList<>();
       try{
           PreparedStatement ps = getCon().prepareStatement(sql);
           ResultSet rs = ps.executeQuery();
           if (rs != null) {
               while (rs.next()) {
                  Funcionario a = new Funcionario();
                  a.setCodigo(rs.getInt(1));
                  a.setNome(rs.getString(2));
                  a.setNascimento(rs.getString(3));
                  a.setRG(rs.getString(4));
                  a.setCPF(rs.getString(5));
                  a.setEmail(rs.getString(6));
                  a.setTelefone(rs.getString(7));
                  a.setBairro(rs.getString(8));
                  a.setRua(rs.getString(9));
                  a.setNumero(rs.getInt(10));
                  a.setCEP(rs.getString(11));
                  lista.add(a);
                  
               }
               return lista;
           }else{
            return null;
           }
       
       }catch (SQLException e){
           return null;
       }
   }
   
   public String Alterar_Funcionario (Funcionario a){
    String sql = "update funcionario set nome = ? ,data_nasc = ? ,rg = ? " 
            +",cpf = ? ,email = ? ,telefone = ? ,bairro = ? ,rua = ?" 
            +",numero = ? ,cep = ? where idcliente = ?";
    try{
    PreparedStatement ps = getCon().prepareStatement(sql);
                ps.setString(1,a.getNome());
                ps.setString(2,a.getNascimento());
                ps.setString(3,a.getRG());
                ps.setString(4,a.getCPF());
                ps.setString(5,a.getEmail());
                ps.setString(6,a.getTelefone());
                ps.setString(7,a.getBairro());
                ps.setString(8,a.getRua());
                ps.setInt(9,a.getNumero());
                ps.setString(10,a.getCEP());
                ps.setInt(11, a.getCodigo());
            if (ps.executeUpdate () > 0) {
                return "Atualizado com sucesso.";      
        }else{
            return "Erro ao Atualizar";
            }
    
    
    }catch (SQLException e){
      return e.getMessage();
    }
   }
   
   public List<Funcionario> ListarComboFuncionario(){
     String sql = "select nome from funcionario order by nome ";
     List<Funcionario> lista = new ArrayList<>();
     try{
     PreparedStatement ps = getCon().prepareStatement(sql);
     ResultSet rs = ps.executeQuery();
     
         if (rs != null) {
             while (rs.next()) {
                 Funcionario a = new Funcionario();
                 a.setNome(rs.getString(1));
                 lista.add(a);    
             }
           return lista;  
         }else{
          return null;
         }
     }catch (Exception e){
          return null;
     }
   }
 public List<Funcionario> ConsultaCodigoFuncionario(String nome){
     String sql = "select idcod from funcionario where nome = '"+nome+"'";
     List<Funcionario> lista = new ArrayList<>();
     try{
     PreparedStatement ps = getCon().prepareStatement(sql);
     ResultSet rs = ps.executeQuery();
     
         if (rs != null) {
             while (rs.next()) {
                 Funcionario a = new Funcionario();
                 a.setCodigo(rs.getInt(1));
                 lista.add(a);    
             }
           return lista;  
         }else{
          return null;
         }
     }catch (Exception e){
          return null;
     }
   }
   
 public String Excluir_Funcionario(Funcionario a){
   String sql = "delete from funcionario where idcod = ? and nome = ? ";
   try{
     PreparedStatement ps = getCon().prepareStatement(sql);
     ps.setInt(1, a.getCodigo());
     ps.setString(2, a.getNome());
     
       if (ps.executeUpdate() > 0) {
           return "Excluido com sucesso";   
       }else{
       return "Erro ao excluir";
       }
   }catch (SQLException e){
          return e.getMessage();
     }
 }

}
