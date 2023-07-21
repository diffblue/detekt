package io.github.detekt.utils;

import static org.junit.jupiter.api.Assertions.assertNull;
import javax.management.loading.MLet;
import org.junit.jupiter.api.Test;

class ResourcesKtDiffblueTest {
  /**
  * Method under test: {@link ResourcesKt#getSafeResourceAsStream(Class, String)}
  */
  @Test
  void testGetSafeResourceAsStream() {
    // Arrange, Act and Assert
    assertNull(ResourcesKt.getSafeResourceAsStream(Object.class, "Name"));
    assertNull(ResourcesKt.getSafeResourceAsStream(new MLet(), "Name"));
  }
}

