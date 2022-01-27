import static org.junit.Assert.*;
import org.junit.*;

import java.util.*;
import java.io.IOException;
import java.nio.file.*;

public class MarkdownParseTest {
	@Test
	public void addition() {
		assertEquals(2, 1 + 1);
	}

	@Test
	public void testFile() throws IOException {
		Path fileName = Path.of("test-file.md");
		String contents = "";
		contents = Files.readString(fileName);
		ArrayList<String> links = MarkdownParse.getLinks(contents);
		assertEquals(List.of("https://something.com", "some-page.html"), links);
	}
}
