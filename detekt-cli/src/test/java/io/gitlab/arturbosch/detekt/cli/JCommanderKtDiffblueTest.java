package io.gitlab.arturbosch.detekt.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import kotlin.collections.EmptyList;
import org.junit.jupiter.api.Test;

class JCommanderKtDiffblueTest {
  /**
  * Method under test: {@link JCommanderKt#parseArguments(String[])}
  */
  @Test
  void testParseArguments() {
    // Arrange, Act and Assert
    assertThrows(HandledArgumentViolation.class, () -> JCommanderKt.parseArguments(new String[]{"Args"}));
    assertThrows(HandledArgumentViolation.class, () -> JCommanderKt.parseArguments(new String[]{"args", "detekt"}));
  }

  /**
   * Method under test: {@link JCommanderKt#parseArguments(String[])}
   */
  @Test
  void testParseArguments2() {
    // Arrange and Act
    CliArgs actualParseArgumentsResult = JCommanderKt.parseArguments(new String[]{});

    // Assert
    assertTrue(actualParseArgumentsResult.getReportPaths() instanceof EmptyList);
    assertEquals("1.8", actualParseArgumentsResult.getJvmTarget());
    assertEquals(1, actualParseArgumentsResult.getInputPaths().size());
  }
}

