package io.gitlab.arturbosch.detekt.core.baseline;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import io.github.detekt.tooling.api.Baseline;
import io.gitlab.arturbosch.detekt.api.Detektion;
import io.gitlab.arturbosch.detekt.api.Notification;
import io.gitlab.arturbosch.detekt.api.ProjectMetric;
import io.gitlab.arturbosch.detekt.api.internal.SimpleNotification;
import io.gitlab.arturbosch.detekt.core.DelegatingResult;
import io.gitlab.arturbosch.detekt.core.DetektResult;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import org.junit.jupiter.api.Test;

class BaselineFilteredResultDiffblueTest {
  /**
   * Method under test: {@link BaselineFilteredResult#add(Notification)}
   */
  @Test
  void testAdd() {
    // Arrange
    DetektResult result = new DetektResult(new HashMap<>());
    HashSet<String> manuallySuppressedIssues = new HashSet<>();
    BaselineFilteredResult baselineFilteredResult = new BaselineFilteredResult(result,
        new DefaultBaseline(manuallySuppressedIssues, new HashSet<>()));

    // Act
    baselineFilteredResult.add(new SimpleNotification("Not all who wander are lost", Notification.Level.Info));

    // Assert
    assertEquals(1, baselineFilteredResult.getNotifications().size());
  }

  /**
   * Method under test: {@link BaselineFilteredResult#add(Notification)}
   */
  @Test
  void testAdd2() {
    // Arrange
    DetektResult result = new DetektResult(new HashMap<>());
    HashSet<String> manuallySuppressedIssues = new HashSet<>();
    BaselineFilteredResult result2 = new BaselineFilteredResult(result,
        new DefaultBaseline(manuallySuppressedIssues, new HashSet<>()));

    HashSet<String> manuallySuppressedIssues2 = new HashSet<>();
    BaselineFilteredResult baselineFilteredResult = new BaselineFilteredResult(result2,
        new DefaultBaseline(manuallySuppressedIssues2, new HashSet<>()));

    // Act
    baselineFilteredResult.add(new SimpleNotification("Not all who wander are lost", Notification.Level.Info));

    // Assert
    assertEquals(1, baselineFilteredResult.getNotifications().size());
  }

  /**
   * Method under test: {@link BaselineFilteredResult#add(Notification)}
   */
  @Test
  void testAdd3() {
    // Arrange
    DetektResult result = new DetektResult(new HashMap<>());
    DelegatingResult result2 = new DelegatingResult(result, new HashMap<>());

    HashSet<String> manuallySuppressedIssues = new HashSet<>();
    BaselineFilteredResult baselineFilteredResult = new BaselineFilteredResult(result2,
        new DefaultBaseline(manuallySuppressedIssues, new HashSet<>()));

    // Act
    baselineFilteredResult.add(new SimpleNotification("Not all who wander are lost", Notification.Level.Info));

    // Assert
    assertEquals(1, baselineFilteredResult.getNotifications().size());
  }

  /**
   * Method under test: {@link BaselineFilteredResult#add(ProjectMetric)}
   */
  @Test
  void testAdd4() {
    // Arrange
    DetektResult result = new DetektResult(new HashMap<>());
    HashSet<String> manuallySuppressedIssues = new HashSet<>();
    BaselineFilteredResult baselineFilteredResult = new BaselineFilteredResult(result,
        new DefaultBaseline(manuallySuppressedIssues, new HashSet<>()));

    // Act
    baselineFilteredResult.add(new ProjectMetric("Type", 42, 1, true, 3));

    // Assert
    assertEquals(1, baselineFilteredResult.getMetrics().size());
  }

  /**
   * Method under test: {@link BaselineFilteredResult#add(ProjectMetric)}
   */
  @Test
  void testAdd5() {
    // Arrange
    DetektResult result = new DetektResult(new HashMap<>());
    HashSet<String> manuallySuppressedIssues = new HashSet<>();
    BaselineFilteredResult result2 = new BaselineFilteredResult(result,
        new DefaultBaseline(manuallySuppressedIssues, new HashSet<>()));

    HashSet<String> manuallySuppressedIssues2 = new HashSet<>();
    BaselineFilteredResult baselineFilteredResult = new BaselineFilteredResult(result2,
        new DefaultBaseline(manuallySuppressedIssues2, new HashSet<>()));

    // Act
    baselineFilteredResult.add(new ProjectMetric("Type", 42, 1, true, 3));

    // Assert
    assertEquals(1, baselineFilteredResult.getMetrics().size());
  }

  /**
   * Method under test: {@link BaselineFilteredResult#add(ProjectMetric)}
   */
  @Test
  void testAdd6() {
    // Arrange
    DetektResult result = new DetektResult(new HashMap<>());
    DelegatingResult result2 = new DelegatingResult(result, new HashMap<>());

    HashSet<String> manuallySuppressedIssues = new HashSet<>();
    BaselineFilteredResult baselineFilteredResult = new BaselineFilteredResult(result2,
        new DefaultBaseline(manuallySuppressedIssues, new HashSet<>()));

    // Act
    baselineFilteredResult.add(new ProjectMetric("Type", 42, 1, true, 3));

    // Assert
    assertEquals(1, baselineFilteredResult.getMetrics().size());
  }

  /**
  * Methods under test: 
  * 
  * <ul>
  *   <li>{@link BaselineFilteredResult#BaselineFilteredResult(Detektion, Baseline)}
  *   <li>{@link BaselineFilteredResult#getFindings()}
  * </ul>
  */
  @Test
  void testConstructor() {
    // Arrange
    DetektResult result = new DetektResult(new HashMap<>());
    HashSet<String> manuallySuppressedIssues = new HashSet<>();

    // Act
    BaselineFilteredResult actualBaselineFilteredResult = new BaselineFilteredResult(result,
        new DefaultBaseline(manuallySuppressedIssues, new HashSet<>()));

    // Assert
    assertTrue(actualBaselineFilteredResult.getFindings().isEmpty());
    Collection<Notification> notifications = actualBaselineFilteredResult.getNotifications();
    assertTrue(notifications.isEmpty());
    Collection<ProjectMetric> metrics = actualBaselineFilteredResult.getMetrics();
    assertEquals(notifications, metrics);
    assertTrue(metrics.isEmpty());
  }

  /**
   * Method under test: {@link BaselineFilteredResult#getMetrics()}
   */
  @Test
  void testGetMetrics() {
    // Arrange
    DetektResult result = new DetektResult(new HashMap<>());
    HashSet<String> manuallySuppressedIssues = new HashSet<>();

    // Act and Assert
    assertTrue((new BaselineFilteredResult(result, new DefaultBaseline(manuallySuppressedIssues, new HashSet<>())))
        .getMetrics()
        .isEmpty());
  }

  /**
   * Method under test: {@link BaselineFilteredResult#getMetrics()}
   */
  @Test
  void testGetMetrics2() {
    // Arrange
    DetektResult result = new DetektResult(new HashMap<>());
    HashSet<String> manuallySuppressedIssues = new HashSet<>();
    BaselineFilteredResult result2 = new BaselineFilteredResult(result,
        new DefaultBaseline(manuallySuppressedIssues, new HashSet<>()));

    HashSet<String> manuallySuppressedIssues2 = new HashSet<>();

    // Act and Assert
    assertTrue((new BaselineFilteredResult(result2, new DefaultBaseline(manuallySuppressedIssues2, new HashSet<>())))
        .getMetrics()
        .isEmpty());
  }

  /**
   * Method under test: {@link BaselineFilteredResult#getNotifications()}
   */
  @Test
  void testGetNotifications() {
    // Arrange
    DetektResult result = new DetektResult(new HashMap<>());
    HashSet<String> manuallySuppressedIssues = new HashSet<>();

    // Act and Assert
    assertTrue((new BaselineFilteredResult(result, new DefaultBaseline(manuallySuppressedIssues, new HashSet<>())))
        .getNotifications()
        .isEmpty());
  }

  /**
   * Method under test: {@link BaselineFilteredResult#getNotifications()}
   */
  @Test
  void testGetNotifications2() {
    // Arrange
    DetektResult result = new DetektResult(new HashMap<>());
    HashSet<String> manuallySuppressedIssues = new HashSet<>();
    BaselineFilteredResult result2 = new BaselineFilteredResult(result,
        new DefaultBaseline(manuallySuppressedIssues, new HashSet<>()));

    HashSet<String> manuallySuppressedIssues2 = new HashSet<>();

    // Act and Assert
    assertTrue((new BaselineFilteredResult(result2, new DefaultBaseline(manuallySuppressedIssues2, new HashSet<>())))
        .getNotifications()
        .isEmpty());
  }
}

