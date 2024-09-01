/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho.libraryproject.model.DAO;

import java.util.List;

/**
 *
 * @author 15102938681
 */
public interface IDao<O>
{
    void save(O objO);
    void update(String codObjO, O objO);
    void remove(String codObjO);
    O find(String codObjO);
    List<O> findAll();
}
