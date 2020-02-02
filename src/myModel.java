
import javax.swing.Icon;
import javax.swing.table.AbstractTableModel;

//model to display the contacts image in jtable
public class myModel extends AbstractTableModel{
    
    private String[] columns;
    private Object[][] rows;
    
    public myModel(){}
    public myModel(Object [][] data,String[] columnsname){
        this.columns=columnsname;
        this.rows=data;
    }
    public Class getColumnClass(int col){
        //index og image col
        if(col==8){
            return Icon.class;
        }
         else{
            return getValueAt(0,col).getClass();
        }
    }
    
    @Override
    public int getRowCount() {
        return this.rows.length; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getColumnCount() {
        return this.columns.length; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return this.rows[rowIndex][columnIndex];
        //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public String getColumnName(int col){
        return this.columns[col];
    }
    
}
