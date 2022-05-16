import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class DVDTest {
	@Test
	void main() {
		ArrayList<String> sc = new ArrayList<String>();
		sc.add("a");
		sc.add("b");
		sc.add("c");
		sc.add("d");

		assertEquals("DVD1", new DVD("DVD1", 30, sc, "category").getTitle());
		assertEquals(30, new DVD("DVD1", 30, sc, "category").getRuntime());
		assertEquals("VHS3", new VHS("VHS3", 90, sc, 0, "category").getTitle());
		assertEquals(90, new VHS("VHS3", 90, sc, 0, "category").getRuntime());
		assertEquals(0, new VHS("VHS3", 90, sc, 0, "category").getCurrentTime());
		VHS ob = new VHS("VHS3", 90, sc, 0, "category");
		ob.play();
		assertEquals(1, ob.getCurrentTime());
		ob.rewind();
		assertEquals(0, ob.getCurrentTime());
		ob.play();
		ob.play();
		ob.play();
		ob.play();

		assertEquals(0, ob.getCurrentTime());

	}

}
