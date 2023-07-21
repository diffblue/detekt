package io.gitlab.arturbosch.detekt.core.config.validation;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import io.gitlab.arturbosch.detekt.api.Notification;
import io.gitlab.arturbosch.detekt.core.config.YamlConfig;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.text.Regex;
import org.junit.jupiter.api.Test;

class MissingRulesConfigValidatorDiffblueTest {
  /**
  * Method under test: {@link MissingRulesConfigValidator#MissingRulesConfigValidator(YamlConfig, Set)}
  */
  @Test
  void testConstructor() {
    // Arrange
    YamlConfig baseline = new YamlConfig(new HashMap<>(), "Parent Path");

    HashSet<Regex> excludePatterns = new HashSet<>();

    // Act
    new MissingRulesConfigValidator(baseline, excludePatterns);

    // Assert
    assertTrue(excludePatterns.isEmpty());
  }

  /**
   * Method under test: {@link MissingRulesConfigValidator#validate(YamlConfig, ValidationSettings)}
   */
  @Test
  void testValidate() {
    // Arrange
    YamlConfig baseline = new YamlConfig(new HashMap<>(), "Parent Path");

    MissingRulesConfigValidator missingRulesConfigValidator = new MissingRulesConfigValidator(baseline,
        new HashSet<>());
    YamlConfig configToValidate = new YamlConfig(new HashMap<>(), "Parent Path");

    // Act
    Collection<Notification> actualValidateResult = missingRulesConfigValidator.validate(configToValidate,
        new ValidationSettings());

    // Assert
    assertSame(((EmptyList) actualValidateResult).INSTANCE, actualValidateResult);
    assertTrue(actualValidateResult.isEmpty());
  }
}

