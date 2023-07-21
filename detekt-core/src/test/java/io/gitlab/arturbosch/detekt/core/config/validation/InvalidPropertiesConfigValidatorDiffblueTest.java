package io.gitlab.arturbosch.detekt.core.config.validation;

import static org.junit.jupiter.api.Assertions.assertTrue;
import io.gitlab.arturbosch.detekt.core.config.YamlConfig;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import kotlin.text.Regex;
import org.junit.jupiter.api.Test;

class InvalidPropertiesConfigValidatorDiffblueTest {
  /**
  * Method under test: {@link InvalidPropertiesConfigValidator#InvalidPropertiesConfigValidator(YamlConfig, Set, Set)}
  */
  @Test
  void testConstructor() {
    // Arrange
    YamlConfig baseline = new YamlConfig(new HashMap<>(), "Parent Path");

    HashSet<String> deprecatedProperties = new HashSet<>();
    HashSet<Regex> excludePatterns = new HashSet<>();

    // Act
    new InvalidPropertiesConfigValidator(baseline, deprecatedProperties, excludePatterns);

    // Assert
    assertTrue(deprecatedProperties.isEmpty());
    assertTrue(excludePatterns.isEmpty());
  }

  /**
   * Method under test: {@link InvalidPropertiesConfigValidator#validate(YamlConfig, ValidationSettings)}
   */
  @Test
  void testValidate() {
    // Arrange
    YamlConfig baseline = new YamlConfig(new HashMap<>(), "Parent Path");

    HashSet<String> deprecatedProperties = new HashSet<>();
    InvalidPropertiesConfigValidator invalidPropertiesConfigValidator = new InvalidPropertiesConfigValidator(baseline,
        deprecatedProperties, new HashSet<>());
    YamlConfig configToValidate = new YamlConfig(new HashMap<>(), "Parent Path");

    // Act and Assert
    assertTrue(invalidPropertiesConfigValidator.validate(configToValidate, new ValidationSettings()).isEmpty());
  }
}

