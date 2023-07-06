package io.gitlab.arturbosch.detekt.api.internal;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import io.gitlab.arturbosch.detekt.api.Config;
import io.gitlab.arturbosch.detekt.test.TestConfig;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class PathFiltersKtDiffblueTest {
  /**
  * Method under test: {@link PathFiltersKt#createPathFilters(Config)}
  */
  @Test
  void testCreatePathFilters() {
    // Arrange, Act and Assert
    assertNull(PathFiltersKt.createPathFilters(new TestConfig()));
  }

  /**
   * Method under test: {@link PathFiltersKt#valueOrDefaultCommaSeparated(Config, String, List)}
   */
  @Test
  void testValueOrDefaultCommaSeparated() {
    // Arrange
    TestConfig $this$valueOrDefaultCommaSeparated = new TestConfig();

    // Act and Assert
    assertTrue(PathFiltersKt.valueOrDefaultCommaSeparated($this$valueOrDefaultCommaSeparated, "foo", new ArrayList<>())
        .isEmpty());
  }
}

