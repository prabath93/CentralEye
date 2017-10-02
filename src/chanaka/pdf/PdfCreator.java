package chanaka.pdf;

import chanaka.dao.ActivitiesDAO;
import chanaka.data.Student;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.SQLException;

public class PdfCreator {

    Student student;
    ActivitiesDAO activitiesDAO;

    public PdfCreator(Student student, ActivitiesDAO activitiesDAO) {
        this.student = student;
        this.activitiesDAO = activitiesDAO;
    }

    public void createCharacterCertificatePDF(String date) throws FileNotFoundException, DocumentException, SQLException {

        Document document = new Document();
        PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(student.getNameWithInitials() + "_Character.pdf"));
        document.open();
        Font font14 = FontFactory.getFont("Times-Roman", 14, Font.BOLD);
        Font font18 = FontFactory.getFont("Times-Roman", 18, Font.BOLD);
        Font fontsmall = FontFactory.getFont("Times-Roman", 10, Font.BOLD);

        Font fontBold = FontFactory.getFont("Times-Roman", 13, Font.BOLD);
        document.add(new Paragraph("                                           Character Certificate\n\n\n", font18));//title
        document.add(new Paragraph("Full name :                       " + student.getFullNameEnglish()));//name
        document.add(new Paragraph("Year of admission :         " + student.getAdmissionYear(student.getAdmissionYear(null))));//admission
        document.add(new Paragraph("Class of admission :        " + student.getClassOfAdmission()));//class of admission
        document.add(new Paragraph("Admission number :        " + student.getAdmissionNumber()));//admission number
        document.add(new Paragraph("\n\n"));

        document.add(new Paragraph("Extra curricular activities", font14));
        document.add(new Paragraph("\n"));
        document.add(new Paragraph(activitiesDAO.getClubRecord(student.getAdmissionNumber())));//club details
        document.add(new Paragraph("\n"));
        document.add(new Paragraph(activitiesDAO.getSportsRecord(student.getAdmissionNumber())));//sports records
        document.add(new Paragraph("\n"));
        document.add(new Paragraph(activitiesDAO.getDisciplineRecord(student.getAdmissionNumber())));//discipline records
        document.add(new Paragraph("\n\n"));

        document.add(new Paragraph("Recomendation of the teacher in charge of the last class"));
        document.add(new Paragraph("\n\n\n\n\n\n\n"));
        document.add(new Paragraph("                                                                   _____________                                 _____________"));
        document.add(new Paragraph("                                                                  Teacher in charge                                  Sectional head"));
        document.add(new Paragraph("\n"));
        document.add(new Paragraph("Recomendation of the principal:", fontBold));
        document.add(new Paragraph("\n"));
        document.add(new Paragraph("                                          Issue this certificate:"));
        document.add(new Paragraph("                                                                                                      __________"));
        document.add(new Paragraph("                                                                                                         Principal"));

        document.add(new Paragraph("Date issued : " + date, fontsmall));
        document.close();
        writer.close();

    }

    public void createLeavingCertificatePDF(String date) throws DocumentException, FileNotFoundException, SQLException {
        Document document = new Document();
        PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(student.getNameWithInitials() + "_Leaving.pdf"));
        document.open();
        Font font14 = FontFactory.getFont("Times-Roman", 14, Font.BOLD);
        Font font18 = FontFactory.getFont("Times-Roman", 18, Font.BOLD);
        Font fontsmall = FontFactory.getFont("Times-Roman", 10, Font.BOLD);

        Font fontBold = FontFactory.getFont("Times-Roman", 13, Font.BOLD);
        document.add(new Paragraph("                                           Leaving Certificate\n\n\n", font18));//title
        document.add(new Paragraph("Full name :                       " + student.getFullNameEnglish()));//name
        document.add(new Paragraph("Year of admission :         " + student.getAdmissionYear(student.getAdmissionYear(null))));//admission
        document.add(new Paragraph("Class of admission :        " + student.getClassOfAdmission()));//class of admission
        document.add(new Paragraph("Admission number :        " + student.getAdmissionNumber()));//admission number
        document.add(new Paragraph("\n\n"));

//        document.add(new Paragraph("Extra curricular activities", font14));
//        document.add(new Paragraph("\n"));
//        document.add(new Paragraph(activitiesDAO.getClubRecord(student.getAdmissionNumber())));//club details
//        document.add(new Paragraph("\n"));
//        document.add(new Paragraph(activitiesDAO.getSportsRecord(student.getAdmissionNumber())));//sports records
//        document.add(new Paragraph("\n"));
//        document.add(new Paragraph(activitiesDAO.getDisciplineRecord(student.getAdmissionNumber())));//discipline records
//        document.add(new Paragraph("\n\n"));
        //document.add(new Paragraph("Recomendation of the teacher in charge of the last class"));
        // document.add(new Paragraph("\n\n\n\n\n\n\n"));
        // document.add(new Paragraph("                                                                   _____________                                 _____________"));
        // document.add(new Paragraph("                                                                  Teacher in charge                                  Sectional head"));
        // document.add(new Paragraph("\n"));
        document.add(new Paragraph("Recomendation of the principal:", fontBold));
        document.add(new Paragraph("\n"));
        document.add(new Paragraph("                                          Issue this certificate:"));
        document.add(new Paragraph("                                                                                                      __________"));
        document.add(new Paragraph("                                                                                                         Principal"));

        document.add(new Paragraph("Date issued : " + date, fontsmall));
        document.close();
        writer.close();

    }
}
