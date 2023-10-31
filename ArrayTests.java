import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test 
	public void testReverseInPlace1() {
    int[] input1 = {1,2,3,4,5,6,7,8,9};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{9,8,7,6,5,4,3,2,1}, input1);
	}

    @Test
  public void testReversed1() {
    int[] input1 = {1,2,3,4,5,6,7,8,9};
    assertArrayEquals(new int[]{9,8,7,6,5,4,3,2,1}, ArrayExamples.reversed(input1));
  }

  @Test
  public void avgwolowest1() {
    double[] input1 = {1,2,3,4,5,6,7,8,9};
    assertEquals(5.5, ArrayExamples.averageWithoutLowest(input1),0);
  }
  @Test
  public void avgwolowest2() {
    double[] input1 = {1,2};
    assertEquals(2, ArrayExamples.averageWithoutLowest(input1),0);
  }
  @Test
  public void avgwolowest3() {
    double[] input1 = {2};
    assertEquals(0, ArrayExamples.averageWithoutLowest(input1),0);
  }
  @Test
  public void avgwolowest4() {
    double[] input1 = {1.5,3.2,6.6,8.4,2,9,7.7};
    assertEquals(6.15, ArrayExamples.averageWithoutLowest(input1),0.01);
  }
  @Test
  public void avgwolowest5() {
    double[] input1 = {2,2,4,4,5};
    assertEquals(3.75, ArrayExamples.averageWithoutLowest(input1),0.01);
  }
}

