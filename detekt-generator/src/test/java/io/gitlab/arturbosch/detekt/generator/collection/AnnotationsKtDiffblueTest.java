package io.gitlab.arturbosch.detekt.generator.collection;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class AnnotationsKtDiffblueTest {
  /**
  * Method under test: {@link AnnotationsKt#withoutQuotes(String)}
  */
  @Test
  void testWithoutQuotes() {
    // Arrange, Act and Assert
    assertEquals("$this$withoutQuotes", AnnotationsKt.withoutQuotes("$this$withoutQuotes"));
    assertEquals(" + ", AnnotationsKt.withoutQuotes("\" + \""));
  }
}

