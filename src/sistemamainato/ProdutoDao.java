/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemamainato;

import java.util.List;

/**
 *
 * @author H.Chirico
 */
public interface ProdutoDao {
    
    
       public void save(Produtos p);
    public void Update(Produtos p);
    public void delete(Produtos p);
    public Produtos get(int id);
    
    public List<Produtos> list();
    
    
    
}
