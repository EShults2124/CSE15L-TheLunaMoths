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
		String contents = Files.readString(fileName);
		ArrayList<String> links = MarkdownParse.getLinks(contents);
		assertEquals(List.of("https://something.com", "some-page.html"), links);
	}

	@Test
	public void testFile2() throws IOException {
		Path fileName = Path.of("test-file2.md");
		String contents = Files.readString(fileName);
		ArrayList<String> links = MarkdownParse.getLinks(contents);
		assertEquals(new ArrayList<String>(), links);
	}

	@Test
	public void testFile3() throws IOException {
		Path fileName = Path.of("test-file3.md");
		String contents = Files.readString(fileName);
		ArrayList<String> links = MarkdownParse.getLinks(contents);
		assertEquals(List.of("https://validlink.com"), links);
	}

	@Test
	public void testFile4() throws IOException {
		Path fileName = Path.of("test-file4.md");
		String contents = Files.readString(fileName);
		ArrayList<String> links = MarkdownParse.getLinks(contents);
		assertEquals(new ArrayList<String>(), links);
	}

	@Test
	public void testFile5() throws IOException {
		Path fileName = Path.of("test-file5.md");
		String contents = Files.readString(fileName);
		ArrayList<String> links = MarkdownParse.getLinks(contents);
		assertEquals(new ArrayList<String>(), links);
	}

	@Test
	public void testFile6() throws IOException {
		Path fileName = Path.of("test-file6.md");
		String contents = Files.readString(fileName);
		ArrayList<String> links = MarkdownParse.getLinks(contents);
		assertEquals(new ArrayList<String>(), links);
	}

	@Test
	public void testFile7() throws IOException {
		Path fileName = Path.of("test-file7.md");
		String contents = Files.readString(fileName);
		ArrayList<String> links = MarkdownParse.getLinks(contents);
		assertEquals(new ArrayList<String>(), links);
	}

	@Test
	public void testFile8() throws IOException {
		Path fileName = Path.of("test-file8.md");
		String contents = Files.readString(fileName);
		ArrayList<String> links = MarkdownParse.getLinks(contents);
		assertEquals(new ArrayList<String>(), links);
	}

	@Test
	public void testSnippet1() throws IOException {

		String testingFile = "SnippetOne.md";

		Path fileName = Path.of(testingFile);
		String contents = Files.readString(fileName);
		ArrayList<String> validLinks = MarkdownParse.getLinks(contents);

		ArrayList<String> test = new ArrayList<>();
		test.add("`google.com");
		test.add("google.com");
		test.add("ucsd.edu");

		assertTrue(test.equals(validLinks));

	}

	@Test
	public void testSnippet2() throws IOException {

		String testingFile = "SnippetTwo.md";

		Path fileName = Path.of(testingFile);
		String contents = Files.readString(fileName);
		ArrayList<String> validLinks = MarkdownParse.getLinks(contents);

		ArrayList<String> test = new ArrayList<>();
		test.add("a.com");
		test.add("a.com(())");
		test.add("example.com");

		assertTrue(test.equals(validLinks));

	}

	@Test
	public void testSnippet3() throws IOException {

		String testingFile = "SnippetThree.md";

		Path fileName = Path.of(testingFile);
		String contents = Files.readString(fileName);
		ArrayList<String> validLinks = MarkdownParse.getLinks(contents);

		ArrayList<String> test = new ArrayList<>();
		test.add("https://ucsd-cse15l-w22.github.io/");

		assertTrue(test.equals(validLinks));

	}

}
