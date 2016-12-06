import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by stud_6 on 08.11.16.
 */
public class CampicComputerrTest {
    @Test
    public void Minis throws Exception

    {
        Campic test = new Campic();
        String TestBrand = "NoBrand";
        String TestModel = "199";
        String ResultBrand = test.getBrand();
        String ResultModel = test.getModel();
        assertEquals(ResultBrand, TestBrand);
        assertEquals(ResultModel, TestModel);
    }

    @Test
    public void Plus throws Exception

    Campic test = new Campic(Bu, Ka);
    String TestBrand = "Bu";
    String TestModel = "Ka";
    String ResultBrand = test.getBrand();
    String ResultModel = test.getModel();

    assertEquals(ResultBrand, TestBrand);

    assertEquals(TestModel, ResultModel);

}

