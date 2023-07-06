package io.gitlab.arturbosch.detekt.core.reporting;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class ColorizerKtDiffblueTest {
  /**
  * Method under test: {@link ColorizerKt#decolorized(String)}
  */
  @Test
  void testDecolorized() {
    // Arrange, Act and Assert
    assertEquals("$this$decolorized", ColorizerKt.decolorized("$this$decolorized"));
  }

  /**
   * Method under test: {@link ColorizerKt#red(String)}
   */
  @Test
  void testRed() {
    // Arrange, Act and Assert
    assertEquals("\u001b[31m$this$red\u001b[0m", ColorizerKt.red("$this$red"));
  }

  /**
   * Method under test: {@link ColorizerKt#yellow(String)}
   */
  @Test
  void testYellow() {
    // Arrange, Act and Assert
    assertEquals("\u001b[33m$this$yellow\u001b[0m", ColorizerKt.yellow("$this$yellow"));
  }
}

