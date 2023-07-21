package io.github.detekt.tooling.dsl;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import io.github.detekt.tooling.api.spec.ExtensionsSpec;
import io.github.detekt.tooling.internal.PluginsHolder;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;

class ExtensionsModelDiffblueTest {
  /**
   * Method under test: {@link ExtensionsModel#component1()}
   */
  @Test
  void testComponent1() {
    // Arrange
    PluginsHolder plugins = new PluginsHolder(new ArrayList<>(), null);

    // Act and Assert
    assertTrue((new ExtensionsModel(true, plugins, new HashSet<>())).component1());
  }

  /**
   * Method under test: {@link ExtensionsModel#component2()}
   */
  @Test
  void testComponent2() {
    // Arrange
    PluginsHolder plugins = new PluginsHolder(new ArrayList<>(), null);

    // Act and Assert
    assertSame(plugins, (new ExtensionsModel(true, plugins, new HashSet<>())).component2());
  }

  /**
   * Method under test: {@link ExtensionsModel#component3()}
   */
  @Test
  void testComponent3() {
    // Arrange
    PluginsHolder plugins = new PluginsHolder(new ArrayList<>(), null);

    HashSet<String> disabledExtensions = new HashSet<>();

    // Act
    Set<String> actualComponent3Result = (new ExtensionsModel(true, plugins, disabledExtensions)).component3();

    // Assert
    assertSame(disabledExtensions, actualComponent3Result);
    assertTrue(actualComponent3Result.isEmpty());
  }

  /**
   * Method under test: {@link ExtensionsModel#component1()}
   */
  @Test
  void testComponent12() {
    // Arrange
    PluginsHolder plugins = new PluginsHolder(new ArrayList<>(), null);

    // Act and Assert
    assertFalse((new ExtensionsModel(false, plugins, new HashSet<>())).component1());
  }

  /**
  * Method under test: {@link ExtensionsModel#ExtensionsModel(boolean, ExtensionsSpec.Plugins, Set)}
  */
  @Test
  void testConstructor() {
    // Arrange
    PluginsHolder plugins = new PluginsHolder(new ArrayList<>(), null);

    // Act
    ExtensionsModel actualExtensionsModel = new ExtensionsModel(true, plugins, new HashSet<>());

    // Assert
    assertTrue(actualExtensionsModel.component1());
    assertSame(plugins, actualExtensionsModel.getPlugins());
    assertTrue(actualExtensionsModel.getDisabledExtensions().isEmpty());
  }
}

