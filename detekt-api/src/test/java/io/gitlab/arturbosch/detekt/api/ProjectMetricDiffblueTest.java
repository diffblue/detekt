package io.gitlab.arturbosch.detekt.api;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class ProjectMetricDiffblueTest {
  /**
  * Methods under test: 
  * 
  * <ul>
  *   <li>{@link ProjectMetric#ProjectMetric(String, int, int, boolean, int)}
  *   <li>{@link ProjectMetric#getConversionFactor()}
  *   <li>{@link ProjectMetric#getPriority()}
  *   <li>{@link ProjectMetric#getType()}
  *   <li>{@link ProjectMetric#getValue()}
  *   <li>{@link ProjectMetric#isDouble()}
  * </ul>
  */
  @Test
  void testConstructor() {
    // Arrange and Act
    ProjectMetric actualProjectMetric = new ProjectMetric("Type", 42, 1, true, 3);

    // Assert
    assertEquals(3, actualProjectMetric.getConversionFactor());
    assertEquals(1, actualProjectMetric.getPriority());
    assertEquals("Type", actualProjectMetric.getType());
    assertEquals(42, actualProjectMetric.getValue());
    assertTrue(actualProjectMetric.isDouble());
  }

  /**
   * Method under test: {@link ProjectMetric#ProjectMetric(String, int, int, boolean, int)}
   */
  @Test
  void testConstructor2() {
    // Arrange and Act
    ProjectMetric actualProjectMetric = new ProjectMetric("Type", 42, 1, true, 3);

    // Assert
    assertEquals(3, actualProjectMetric.getConversionFactor());
    assertTrue(actualProjectMetric.isDouble());
    assertEquals(42, actualProjectMetric.getValue());
    assertEquals("Type", actualProjectMetric.getType());
    assertEquals(1, actualProjectMetric.getPriority());
  }

  /**
   * Method under test: {@link ProjectMetric#toString()}
   */
  @Test
  void testToString() {
    // Arrange, Act and Assert
    assertEquals("Type: 14.0", (new ProjectMetric("Type", 42, 1, true, 3)).toString());
    assertEquals("Type: 42", (new ProjectMetric("Type", 42, 1, false, 3)).toString());
  }
}

