package io.github.detekt.tooling.api;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;

class InvalidConfigDiffblueTest {
  /**
  * Method under test: {@link InvalidConfig#InvalidConfig(String)}
  */
  @Test
  void testConstructor() {
    // Arrange and Act
    InvalidConfig actualInvalidConfig = new InvalidConfig("Not all who wander are lost");

    // Assert
    assertNull(actualInvalidConfig.getCause());
    assertEquals(0, actualInvalidConfig.getSuppressed().length);
    assertEquals("Not all who wander are lost", actualInvalidConfig.getMessage());
    assertEquals("Not all who wander are lost", actualInvalidConfig.getLocalizedMessage());
  }
}

