package io.gitlab.arturbosch.detekt.api;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.Test;

class SourceLocationDiffblueTest {
  /**
   * Method under test: {@link SourceLocation#component1()}
   */
  @Test
  void testComponent1() {
    // Arrange, Act and Assert
    assertEquals(2, (new SourceLocation(2, 1)).component1());
  }

  /**
   * Method under test: {@link SourceLocation#component2()}
   */
  @Test
  void testComponent2() {
    // Arrange, Act and Assert
    assertEquals(1, (new SourceLocation(2, 1)).component2());
  }

  /**
  * Methods under test: 
  * 
  * <ul>
  *   <li>{@link SourceLocation#SourceLocation(int, int)}
  *   <li>{@link SourceLocation#toString()}
  *   <li>{@link SourceLocation#getColumn()}
  *   <li>{@link SourceLocation#getLine()}
  * </ul>
  */
  @Test
  void testConstructor() {
    // Arrange and Act
    SourceLocation actualSourceLocation = new SourceLocation(2, 1);
    String actualToStringResult = actualSourceLocation.toString();

    // Assert
    assertEquals(1, actualSourceLocation.getColumn());
    assertEquals(2, actualSourceLocation.getLine());
    assertEquals("2:1", actualToStringResult);
  }

  /**
   * Method under test: {@link SourceLocation#copy(int, int)}
   */
  @Test
  void testCopy() {
    // Arrange and Act
    SourceLocation actualCopyResult = (new SourceLocation(2, 1)).copy(2, 1);

    // Assert
    assertEquals(2, actualCopyResult.component1());
    assertEquals(1, actualCopyResult.getColumn());
  }

  /**
   * Method under test: {@link SourceLocation#equals(Object)}
   */
  @Test
  void testEquals() {
    // Arrange, Act and Assert
    assertNotEquals(new SourceLocation(2, 1), null);
    assertNotEquals(new SourceLocation(2, 1), "Different type to SourceLocation");
  }

  /**
   * Methods under test: 
   * 
   * <ul>
   *   <li>{@link SourceLocation#equals(Object)}
   *   <li>{@link SourceLocation#hashCode()}
   * </ul>
   */
  @Test
  void testEquals2() {
    // Arrange
    SourceLocation sourceLocation = new SourceLocation(2, 1);

    // Act and Assert
    assertEquals(sourceLocation, sourceLocation);
    int expectedHashCodeResult = sourceLocation.hashCode();
    assertEquals(expectedHashCodeResult, sourceLocation.hashCode());
  }

  /**
   * Methods under test: 
   * 
   * <ul>
   *   <li>{@link SourceLocation#equals(Object)}
   *   <li>{@link SourceLocation#hashCode()}
   * </ul>
   */
  @Test
  void testEquals3() {
    // Arrange
    SourceLocation sourceLocation = new SourceLocation(2, 1);
    SourceLocation sourceLocation2 = new SourceLocation(2, 1);

    // Act and Assert
    assertEquals(sourceLocation, sourceLocation2);
    int expectedHashCodeResult = sourceLocation.hashCode();
    assertEquals(expectedHashCodeResult, sourceLocation2.hashCode());
  }

  /**
   * Method under test: {@link SourceLocation#equals(Object)}
   */
  @Test
  void testEquals4() {
    // Arrange
    SourceLocation sourceLocation = new SourceLocation(1, 1);

    // Act and Assert
    assertNotEquals(sourceLocation, new SourceLocation(2, 1));
  }

  /**
   * Method under test: {@link SourceLocation#equals(Object)}
   */
  @Test
  void testEquals5() {
    // Arrange
    SourceLocation sourceLocation = new SourceLocation(2, 2);

    // Act and Assert
    assertNotEquals(sourceLocation, new SourceLocation(2, 1));
  }
}

