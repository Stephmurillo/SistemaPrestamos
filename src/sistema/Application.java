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

public class Application {

    public static void main(String[] args) {
        sistema.presentation.cliente.Model modelClientes=new sistema.presentation.cliente.Model() ;
        sistema.presentation.cliente.ViewCliente viewClientes = new sistema.presentation.cliente.ViewCliente();
        sistema.presentation.cliente.Controller controllerClientes = new sistema.presentation.cliente.Controller(modelClientes,viewClientes);
        CLIENTES = controllerClientes;
        
        sistema.presentation.prestamos.ModelPrestamo modelPrestamos =new sistema.presentation.prestamos.ModelPrestamo() ;
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
    
//    public static void createPdf3(String dest) throws IOException {
//        PdfFont font = PdfFontFactory.createFont(StandardFonts.HELVETICA);
//        PdfWriter writer = new PdfWriter(dest);
//        PdfDocument pdf = new PdfDocument(writer);
//        Document document = new Document(pdf, PageSize.A4.rotate());
//        document.setMargins(20, 20, 20, 20);
//
//        ImageData data = ImageDataFactory.create("logo.png");        
//        Image img = new Image(data); 
//        document.add(img);
//        
//        document.add(new Paragraph(""));
//        document.add(new Paragraph("SUPLIDORA ALAJUELA FM, LTDA.").setFont(font).setBold().setFontSize(20f));
//
//        Table table = new Table(5);
//        Cell c; 
//        Color bkg = ColorConstants.RED;
//        Color frg= ColorConstants.WHITE;
//        c= new Cell(); c.add(new Paragraph("Cantidad")).setBackgroundColor(bkg).setFontColor(frg); 
//        table.addHeaderCell(c);
//        c= new Cell(); c.add(new Paragraph("Codigo")).setBackgroundColor(bkg).setFontColor(frg);
//        table.addHeaderCell(c);     
//        c= new Cell(); c.add(new Paragraph("Descripcion")).setBackgroundColor(bkg).setFontColor(frg);
//        table.addHeaderCell(c); 
//        c= new Cell(); c.add(new Paragraph("Precio")).setBackgroundColor(bkg).setFontColor(frg);
//        table.addHeaderCell(c); 
//        c= new Cell(); c.add(new Paragraph("Total")).setBackgroundColor(bkg).setFontColor(frg);
//        table.addHeaderCell(c);                    
//        
//        for(int i=0;i<5;i++){
//            table.addHeaderCell("2");
//            table.addHeaderCell("AB34");
//            table.addHeaderCell("Base para medidor");  
//            table.addHeaderCell("5000");             
//            table.addHeaderCell("10000");               
//        }
//        c= new Cell(1,4);  c.add(new Paragraph("SubTotal")).setBackgroundColor(bkg).setFontColor(frg).setTextAlignment(TextAlignment.RIGHT);
//        table.addHeaderCell(c);                    
//        c= new Cell();  c.add(new Paragraph("50000")).setBackgroundColor(bkg).setFontColor(frg);
//        table.addHeaderCell(c);         
//        document.add(table);
//        document.close();
//    }
    }
