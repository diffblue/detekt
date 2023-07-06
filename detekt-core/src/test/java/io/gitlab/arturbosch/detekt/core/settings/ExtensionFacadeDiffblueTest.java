package io.gitlab.arturbosch.detekt.core.settings;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import io.github.detekt.tooling.api.spec.ExtensionsSpec;
import io.github.detekt.tooling.internal.PluginsHolder;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class ExtensionFacadeDiffblueTest {
  /**
   * Method under test: {@link ExtensionFacade#close()}
   */
  @Test
  void testClose() {
    // Arrange
    ExtensionFacade extensionFacade = new ExtensionFacade(new PluginsHolder(new ArrayList<>(), null));

    // Act
    extensionFacade.close();

    // Assert
    assertNotNull(extensionFacade.getPluginLoader());
  }

  /**
   * Method under test: {@link ExtensionFacade#closeLoaderIfNeeded()}
   */
  @Test
  void testCloseLoaderIfNeeded() {
    // Arrange
    ExtensionFacade extensionFacade = new ExtensionFacade(new PluginsHolder(new ArrayList<>(), null));

    // Act
    extensionFacade.closeLoaderIfNeeded();

    // Assert
    assertNotNull(extensionFacade.getPluginLoader());
  }

  /**
  * Method under test: {@link ExtensionFacade#ExtensionFacade(ExtensionsSpec.Plugins)}
  */
  @Test
  void testConstructor() {
    // Arrange, Act and Assert
    assertNotNull((new ExtensionFacade(new PluginsHolder(new ArrayList<>(), null))).getPluginLoader());
    assertNotNull((new ExtensionFacade(null)).getPluginLoader());
  }

  /**
   * Method under test: {@link ExtensionFacade#ExtensionFacade(ExtensionsSpec.Plugins)}
   */
  @Test
  void testConstructor2() {
    // Arrange
    ArrayList<Path> paths = new ArrayList<>();
    paths.add(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> new ExtensionFacade(new PluginsHolder(paths, null)));
  }

  /**
   * Method under test: {@link ExtensionFacade#getPluginLoader()}
   */
  @Test
  void testGetPluginLoader() {
    // Arrange, Act and Assert
    assertNotNull((new ExtensionFacade(new PluginsHolder(new ArrayList<>(), null))).getPluginLoader());
    assertNotNull((new ExtensionFacade(null)).getPluginLoader());
  }
}

