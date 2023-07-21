package io.gitlab.arturbosch.detekt.core;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class KtFileModifierDiffblueTest {
  /**
  * Method under test: default or parameterless constructor of {@link KtFileModifier}
  */
  @Test
  void testConstructor() {
    // Arrange and Act
    KtFileModifier actualKtFileModifier = new KtFileModifier();

    // Assert
    assertEquals("KtFileModifier", actualKtFileModifier.getId());
    assertEquals(-1, actualKtFileModifier.getPriority());
  }

  /**
   * Method under test: {@link KtFileModifier#getId()}
   */
  @Test
  void testGetId() {
    // Arrange, Act and Assert
    assertEquals("KtFileModifier", (new KtFileModifier()).getId());
  }

  /**
   * Method under test: {@link KtFileModifier#getPriority()}
   */
  @Test
  void testGetPriority() {
    // Arrange, Act and Assert
    assertEquals(-1, (new KtFileModifier()).getPriority());
  }
}

