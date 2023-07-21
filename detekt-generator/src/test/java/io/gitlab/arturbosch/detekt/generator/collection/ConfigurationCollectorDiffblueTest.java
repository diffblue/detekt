package io.gitlab.arturbosch.detekt.generator.collection;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class ConfigurationCollectorDiffblueTest {
  /**
  * Method under test: default or parameterless constructor of {@link ConfigurationCollector}
  */
  @Test
  void testConstructor() {
    // Arrange, Act and Assert
    assertTrue((new ConfigurationCollector()).getConfigurations().isEmpty());
  }
}

