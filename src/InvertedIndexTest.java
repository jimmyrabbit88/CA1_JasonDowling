import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InvertedIndexTest {

    @Test
    void search() {

        InvertedIndex index = new InvertedIndex();

        File f = new File("C:\\test2");
        List<File> files = new ArrayList<File>(Arrays.asList(f.listFiles()));

        index.buildIndex(files);

        List<File> res = index.search("ash");
        List<File> exp = new ArrayList<File>(Arrays.asList(f.listFiles()[0], f.listFiles()[1]));
        assertEquals(exp, res);

        res = index.search("Trees");
        exp = new ArrayList<File>(Arrays.asList(f.listFiles()[0], f.listFiles()[1], f.listFiles()[2]));
        assertEquals(exp, res);

        res = index.search("tralee");
        exp = null;
        assertEquals(exp, res);
    }
}