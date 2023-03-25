package Models;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javafx.scene.control.Pagination;


public class GenerarPdf {

    public static void main(String[] args) {
        Document document = new Document(PageSize.A4);

        try {
            PdfWriter.getInstance(document, new FileOutputStream("C:/Users/EGT/Desktop/PDF/ejemplo3.pdf"));
            document.open();

                      
           Image image = Image.getInstance("/img/logozoo.JPG");
            
           
           image.scalePercent(50);
           image.setAlignment(Element.ALIGN_CENTER);

            document.add(image);

            // Agregar titulo
            Paragraph title = new Paragraph("UdeaZoo | Calle 70 N° 52-21 - Medellín | Teléfono: (604) 2198332 | info@udeazoo.org");
            title.setAlignment(Element.ALIGN_CENTER);
            title.setSpacingBefore(0); 
            title.setSpacingAfter(30f); 
            document.add(title);
            
              // Agregar titulo
            //Font font = FontFactory.getFont(FontFactory.HELVETICA_BOLD);
            Paragraph title2 = new Paragraph("INFORME DE VENTAS");
            title.setAlignment(Element.ALIGN_CENTER);
            title2.setSpacingBefore(20f); 
            title2.setSpacingAfter(20f); 
            document.add(title2);

            // Agregar tabla
            PdfPTable table = new PdfPTable(5);// Crea una tabla con 3 columnas
            table.setWidthPercentage(100); // La tabla ocupa el ancho completo de la página
            table.setSpacingBefore(10f); // Espacio antes de la tabla
            table.setSpacingAfter(10f); // Espacio después de la tabla
            
            // Agregar encabezado
            Font font = FontFactory.getFont(FontFactory.HELVETICA_BOLD);
            PdfPCell cell1 = new PdfPCell(new Paragraph("PLAN", font));
            PdfPCell cell2 = new PdfPCell(new Paragraph("VALOR", font));
            PdfPCell cell3 = new PdfPCell(new Paragraph("CANTIDAD", font));
            PdfPCell cell4 = new PdfPCell(new Paragraph("VALOR VENTA", font));
            PdfPCell cell5 = new PdfPCell(new Paragraph("TOTAL", font));

            // Agrega filas a la tabla
            table.addCell(cell1);
            table.addCell(cell2);
            table.addCell(cell3);
            table.addCell(cell4);
            table.addCell(cell5);

            // Agregar datos a las celdas
            table.addCell("Plan 1");
            table.addCell("");
            table.addCell("");
            table.addCell("");
            table.addCell("");

            table.addCell("Plan 2");
            table.addCell("");
            table.addCell("");
            table.addCell("");
            table.addCell("");

            table.addCell("Plan 3");
            table.addCell("");
            table.addCell("");
            table.addCell("");
            table.addCell("");
            
            table.addCell("Plan 4");
            table.addCell("");
            table.addCell("");
            table.addCell("");
            table.addCell("");

            table.addCell("Plan 5");
            table.addCell("");
            table.addCell("");
            table.addCell("");
            table.addCell("");
            document.add(table);
            
            // Agregar tabla
            PdfPTable table2 = new PdfPTable(2);// Crea una tabla con 3 columnas
            table2.setWidthPercentage(100); // La tabla ocupa el ancho completo de la página
            table2.setSpacingBefore(10f); // Espacio antes de la tabla
            table2.setSpacingAfter(10f); // Espacio después de la tabla

            // Agregar encabezado
            Font font2 = FontFactory.getFont(FontFactory.HELVETICA_BOLD);
            PdfPCell cell6 = new PdfPCell(new Paragraph("VALOR VENTAS TOTALES", font2));
            PdfPCell cell7 = new PdfPCell(new Paragraph("VALOR TOTAL", font2));
            

            // Agrega filas a la tabla
            table2.addCell(cell6);
            table2.addCell(cell7);
            
            table2.addCell("Todas las ventas y planes");
            table2.addCell("");
            document.add(table2);
            
            Paragraph piePagina = new Paragraph("ZOODI | Calle 70 N° 52-21 - Medellín | Teléfono: (604) 2198332 | info@zoodi.org");
            piePagina.setAlignment(Element.ALIGN_CENTER);
            piePagina.setSpacingBefore(380); 
            piePagina.setSpacingAfter(0f); 
            document.add(piePagina);
                   
            document.close();
            
        } catch (FileNotFoundException | DocumentException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

