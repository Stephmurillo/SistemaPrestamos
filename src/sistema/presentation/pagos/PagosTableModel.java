package sistema.presentation.pagos;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;
import sistema.logic.Pagos;

public class PagosTableModel extends AbstractTableModel implements TableModel {
    String[] cols ={"Numero" ,"Fecha" ,"Monto" ,"Interes" ,"Amortización" };
    
    List<Pagos> rows;

    public  PagosTableModel(List<Pagos> rows){
        this.rows = rows;
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public String getColumnName(int col){
        return cols[col];
    }

    @Override
    public int getRowCount() {
        return rows.size();
    }
    
    @Override
    public Class<?> getColumnClass(int columnIndex){
        return Integer.class;
    }
    
    @Override
    public Object getValueAt(int row, int col) {
        Pagos m = rows.get(row);
        java.text.DecimalFormat df = new java.text.DecimalFormat("####");
        switch (col){
            case 0: return m.getNumero();
            case 1: return df.format(m.getFecha());
            case 2: return df.format(m.getMonto());
            case 3: return df.format(m.getInteres());
            case 4: return df.format(m.getAmortizacion());
            default: return "";
        }
    }    
}

