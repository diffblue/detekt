package io.github.detekt.tooling.api;

import static org.junit.jupiter.api.Assertions.assertSame;
import org.junit.jupiter.api.Test;

class UnexpectedErrorDiffblueTest {
  /**
  * Methods under test: 
  * 
  * <ul>
  *   <li>{@link UnexpectedError#UnexpectedError(Throwable)}
  *   <li>{@link UnexpectedError#getCause()}
  * </ul>
  */
  @Test
  void testConstructor() {
    // Arrange
    Throwable cause = new Throwable();

    // Act and Assert
    assertSame(cause, (new UnexpectedError(cause)).getCause());
  }

  /**
   * Method under test: {@link UnexpectedError#UnexpectedError(Throwable)}
   */
  @Test
  void testConstructor2() {
    // Arrange
    Throwable cause = new Throwable();

    // Act and Assert
    assertSame(cause, (new UnexpectedError(cause)).getCause());
  }
}

