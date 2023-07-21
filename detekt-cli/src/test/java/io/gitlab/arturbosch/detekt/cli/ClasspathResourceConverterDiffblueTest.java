package io.gitlab.arturbosch.detekt.cli;

import static org.junit.jupiter.api.Assertions.assertThrows;
import com.beust.jcommander.ParameterException;
import org.junit.jupiter.api.Test;

class ClasspathResourceConverterDiffblueTest {
  /**
  * Method under test: {@link ClasspathResourceConverter#convert(String)}
  */
  @Test
  void testConvert() {
    // Arrange, Act and Assert
    assertThrows(ParameterException.class, () -> (new ClasspathResourceConverter()).convert("Resource"));
  }
}

