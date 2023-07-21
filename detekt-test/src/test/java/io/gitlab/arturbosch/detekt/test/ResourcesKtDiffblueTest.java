package io.gitlab.arturbosch.detekt.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import io.gitlab.arturbosch.detekt.api.Config;
import io.gitlab.arturbosch.detekt.core.config.YamlConfig;
import org.junit.jupiter.api.Test;

class ResourcesKtDiffblueTest {
  /**
  * Method under test: {@link ResourcesKt#yamlConfigFromContent(String)}
  */
  @Test
  void testYamlConfigFromContent() {
    // Arrange and Act
    Config actualYamlConfigFromContentResult = ResourcesKt.yamlConfigFromContent("null");

    // Assert
    assertNull(actualYamlConfigFromContentResult.getParentPath());
    assertTrue(((YamlConfig) actualYamlConfigFromContentResult).getProperties().isEmpty());
  }

  /**
   * Method under test: {@link ResourcesKt#yamlConfigFromContent(String)}
   */
  @Test
  void testYamlConfigFromContent2() {
    // Arrange and Act
    Config actualYamlConfigFromContentResult = ResourcesKt
        .yamlConfigFromContent("Provided configuration file is invalid: Structure must be from type Map<String,Any>!");

    // Assert
    assertNull(actualYamlConfigFromContentResult.getParentPath());
    assertEquals(1, ((YamlConfig) actualYamlConfigFromContentResult).getProperties().size());
  }
}

