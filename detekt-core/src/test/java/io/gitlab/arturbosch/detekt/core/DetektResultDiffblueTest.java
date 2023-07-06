package io.gitlab.arturbosch.detekt.core;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import io.gitlab.arturbosch.detekt.api.Finding;
import io.gitlab.arturbosch.detekt.api.Notification;
import io.gitlab.arturbosch.detekt.api.ProjectMetric;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;

class DetektResultDiffblueTest {
  /**
  * Methods under test: 
  * 
  * <ul>
  *   <li>{@link DetektResult#DetektResult(Map)}
  *   <li>{@link DetektResult#toString()}
  *   <li>{@link DetektResult#getFindings()}
  *   <li>{@link DetektResult#getNotifications()}
  *   <li>{@link DetektResult#getMetrics()}
  * </ul>
  */
  @Test
  void testConstructor() {
    // Arrange and Act
    DetektResult actualDetektResult = new DetektResult(new HashMap<>());
    String actualToStringResult = actualDetektResult.toString();

    // Assert
    Map<String, List<Finding>> expectedFindings = actualDetektResult.component1();
    assertSame(expectedFindings, actualDetektResult.getFindings());
    Collection<Notification> expectedMetrics = actualDetektResult.getNotifications();
    assertEquals(expectedMetrics, actualDetektResult.getMetrics());
    assertEquals("DetektResult(findings={})", actualToStringResult);
  }

  /**
   * Method under test: {@link DetektResult#DetektResult(Map)}
   */
  @Test
  void testConstructor2() {
    // Arrange and Act
    DetektResult actualDetektResult = new DetektResult(new HashMap<>());

    // Assert
    assertTrue(actualDetektResult.component1().isEmpty());
    Collection<Notification> notifications = actualDetektResult.getNotifications();
    assertTrue(notifications.isEmpty());
    assertEquals(notifications, actualDetektResult.getMetrics());
  }
}

