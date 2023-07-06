package io.gitlab.arturbosch.detekt.generator.collection;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class DetektCollectorDiffblueTest {
  /**
  * Method under test: default or parameterless constructor of {@link DetektCollector}
  */
  @Test
  void testConstructor() {
    // Arrange, Act and Assert
    assertTrue((new DetektCollector()).getItems().isEmpty());
  }

  /**
   * Method under test: {@link DetektCollector#getItems()}
   */
  @Test
  void testGetItems() {
    // Arrange, Act and Assert
    assertTrue((new DetektCollector()).getItems().isEmpty());
  }
}

