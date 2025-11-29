import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.example.Gra;
public class Testy  {
    @Test
    public void porownanie(){
    Gra gra = new Gra("AY");
    Assertions.assertArrayEquals(new char[]{'A','Y'}, gra.zwrocTabliceZnakow());
    }
    @Test
    public void zmienznaki(){
        Assertions.assertArrayEquals(new char[]{'K','P'}, Gra.zmienZnakiWTablice(Gra.znaki()));
    }
    @Test
    public void obliczWynik(){
        Assertions.assertEquals(0, Gra.obliczWynik(Gra.zmienZnakiWTablice(Gra.znaki())));
    }
    @Test
    public void obliczWynikDlaZnakow(){
        char[] gra= {'A', 'Y'};
        Assertions.assertEquals(3, Gra.obliczWynikDlaZnakow(Gra.znaki(),Gra.obliczWynik(gra)));
        
    }
}
