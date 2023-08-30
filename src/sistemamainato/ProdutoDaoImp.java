/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemamainato;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author H.Chirico
 */
public class ProdutoDaoImp  implements ProdutoDao {

    @Override
    public void save(Produtos p) {
       

 try{
            Connection con=Conexao.getconnection();
            
           String query="insert into calcado(ID,Nome,Para,Tamanho,Preco,Quantidade)   values (null, ?,?,?,?,?)";
          PreparedStatement ps= con.prepareStatement(query);
           ps.setString(1, p.getNome());
           ps.setString(2, p.getPara());
           ps.setFloat(3, p.getTamanho());
           ps.setFloat(4, p.getPreco());
           ps.setInt(5, p.getQuantidade());
           
          
          
           ps.executeUpdate();
           JOptionPane.showMessageDialog(null," Dados do Produto Salvos  com sucesso");
            
        }catch (Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Erro ao Salvar os dados do Produto " +e);
        }
        
        

//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Update(Produtos p) {
       
         try{ 
          Connection con =Conexao .getconnection();
          String query= "UPDATE calcado SET Nome=?,Para=?,Tamanho=?,Preco=?,Quantidade=?   WHERE ID=?";
          PreparedStatement ps= con.prepareStatement(query);
          ps.setString(1, p.getNome());
           ps.setString(2, p.getPara());
           ps.setFloat(3, p.getTamanho());
           ps.setFloat(4, p.getPreco());
           ps.setInt(5, p.getQuantidade());
           ps.setInt(6, p.getID());
          
           
          ps.executeUpdate();
          JOptionPane.showMessageDialog(null, " Dados atualizados com sucesso");
          
      }catch(Exception e){
          e.printStackTrace();
          JOptionPane.showMessageDialog(null," falha ao atualizar dados");
      
        
        
    }
        
        
        
//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Produtos p) {
        
         try{
            Connection con= Conexao.getconnection();
            String query= "delete  from calcado where ID=? ";
            PreparedStatement ps= con.prepareStatement(query);
            ps.setInt(1, p.getID());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null," Produto Apagado com Sucesso");
            
            
            
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null," Falha ao apagar aos dados do Produto " +e);
        }
        
//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Produtos get(int id) {
       
          Produtos med= new  Produtos();
     
        try{
            
             Connection con=Conexao.getconnection();
            
           String query="SELECT * FROM calcado  WHERE ID=? ";
          PreparedStatement ps= con.prepareStatement(query);
          ps.setInt(1, id);
          ResultSet rs=ps.executeQuery();
          
          if(rs.next()){
                 
              
               med.setID(rs.getInt("ID"));
               med.setNome(rs.getString("Nome"));
               med.setPara(rs.getString("Para"));
               med.setTamanho(rs.getFloat("Tamanho"));
               med.setPreco(rs.getFloat("Preco"));
               med.setQuantidade(rs.getInt("Quantidade"));
               med.setValorVenda(rs.getFloat("ValorVenda"));
               med.setDataVenda(rs.getString("Venda"));
          
  
          }
            
        }catch(Exception e){
          JOptionPane.showMessageDialog(null, "falha na Busca");
        }
        
        return med;
        

//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Produtos> list() {
       
         List<Produtos> list= new ArrayList<Produtos>();
      
        try{
            Connection con=Conexao.getconnection();
            String query=" SELECT * FROM calcado";
            PreparedStatement ps= con.prepareStatement(query);
            
            ResultSet rs= ps.executeQuery();
            while(rs.next()){
                 Produtos med= new  Produtos();
               
               
             
               med.setID(rs.getInt("ID"));
               med.setNome(rs.getString("Nome"));
               med.setPara(rs.getString("Para"));
               med.setTamanho(rs.getFloat("Tamanho"));
               med.setPreco(rs.getFloat("Preco"));
               med.setQuantidade(rs.getInt("Quantidade"));
               med.setValorVenda(rs.getFloat("ValorVenda"));
               med.setDataVenda(rs.getString("Venda"));
          
          
              
               list.add(med);
                
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error" +e);
        }
       return list; 
    }
        


//To change body of generated methods, choose Tools | Templates.
    }
    

