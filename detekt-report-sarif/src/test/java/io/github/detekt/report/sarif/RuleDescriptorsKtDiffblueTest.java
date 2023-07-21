package io.github.detekt.report.sarif;

import static org.junit.jupiter.api.Assertions.assertTrue;
import io.gitlab.arturbosch.detekt.api.Config;
import io.gitlab.arturbosch.detekt.test.TestConfig;
import org.junit.jupiter.api.Test;

class RuleDescriptorsKtDiffblueTest {
  /**
  * Method under test: {@link RuleDescriptorsKt#toReportingDescriptors(Config)}
  */
  @Test
  void testToReportingDescriptors() {
    // Arrange, Act and Assert
    assertTrue(RuleDescriptorsKt.toReportingDescriptors(new TestConfig()).isEmpty());
  }
}

