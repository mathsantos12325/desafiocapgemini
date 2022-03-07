import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestsUnitCapgeminiTest {

    @Test
    public void MedianaUnit() {
        int lista[] = { 9, 2, 1, 4, 6 };
        int resultado = QuestoesCapgemini.ObterMediana(lista);

        assertEquals(4, resultado);
    }

    @Test
    public void ValidarPares() {
        int lista[] = { 1, 5, 3, 4, 2 };
        int x = 2;

        int resultado = QuestoesCapgemini.AgruparPares(lista, x);

        assertEquals(3, resultado);
    }

    @Test
    public void EncriptarTextoEx1(){
        String frase = "tenha um bom dia";
        String resultado = QuestoesCapgemini.EncriptarTexto(frase);
        assertEquals("taoa eum nmd hbi", resultado);
    }

    @Test
    public void EncriptarTextoEx2(){
        String frase = "ola mundo";
        String resultado = QuestoesCapgemini.EncriptarTexto(frase);
        assertEquals("omd luo an", resultado);
    }

}
