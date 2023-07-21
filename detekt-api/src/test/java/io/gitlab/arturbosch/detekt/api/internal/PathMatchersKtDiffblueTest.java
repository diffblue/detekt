package io.gitlab.arturbosch.detekt.api.internal;

import static org.junit.jupiter.api.Assertions.assertFalse;
import java.nio.file.Paths;
import org.junit.jupiter.api.Test;

class PathMatchersKtDiffblueTest {
  /**
  * Method under test: {@link PathMatchersKt#pathMatcher(String)}
  */
  @Test
  void testPathMatcher() {
    // Arrange, Act and Assert
    assertFalse(
        PathMatchersKt.pathMatcher("Pattern").matches(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt")));
  }
}

