package io.gitlab.arturbosch.detekt.core.config.validation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import io.gitlab.arturbosch.detekt.api.Config;
import io.gitlab.arturbosch.detekt.api.Notification;
import io.gitlab.arturbosch.detekt.api.internal.SimpleNotification;
import io.gitlab.arturbosch.detekt.core.config.DisabledAutoCorrectConfig;
import io.gitlab.arturbosch.detekt.core.config.YamlConfig;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;

class ConfigValidationKtDiffblueTest {
  /**
  * Method under test: {@link ConfigValidationKt#renderMessage(Notification)}
  */
  @Test
  void testRenderMessage() {
    // Arrange, Act and Assert
    assertEquals("Not all who wander are lost", ConfigValidationKt
        .renderMessage(new SimpleNotification("Not all who wander are lost", Notification.Level.Info)));
    assertEquals("\u001b[33mNot all who wander are lost\u001b[0m", ConfigValidationKt
        .renderMessage(new SimpleNotification("Not all who wander are lost", Notification.Level.Warning)));
    assertEquals("\u001b[31mNot all who wander are lost\u001b[0m", ConfigValidationKt
        .renderMessage(new SimpleNotification("Not all who wander are lost", Notification.Level.Error)));
    assertEquals("\u001b[33m9\u001b[0m",
        ConfigValidationKt.renderMessage(new SimpleNotification("9", Notification.Level.Warning)));
  }

  /**
   * Method under test: {@link ConfigValidationKt#validateConfig(Config, Config, Set)}
   */
  @Test
  void testValidateConfig() {
    // Arrange
    DisabledAutoCorrectConfig config = new DisabledAutoCorrectConfig(new YamlConfig(new HashMap<>(), "Parent Path"));
    DisabledAutoCorrectConfig baseline = new DisabledAutoCorrectConfig(new YamlConfig(new HashMap<>(), "Parent Path"));

    // Act and Assert
    assertThrows(IllegalArgumentException.class,
        () -> ConfigValidationKt.validateConfig(config, baseline, new HashSet<>()));
  }
}

