package io.gitlab.arturbosch.detekt.core.reporting;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.Test;

class ColorDiffblueTest {
  /**
  * Methods under test: 
  * 
  * <ul>
  *   <li>{@link Color#Color(byte)}
  *   <li>{@link Color#toString()}
  * </ul>
  */
  @Test
  void testConstructor() {
    // Arrange, Act and Assert
    assertEquals("Color(value=65)", (new Color((byte) 'A')).toString());
  }

  /**
   * Method under test: {@link Color#copy(byte)}
   */
  @Test
  void testCopy() {
    // Arrange, Act and Assert
    assertEquals("\u001b[65m", (new Color((byte) 'A')).copy((byte) 'A').getEscapeSequence());
  }

  /**
   * Method under test: {@link Color#equals(Object)}
   */
  @Test
  void testEquals() {
    // Arrange, Act and Assert
    assertNotEquals(new Color((byte) 'A'), null);
    assertNotEquals(new Color((byte) 'A'), "Different type to Color");
  }

  /**
   * Methods under test: 
   * 
   * <ul>
   *   <li>{@link Color#equals(Object)}
   *   <li>{@link Color#hashCode()}
   * </ul>
   */
  @Test
  void testEquals2() {
    // Arrange
    Color color = new Color((byte) 'A');

    // Act and Assert
    assertEquals(color, color);
    int expectedHashCodeResult = color.hashCode();
    assertEquals(expectedHashCodeResult, color.hashCode());
  }

  /**
   * Methods under test: 
   * 
   * <ul>
   *   <li>{@link Color#equals(Object)}
   *   <li>{@link Color#hashCode()}
   * </ul>
   */
  @Test
  void testEquals3() {
    // Arrange
    Color color = new Color((byte) 'A');
    Color color2 = new Color((byte) 'A');

    // Act and Assert
    assertEquals(color, color2);
    int expectedHashCodeResult = color.hashCode();
    assertEquals(expectedHashCodeResult, color2.hashCode());
  }

  /**
   * Method under test: {@link Color#equals(Object)}
   */
  @Test
  void testEquals4() {
    // Arrange
    Color color = new Color((byte) 1);

    // Act and Assert
    assertNotEquals(color, new Color((byte) 'A'));
  }

  /**
   * Method under test: {@link Color#getEscapeSequence()}
   */
  @Test
  void testGetEscapeSequence() {
    // Arrange, Act and Assert
    assertEquals("\u001b[65m", (new Color((byte) 'A')).getEscapeSequence());
  }
}

