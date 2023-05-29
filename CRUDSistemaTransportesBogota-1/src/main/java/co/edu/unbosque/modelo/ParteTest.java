package co.edu.unbosque.modelo;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.Date;

public class ParteTest {

    @Test
    public void testConstructor() {
        Parte parte = new Parte(1, new Date(), "ABC123", "Bogota D.C", "Valentina Becerra", "A5", 117040, "No respetar las señales de tránsito.");
        assertEquals(Integer.valueOf(1), parte.getId());
        assertEquals("ABC123", parte.getPlaca());
        assertEquals("Valentina Becerra", parte.getDueno());
        assertEquals("A5", parte.getCodigo());
        assertEquals(117040, parte.getValor());
        assertEquals("No respetar las señales de tránsito.", parte.getDescripcion());
    }

    @Test
    public void testSetPlaca() {
        Parte parte = new Parte();
        parte.setPlaca("XYZ987");
        assertEquals("XYZ987", parte.getPlaca());
    }

    @Test
    public void testSetDueno() {
        Parte parte = new Parte();
        try {
			parte.setDueno("Nuevo Valentina Becerra");
		} catch (Exception e) {
			e.printStackTrace();
		}
        assertEquals("Nuevo Valentina Becerra", parte.getDueno());
    }
}


