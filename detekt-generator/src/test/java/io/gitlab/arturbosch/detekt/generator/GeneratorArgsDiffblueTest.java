package io.gitlab.arturbosch.detekt.generator;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class GeneratorArgsDiffblueTest {
  /**
  * Methods under test: 
  * 
  * <ul>
  *   <li>default or parameterless constructor of {@link GeneratorArgs}
  *   <li>{@link GeneratorArgs#setGenerateCustomRuleConfig(boolean)}
  *   <li>{@link GeneratorArgs#setHelp(boolean)}
  *   <li>{@link GeneratorArgs#getGenerateCustomRuleConfig()}
  *   <li>{@link GeneratorArgs#getHelp()}
  * </ul>
  */
  @Test
  void testConstructor() {
    // Arrange and Act
    GeneratorArgs actualGeneratorArgs = new GeneratorArgs();
    actualGeneratorArgs.setGenerateCustomRuleConfig(true);
    actualGeneratorArgs.setHelp(true);

    // Assert
    assertTrue(actualGeneratorArgs.getGenerateCustomRuleConfig());
    assertTrue(actualGeneratorArgs.getHelp());
  }

  /**
   * Method under test: default or parameterless constructor of {@link GeneratorArgs}
   */
  @Test
  void testConstructor2() {
    // Arrange and Act
    GeneratorArgs actualGeneratorArgs = new GeneratorArgs();

    // Assert
    assertFalse(actualGeneratorArgs.getGenerateCustomRuleConfig());
    assertFalse(actualGeneratorArgs.getHelp());
  }

  /**
   * Method under test: {@link GeneratorArgs#getCliOptionsPath()}
   */
  @Test
  void testGetCliOptionsPath() {
    // Arrange, Act and Assert
    assertThrows(IllegalStateException.class, () -> (new GeneratorArgs()).getCliOptionsPath());
  }

  /**
   * Method under test: {@link GeneratorArgs#getConfigPath()}
   */
  @Test
  void testGetConfigPath() {
    // Arrange, Act and Assert
    assertThrows(IllegalStateException.class, () -> (new GeneratorArgs()).getConfigPath());
  }

  /**
   * Method under test: {@link GeneratorArgs#getDocumentationPath()}
   */
  @Test
  void testGetDocumentationPath() {
    // Arrange, Act and Assert
    assertThrows(IllegalStateException.class, () -> (new GeneratorArgs()).getDocumentationPath());
  }
}

