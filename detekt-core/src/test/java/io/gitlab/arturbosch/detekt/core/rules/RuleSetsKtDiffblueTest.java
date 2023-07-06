package io.gitlab.arturbosch.detekt.core.rules;

import static org.junit.jupiter.api.Assertions.assertTrue;
import io.gitlab.arturbosch.detekt.api.Config;
import io.gitlab.arturbosch.detekt.core.config.DisabledAutoCorrectConfig;
import io.gitlab.arturbosch.detekt.core.config.YamlConfig;
import java.util.HashMap;
import org.junit.jupiter.api.Test;

class RuleSetsKtDiffblueTest {
  /**
  * Method under test: {@link RuleSetsKt#isActive(Config)}
  */
  @Test
  void testIsActive() {
    // Arrange, Act and Assert
    assertTrue(RuleSetsKt.isActive(new DisabledAutoCorrectConfig(new YamlConfig(new HashMap<>(), "Parent Path"))));
  }
}

