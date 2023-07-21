package io.gitlab.arturbosch.detekt.core;

import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class TaskPoolKtDiffblueTest {
  /**
  * Method under test: {@link TaskPoolKt#awaitAll(List)}
  */
  @Test
  void testAwaitAll() {
    // Arrange, Act and Assert
    assertTrue(TaskPoolKt.awaitAll(new ArrayList<>()).isEmpty());
  }
}

