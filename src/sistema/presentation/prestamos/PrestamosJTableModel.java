package sistema.presentation.prestamos;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;
import sistema.logic.Prestamo;

public class PrestamosJTableModel extends AbstractTableModel implements TableModel {

    String[] cols = {"Codigo", "Saldo", "Interés", "Amortización"};
    
    ArrayList<Prestamo> rows;

    public PrestamosJTableModel(ArrayList<Prestamo> rows) {
        this.rows = rows;
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public String getColumnName(int col) {
        return cols[col];
    }

    @Override
    public int getRowCount() {
        return rows.size();
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return Integer.class;
    }

    @Override
    public Object getValueAt(int row, int col) {
        Prestamo m = rows.get(row);
        java.text.DecimalFormat df = new java.text.DecimalFormat("####");
        switch (col) {
            case 0:
             //   return df.format(m.getNumero());
            case 1:
               // return df.format(m.getSaldoAct());
            case 2:
              //  return df.format(m.getInteres());
            case 3:
               // return df.format(m.getAmortizacion());
            default:
                return "";
        }
    }


    
}
