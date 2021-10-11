/* @authors 
    - Yoselin Rojas | Grupo 04 
    - Stephanny Murillo | Grupo 03
*/

// ARREGLAR:
// - Arreglar el botón de listar en prestamos view.
// - Cargar la lista de prestamos del cliente en el jTable de prestamos.

// - Setear valores en el pago.
// - Manejar excepciones en la view de pago, no permitir ingresar strings.

package sistema;

import java.io.IOException;
import com.itextpdf.io.font.constants.StandardFonts;
import com.itextpdf.kernel.colors.Color;
import com.itextpdf.kernel.colors.ColorConstants;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.*;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.TextAlignment;
import java.util.List;
import sistema.logic.Cliente;
import sistema.logic.Pagos;
import sistema.logic.Prestamo;

public class Application {

    public static void main(String[] args) {
        sistema.presentation.cliente.Model modelClientes=new sistema.presentation.cliente.Model() ;
        sistema.presentation.cliente.ViewCliente viewClientes = new sistema.presentation.cliente.ViewCliente();
        sistema.presentation.cliente.Controller controllerClientes = new sistema.presentation.cliente.Controller(modelClientes,viewClientes);
        CLIENTES = controllerClientes;
        
        sistema.presentation.prestamos.ModelPrestamo modelPrestamos = new sistema.presentation.prestamos.ModelPrestamo() ;
        sistema.presentation.prestamos.ViewPrestamo viewPrestamo = new sistema.presentation.prestamos.ViewPrestamo();
        sistema.presentation.prestamos.ControllerPrestamo controllerPrestamos = new sistema.presentation.prestamos.ControllerPrestamo(modelPrestamos,viewPrestamo);
        PRESTAMOS = controllerPrestamos;       
        
        sistema.presentation.pagos.ModelPagos modelMensualidades = new sistema.presentation.pagos.ModelPagos() ;
        sistema.presentation.pagos.ViewPagos viewMensualidad = new sistema.presentation.pagos.ViewPagos();
        sistema.presentation.pagos.ControllerPagos controllerMensualidades = new sistema.presentation.pagos.ControllerPagos(modelMensualidades, viewMensualidad);
        MENSUALIDADES = controllerMensualidades;    
        
        CLIENTES.show();
    }

    public static sistema.presentation.cliente.Controller CLIENTES;
    public static sistema.presentation.prestamos.ControllerPrestamo PRESTAMOS;
    public static sistema.presentation.pagos.ControllerPagos MENSUALIDADES;
    
    public static void createPdfPrestamos(List<Prestamo> prestamos) throws IOException {
        PdfFont font = PdfFontFactory.createFont(StandardFonts.HELVETICA);
        PdfWriter writer = new PdfWriter("Prestamos.pdf");
        PdfDocument pdf = new PdfDocument(writer);
        try (Document document = new Document(pdf, PageSize.A4.rotate())) {
            document.setMargins(20, 20, 20, 20);
            
            document.add(new Paragraph(""));
            document.add(new Paragraph("PRESTAMOS DATA").setFont(font).setBold().setFontSize(20f));
            
            Table table = new Table(4);
            Cell c;
            Color bkg = ColorConstants.RED;
            Color frg = ColorConstants.WHITE;
            c = new Cell();
            c.add(new Paragraph("Código")).setBackgroundColor(bkg).setFontColor(frg);
            table.addHeaderCell(c);
            c = new Cell();
            c.add(new Paragraph("Monto")).setBackgroundColor(bkg).setFontColor(frg);
            table.addHeaderCell(c);
            c = new Cell();
            c.add(new Paragraph("Tasa")).setBackgroundColor(bkg).setFontColor(frg);
            table.addHeaderCell(c);
            c = new Cell();
            c.add(new Paragraph("Pago")).setBackgroundColor(bkg).setFontColor(frg);
            table.addHeaderCell(c);
            
            prestamos.stream().map(prestamo -> {
                table.addHeaderCell(prestamo.getCodigo());
                return prestamo;
            }).map(prestamo -> {
                table.addHeaderCell(Double.toString(prestamo.getMonto()));
                return prestamo;
            }).map(prestamo -> {
                table.addHeaderCell(Double.toString(prestamo.getTasa()));
                return prestamo;
            }).forEachOrdered(prestamo -> {
                table.addHeaderCell(Double.toString(prestamo.getPlazo()));
            });
            
            c = new Cell(1, 3);
            c.add(new Paragraph("")).setBackgroundColor(bkg).setFontColor(frg).setTextAlignment(TextAlignment.RIGHT);
            table.addHeaderCell(c);
            c = new Cell();
            c.add(new Paragraph("")).setBackgroundColor(bkg).setFontColor(frg);
            table.addHeaderCell(c);
            document.add(table);
        }
    }
        
    public static void createPdfPagos(List<Pagos> pagos) throws IOException {
        PdfFont font = PdfFontFactory.createFont(StandardFonts.HELVETICA);
        PdfWriter writer = new PdfWriter("Pagos.pdf");
        PdfDocument pdf = new PdfDocument(writer);
        try (Document document = new Document(pdf, PageSize.A4.rotate())) {
            document.setMargins(20, 20, 20, 20);
            
            document.add(new Paragraph(""));
            document.add(new Paragraph("PAGOS DATA").setFont(font).setBold().setFontSize(20f));
            
            Table table = new Table(5);
            Cell c;
            Color bkg = ColorConstants.RED;
            Color frg = ColorConstants.WHITE;
            c = new Cell();
            c.add(new Paragraph("Numero")).setBackgroundColor(bkg).setFontColor(frg);
            table.addHeaderCell(c);
            c = new Cell();
            c.add(new Paragraph("Fecha")).setBackgroundColor(bkg).setFontColor(frg);
            table.addHeaderCell(c);
            c = new Cell();
            c.add(new Paragraph("Monto")).setBackgroundColor(bkg).setFontColor(frg);
            table.addHeaderCell(c);
            c = new Cell();
            c.add(new Paragraph("Intereses")).setBackgroundColor(bkg).setFontColor(frg);
            table.addHeaderCell(c);
            c = new Cell();
            c.add(new Paragraph("Amortización")).setBackgroundColor(bkg).setFontColor(frg);
            table.addHeaderCell(c);
            
            pagos.stream().map(pago -> {
                table.addHeaderCell(pago.getNumero());
                return pago;
            }).map(pago -> {
                table.addHeaderCell(pago.getFecha());
                return pago;
            }).map(pago -> {
                table.addHeaderCell(Double.toString(pago.getMonto()));
                return pago;
            }).map(pago -> {
                table.addHeaderCell(Double.toString(pago.getInteres()));
                return pago;
            }).forEachOrdered(pago -> {
                table.addHeaderCell(Double.toString(pago.getAmortizacion()));
            });
            c = new Cell(1, 4);
            c.add(new Paragraph("")).setBackgroundColor(bkg).setFontColor(frg).setTextAlignment(TextAlignment.RIGHT);
            table.addHeaderCell(c);
            c = new Cell();
            c.add(new Paragraph("")).setBackgroundColor(bkg).setFontColor(frg);
            table.addHeaderCell(c);
            document.add(table);
        }
    }

    public static void createPdfClientes(List<Cliente> clientes) throws IOException {
        PdfFont font = PdfFontFactory.createFont(StandardFonts.HELVETICA);
        PdfWriter writer = new PdfWriter("Clientes.pdf");
        PdfDocument pdf = new PdfDocument(writer);
        try (Document document = new Document(pdf, PageSize.A4.rotate())) {
            document.setMargins(20, 20, 20, 20);
            
            document.add(new Paragraph(""));
            document.add(new Paragraph("CLIENTES DATA").setFont(font).setBold().setFontSize(20f));
            
            Table table = new Table(5);
            Cell c;
            Color bkg = ColorConstants.RED;
            Color frg = ColorConstants.WHITE;
            c = new Cell();
            c.add(new Paragraph("Cedula")).setBackgroundColor(bkg).setFontColor(frg);
            table.addHeaderCell(c);
            c = new Cell();
            c.add(new Paragraph("Nombre")).setBackgroundColor(bkg).setFontColor(frg);
            table.addHeaderCell(c);
            c = new Cell();
            c.add(new Paragraph("Provincia")).setBackgroundColor(bkg).setFontColor(frg);
            table.addHeaderCell(c);
            c = new Cell();
            c.add(new Paragraph("Cantón")).setBackgroundColor(bkg).setFontColor(frg);
            table.addHeaderCell(c);
            c = new Cell();
            c.add(new Paragraph("Distrito")).setBackgroundColor(bkg).setFontColor(frg);
            table.addHeaderCell(c);
            
            clientes.stream().map(cliente -> {
                table.addHeaderCell(cliente.getCedula());
                return cliente;
            }).map(cliente -> {
                table.addHeaderCell(cliente.getNombre());
                return cliente;
            }).map(cliente -> {
                table.addHeaderCell(cliente.getProvincia().getNombre());
                return cliente;
            }).map(cliente -> {
                table.addHeaderCell(cliente.getCanton().getNombre());
                return cliente;
            }).forEachOrdered(cliente -> {
                table.addHeaderCell(cliente.getDistrito().getNombre());
            });
            c = new Cell(1, 4);
            c.add(new Paragraph("")).setBackgroundColor(bkg).setFontColor(frg).setTextAlignment(TextAlignment.RIGHT);
            table.addHeaderCell(c);
            c = new Cell();
            c.add(new Paragraph("")).setBackgroundColor(bkg).setFontColor(frg);
            table.addHeaderCell(c);
            document.add(table);
        }
    }
}
