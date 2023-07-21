package io.github.detekt.report.md;

import static org.junit.jupiter.api.Assertions.assertEquals;
import io.github.detekt.utils.MarkdownContent;
import org.junit.jupiter.api.Test;

class MdOutputReportKtDiffblueTest {
  /**
  * Method under test: {@link MdOutputReportKt#link(MarkdownContent, String, String)}
  */
  @Test
  void testLink() {
    // Arrange, Act and Assert
    assertEquals("[Text](https://example.org/example)",
        MdOutputReportKt.link(new MarkdownContent(), "Text", "https://example.org/example"));
  }
}

