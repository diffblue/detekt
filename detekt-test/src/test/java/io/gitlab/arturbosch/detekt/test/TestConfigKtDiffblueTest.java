package io.gitlab.arturbosch.detekt.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import io.gitlab.arturbosch.detekt.api.ValueWithReason;
import java.util.Map;
import org.junit.jupiter.api.Test;

class TestConfigKtDiffblueTest {
  /**
  * Method under test: {@link TestConfigKt#toConfig(ValueWithReason)}
  */
  @Test
  void testToConfig() {
    // Arrange and Act
    Map<String, String> actualToConfigResult = TestConfigKt.toConfig(new ValueWithReason("42", "Just cause"));

    // Assert
    assertEquals(2, actualToConfigResult.size());
    assertEquals("42", actualToConfigResult.get("value"));
    assertEquals("Just cause", actualToConfigResult.get("reason"));
  }
}

