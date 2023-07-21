package io.github.detekt.parser;

import static org.junit.jupiter.api.Assertions.assertNull;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class KotlinEnvironmentUtilsKtDiffblueTest {
  /**
  * Method under test: {@link KotlinEnvironmentUtilsKt#getKotlinLanguageVersion(Iterable)}
  */
  @Test
  void testGetKotlinLanguageVersion() {
    // Arrange, Act and Assert
    assertNull(KotlinEnvironmentUtilsKt.getKotlinLanguageVersion(new ArrayList<>()));
  }
}

