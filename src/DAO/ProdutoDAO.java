/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Produto;
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
public class ProdutoDAO extends ExecuteSQL{
    
    public  ProdutoDAO (Connection con) {
        super(con);
    }
    
    public String Inserir_Produto(Produto a){
     String sql = "insert into produto values (0,?,?,?,?,?)";
            try{
                PreparedStatement ps = getCon().prepareStatement(sql);
                
                ps.setString(1,a.getNome());
                ps.setString(2,a.getProduto());
                ps.setString(3,a.getMarca());
                ps.setString(4,a.getFornecedor());
                ps.setInt(5,a.getQuantidade());
                
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
   public List<Produto> ListarProduto(){
   String sql = "select * from produto";
   List<Produto> lista = new ArrayList<>();
   try{
   PreparedStatement ps = getCon().prepareStatement(sql);
   ResultSet rs = ps.executeQuery();
   
       if (rs != null) {
           while (rs.next()) {

              Produto a = new Produto();
              a.setCodigo(rs.getInt(1));
              a.setNome(rs.getString(2));
              a.setProduto(rs.getString(3));
              a.setMarca(rs.getString(4));
              a.setFornecedor(rs.getString(5));
              a.setQuantidade(rs.getInt(6));
              
             
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
   
  public List<Produto> Pesquisar_Nome_Produto(String nome){  
  String sql = "select * from produto where nome LIKE '%"+ nome +"%'";
   List<Produto> lista = new ArrayList<>();
   try{
   PreparedStatement ps = getCon().prepareStatement(sql);
   ResultSet rs = ps.executeQuery();
   
       if (rs != null) {
           while (rs.next()) {
              Produto a = new Produto();
              
              a.setCodigo(rs.getInt(1));
              a.setNome(rs.getString(2));
               a.setProduto(rs.getString(3));
                a.setMarca(rs.getString(4));
                a.setFornecedor(rs.getString(5));
                 a.setQuantidade(rs.getInt(6));
             
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
  
   public List<Produto> Pesquisar_Cod_Produto(int cod){
   
   String sql = "select cod, nome,produto,marca,fornecedor,quantidade from produto where cod = '"+cod+"'";
   List<Produto> lista = new ArrayList<>();
   try{
   PreparedStatement ps = getCon().prepareStatement(sql);
   ResultSet rs = ps.executeQuery();
   
       if (rs != null) {
           while (rs.next()) {
             Produto a = new Produto();
              a.setCodigo(rs.getInt(1));
              a.setNome(rs.getString(2));
               a.setProduto(rs.getString(3));
                a.setMarca(rs.getString(4));
                a.setFornecedor(rs.getString(5));
                 a.setQuantidade(rs.getInt(6));
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
  
   public boolean Testar_Produto(int cod){
   boolean Resultado = false;
            try{
                String sql = "select * from produto where cod = "+cod+"";
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
   
   public List<Produto> CapturarProduto(int cod){
       String sql = "select * from produto where cod ="+cod+"";
       List<Produto> lista = new ArrayList<>();
       try{
           PreparedStatement ps = getCon().prepareStatement(sql);
           ResultSet rs = ps.executeQuery();
           if (rs != null) {
               while (rs.next()) {
                  Produto a = new Produto();
                  
                   a.setCodigo(rs.getInt(1));
              a.setNome(rs.getString(2));
               a.setProduto(rs.getString(3));
                
                a.setMarca(rs.getString(4));
                a.setFornecedor(rs.getString(5));
                 a.setQuantidade(rs.getInt(6));
                 
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
   
   public String Alterar_Produto (Produto a){
    String sql = "update produto set nome = ? , produto = ? " 
            +",marca = ? , fornecedor = ? , quantidade = ? where cod = ?";
    try{
        
        PreparedStatement ps = getCon().prepareStatement(sql);
        ps.setString(1,a.getNome());
        ps.setString(2,a.getProduto());
        ps.setString(3,a.getMarca());
        ps.setString(4,a.getFornecedor());
        ps.setInt(5,a.getQuantidade());
        ps.setInt(6, a.getCodigo());

            if (ps.executeUpdate () > 0) {
                return "Atualizado com sucesso.";      
        }else{
            return "Erro ao Atualizar";
            }
    
    
    }catch (SQLException e){
      return e.getMessage();
    }
   }
   
   public List<Produto> ListarComboProduto(){
     String sql = "select nome from produto order by nome ";
     List<Produto> lista = new ArrayList<>();
     try{
     PreparedStatement ps = getCon().prepareStatement(sql);
     ResultSet rs = ps.executeQuery();
     
         if (rs != null) {
             while (rs.next()) {
                 Produto a = new Produto();
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
 public List<Produto> ConsultaCodigoProduto(String nome){
     String sql = "select cod from produto where nome = '"+nome+"'";
     List<Produto> lista = new ArrayList<>();
     try{
     PreparedStatement ps = getCon().prepareStatement(sql);
     ResultSet rs = ps.executeQuery();
     
         if (rs != null) {
             while (rs.next()) {
                 Produto a = new Produto();
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
   
 public String Excluir_Produto(Produto a){
   String sql = "delete from produto where cod = ? and nome = ? ";
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
