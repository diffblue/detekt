package io.gitlab.arturbosch.detekt.generator.collection;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class DocumentationCollectorDiffblueTest {
  /**
  * Methods under test: 
  * 
  * <ul>
  *   <li>default or parameterless constructor of {@link DocumentationCollector}
  *   <li>{@link DocumentationCollector#getCompliant()}
  *   <li>{@link DocumentationCollector#getDescription()}
  *   <li>{@link DocumentationCollector#getNonCompliant()}
  * </ul>
  */
  @Test
  void testConstructor() {
    // Arrange and Act
    DocumentationCollector actualDocumentationCollector = new DocumentationCollector();

    // Assert
    assertEquals("", actualDocumentationCollector.getCompliant());
    assertEquals("", actualDocumentationCollector.getDescription());
    assertEquals("", actualDocumentationCollector.getNonCompliant());
  }
}

