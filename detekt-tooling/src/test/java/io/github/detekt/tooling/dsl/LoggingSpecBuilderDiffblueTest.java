package io.github.detekt.tooling.dsl;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import io.github.detekt.test.utils.NullPrintStream;
import org.junit.jupiter.api.Test;

class LoggingSpecBuilderDiffblueTest {
  /**
  * Methods under test: 
  * 
  * <ul>
  *   <li>default or parameterless constructor of {@link LoggingSpecBuilder}
  *   <li>{@link LoggingSpecBuilder#setDebug(boolean)}
  *   <li>{@link LoggingSpecBuilder#setErrorChannel(Appendable)}
  *   <li>{@link LoggingSpecBuilder#setOutputChannel(Appendable)}
  *   <li>{@link LoggingSpecBuilder#getDebug()}
  *   <li>{@link LoggingSpecBuilder#getErrorChannel()}
  *   <li>{@link LoggingSpecBuilder#getOutputChannel()}
  * </ul>
  */
  @Test
  void testConstructor() {
    // Arrange and Act
    LoggingSpecBuilder actualLoggingSpecBuilder = new LoggingSpecBuilder();
    actualLoggingSpecBuilder.setDebug(true);
    NullPrintStream errorChannel = new NullPrintStream();
    actualLoggingSpecBuilder.setErrorChannel(errorChannel);
    NullPrintStream outputChannel = new NullPrintStream();
    actualLoggingSpecBuilder.setOutputChannel(outputChannel);

    // Assert
    assertTrue(actualLoggingSpecBuilder.getDebug());
    assertSame(errorChannel, actualLoggingSpecBuilder.getErrorChannel());
    assertSame(outputChannel, actualLoggingSpecBuilder.getOutputChannel());
  }
}

