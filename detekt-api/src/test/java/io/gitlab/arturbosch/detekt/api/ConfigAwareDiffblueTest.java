package io.gitlab.arturbosch.detekt.api;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import io.gitlab.arturbosch.detekt.test.TestConfig;
import kotlin.Pair;
import org.junit.jupiter.api.Test;

class ConfigAwareDiffblueTest {
  /**
  * Method under test: {@link ConfigAware.DefaultImpls#getActive(ConfigAware)}
  */
  @Test
  void testDefaultImplsGetActive() {
    // Arrange, Act and Assert
    assertTrue(ConfigAware.DefaultImpls.getActive(new TestConfigAware(new Pair<>("First", "Second"))));
    assertFalse(ConfigAware.DefaultImpls.getActive(new TestConfigAware(new Pair<>(Config.ACTIVE_KEY, false))));
  }

  /**
   * Method under test: {@link ConfigAware.DefaultImpls#getAutoCorrect(ConfigAware)}
   */
  @Test
  void testDefaultImplsGetAutoCorrect() {
    // Arrange, Act and Assert
    assertFalse(ConfigAware.DefaultImpls.getAutoCorrect(new TestConfigAware(new Pair<>("First", "Second"))));
    assertTrue(ConfigAware.DefaultImpls.getAutoCorrect(new TestConfigAware(new Pair<>(Config.AUTO_CORRECT_KEY, true))));
  }

  /**
   * Method under test: {@link ConfigAware.DefaultImpls#getParentPath(ConfigAware)}
   */
  @Test
  void testDefaultImplsGetParentPath() {
    // Arrange, Act and Assert
    assertNull(ConfigAware.DefaultImpls.getParentPath(new TestConfigAware(new Pair<>("First", "Second"))));
  }

  /**
   * Method under test: {@link ConfigAware.DefaultImpls#subConfig(ConfigAware, String)}
   */
  @Test
  void testDefaultImplsSubConfig() {
    // Arrange, Act and Assert
    assertTrue(ConfigAware.DefaultImpls.subConfig(new TestConfigAware(new Pair<>("First", "Second")),
        "Key") instanceof TestConfig);
    assertTrue(ConfigAware.DefaultImpls.subConfig(new TestConfigAware(), "Key") instanceof TestConfig);
  }

  /**
   * Method under test: {@link ConfigAware.DefaultImpls#valueOrDefault(ConfigAware, String, Object)}
   */
  @Test
  void testDefaultImplsValueOrDefault() {
    // Arrange, Act and Assert
    assertEquals("Default",
        ConfigAware.DefaultImpls.valueOrDefault(new TestConfigAware(new Pair<>("First", "Second")), "Key", "Default"));
  }

  /**
   * Method under test: {@link ConfigAware.DefaultImpls#valueOrNull(ConfigAware, String)}
   */
  @Test
  void testDefaultImplsValueOrNull() {
    // Arrange, Act and Assert
    assertNull(ConfigAware.DefaultImpls.valueOrNull(new TestConfigAware(new Pair<>("First", "Second")), "Key"));
    assertNull(ConfigAware.DefaultImpls.valueOrNull(new TestConfigAware(), "Key"));
  }
}

