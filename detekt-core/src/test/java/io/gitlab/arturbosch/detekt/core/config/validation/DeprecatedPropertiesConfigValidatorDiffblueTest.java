package io.gitlab.arturbosch.detekt.core.config.validation;

import static org.junit.jupiter.api.Assertions.assertTrue;
import io.gitlab.arturbosch.detekt.core.config.YamlConfig;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;

class DeprecatedPropertiesConfigValidatorDiffblueTest {
  /**
  * Method under test: {@link DeprecatedPropertiesConfigValidator#DeprecatedPropertiesConfigValidator(Map)}
  */
  @Test
  void testConstructor() {
    // Arrange
    HashMap<String, String> deprecatedProperties = new HashMap<>();

    // Act
    new DeprecatedPropertiesConfigValidator(deprecatedProperties);

    // Assert
    assertTrue(deprecatedProperties.isEmpty());
  }

  /**
   * Method under test: {@link DeprecatedPropertiesConfigValidator#validate(YamlConfig, ValidationSettings)}
   */
  @Test
  void testValidate() {
    // Arrange
    DeprecatedPropertiesConfigValidator deprecatedPropertiesConfigValidator = new DeprecatedPropertiesConfigValidator(
        new HashMap<>());
    YamlConfig configToValidate = new YamlConfig(new HashMap<>(), "Parent Path");

    // Act and Assert
    assertTrue(deprecatedPropertiesConfigValidator.validate(configToValidate, new ValidationSettings()).isEmpty());
  }

  /**
   * Method under test: {@link DeprecatedPropertiesConfigValidator#validate(YamlConfig, ValidationSettings)}
   */
  @Test
  void testValidate2() {
    // Arrange
    HashMap<String, String> deprecatedProperties = new HashMap<>();
    deprecatedProperties.put("configToValidate", "configToValidate");
    DeprecatedPropertiesConfigValidator deprecatedPropertiesConfigValidator = new DeprecatedPropertiesConfigValidator(
        deprecatedProperties);
    YamlConfig configToValidate = new YamlConfig(new HashMap<>(), "Parent Path");

    // Act and Assert
    assertTrue(deprecatedPropertiesConfigValidator.validate(configToValidate, new ValidationSettings()).isEmpty());
  }

  /**
   * Method under test: {@link DeprecatedPropertiesConfigValidator#validate(YamlConfig, ValidationSettings)}
   */
  @Test
  void testValidate3() {
    // Arrange
    HashMap<String, String> deprecatedProperties = new HashMap<>();
    deprecatedProperties.put(">", "configToValidate");
    DeprecatedPropertiesConfigValidator deprecatedPropertiesConfigValidator = new DeprecatedPropertiesConfigValidator(
        deprecatedProperties);
    YamlConfig configToValidate = new YamlConfig(new HashMap<>(), "Parent Path");

    // Act and Assert
    assertTrue(deprecatedPropertiesConfigValidator.validate(configToValidate, new ValidationSettings()).isEmpty());
  }
}

