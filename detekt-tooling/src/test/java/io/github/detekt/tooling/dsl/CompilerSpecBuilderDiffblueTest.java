package io.github.detekt.tooling.dsl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import io.github.detekt.tooling.api.spec.CompilerSpec;
import org.junit.jupiter.api.Test;

class CompilerSpecBuilderDiffblueTest {
  /**
  * Methods under test: 
  * 
  * <ul>
  *   <li>{@link CompilerSpecBuilder#build()}
  *   <li>default or parameterless constructor of {@link CompilerSpecBuilder}
  * </ul>
  */
  @Test
  void testBuild() {
    // Arrange and Act
    CompilerSpec actualBuildResult = (new CompilerSpecBuilder()).build();

    // Assert
    assertTrue(actualBuildResult instanceof CompilerModel);
    assertEquals("1.8", ((CompilerModel) actualBuildResult).component1());
    assertNull(actualBuildResult.getLanguageVersion());
    assertEquals("1.8", actualBuildResult.getJvmTarget());
    assertNull(actualBuildResult.getJdkHome());
    assertNull(actualBuildResult.getClasspath());
    assertNull(((CompilerModel) actualBuildResult).component4());
    assertNull(((CompilerModel) actualBuildResult).component3());
    assertNull(((CompilerModel) actualBuildResult).component2());
  }
}

