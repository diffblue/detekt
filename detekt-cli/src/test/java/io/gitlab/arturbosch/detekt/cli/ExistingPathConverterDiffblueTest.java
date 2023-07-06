package io.gitlab.arturbosch.detekt.cli;

import static org.junit.jupiter.api.Assertions.assertThrows;
import com.beust.jcommander.ParameterException;
import org.junit.jupiter.api.Test;

class ExistingPathConverterDiffblueTest {
  /**
  * Method under test: {@link ExistingPathConverter#convert(String)}
  */
  @Test
  void testConvert() {
    // Arrange, Act and Assert
    assertThrows(ParameterException.class, () -> (new ExistingPathConverter()).convert("42"));
    assertThrows(IllegalArgumentException.class, () -> (new ExistingPathConverter()).convert(""));
  }
}

