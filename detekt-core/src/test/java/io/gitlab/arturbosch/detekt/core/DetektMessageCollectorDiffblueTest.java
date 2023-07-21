package io.gitlab.arturbosch.detekt.core;

import static org.junit.jupiter.api.Assertions.assertFalse;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.KClassImpl;
import kotlin.reflect.jvm.internal.KMutableProperty0Impl;
import org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity;
import org.junit.jupiter.api.Test;

class DetektMessageCollectorDiffblueTest {
  /**
  * Method under test: {@link DetektMessageCollector#DetektMessageCollector(CompilerMessageSeverity, Function1)}
  */
  @Test
  void testConstructor() {
    // Arrange, Act and Assert
    assertFalse((new DetektMessageCollector(CompilerMessageSeverity.EXCEPTION,
        new KMutableProperty0Impl.Setter<>(
            new KMutableProperty0Impl<>(new KClassImpl<>(Object.class), "Name", "Signature", "Bound Receiver"))))
                .hasErrors());
  }

  /**
   * Method under test: {@link DetektMessageCollector#hasErrors()}
   */
  @Test
  void testHasErrors() {
    // Arrange, Act and Assert
    assertFalse((new DetektMessageCollector(CompilerMessageSeverity.EXCEPTION,
        new KMutableProperty0Impl.Setter<>(
            new KMutableProperty0Impl<>(new KClassImpl<>(Object.class), "Name", "Signature", "Bound Receiver"))))
                .hasErrors());
  }
}

