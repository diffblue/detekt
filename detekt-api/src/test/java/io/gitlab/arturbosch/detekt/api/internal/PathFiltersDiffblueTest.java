package io.gitlab.arturbosch.detekt.api.internal;

import static org.junit.jupiter.api.Assertions.assertTrue;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;
import java.util.HashSet;
import org.junit.jupiter.api.Test;

class PathFiltersDiffblueTest {
  /**
  * Method under test: {@link PathFilters#isIgnored(Path)}
  */
  @Test
  void testIsIgnored() {
    // Arrange
    HashSet<PathMatcher> includes = new HashSet<>();

    // Act and Assert
    assertTrue((new PathFilters(includes, new HashSet<>()))
        .isIgnored(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt")));
  }
}

