package io.gitlab.arturbosch.detekt.core.tooling;

import static org.junit.jupiter.api.Assertions.assertThrows;
import java.nio.file.Path;
import java.nio.file.Paths;
import kotlin.UninitializedPropertyAccessException;
import org.junit.jupiter.api.Test;

class DefaultConfigProviderDiffblueTest {
  /**
  * Method under test: {@link DefaultConfigProvider#copy(Path)}
  */
  @Test
  void testCopy() {
    // Arrange, Act and Assert
    assertThrows(UninitializedPropertyAccessException.class,
        () -> (new DefaultConfigProvider()).copy(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt")));
  }

  /**
   * Method under test: {@link DefaultConfigProvider#get()}
   */
  @Test
  void testGet() {
    // Arrange, Act and Assert
    assertThrows(UninitializedPropertyAccessException.class, () -> (new DefaultConfigProvider()).get());
  }
}

