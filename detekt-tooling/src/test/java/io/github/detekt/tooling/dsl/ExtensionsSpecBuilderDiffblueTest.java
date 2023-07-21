package io.github.detekt.tooling.dsl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import io.github.detekt.tooling.api.spec.ExtensionsSpec;
import java.util.Set;
import org.junit.jupiter.api.Test;

class ExtensionsSpecBuilderDiffblueTest {
  /**
  * Method under test: {@link ExtensionsSpecBuilder#build()}
  */
  @Test
  void testBuild() {
    // Arrange and Act
    ExtensionsSpec actualBuildResult = (new ExtensionsSpecBuilder()).build();

    // Assert
    assertTrue(actualBuildResult instanceof ExtensionsModel);
    assertFalse(((ExtensionsModel) actualBuildResult).component1());
    assertNull(actualBuildResult.getPlugins());
    Set<String> disabledExtensions = actualBuildResult.getDisabledExtensions();
    assertTrue(disabledExtensions.isEmpty());
    assertFalse(actualBuildResult.getDisableDefaultRuleSets());
    assertSame(disabledExtensions, ((ExtensionsModel) actualBuildResult).component3());
    assertNull(((ExtensionsModel) actualBuildResult).component2());
  }

  /**
   * Method under test: default or parameterless constructor of {@link ExtensionsSpecBuilder}
   */
  @Test
  void testConstructor() {
    // Arrange, Act and Assert
    assertTrue((new ExtensionsSpecBuilder()).getDisabledExtensions().isEmpty());
  }

  /**
   * Method under test: {@link ExtensionsSpecBuilder#disableExtension(String)}
   */
  @Test
  void testDisableExtension() {
    // Arrange
    ExtensionsSpecBuilder extensionsSpecBuilder = new ExtensionsSpecBuilder();

    // Act
    extensionsSpecBuilder.disableExtension("42");

    // Assert
    assertEquals(1, extensionsSpecBuilder.getDisabledExtensions().size());
  }
}

