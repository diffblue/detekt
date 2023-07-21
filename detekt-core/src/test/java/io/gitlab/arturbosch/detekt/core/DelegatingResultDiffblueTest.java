package io.gitlab.arturbosch.detekt.core;

import static org.junit.jupiter.api.Assertions.assertSame;
import io.gitlab.arturbosch.detekt.api.Detektion;
import io.gitlab.arturbosch.detekt.api.Finding;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;

class DelegatingResultDiffblueTest {
  /**
  * Methods under test: 
  * 
  * <ul>
  *   <li>{@link DelegatingResult#DelegatingResult(Detektion, Map)}
  *   <li>{@link DelegatingResult#getFindings()}
  * </ul>
  */
  @Test
  void testConstructor() {
    // Arrange
    DetektResult result = new DetektResult(new HashMap<>());
    HashMap<String, List<? extends Finding>> findings = new HashMap<>();

    // Act and Assert
    assertSame(findings, (new DelegatingResult(result, findings)).getFindings());
  }
}

