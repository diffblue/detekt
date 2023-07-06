package io.gitlab.arturbosch.detekt.sample.extensions.processors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class QualifiedNameProcessorDiffblueTest {
  /**
   * Methods under test: 
   * 
   * <ul>
   *   <li>default or parameterless constructor of {@link QualifiedNameProcessor.ClassNameVisitor}
   *   <li>{@link QualifiedNameProcessor.ClassNameVisitor#getNames()}
   * </ul>
   */
  @Test
  void testClassNameVisitorConstructor() {
    // Arrange, Act and Assert
    assertTrue((new QualifiedNameProcessor.ClassNameVisitor()).getNames().isEmpty());
    assertTrue((new QualifiedNameProcessor.ClassNameVisitor()).getNames().isEmpty());
  }

  /**
  * Method under test: default or parameterless constructor of {@link QualifiedNameProcessor}
  */
  @Test
  void testConstructor() {
    // Arrange and Act
    QualifiedNameProcessor actualQualifiedNameProcessor = new QualifiedNameProcessor();

    // Assert
    assertEquals("QualifiedNameProcessor", actualQualifiedNameProcessor.getId());
    assertEquals(-1, actualQualifiedNameProcessor.getPriority());
  }

  /**
   * Method under test: {@link QualifiedNameProcessor#getId()}
   */
  @Test
  void testGetId() {
    // Arrange, Act and Assert
    assertEquals("QualifiedNameProcessor", (new QualifiedNameProcessor()).getId());
  }

  /**
   * Method under test: {@link QualifiedNameProcessor#getPriority()}
   */
  @Test
  void testGetPriority() {
    // Arrange, Act and Assert
    assertEquals(-1, (new QualifiedNameProcessor()).getPriority());
  }
}

