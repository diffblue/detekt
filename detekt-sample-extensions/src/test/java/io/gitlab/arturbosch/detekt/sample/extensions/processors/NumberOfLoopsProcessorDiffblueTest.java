package io.gitlab.arturbosch.detekt.sample.extensions.processors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class NumberOfLoopsProcessorDiffblueTest {
  /**
  * Methods under test: 
  * 
  * <ul>
  *   <li>default or parameterless constructor of {@link NumberOfLoopsProcessor.LoopVisitor}
  *   <li>{@link NumberOfLoopsProcessor.LoopVisitor#setNumberOfLoops$detekt_sample_extensions(int)}
  *   <li>{@link NumberOfLoopsProcessor.LoopVisitor#getNumberOfLoops$detekt_sample_extensions()}
  * </ul>
  */
  @Test
  void testLoopVisitorConstructor() {
    // Arrange and Act
    NumberOfLoopsProcessor.LoopVisitor actualLoopVisitor = new NumberOfLoopsProcessor.LoopVisitor();
    actualLoopVisitor.setNumberOfLoops$detekt_sample_extensions(10);

    // Assert
    assertEquals(10, actualLoopVisitor.getNumberOfLoops$detekt_sample_extensions());
  }
}

