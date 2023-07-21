package io.github.detekt.tooling.dsl;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import io.github.detekt.tooling.api.spec.ExecutionSpec;
import org.junit.jupiter.api.Test;

class ExecutionSpecBuilderDiffblueTest {
  /**
  * Methods under test: 
  * 
  * <ul>
  *   <li>{@link ExecutionSpecBuilder#build()}
  *   <li>default or parameterless constructor of {@link ExecutionSpecBuilder}
  * </ul>
  */
  @Test
  void testBuild() {
    // Arrange and Act
    ExecutionSpec actualBuildResult = (new ExecutionSpecBuilder()).build();

    // Assert
    assertTrue(actualBuildResult instanceof ExecutionModel);
    assertNull(((ExecutionModel) actualBuildResult).component1());
    assertFalse(actualBuildResult.getParallelParsing());
    assertFalse(actualBuildResult.getParallelAnalysis());
    assertNull(actualBuildResult.getExecutorService());
    assertFalse(((ExecutionModel) actualBuildResult).component3());
    assertFalse(((ExecutionModel) actualBuildResult).component2());
  }
}

