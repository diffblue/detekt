package io.github.detekt.tooling.dsl;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import io.github.detekt.tooling.api.spec.BaselineSpec;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.junit.jupiter.api.Test;

class BaselineSpecBuilderDiffblueTest {
  /**
   * Method under test: {@link BaselineSpecBuilder#build()}
   */
  @Test
  void testBuild() {
    // Arrange and Act
    BaselineSpec actualBuildResult = (new BaselineSpecBuilder()).build();

    // Assert
    assertTrue(actualBuildResult instanceof BaselineModel);
    assertNull(((BaselineModel) actualBuildResult).component1());
    assertFalse(actualBuildResult.getShouldCreateDuringAnalysis());
    assertNull(actualBuildResult.getPath());
    assertFalse(((BaselineModel) actualBuildResult).component2());
  }

  /**
  * Methods under test: 
  * 
  * <ul>
  *   <li>default or parameterless constructor of {@link BaselineSpecBuilder}
  *   <li>{@link BaselineSpecBuilder#setPath(Path)}
  *   <li>{@link BaselineSpecBuilder#setShouldCreateDuringAnalysis(boolean)}
  *   <li>{@link BaselineSpecBuilder#getPath()}
  *   <li>{@link BaselineSpecBuilder#getShouldCreateDuringAnalysis()}
  * </ul>
  */
  @Test
  void testConstructor() {
    // Arrange and Act
    BaselineSpecBuilder actualBaselineSpecBuilder = new BaselineSpecBuilder();
    Path path = Paths.get(System.getProperty("java.io.tmpdir"), "test.txt");
    actualBaselineSpecBuilder.setPath(path);
    actualBaselineSpecBuilder.setShouldCreateDuringAnalysis(true);

    // Assert
    assertSame(path, actualBaselineSpecBuilder.getPath());
    assertTrue(actualBaselineSpecBuilder.getShouldCreateDuringAnalysis());
  }
}

