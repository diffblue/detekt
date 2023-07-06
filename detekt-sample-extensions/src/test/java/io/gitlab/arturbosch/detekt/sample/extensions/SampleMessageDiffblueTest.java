package io.gitlab.arturbosch.detekt.sample.extensions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import io.gitlab.arturbosch.detekt.api.Notification;
import org.junit.jupiter.api.Test;

class SampleMessageDiffblueTest {
  /**
  * Methods under test: 
  * 
  * <ul>
  *   <li>{@link SampleMessage#SampleMessage(String, Notification.Level)}
  *   <li>{@link SampleMessage#getLevel()}
  *   <li>{@link SampleMessage#getMessage()}
  * </ul>
  */
  @Test
  void testConstructor() {
    // Arrange and Act
    SampleMessage actualSampleMessage = new SampleMessage("Not all who wander are lost", Notification.Level.Info);

    // Assert
    assertEquals(Notification.Level.Info, actualSampleMessage.getLevel());
    assertEquals("Not all who wander are lost", actualSampleMessage.getMessage());
  }

  /**
   * Method under test: {@link SampleMessage#SampleMessage(String, Notification.Level)}
   */
  @Test
  void testConstructor2() {
    // Arrange and Act
    SampleMessage actualSampleMessage = new SampleMessage("Not all who wander are lost", Notification.Level.Info);

    // Assert
    assertEquals(Notification.Level.Info, actualSampleMessage.getLevel());
    assertEquals("Not all who wander are lost", actualSampleMessage.getMessage());
  }

  /**
   * Method under test: {@link SampleMessage#isError()}
   */
  @Test
  void testIsError() {
    // Arrange, Act and Assert
    assertFalse((new SampleMessage("Not all who wander are lost", Notification.Level.Info)).isError());
    assertTrue((new SampleMessage("Not all who wander are lost", Notification.Level.Error)).isError());
  }
}

