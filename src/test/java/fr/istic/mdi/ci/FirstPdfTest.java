package fr.istic.mdi.ci;

import com.itextpdf.text.DocumentException;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.assertTrue;

public class FirstPdfTest {

    @BeforeEach
    public void init(){
        FirstPdf firstPdf = new FirstPdf();
    }

    @Test
public void TestCreateList() throws DocumentException {

        assertTrue(true);
    }
}
