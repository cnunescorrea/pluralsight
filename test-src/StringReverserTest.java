public class StringReverserTest {
    @Test
    void testReverse() {
        StringReverser reverser = new StringReverser();

        assertEquals("thgislaurulP", reverser.reverse("Pluralsight"));
    }
}
