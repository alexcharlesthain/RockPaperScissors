package testRPS;

import static org.junit.Assert.*

public class TestRPS {
	
	@Test
	public void testPapervRock() {
	assertEquals("Player has won", Paper, testing.get());	
	}

	@Test
	public void testRockvScissor() {
	assertEquals("Player has won", Rock, testing.get());	
	}
	
	@Test
	public void testScissorvPaper() {
	assertEquals("Player has won", Scissor, testing.get());	
	}
	
	@Test
	public void testPapervScissor() {
	assertEquals("Player has lost", Paper, testing.get());
	}
	
	@Test
	public void testScissorvRock() {
	assertEquals("Player has lost", Scissor, testing.get());
	

}}
