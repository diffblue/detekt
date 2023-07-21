package io.github.detekt.psi;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.junit.jupiter.api.Test;

class KtFilesKtDiffblueTest {
  /**
  * Method under test: {@link KtFilesKt#toUnifiedString(Path)}
  */
  @Test
  void testToUnifiedString() {
    // Arrange and Act
    String actualToUnifiedStringResult = KtFilesKt
        .toUnifiedString(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt"));

    // Assert
    assertEquals(Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toString(), actualToUnifiedStringResult);
  }
}

