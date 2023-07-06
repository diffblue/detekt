package io.gitlab.arturbosch.detekt.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class DetektProgressListenerDiffblueTest {
  /**
  * Method under test: default or parameterless constructor of {@link DetektProgressListener}
  */
  @Test
  void testConstructor() {
    // Arrange and Act
    DetektProgressListener actualDetektProgressListener = new DetektProgressListener();

    // Assert
    assertEquals("DetektProgressListener", actualDetektProgressListener.getId());
    assertEquals(-1, actualDetektProgressListener.getPriority());
  }

  /**
   * Method under test: {@link DetektProgressListener#getId()}
   */
  @Test
  void testGetId() {
    // Arrange, Act and Assert
    assertEquals("DetektProgressListener", (new DetektProgressListener()).getId());
  }

  /**
   * Method under test: {@link DetektProgressListener#getPriority()}
   */
  @Test
  void testGetPriority() {
    // Arrange, Act and Assert
    assertEquals(-1, (new DetektProgressListener()).getPriority());
  }
}

