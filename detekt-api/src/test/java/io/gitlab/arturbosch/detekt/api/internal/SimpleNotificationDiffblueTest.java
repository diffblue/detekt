package io.gitlab.arturbosch.detekt.api.internal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import io.gitlab.arturbosch.detekt.api.Notification;
import org.junit.jupiter.api.Test;

class SimpleNotificationDiffblueTest {
  /**
   * Method under test: {@link SimpleNotification#component1()}
   */
  @Test
  void testComponent1() {
    // Arrange, Act and Assert
    assertEquals("Not all who wander are lost",
        (new SimpleNotification("Not all who wander are lost", Notification.Level.Info)).component1());
  }

  /**
   * Method under test: {@link SimpleNotification#component2()}
   */
  @Test
  void testComponent2() {
    // Arrange, Act and Assert
    assertEquals(Notification.Level.Info,
        (new SimpleNotification("Not all who wander are lost", Notification.Level.Info)).component2());
  }

  /**
  * Methods under test: 
  * 
  * <ul>
  *   <li>{@link SimpleNotification#SimpleNotification(String, Notification.Level)}
  *   <li>{@link SimpleNotification#toString()}
  *   <li>{@link SimpleNotification#getLevel()}
  *   <li>{@link SimpleNotification#getMessage()}
  * </ul>
  */
  @Test
  void testConstructor() {
    // Arrange and Act
    SimpleNotification actualSimpleNotification = new SimpleNotification("Not all who wander are lost",
        Notification.Level.Info);
    String actualToStringResult = actualSimpleNotification.toString();

    // Assert
    assertEquals(Notification.Level.Info, actualSimpleNotification.getLevel());
    assertEquals("Not all who wander are lost", actualSimpleNotification.getMessage());
    assertEquals("Not all who wander are lost", actualToStringResult);
  }

  /**
   * Method under test: {@link SimpleNotification#SimpleNotification(String, Notification.Level)}
   */
  @Test
  void testConstructor2() {
    // Arrange and Act
    SimpleNotification actualSimpleNotification = new SimpleNotification("Not all who wander are lost",
        Notification.Level.Info);

    // Assert
    assertEquals("Not all who wander are lost", actualSimpleNotification.component1());
    assertEquals(Notification.Level.Info, actualSimpleNotification.getLevel());
  }

  /**
   * Method under test: {@link SimpleNotification#copy(String, Notification.Level)}
   */
  @Test
  void testCopy() {
    // Arrange and Act
    SimpleNotification actualCopyResult = (new SimpleNotification("Not all who wander are lost",
        Notification.Level.Info)).copy("Not all who wander are lost", Notification.Level.Info);

    // Assert
    assertEquals("Not all who wander are lost", actualCopyResult.component1());
    assertEquals(Notification.Level.Info, actualCopyResult.getLevel());
  }

  /**
   * Method under test: {@link SimpleNotification#equals(Object)}
   */
  @Test
  void testEquals() {
    // Arrange, Act and Assert
    assertNotEquals(new SimpleNotification("Not all who wander are lost", Notification.Level.Info), null);
    assertNotEquals(new SimpleNotification("Not all who wander are lost", Notification.Level.Info),
        "Different type to SimpleNotification");
  }

  /**
   * Methods under test: 
   * 
   * <ul>
   *   <li>{@link SimpleNotification#equals(Object)}
   *   <li>{@link SimpleNotification#hashCode()}
   * </ul>
   */
  @Test
  void testEquals2() {
    // Arrange
    SimpleNotification simpleNotification = new SimpleNotification("Not all who wander are lost",
        Notification.Level.Info);

    // Act and Assert
    assertEquals(simpleNotification, simpleNotification);
    int expectedHashCodeResult = simpleNotification.hashCode();
    assertEquals(expectedHashCodeResult, simpleNotification.hashCode());
  }

  /**
   * Methods under test: 
   * 
   * <ul>
   *   <li>{@link SimpleNotification#equals(Object)}
   *   <li>{@link SimpleNotification#hashCode()}
   * </ul>
   */
  @Test
  void testEquals3() {
    // Arrange
    SimpleNotification simpleNotification = new SimpleNotification("Not all who wander are lost",
        Notification.Level.Info);
    SimpleNotification simpleNotification2 = new SimpleNotification("Not all who wander are lost",
        Notification.Level.Info);

    // Act and Assert
    assertEquals(simpleNotification, simpleNotification2);
    int expectedHashCodeResult = simpleNotification.hashCode();
    assertEquals(expectedHashCodeResult, simpleNotification2.hashCode());
  }

  /**
   * Method under test: {@link SimpleNotification#equals(Object)}
   */
  @Test
  void testEquals4() {
    // Arrange
    SimpleNotification simpleNotification = new SimpleNotification("Message", Notification.Level.Info);

    // Act and Assert
    assertNotEquals(simpleNotification, new SimpleNotification("Not all who wander are lost", Notification.Level.Info));
  }

  /**
   * Method under test: {@link SimpleNotification#equals(Object)}
   */
  @Test
  void testEquals5() {
    // Arrange
    SimpleNotification simpleNotification = new SimpleNotification("Not all who wander are lost",
        Notification.Level.Warning);

    // Act and Assert
    assertNotEquals(simpleNotification, new SimpleNotification("Not all who wander are lost", Notification.Level.Info));
  }

  /**
   * Method under test: {@link SimpleNotification#isError()}
   */
  @Test
  void testIsError() {
    // Arrange, Act and Assert
    assertFalse((new SimpleNotification("Not all who wander are lost", Notification.Level.Info)).isError());
    assertTrue((new SimpleNotification("Not all who wander are lost", Notification.Level.Error)).isError());
  }
}

