package io.gitlab.arturbosch.detekt.core;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import io.gitlab.arturbosch.detekt.api.Notification;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.junit.jupiter.api.Test;

class ModificationNotificationDiffblueTest {
  /**
  * Methods under test: 
  * 
  * <ul>
  *   <li>{@link ModificationNotification#ModificationNotification(Path)}
  *   <li>{@link ModificationNotification#toString()}
  *   <li>{@link ModificationNotification#getLevel()}
  *   <li>{@link ModificationNotification#getMessage()}
  * </ul>
  */
  @Test
  void testConstructor() {
    // Arrange and Act
    ModificationNotification actualModificationNotification = new ModificationNotification(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));
    String actualToStringResult = actualModificationNotification.toString();

    // Assert
    assertEquals(Notification.Level.Info, actualModificationNotification.getLevel());
    String expectedMessage = String.join("", "File ",
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toString(), " was modified.");
    assertEquals(expectedMessage, actualModificationNotification.getMessage());
    assertEquals(String.join("", "File ", Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toString(),
        " was modified."), actualToStringResult);
  }

  /**
   * Method under test: {@link ModificationNotification#ModificationNotification(Path)}
   */
  @Test
  void testConstructor2() {
    // Arrange and Act
    ModificationNotification actualModificationNotification = new ModificationNotification(
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));

    // Assert
    assertEquals(Notification.Level.Info, actualModificationNotification.getLevel());
    String expectedMessage = String.join("", "File ",
        Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toString(), " was modified.");
    assertEquals(expectedMessage, actualModificationNotification.getMessage());
  }

  /**
   * Method under test: {@link ModificationNotification#isError()}
   */
  @Test
  void testIsError() {
    // Arrange, Act and Assert
    assertFalse((new ModificationNotification(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"))).isError());
  }
}

