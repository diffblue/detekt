package io.gitlab.arturbosch.detekt.rules.documentation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class LicenceHeaderLoaderExtensionDiffblueTest {
  /**
  * Method under test: default or parameterless constructor of {@link LicenceHeaderLoaderExtension}
  */
  @Test
  void testConstructor() {
    // Arrange and Act
    LicenceHeaderLoaderExtension actualLicenceHeaderLoaderExtension = new LicenceHeaderLoaderExtension();

    // Assert
    assertEquals("LicenceHeaderLoaderExtension", actualLicenceHeaderLoaderExtension.getId());
    assertEquals(-1, actualLicenceHeaderLoaderExtension.getPriority());
  }

  /**
   * Method under test: {@link LicenceHeaderLoaderExtension#getId()}
   */
  @Test
  void testGetId() {
    // Arrange, Act and Assert
    assertEquals("LicenceHeaderLoaderExtension", (new LicenceHeaderLoaderExtension()).getId());
  }

  /**
   * Method under test: {@link LicenceHeaderLoaderExtension#getPriority()}
   */
  @Test
  void testGetPriority() {
    // Arrange, Act and Assert
    assertEquals(-1, (new LicenceHeaderLoaderExtension()).getPriority());
  }
}

