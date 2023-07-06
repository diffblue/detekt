package io.gitlab.arturbosch.detekt.api.internal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class VersionsKtDiffblueTest {
  /**
  * Method under test: {@link VersionsKt#whichDetekt()}
  */
  @Test
  void testWhichDetekt() {
    // Arrange, Act and Assert
    assertEquals("1.23.0", VersionsKt.whichDetekt());
  }

  /**
   * Method under test: {@link VersionsKt#whichJava()}
   */
  @Test
  void testWhichJava() {
    // Arrange, Act and Assert
    assertEquals(System.getProperty("java.runtime.version"), VersionsKt.whichJava());
  }

  /**
   * Method under test: {@link VersionsKt#whichKotlin()}
   */
  @Test
  void testWhichKotlin() {
    // Arrange, Act and Assert
    assertEquals("1.8.22", VersionsKt.whichKotlin());
  }

  /**
   * Method under test: {@link VersionsKt#whichOS()}
   */
  @Test
  void testWhichOS() {
    // Arrange, Act and Assert
    assertEquals(System.getProperty("os.name"), VersionsKt.whichOS());
  }
}

