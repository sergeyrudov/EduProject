package automation.workWithFiles;

import com.codeborne.pdftest.PDF;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

import static com.codeborne.pdftest.PDF.containsText;
import static org.hamcrest.MatcherAssert.assertThat;


public class PdfFileExample {
    @Test
    void pdfTest() throws IOException {
        PDF pdf = new PDF(new File("src/test/resources/50quickideas.pdf"));
        assertThat(pdf, containsText("50 Quick Ideas to Improve your User Stories"));

    }
}
