package io.github.detekt.compiler.plugin.internal;

import static org.junit.jupiter.api.Assertions.assertSame;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.KClassImpl;
import kotlin.reflect.jvm.internal.KMutableProperty0Impl;
import org.junit.jupiter.api.Test;

class AppendableAdapterDiffblueTest {
  /**
  * Method under test: {@link AppendableAdapter#AppendableAdapter(Function1)}
  */
  @Test
  void testConstructor() {
    // Arrange
    KMutableProperty0Impl.Setter<? super String> logging = new KMutableProperty0Impl.Setter<>(
        new KMutableProperty0Impl<>(new KClassImpl<>(Object.class), "Name", "Signature", "Bound Receiver"));

    // Act and Assert
    assertSame(logging, (new AppendableAdapter(logging)).getLogging());
  }
}

