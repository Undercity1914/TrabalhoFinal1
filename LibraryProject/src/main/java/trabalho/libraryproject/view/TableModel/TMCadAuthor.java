/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho.libraryproject.view.TableModel;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import trabalho.libraryproject.model.entities.Author;

/**
 *
 * @author Windows
 */
public class TMCadAuthor  extends AbstractTableModel{
    
    private List<Author> authors;
    
     private final int COL_NAME= 0;
    private final int COL_CPF = 1;
    private final int COL_AGE = 2;
    private final int COL_ISBN = 3;
    
    public TMCadAuthor(List<Author> authors){
        this.authors = authors;
    }
    

    @Override
    public int getRowCount() {
        return this.authors.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
        
       
    }
    
    public Author getObjetoAuthor(int row){
        return this.authors.get(row);
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Author a= this.authors.get(rowIndex);
        switch (columnIndex){
            case COL_NAME :
                return a.getName();
            case COL_CPF :
                return a.getCpf();
            case COL_AGE :
                return a.getAge();
            case COL_ISBN :
     //           return a.getBook;
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
