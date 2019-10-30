import java.security.Key;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTreeMapTest {

    @org.junit.jupiter.api.Test
    void put() {
    }

    @org.junit.jupiter.api.Test
    void print() {
    }

    @org.junit.jupiter.api.Test
    void get() {
    }

    @org.junit.jupiter.api.Test
    void containsKey() {
    }

    @org.junit.jupiter.api.Test
    void height() {
        BinarySearchTreeMap map = new BinarySearchTreeMap();

        int res = map.height();
        int exp = 0;

        assertEquals(res, exp);

        map.put("c","1");

        res = map.height();
        exp = 1;

        assertEquals(res, exp);

        map.put("d","w");
        map.put("a","l");

        res = map.height();
        exp = 2;

        assertEquals(res, exp);

        map.put("f","t");
        map.put("g","c");
        map.put("h","t");

        res = map.height();
        exp = 5;

        assertEquals(res, exp);

    }

    @org.junit.jupiter.api.Test
    void keySet() {
        BinarySearchTreeMap map = new BinarySearchTreeMap();

        Set resSet = map.keySet();
        Set<String> testSet = new HashSet<>();
        assertEquals(testSet, resSet);

        map.put("jason","tralee");
        map.put("tim","cork");
        map.put("bob","lim");
        map.put("pat","tralee");
        map.put("bob","cork");
        map.put("joe","tralee");
        map.put("bob","cork");

        testSet.add("bob");
        testSet.add("jason");
        testSet.add("joe");
        testSet.add("pat");
        testSet.add("tim");

        resSet = map.keySet();
        assertEquals(resSet, testSet);

    }

    @org.junit.jupiter.api.Test
    void main() {
    }
}