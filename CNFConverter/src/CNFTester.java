import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CNFTester {
    @Test
    public void nameIsSavedTest() {
        Formula target = new Atom("A");
        String expected = "A";
        String actual = target.getRoot();
        assertEquals(expected, actual);
    }

    @Test
    public void testAnd1() {
        Formula a1 = new Atom("A");
        Formula a2 = new Atom("B");

        Formula target = new And(a1, a2);
        String expected = "AND";
        String actual = target.getRoot();
        assertEquals(expected, actual);
    }

    @Test
    public void testCNFCreation() {
        Formula a1 = new Atom("A");
        Formula a2 = new Atom("B");

        Formula target = new Not(new And(a1, a2));
        String expected = "OR";
        String actual = target.getCNF().getRoot();
        assertEquals(expected, actual);
    }

    @Test
    public void iffCNFTest() {
        Formula target = new Iff(new Atom("A"), new Atom("B"));
        String expected = "AND";
        String actual = target.getCNF().getRoot();

        assertEquals(expected, actual);
    }
}