package io.github.detekt.metrics.processors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class CLOCCountVisitorDiffblueTest {
  /**
  * Methods under test: 
  * 
  * <ul>
  *   <li>default or parameterless constructor of {@link CLOCCountVisitor}
  *   <li>{@link CLOCCountVisitor#setCount$detekt_metrics(int)}
  *   <li>{@link CLOCCountVisitor#getCount$detekt_metrics()}
  * </ul>
  */
  @Test
  void testConstructor() {
    // Arrange and Act
    CLOCCountVisitor actualClocCountVisitor = new CLOCCountVisitor();
    actualClocCountVisitor.setCount$detekt_metrics(3);

    // Assert
    assertEquals(3, actualClocCountVisitor.getCount$detekt_metrics());
  }
}

