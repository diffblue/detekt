package io.gitlab.arturbosch.detekt.api;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.Test;

class TextLocationDiffblueTest {
  /**
   * Method under test: {@link TextLocation#component1()}
   */
  @Test
  void testComponent1() {
    // Arrange, Act and Assert
    assertEquals(1, (new TextLocation(1, 3)).component1());
  }

  /**
   * Method under test: {@link TextLocation#component2()}
   */
  @Test
  void testComponent2() {
    // Arrange, Act and Assert
    assertEquals(3, (new TextLocation(1, 3)).component2());
  }

  /**
  * Methods under test: 
  * 
  * <ul>
  *   <li>{@link TextLocation#TextLocation(int, int)}
  *   <li>{@link TextLocation#toString()}
  *   <li>{@link TextLocation#getEnd()}
  *   <li>{@link TextLocation#getStart()}
  * </ul>
  */
  @Test
  void testConstructor() {
    // Arrange and Act
    TextLocation actualTextLocation = new TextLocation(1, 3);
    String actualToStringResult = actualTextLocation.toString();

    // Assert
    assertEquals(3, actualTextLocation.getEnd());
    assertEquals(1, actualTextLocation.getStart());
    assertEquals("1:3", actualToStringResult);
  }

  /**
   * Method under test: {@link TextLocation#copy(int, int)}
   */
  @Test
  void testCopy() {
    // Arrange and Act
    TextLocation actualCopyResult = (new TextLocation(1, 3)).copy(1, 3);

    // Assert
    assertEquals(1, actualCopyResult.component1());
    assertEquals(3, actualCopyResult.getEnd());
  }

  /**
   * Method under test: {@link TextLocation#equals(Object)}
   */
  @Test
  void testEquals() {
    // Arrange, Act and Assert
    assertNotEquals(new TextLocation(1, 3), null);
    assertNotEquals(new TextLocation(1, 3), "Different type to TextLocation");
  }

  /**
   * Methods under test: 
   * 
   * <ul>
   *   <li>{@link TextLocation#equals(Object)}
   *   <li>{@link TextLocation#hashCode()}
   * </ul>
   */
  @Test
  void testEquals2() {
    // Arrange
    TextLocation textLocation = new TextLocation(1, 3);

    // Act and Assert
    assertEquals(textLocation, textLocation);
    int expectedHashCodeResult = textLocation.hashCode();
    assertEquals(expectedHashCodeResult, textLocation.hashCode());
  }

  /**
   * Methods under test: 
   * 
   * <ul>
   *   <li>{@link TextLocation#equals(Object)}
   *   <li>{@link TextLocation#hashCode()}
   * </ul>
   */
  @Test
  void testEquals3() {
    // Arrange
    TextLocation textLocation = new TextLocation(1, 3);
    TextLocation textLocation2 = new TextLocation(1, 3);

    // Act and Assert
    assertEquals(textLocation, textLocation2);
    int expectedHashCodeResult = textLocation.hashCode();
    assertEquals(expectedHashCodeResult, textLocation2.hashCode());
  }

  /**
   * Method under test: {@link TextLocation#equals(Object)}
   */
  @Test
  void testEquals4() {
    // Arrange
    TextLocation textLocation = new TextLocation(3, 3);

    // Act and Assert
    assertNotEquals(textLocation, new TextLocation(1, 3));
  }

  /**
   * Method under test: {@link TextLocation#equals(Object)}
   */
  @Test
  void testEquals5() {
    // Arrange
    TextLocation textLocation = new TextLocation(1, 1);

    // Act and Assert
    assertNotEquals(textLocation, new TextLocation(1, 3));
  }
}

