package io.github.detekt.compiler.plugin.internal;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.rmi.server.LogStream;
import org.jetbrains.kotlin.cli.common.messages.CompilerMessageSourceLocation;
import org.jetbrains.kotlin.cli.common.messages.GradleStyleMessageRenderer;
import org.jetbrains.kotlin.cli.common.messages.GroupingMessageCollector;
import org.jetbrains.kotlin.cli.common.messages.MessageCollector;
import org.jetbrains.kotlin.cli.common.messages.PrintingMessageCollector;
import org.jetbrains.kotlin.incremental.util.BufferingMessageCollector;
import org.junit.jupiter.api.Test;

class MessageCollectorExtensionsKtDiffblueTest {
  /**
  * Method under test: {@link MessageCollectorExtensionsKt#error(MessageCollector, String)}
  */
  @Test
  void testError() {
    // Arrange
    BufferingMessageCollector $this$error = new BufferingMessageCollector();

    // Act
    MessageCollectorExtensionsKt.error($this$error, "Msg");

    // Assert
    assertTrue($this$error.hasErrors());
  }

  /**
   * Method under test: {@link MessageCollectorExtensionsKt#error(MessageCollector, String)}
   */
  @Test
  void testError2() {
    // Arrange
    GroupingMessageCollector $this$error = new GroupingMessageCollector(new BufferingMessageCollector(), true);

    // Act
    MessageCollectorExtensionsKt.error($this$error, "Msg");

    // Assert
    assertTrue($this$error.hasErrors());
  }

  /**
   * Method under test: {@link MessageCollectorExtensionsKt#error(MessageCollector, String)}
   */
  @Test
  void testError3() {
    // Arrange
    LogStream errStream = LogStream.log("foo");
    PrintingMessageCollector $this$error = new PrintingMessageCollector(errStream, new GradleStyleMessageRenderer(),
        true);

    // Act
    MessageCollectorExtensionsKt.error($this$error, "Msg");

    // Assert
    assertTrue($this$error.hasErrors());
  }

  /**
   * Method under test: {@link MessageCollectorExtensionsKt#info(MessageCollector, String)}
   */
  @Test
  void testInfo() {
    // Arrange
    BufferingMessageCollector $this$info = new BufferingMessageCollector();

    // Act
    MessageCollectorExtensionsKt.info($this$info, "Msg");

    // Assert
    assertFalse($this$info.hasErrors());
  }

  /**
   * Method under test: {@link MessageCollectorExtensionsKt#info(MessageCollector, String)}
   */
  @Test
  void testInfo2() {
    // Arrange
    GroupingMessageCollector $this$info = new GroupingMessageCollector(new BufferingMessageCollector(), true);

    // Act
    MessageCollectorExtensionsKt.info($this$info, "Msg");

    // Assert
    assertFalse($this$info.hasErrors());
  }

  /**
   * Method under test: {@link MessageCollectorExtensionsKt#info(MessageCollector, String)}
   */
  @Test
  void testInfo3() {
    // Arrange
    LogStream errStream = LogStream.log("foo");
    PrintingMessageCollector $this$info = new PrintingMessageCollector(errStream, new GradleStyleMessageRenderer(),
        true);

    // Act
    MessageCollectorExtensionsKt.info($this$info, "Msg");

    // Assert
    assertFalse($this$info.hasErrors());
  }

  /**
   * Method under test: {@link MessageCollectorExtensionsKt#warn(MessageCollector, String, CompilerMessageSourceLocation)}
   */
  @Test
  void testWarn() {
    // Arrange
    BufferingMessageCollector $this$warn = new BufferingMessageCollector();

    // Act
    MessageCollectorExtensionsKt.warn($this$warn, "Msg", null);

    // Assert
    assertFalse($this$warn.hasErrors());
  }

  /**
   * Method under test: {@link MessageCollectorExtensionsKt#warn(MessageCollector, String, CompilerMessageSourceLocation)}
   */
  @Test
  void testWarn2() {
    // Arrange
    GroupingMessageCollector $this$warn = new GroupingMessageCollector(new BufferingMessageCollector(), true);

    // Act
    MessageCollectorExtensionsKt.warn($this$warn, "Msg", null);

    // Assert
    assertTrue($this$warn.hasErrors());
  }

  /**
   * Method under test: {@link MessageCollectorExtensionsKt#warn(MessageCollector, String, CompilerMessageSourceLocation)}
   */
  @Test
  void testWarn3() {
    // Arrange
    LogStream errStream = LogStream.log("foo");
    PrintingMessageCollector $this$warn = new PrintingMessageCollector(errStream, new GradleStyleMessageRenderer(),
        true);

    // Act
    MessageCollectorExtensionsKt.warn($this$warn, "Msg", null);

    // Assert
    assertFalse($this$warn.hasErrors());
  }
}

