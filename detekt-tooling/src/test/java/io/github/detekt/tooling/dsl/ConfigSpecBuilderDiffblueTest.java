package io.github.detekt.tooling.dsl;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import io.github.detekt.tooling.api.spec.ConfigSpec;
import java.net.URL;
import java.nio.file.Path;
import java.util.Collection;
import kotlin.collections.EmptyList;
import org.junit.jupiter.api.Test;

class ConfigSpecBuilderDiffblueTest {
  /**
  * Method under test: {@link ConfigSpecBuilder#build()}
  */
  @Test
  void testBuild() {
    // Arrange and Act
    ConfigSpec actualBuildResult = (new ConfigSpecBuilder()).build();

    // Assert
    assertTrue(actualBuildResult instanceof ConfigModel);
    assertNull(((ConfigModel) actualBuildResult).component1());
    assertFalse(actualBuildResult.getUseDefaultConfig());
    assertNull(actualBuildResult.getShouldValidateBeforeAnalysis());
    Collection<URL> resources = actualBuildResult.getResources();
    assertTrue(resources instanceof EmptyList);
    Collection<String> knownPatterns = actualBuildResult.getKnownPatterns();
    assertTrue(knownPatterns instanceof EmptyList);
    assertTrue(resources.isEmpty());
    assertSame(resources, knownPatterns);
    assertSame(resources, actualBuildResult.getConfigPaths());
    assertSame(resources, ((ConfigModel) actualBuildResult).component5());
    assertSame(resources, ((ConfigModel) actualBuildResult).component4());
    assertFalse(((ConfigModel) actualBuildResult).component3());
    assertSame(resources, ((ConfigModel) actualBuildResult).component2());
  }

  /**
   * Method under test: default or parameterless constructor of {@link ConfigSpecBuilder}
   */
  @Test
  void testConstructor() {
    // Arrange and Act
    ConfigSpecBuilder actualConfigSpecBuilder = new ConfigSpecBuilder();

    // Assert
    Collection<Path> configPaths = actualConfigSpecBuilder.getConfigPaths();
    assertTrue(configPaths instanceof EmptyList);
    assertSame(configPaths, actualConfigSpecBuilder.getResources());
    assertSame(configPaths, actualConfigSpecBuilder.getKnownPatterns());
  }
}

