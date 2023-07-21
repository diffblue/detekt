package io.gitlab.arturbosch.detekt.core.config.validation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import io.gitlab.arturbosch.detekt.api.Config;
import io.gitlab.arturbosch.detekt.core.config.DisabledAutoCorrectConfig;
import io.gitlab.arturbosch.detekt.core.config.YamlConfig;
import java.util.HashMap;
import org.junit.jupiter.api.Test;

class AbstractYamlConfigValidatorDiffblueTest {
  /**
  * Method under test: {@link AbstractYamlConfigValidator#getId()}
  */
  @Test
  void testGetId() {
    // Arrange, Act and Assert
    assertEquals("DeprecatedPropertiesConfigValidator",
        (new DeprecatedPropertiesConfigValidator(new HashMap<>())).getId());
  }

  /**
   * Method under test: {@link AbstractYamlConfigValidator#getPriority()}
   */
  @Test
  void testGetPriority() {
    // Arrange, Act and Assert
    assertEquals(-1, (new DeprecatedPropertiesConfigValidator(new HashMap<>())).getPriority());
  }

  /**
   * Method under test: {@link AbstractYamlConfigValidator#validate(Config)}
   */
  @Test
  void testValidate() {
    // Arrange
    DeprecatedPropertiesConfigValidator deprecatedPropertiesConfigValidator = new DeprecatedPropertiesConfigValidator(
        new HashMap<>());

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> deprecatedPropertiesConfigValidator
        .validate(new DisabledAutoCorrectConfig(new YamlConfig(new HashMap<>(), "Parent Path"))));
  }
}

