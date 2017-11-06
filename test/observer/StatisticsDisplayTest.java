package observer;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

/**
 * Created by UI on 06.11.2017.
 */
public class StatisticsDisplayTest {

    public StatisticsDisplayTest() throws Exception {}
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);

    }
    @Before
    public void setUp() throws Exception {
        System.setOut(ps);

    }

    @Test




}