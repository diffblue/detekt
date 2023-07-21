package io.gitlab.arturbosch.detekt.api;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.Test;

class ValueWithReasonDiffblueTest {
  /**
   * Method under test: {@link ValueWithReason#component1()}
   */
  @Test
  void testComponent1() {
    // Arrange, Act and Assert
    assertEquals("42", (new ValueWithReason("42", "Just cause")).component1());
  }

  /**
   * Method under test: {@link ValueWithReason#component2()}
   */
  @Test
  void testComponent2() {
    // Arrange, Act and Assert
    assertEquals("Just cause", (new ValueWithReason("42", "Just cause")).component2());
  }

  /**
  * Methods under test: 
  * 
  * <ul>
  *   <li>{@link ValueWithReason#ValueWithReason(String, String)}
  *   <li>{@link ValueWithReason#toString()}
  *   <li>{@link ValueWithReason#getReason()}
  *   <li>{@link ValueWithReason#getValue()}
  * </ul>
  */
  @Test
  void testConstructor() {
    // Arrange and Act
    ValueWithReason actualValueWithReason = new ValueWithReason("42", "Just cause");
    String actualToStringResult = actualValueWithReason.toString();

    // Assert
    assertEquals("Just cause", actualValueWithReason.getReason());
    assertEquals("42", actualValueWithReason.getValue());
    assertEquals("ValueWithReason(value=42, reason=Just cause)", actualToStringResult);
  }

  /**
   * Method under test: {@link ValueWithReason#ValueWithReason(String, String)}
   */
  @Test
  void testConstructor2() {
    // Arrange and Act
    ValueWithReason actualValueWithReason = new ValueWithReason("42", "Just cause");

    // Assert
    assertEquals("42", actualValueWithReason.component1());
    assertEquals("Just cause", actualValueWithReason.getReason());
  }

  /**
   * Method under test: {@link ValueWithReason#copy(String, String)}
   */
  @Test
  void testCopy() {
    // Arrange and Act
    ValueWithReason actualCopyResult = (new ValueWithReason("42", "Just cause")).copy("42", "Just cause");

    // Assert
    assertEquals("42", actualCopyResult.component1());
    assertEquals("Just cause", actualCopyResult.getReason());
  }

  /**
   * Method under test: {@link ValueWithReason#equals(Object)}
   */
  @Test
  void testEquals() {
    // Arrange, Act and Assert
    assertNotEquals(new ValueWithReason("42", "Just cause"), null);
    assertNotEquals(new ValueWithReason("42", "Just cause"), "Different type to ValueWithReason");
  }

  /**
   * Methods under test: 
   * 
   * <ul>
   *   <li>{@link ValueWithReason#equals(Object)}
   *   <li>{@link ValueWithReason#hashCode()}
   * </ul>
   */
  @Test
  void testEquals2() {
    // Arrange
    ValueWithReason valueWithReason = new ValueWithReason("42", "Just cause");

    // Act and Assert
    assertEquals(valueWithReason, valueWithReason);
    int expectedHashCodeResult = valueWithReason.hashCode();
    assertEquals(expectedHashCodeResult, valueWithReason.hashCode());
  }

  /**
   * Methods under test: 
   * 
   * <ul>
   *   <li>{@link ValueWithReason#equals(Object)}
   *   <li>{@link ValueWithReason#hashCode()}
   * </ul>
   */
  @Test
  void testEquals3() {
    // Arrange
    ValueWithReason valueWithReason = new ValueWithReason("42", "Just cause");
    ValueWithReason valueWithReason2 = new ValueWithReason("42", "Just cause");

    // Act and Assert
    assertEquals(valueWithReason, valueWithReason2);
    int expectedHashCodeResult = valueWithReason.hashCode();
    assertEquals(expectedHashCodeResult, valueWithReason2.hashCode());
  }

  /**
   * Method under test: {@link ValueWithReason#equals(Object)}
   */
  @Test
  void testEquals4() {
    // Arrange
    ValueWithReason valueWithReason = new ValueWithReason("Value", "Just cause");

    // Act and Assert
    assertNotEquals(valueWithReason, new ValueWithReason("42", "Just cause"));
  }

  /**
   * Method under test: {@link ValueWithReason#equals(Object)}
   */
  @Test
  void testEquals5() {
    // Arrange
    ValueWithReason valueWithReason = new ValueWithReason("42", "Reason");

    // Act and Assert
    assertNotEquals(valueWithReason, new ValueWithReason("42", "Just cause"));
  }
}

