package io.gitlab.arturbosch.detekt.api.internal;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import io.gitlab.arturbosch.detekt.api.Finding;
import java.util.List;
import kotlin.collections.EmptyList;
import org.junit.jupiter.api.Test;

class DefaultContextDiffblueTest {
  /**
   * Method under test: {@link DefaultContext#clearFindings()}
   */
  @Test
  void testClearFindings() {
    // Arrange
    DefaultContext defaultContext = new DefaultContext();

    // Act
    defaultContext.clearFindings();

    // Assert
    assertTrue(defaultContext.getFindings() instanceof EmptyList);
  }

  /**
  * Method under test: default or parameterless constructor of {@link DefaultContext}
  */
  @Test
  void testConstructor() {
    // Arrange, Act and Assert
    assertTrue((new DefaultContext()).getFindings() instanceof EmptyList);
  }

  /**
   * Method under test: {@link DefaultContext#getFindings()}
   */
  @Test
  void testGetFindings() {
    // Arrange and Act
    List<Finding> actualFindings = (new DefaultContext()).getFindings();

    // Assert
    assertSame(((EmptyList) actualFindings).INSTANCE, actualFindings);
    assertTrue(actualFindings.isEmpty());
  }
}

