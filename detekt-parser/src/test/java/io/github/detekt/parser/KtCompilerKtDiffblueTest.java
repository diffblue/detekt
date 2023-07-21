package io.github.detekt.parser;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class KtCompilerKtDiffblueTest {
  /**
  * Method under test: {@link KtCompilerKt#determineLineSeparator(String)}
  */
  @Test
  void testDetermineLineSeparator() {
    // Arrange, Act and Assert
    assertEquals("\n", KtCompilerKt.determineLineSeparator("$this$determineLineSeparator"));
  }
}

