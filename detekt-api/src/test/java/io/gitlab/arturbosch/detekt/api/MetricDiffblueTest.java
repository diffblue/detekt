package io.gitlab.arturbosch.detekt.api;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class MetricDiffblueTest {
  /**
   * Method under test: {@link Metric#component1()}
   */
  @Test
  void testComponent1() {
    // Arrange, Act and Assert
    assertEquals("Type", (new Metric("Type", 10.0d, 10.0d, 3)).component1());
  }

  /**
   * Method under test: {@link Metric#component2()}
   */
  @Test
  void testComponent2() {
    // Arrange, Act and Assert
    assertEquals(30, (new Metric("Type", 10.0d, 10.0d, 3)).component2());
  }

  /**
   * Method under test: {@link Metric#component3()}
   */
  @Test
  void testComponent3() {
    // Arrange, Act and Assert
    assertEquals(30, (new Metric("Type", 10.0d, 10.0d, 3)).component3());
  }

  /**
   * Method under test: {@link Metric#component4()}
   */
  @Test
  void testComponent4() {
    // Arrange, Act and Assert
    assertTrue((new Metric("Type", 10.0d, 10.0d, 3)).component4());
    assertFalse((new Metric("Type", 42, 3, false, 3)).component4());
  }

  /**
   * Method under test: {@link Metric#component5()}
   */
  @Test
  void testComponent5() {
    // Arrange, Act and Assert
    assertEquals(3, (new Metric("Type", 10.0d, 10.0d, 3)).component5());
  }

  /**
  * Methods under test: 
  * 
  * <ul>
  *   <li>{@link Metric#Metric(String, double, double, int)}
  *   <li>{@link Metric#getConversionFactor()}
  *   <li>{@link Metric#getThreshold()}
  *   <li>{@link Metric#getType()}
  *   <li>{@link Metric#getValue()}
  *   <li>{@link Metric#isDouble()}
  * </ul>
  */
  @Test
  void testConstructor() {
    // Arrange and Act
    Metric actualMetric = new Metric("Type", 10.0d, 10.0d, 3);

    // Assert
    assertEquals(3, actualMetric.getConversionFactor());
    assertEquals(30, actualMetric.getThreshold());
    assertEquals("Type", actualMetric.getType());
    assertEquals(30, actualMetric.getValue());
    assertTrue(actualMetric.isDouble());
  }

  /**
   * Method under test: {@link Metric#Metric(String, double, double, int)}
   */
  @Test
  void testConstructor2() {
    // Arrange and Act
    Metric actualMetric = new Metric("Type", 10.0d, 10.0d, 3);

    // Assert
    assertEquals("Type", actualMetric.component1());
    assertTrue(actualMetric.isDouble());
    assertEquals(30, actualMetric.getValue());
    assertEquals(30, actualMetric.getThreshold());
    assertEquals(3, actualMetric.getConversionFactor());
  }

  /**
   * Method under test: {@link Metric#Metric(String, int, int, boolean, int)}
   */
  @Test
  void testConstructor3() {
    // Arrange and Act
    Metric actualMetric = new Metric("Type", 42, 1, true, 3);

    // Assert
    assertEquals("Type", actualMetric.component1());
    assertTrue(actualMetric.isDouble());
    assertEquals(42, actualMetric.getValue());
    assertEquals(1, actualMetric.getThreshold());
    assertEquals(3, actualMetric.getConversionFactor());
  }

  /**
   * Method under test: {@link Metric#copy(String, int, int, boolean, int)}
   */
  @Test
  void testCopy() {
    // Arrange and Act
    Metric actualCopyResult = (new Metric("Type", 10.0d, 10.0d, 3)).copy("Type", 42, 1, true, 3);

    // Assert
    assertEquals("Type", actualCopyResult.component1());
    assertTrue(actualCopyResult.isDouble());
    assertEquals(42, actualCopyResult.getValue());
    assertEquals(1, actualCopyResult.getThreshold());
    assertEquals(3, actualCopyResult.getConversionFactor());
  }

  /**
   * Method under test: {@link Metric#doubleThreshold()}
   */
  @Test
  void testDoubleThreshold() {
    // Arrange, Act and Assert
    assertEquals(10.0d, (new Metric("Type", 10.0d, 10.0d, 3)).doubleThreshold());
    assertThrows(IllegalStateException.class, () -> (new Metric("Type", 42, 1, false, 3)).doubleThreshold());
  }

  /**
   * Method under test: {@link Metric#doubleValue()}
   */
  @Test
  void testDoubleValue() {
    // Arrange, Act and Assert
    assertEquals(10.0d, (new Metric("Type", 10.0d, 10.0d, 3)).doubleValue());
    assertThrows(IllegalStateException.class, () -> (new Metric("Type", 42, 1, false, 3)).doubleValue());
  }

  /**
   * Method under test: {@link Metric#equals(Object)}
   */
  @Test
  void testEquals() {
    // Arrange, Act and Assert
    assertNotEquals(new Metric("Type", 10.0d, 10.0d, 3), null);
    assertNotEquals(new Metric("Type", 10.0d, 10.0d, 3), "Different type to Metric");
  }

  /**
   * Methods under test: 
   * 
   * <ul>
   *   <li>{@link Metric#equals(Object)}
   *   <li>{@link Metric#hashCode()}
   * </ul>
   */
  @Test
  void testEquals2() {
    // Arrange
    Metric metric = new Metric("Type", 10.0d, 10.0d, 3);

    // Act and Assert
    assertEquals(metric, metric);
    int expectedHashCodeResult = metric.hashCode();
    assertEquals(expectedHashCodeResult, metric.hashCode());
  }

  /**
   * Methods under test: 
   * 
   * <ul>
   *   <li>{@link Metric#equals(Object)}
   *   <li>{@link Metric#hashCode()}
   * </ul>
   */
  @Test
  void testEquals3() {
    // Arrange
    Metric metric = new Metric("Type", 10.0d, 10.0d, 3);
    Metric metric2 = new Metric("Type", 10.0d, 10.0d, 3);

    // Act and Assert
    assertEquals(metric, metric2);
    int expectedHashCodeResult = metric.hashCode();
    assertEquals(expectedHashCodeResult, metric2.hashCode());
  }

  /**
   * Method under test: {@link Metric#equals(Object)}
   */
  @Test
  void testEquals4() {
    // Arrange
    Metric metric = new Metric("io.gitlab.arturbosch.detekt.api.Metric", 10.0d, 10.0d, 3);

    // Act and Assert
    assertNotEquals(metric, new Metric("Type", 10.0d, 10.0d, 3));
  }

  /**
   * Method under test: {@link Metric#equals(Object)}
   */
  @Test
  void testEquals5() {
    // Arrange
    Metric metric = new Metric("Type", 0.5d, 10.0d, 3);

    // Act and Assert
    assertNotEquals(metric, new Metric("Type", 10.0d, 10.0d, 3));
  }

  /**
   * Method under test: {@link Metric#equals(Object)}
   */
  @Test
  void testEquals6() {
    // Arrange
    Metric metric = new Metric("Type", 10.0d, 0.5d, 3);

    // Act and Assert
    assertNotEquals(metric, new Metric("Type", 10.0d, 10.0d, 3));
  }

  /**
   * Method under test: {@link Metric#toString()}
   */
  @Test
  void testToString() {
    // Arrange, Act and Assert
    assertEquals("10.0/10.0", (new Metric("Type", 10.0d, 10.0d, 3)).toString());
    assertEquals("42/1", (new Metric("Type", 42, 1, false, 3)).toString());
  }
}

