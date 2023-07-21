package io.gitlab.arturbosch.detekt.rules.style;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class ForbiddenCommentKtDiffblueTest {
  /**
  * Method under test: {@link ForbiddenCommentKt#getCommentContent(String)}
  */
  @Test
  void testGetCommentContent() {
    // Arrange, Act and Assert
    assertEquals("Not all who wander are lost", ForbiddenCommentKt.getCommentContent("Not all who wander are lost"));
    assertEquals("foo", ForbiddenCommentKt.getCommentContent("foo"));
    assertEquals("", ForbiddenCommentKt.getCommentContent("//"));
    assertEquals("", ForbiddenCommentKt.getCommentContent("\n"));
    assertEquals("", ForbiddenCommentKt.getCommentContent("/*"));
    assertEquals("", ForbiddenCommentKt.getCommentContent("*"));
    assertEquals("", ForbiddenCommentKt.getCommentContent("*/"));
  }
}

