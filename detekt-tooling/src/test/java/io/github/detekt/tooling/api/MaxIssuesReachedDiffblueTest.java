package io.github.detekt.tooling.api;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;

class MaxIssuesReachedDiffblueTest {
  /**
  * Method under test: {@link MaxIssuesReached#MaxIssuesReached(String)}
  */
  @Test
  void testConstructor() {
    // Arrange and Act
    MaxIssuesReached actualMaxIssuesReached = new MaxIssuesReached("Not all who wander are lost");

    // Assert
    assertNull(actualMaxIssuesReached.getCause());
    assertEquals(0, actualMaxIssuesReached.getSuppressed().length);
    assertEquals("Not all who wander are lost", actualMaxIssuesReached.getMessage());
    assertEquals("Not all who wander are lost", actualMaxIssuesReached.getLocalizedMessage());
  }
}

