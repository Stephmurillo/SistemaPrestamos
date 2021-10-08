package sistema.presentation.prestamos;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;
import sistema.logic.Prestamo;

public class PrestamosJTableModel extends AbstractTableModel implements TableModel {

    String[] cols = {"Codigo", "Monto", "Tasa", "Plazo"};
    
    List<Prestamo> rows;

    public PrestamosJTableModel(List<Prestamo> rows) {
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
    public Class<?> getColumnClass(int i) {
        return super.getColumnClass(i); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getValueAt(int row, int col) {
        Prestamo m = rows.get(row);
        java.text.DecimalFormat df = new java.text.DecimalFormat("####");
        switch (col) {
            case 0:
                return m.getCodigo();
            case 1:
                return df.format(m.getMonto());
            case 2:
                return df.format(m.getTasa());
            case 3:
                return df.format(m.getPlazo());
            default:
                return "";
        }
    }


    
}
