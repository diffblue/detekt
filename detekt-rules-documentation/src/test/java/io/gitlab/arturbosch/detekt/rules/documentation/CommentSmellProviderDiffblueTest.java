package io.gitlab.arturbosch.detekt.rules.documentation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class CommentSmellProviderDiffblueTest {
  /**
  * Methods under test: 
  * 
  * <ul>
  *   <li>default or parameterless constructor of {@link CommentSmellProvider}
  *   <li>{@link CommentSmellProvider#getRuleSetId()}
  * </ul>
  */
  @Test
  void testConstructor() {
    // Arrange, Act and Assert
    assertEquals("comments", (new CommentSmellProvider()).getRuleSetId());
  }
}

