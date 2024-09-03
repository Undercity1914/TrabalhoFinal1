/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho.libraryproject.view.TableModel;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import trabalho.libraryproject.model.entities.User;

/**
 *
 * @author Windows
 */
public class TMCadUser extends AbstractTableModel{
    private List<User> users;
    
    private final int COL_NAME= 0;
    private final int COL_CPF = 1;
    private final int COL_AGE = 2;
    private final int COL_ISBN = 3;
    
    public TMCadUser(List<User> users){
        this.users = users;
    }
    

    
    @Override
    public int getRowCount() {
        return this.users.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
        
       
    }
    
    public User getObjetoAuthor(int row){
        return this.users.get(row);
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        User u = this.users.get(rowIndex);
        switch (columnIndex){
            case COL_NAME :
                return u.getName();
            case COL_CPF :
                return u.getCpf();
            case COL_AGE :
                return u.getAge();
            case COL_ISBN :
     //           return u.getBook;
            default:
                break;
            }
        return "-";
        }
    @Override
    public String getColumnName(int columnIndex){
        if(columnIndex == COL_NAME ){
            return "NAME";
        }else if(columnIndex == COL_CPF){
            return "CPF";
        }else if(columnIndex == COL_AGE){
            return "AGE";
        }else if (columnIndex == COL_ISBN){
            return "ISBN";
        }
        return "";
    }
    

    
    
    
}
