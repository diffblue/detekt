package io.github.detekt.tooling.dsl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import io.github.detekt.test.utils.NullPrintStream;
import org.junit.jupiter.api.Test;

class LoggingModelDiffblueTest {
  /**
   * Method under test: {@link LoggingModel#component1()}
   */
  @Test
  void testComponent1() {
    // Arrange
    NullPrintStream outputChannel = new NullPrintStream();

    // Act and Assert
    assertTrue((new LoggingModel(true, outputChannel, new NullPrintStream())).component1());
  }

  /**
   * Method under test: {@link LoggingModel#component2()}
   */
  @Test
  void testComponent2() {
    // Arrange
    NullPrintStream outputChannel = new NullPrintStream();

    // Act and Assert
    assertSame(outputChannel, (new LoggingModel(true, outputChannel, new NullPrintStream())).component2());
  }

  /**
   * Method under test: {@link LoggingModel#component3()}
   */
  @Test
  void testComponent3() {
    // Arrange
    NullPrintStream outputChannel = new NullPrintStream();
    NullPrintStream errorChannel = new NullPrintStream();

    // Act and Assert
    assertSame(errorChannel, (new LoggingModel(true, outputChannel, errorChannel)).component3());
  }

  /**
   * Method under test: {@link LoggingModel#component1()}
   */
  @Test
  void testComponent12() {
    // Arrange
    NullPrintStream outputChannel = new NullPrintStream();

    // Act and Assert
    assertFalse((new LoggingModel(false, outputChannel, new NullPrintStream())).component1());
  }

  /**
  * Methods under test: 
  * 
  * <ul>
  *   <li>{@link LoggingModel#LoggingModel(boolean, Appendable, Appendable)}
  *   <li>{@link LoggingModel#toString()}
  *   <li>{@link LoggingModel#getDebug()}
  *   <li>{@link LoggingModel#getErrorChannel()}
  *   <li>{@link LoggingModel#getOutputChannel()}
  * </ul>
  */
  @Test
  void testConstructor() {
    // Arrange
    NullPrintStream outputChannel = new NullPrintStream();
    NullPrintStream errorChannel = new NullPrintStream();

    // Act
    LoggingModel actualLoggingModel = new LoggingModel(true, outputChannel, errorChannel);
    actualLoggingModel.toString();

    // Assert
    assertTrue(actualLoggingModel.getDebug());
    assertSame(errorChannel, actualLoggingModel.getErrorChannel());
    assertSame(outputChannel, actualLoggingModel.getOutputChannel());
  }

  /**
   * Method under test: {@link LoggingModel#LoggingModel(boolean, Appendable, Appendable)}
   */
  @Test
  void testConstructor2() {
    // Arrange
    NullPrintStream outputChannel = new NullPrintStream();
    NullPrintStream errorChannel = new NullPrintStream();

    // Act
    LoggingModel actualLoggingModel = new LoggingModel(true, outputChannel, errorChannel);

    // Assert
    assertTrue(actualLoggingModel.component1());
    assertSame(outputChannel, actualLoggingModel.getOutputChannel());
    assertSame(errorChannel, actualLoggingModel.getErrorChannel());
  }

  /**
   * Method under test: {@link LoggingModel#copy(boolean, Appendable, Appendable)}
   */
  @Test
  void testCopy() {
    // Arrange
    NullPrintStream outputChannel = new NullPrintStream();
    LoggingModel loggingModel = new LoggingModel(true, outputChannel, new NullPrintStream());
    NullPrintStream outputChannel2 = new NullPrintStream();
    NullPrintStream errorChannel = new NullPrintStream();

    // Act
    LoggingModel actualCopyResult = loggingModel.copy(true, outputChannel2, errorChannel);

    // Assert
    assertTrue(actualCopyResult.component1());
    assertSame(outputChannel2, actualCopyResult.getOutputChannel());
    assertSame(errorChannel, actualCopyResult.getErrorChannel());
  }

  /**
   * Method under test: {@link LoggingModel#equals(Object)}
   */
  @Test
  void testEquals() {
    // Arrange
    NullPrintStream outputChannel = new NullPrintStream();

    // Act and Assert
    assertNotEquals(new LoggingModel(true, outputChannel, new NullPrintStream()), null);
  }

  /**
   * Method under test: {@link LoggingModel#equals(Object)}
   */
  @Test
  void testEquals2() {
    // Arrange
    NullPrintStream outputChannel = new NullPrintStream();

    // Act and Assert
    assertNotEquals(new LoggingModel(true, outputChannel, new NullPrintStream()), "Different type to LoggingModel");
  }

  /**
   * Methods under test: 
   * 
   * <ul>
   *   <li>{@link LoggingModel#equals(Object)}
   *   <li>{@link LoggingModel#hashCode()}
   * </ul>
   */
  @Test
  void testEquals3() {
    // Arrange
    NullPrintStream outputChannel = new NullPrintStream();
    LoggingModel loggingModel = new LoggingModel(true, outputChannel, new NullPrintStream());

    // Act and Assert
    assertEquals(loggingModel, loggingModel);
    int expectedHashCodeResult = loggingModel.hashCode();
    assertEquals(expectedHashCodeResult, loggingModel.hashCode());
  }

  /**
   * Method under test: {@link LoggingModel#equals(Object)}
   */
  @Test
  void testEquals4() {
    // Arrange
    NullPrintStream outputChannel = new NullPrintStream();
    LoggingModel loggingModel = new LoggingModel(true, outputChannel, new NullPrintStream());
    NullPrintStream outputChannel2 = new NullPrintStream();

    // Act and Assert
    assertNotEquals(loggingModel, new LoggingModel(true, outputChannel2, new NullPrintStream()));
  }

  /**
   * Method under test: {@link LoggingModel#equals(Object)}
   */
  @Test
  void testEquals5() {
    // Arrange
    NullPrintStream outputChannel = new NullPrintStream();
    LoggingModel loggingModel = new LoggingModel(false, outputChannel, new NullPrintStream());
    NullPrintStream outputChannel2 = new NullPrintStream();

    // Act and Assert
    assertNotEquals(loggingModel, new LoggingModel(true, outputChannel2, new NullPrintStream()));
  }
}

