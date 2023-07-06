package io.github.detekt.compiler.plugin;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.Collection;
import java.util.List;
import org.jetbrains.kotlin.compiler.plugin.AbstractCliOption;
import org.jetbrains.kotlin.compiler.plugin.CliOption;
import org.jetbrains.kotlin.compiler.plugin.CliOptionProcessingException;
import org.jetbrains.kotlin.config.CompilerConfiguration;
import org.junit.jupiter.api.Test;

class DetektCommandLineProcessorDiffblueTest {
  /**
  * Methods under test: 
  * 
  * <ul>
  *   <li>default or parameterless constructor of {@link DetektCommandLineProcessor}
  *   <li>{@link DetektCommandLineProcessor#getPluginId()}
  * </ul>
  */
  @Test
  void testConstructor() {
    // Arrange, Act and Assert
    assertEquals("detekt-compiler-plugin", (new DetektCommandLineProcessor()).getPluginId());
  }

  /**
   * Method under test: default or parameterless constructor of {@link DetektCommandLineProcessor}
   */
  @Test
  void testConstructor2() {
    // Arrange and Act
    DetektCommandLineProcessor actualDetektCommandLineProcessor = new DetektCommandLineProcessor();

    // Assert
    assertEquals("detekt-compiler-plugin", actualDetektCommandLineProcessor.getPluginId());
    Collection<AbstractCliOption> pluginOptions = actualDetektCommandLineProcessor.getPluginOptions();
    assertEquals(12, pluginOptions.size());
    AbstractCliOption getResult = ((List<AbstractCliOption>) pluginOptions).get(1);
    assertEquals("<digest>", getResult.getValueDescription());
    AbstractCliOption getResult2 = ((List<AbstractCliOption>) pluginOptions).get(2);
    assertEquals("<path>", getResult2.getValueDescription());
    assertFalse(getResult2.getRequired());
    assertEquals(Options.baseline, getResult2.getOptionName());
    assertEquals("Path to a detekt baseline file.", getResult2.getDescription());
    assertFalse(getResult2.getAllowMultipleOccurrences());
    assertFalse(getResult.getRequired());
    assertEquals(Options.configDigest, getResult.getOptionName());
    assertEquals(
        "A digest calculated from the content of the config files. Used for Gradle incremental task" + " invalidation.",
        getResult.getDescription());
    assertFalse(getResult.getAllowMultipleOccurrences());
    AbstractCliOption getResult3 = ((List<AbstractCliOption>) pluginOptions).get(10);
    assertFalse(getResult3.getRequired());
    assertEquals(Options.excludes, getResult3.getOptionName());
    assertEquals("A base64-encoded list of the globs used to exclude paths from scanning.",
        getResult3.getDescription());
    assertFalse(getResult3.getAllowMultipleOccurrences());
    AbstractCliOption getResult4 = ((List<AbstractCliOption>) pluginOptions).get(9);
    assertFalse(getResult4.getRequired());
    assertEquals(Options.rootPath, getResult4.getOptionName());
    assertEquals("Root path used to relativize paths when using exclude patterns.", getResult4.getDescription());
    assertFalse(getResult4.getAllowMultipleOccurrences());
    AbstractCliOption getResult5 = ((List<AbstractCliOption>) pluginOptions).get(11);
    assertFalse(getResult5.getRequired());
    assertEquals(Options.report, getResult5.getOptionName());
    assertEquals("<report-id:path>", getResult5.getValueDescription());
    assertTrue(getResult5.getAllowMultipleOccurrences());
    AbstractCliOption getResult6 = ((List<AbstractCliOption>) pluginOptions).get(0);
    assertFalse(getResult6.getRequired());
    assertEquals(Options.config, getResult6.getOptionName());
    assertEquals("<path>", getResult4.getValueDescription());
    assertFalse(getResult6.getAllowMultipleOccurrences());
    assertEquals("Comma separated paths to detekt config files.", getResult6.getDescription());
    assertEquals("<path|paths>", getResult6.getValueDescription());
    assertEquals("<base64-encoded globs>", getResult3.getValueDescription());
    assertEquals("Generates a report for given 'report-id' and stores it on given 'path'. Available 'report-id' values:"
        + " 'txt', 'xml', 'html'.", getResult5.getDescription());
  }

  /**
   * Method under test: {@link DetektCommandLineProcessor#processOption(AbstractCliOption, String, CompilerConfiguration)}
   */
  @Test
  void testProcessOption() {
    // Arrange
    DetektCommandLineProcessor detektCommandLineProcessor = new DetektCommandLineProcessor();
    CliOption option = new CliOption("Option Name", "42", "The characteristics of someone or something", true, true);

    // Act and Assert
    assertThrows(CliOptionProcessingException.class,
        () -> detektCommandLineProcessor.processOption((AbstractCliOption) option, "42", new CompilerConfiguration()));
  }
}

