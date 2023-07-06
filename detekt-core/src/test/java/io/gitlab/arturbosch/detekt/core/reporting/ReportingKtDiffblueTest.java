package io.gitlab.arturbosch.detekt.core.reporting;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import io.gitlab.arturbosch.detekt.api.Config;
import io.gitlab.arturbosch.detekt.core.config.DisabledAutoCorrectConfig;
import io.gitlab.arturbosch.detekt.core.config.YamlConfig;
import java.util.HashMap;
import org.junit.jupiter.api.Test;

class ReportingKtDiffblueTest {
  /**
  * Method under test: {@link ReportingKt#defaultReportMapping(String)}
  */
  @Test
  void testDefaultReportMapping() {
    // Arrange, Act and Assert
    assertEquals("42", ReportingKt.defaultReportMapping("42"));
  }

  /**
   * Method under test: {@link ReportingKt#excludeCorrectable(Config)}
   */
  @Test
  void testExcludeCorrectable() {
    // Arrange, Act and Assert
    assertFalse(
        ReportingKt.excludeCorrectable(new DisabledAutoCorrectConfig(new YamlConfig(new HashMap<>(), "Parent Path"))));
  }
}

