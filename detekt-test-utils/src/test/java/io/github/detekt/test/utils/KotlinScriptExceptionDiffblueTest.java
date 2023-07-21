package io.github.detekt.test.utils;

import static org.junit.jupiter.api.Assertions.assertSame;
import javax.script.ScriptException;
import org.junit.jupiter.api.Test;

class KotlinScriptExceptionDiffblueTest {
  /**
  * Method under test: {@link KotlinScriptException#KotlinScriptException(ScriptException)}
  */
  @Test
  void testConstructor() {
    // Arrange
    ScriptException e = new ScriptException("foo");

    // Act and Assert
    assertSame((new KotlinScriptException(e)).getCause(), e);
  }
}

