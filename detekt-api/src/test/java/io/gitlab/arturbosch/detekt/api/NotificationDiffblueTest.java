package io.gitlab.arturbosch.detekt.api;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import io.gitlab.arturbosch.detekt.api.internal.SimpleNotification;
import org.junit.jupiter.api.Test;

class NotificationDiffblueTest {
  /**
  * Method under test: {@link Notification.DefaultImpls#isError(Notification)}
  */
  @Test
  void testDefaultImplsIsError() {
    // Arrange, Act and Assert
    assertFalse(Notification.DefaultImpls
        .isError(new SimpleNotification("Not all who wander are lost", Notification.Level.Info)));
    assertTrue(Notification.DefaultImpls
        .isError(new SimpleNotification("Not all who wander are lost", Notification.Level.Error)));
  }
}

