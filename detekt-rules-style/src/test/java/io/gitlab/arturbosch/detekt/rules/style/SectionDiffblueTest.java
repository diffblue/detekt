package io.gitlab.arturbosch.detekt.rules.style;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

class SectionDiffblueTest {
  /**
   * Method under test: {@link Section#compareTo(Section)}
   */
  @Test
  void testCompareTo() {
    // Arrange
    Section section = new Section(1);

    // Act and Assert
    assertEquals(0, section.compareTo(new Section(1)));
  }

  /**
   * Method under test: {@link Section#compareTo(Section)}
   */
  @Test
  void testCompareTo2() {
    // Arrange
    Section section = new Section(0);

    // Act and Assert
    assertEquals(-1, section.compareTo(new Section(1)));
  }

  /**
   * Method under test: {@link Section#compareTo(Section)}
   */
  @Test
  void testCompareTo3() {
    // Arrange
    Section section = new Section(1);

    // Act and Assert
    assertEquals(1, section.compareTo(new Section(0)));
  }

  /**
  * Methods under test: 
  * 
  * <ul>
  *   <li>{@link Section#Section(int)}
  *   <li>{@link Section#getPriority()}
  * </ul>
  */
  @Test
  void testConstructor() {
    // Arrange, Act and Assert
    assertEquals(1, (new Section(1)).getPriority());
    assertEquals(1, (new Section(1)).getPriority());
    assertThrows(IllegalArgumentException.class, () -> new Section(4));
    assertThrows(IllegalArgumentException.class, () -> new Section(-1));
  }

  /**
   * Method under test: {@link Section#toDescription()}
   */
  @Test
  void testToDescription() {
    // Arrange, Act and Assert
    assertEquals("secondary constructors", (new Section(1)).toDescription());
    assertEquals("method declarations", (new Section(2)).toDescription());
    assertEquals("companion object", (new Section(3)).toDescription());
    assertEquals("property declarations and initializer blocks", (new Section(0)).toDescription());
  }
}

