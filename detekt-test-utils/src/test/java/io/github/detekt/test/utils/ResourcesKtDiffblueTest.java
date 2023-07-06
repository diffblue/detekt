package io.github.detekt.test.utils;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

class ResourcesKtDiffblueTest {
  /**
  * Method under test: {@link ResourcesKt#readResourceContent(String)}
  */
  @Test
  void testReadResourceContent() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ResourcesKt.readResourceContent("Name"));
  }

  /**
   * Method under test: {@link ResourcesKt#resource(String)}
   */
  @Test
  void testResource() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ResourcesKt.resource("Name"));
  }

  /**
   * Method under test: {@link ResourcesKt#resourceAsPath(String)}
   */
  @Test
  void testResourceAsPath() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ResourcesKt.resourceAsPath("Name"));
  }

  /**
   * Method under test: {@link ResourcesKt#resourceUrl(String)}
   */
  @Test
  void testResourceUrl() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ResourcesKt.resourceUrl("https://example.org/example"));
  }
}

