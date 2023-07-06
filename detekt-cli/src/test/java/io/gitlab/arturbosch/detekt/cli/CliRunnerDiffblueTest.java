package io.gitlab.arturbosch.detekt.cli;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import io.github.detekt.test.utils.NullPrintStream;
import io.github.detekt.tooling.api.AnalysisResult;
import io.github.detekt.tooling.api.DetektError;
import io.github.detekt.tooling.api.UnexpectedError;
import org.junit.jupiter.api.Test;

class CliRunnerDiffblueTest {
  /**
  * Method under test: {@link CliRunner#run(String[])}
  */
  @Test
  void testRun() {
    // Arrange and Act
    AnalysisResult actualRunResult = (new CliRunner()).run(new String[]{"Args"});

    // Assert
    assertNull(actualRunResult.getContainer());
    DetektError error = actualRunResult.getError();
    assertTrue(error instanceof UnexpectedError);
    Throwable cause = error.getCause();
    assertTrue(cause instanceof HandledArgumentViolation);
    assertEquals("Usage: detekt [options]\n" + "  Options:\n" + "    --all-rules\n"
        + "      Activates all available (even unstable) rules.\n" + "      Default: false\n"
        + "    --auto-correct, -ac\n" + "      Allow rules to auto correct code if they support it. The default rule \n"
        + "      sets do NOT support auto correcting and won't change any line in the \n"
        + "      users code base. However custom rules can be written to support auto \n"
        + "      correcting. The additional 'formatting' rule set, added with \n"
        + "      '--plugins', does support it and needs this flag.\n" + "      Default: false\n"
        + "    --base-path, -bp\n" + "      Specifies a directory as the base path.Currently it impacts all file \n"
        + "      paths in the formatted reports. File paths in console output and txt \n"
        + "      report are not affected and remain as absolute paths.\n" + "    --baseline, -b\n"
        + "      If a baseline xml file is passed in, only new code smells not in the \n"
        + "      baseline are printed in the console.\n" + "    --build-upon-default-config\n"
        + "      Preconfigures detekt with a bunch of rules and some opinionated defaults \n"
        + "      for you. Allows additional provided configurations to override the \n" + "      defaults. \n"
        + "      Default: false\n" + "    --classpath, -cp\n"
        + "      EXPERIMENTAL: Paths where to find user class files and depending jar \n"
        + "      files. Used for type resolution.\n" + "    --config, -c\n"
        + "      Path to the config file (path/to/config.yml). Multiple configuration \n"
        + "      files can be specified with ',' or ';' as separator.\n" + "    --config-resource, -cr\n"
        + "      Path to the config resource on detekt's classpath (path/to/config.yml).\n"
        + "    --create-baseline, -cb\n"
        + "      Treats current analysis findings as a smell baseline for future detekt \n" + "      runs. \n"
        + "      Default: false\n" + "    --debug\n"
        + "      Prints extra information about configurations and extensions.\n" + "      Default: false\n"
        + "    --disable-default-rulesets, -dd\n" + "      Disables default rule sets.\n" + "      Default: false\n"
        + "    --excludes, -ex\n" + "      Globbing patterns describing paths to exclude from the analysis.\n"
        + "    --generate-config, -gc\n" + "      Export default config. Path can be specified with --config option \n"
        + "      (default path: default-detekt-config.yml)\n" + "      Default: false\n" + "    --help, -h\n"
        + "      Shows the usage.\n" + "    --includes, -in\n"
        + "      Globbing patterns describing paths to include in the analysis. Useful in \n"
        + "      combination with 'excludes' patterns.\n" + "    --input, -i\n"
        + "      Input paths to analyze. Multiple paths are separated by comma. If not \n"
        + "      specified the current working directory is used.\n" + "    --jdk-home\n"
        + "      EXPERIMENTAL: Use a custom JDK home directory to include into the \n" + "      classpath \n"
        + "    --jvm-target\n" + "      EXPERIMENTAL: Target version of the generated JVM bytecode that was \n"
        + "      generated during compilation and is now being used for type resolution \n"
        + "      (1.8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18 or 19)\n" + "      Default: 1.8\n"
        + "    --language-version\n" + "      EXPERIMENTAL: Compatibility mode for Kotlin language version X.Y, \n"
        + "      reports errors for all language features that came out later\n"
        + "      Possible Values: [1.0, 1.1, 1.2, 1.3, 1.4, 1.5, 1.6, 1.7, 1.8, 1.9, 2.0]\n" + "    --max-issues\n"
        + "      Return exit code 0 only when found issues count does not exceed \n" + "      specified issues count.\n"
        + "    --parallel\n" + "      Enables parallel compilation and analysis of source files. Do some \n"
        + "      benchmarks first before enabling this flag. Heuristics show performance \n"
        + "      benefits starting from 2000 lines of Kotlin code.\n" + "      Default: false\n" + "    --plugins, -p\n"
        + "      Extra paths to plugin jars separated by ',' or ';'.\n" + "    --report, -r\n"
        + "      Generates a report for given 'report-id' and stores it on given 'path'. \n"
        + "      Entry should consist of: [report-id:path]. Available 'report-id' values: \n"
        + "      'txt', 'xml', 'html', 'md', 'sarif'. These can also be used in \n"
        + "      combination with each other e.g. '-r txt:reports/detekt.txt -r \n" + "      xml:reports/detekt.xml' \n"
        + "    --version\n" + "      Prints the detekt CLI version.\n" + "      Default: false\n",
        ((HandledArgumentViolation) cause).getUsageText());
  }

  /**
   * Method under test: {@link CliRunner#run(String[])}
   */
  @Test
  void testRun2() {
    // Arrange and Act
    AnalysisResult actualRunResult = (new CliRunner()).run(new String[]{null});

    // Assert
    assertNull(actualRunResult.getContainer());
    assertTrue(actualRunResult.getError() instanceof UnexpectedError);
  }

  /**
   * Method under test: {@link CliRunner#run(String[], Appendable, Appendable)}
   */
  @Test
  void testRun3() {
    // Arrange
    CliRunner cliRunner = new CliRunner();
    NullPrintStream outputChannel = new NullPrintStream();

    // Act
    AnalysisResult actualRunResult = cliRunner.run(new String[]{"Args"}, outputChannel, new NullPrintStream());

    // Assert
    assertNull(actualRunResult.getContainer());
    DetektError error = actualRunResult.getError();
    assertTrue(error instanceof UnexpectedError);
    Throwable cause = error.getCause();
    assertTrue(cause instanceof HandledArgumentViolation);
    assertEquals("Usage: detekt [options]\n" + "  Options:\n" + "    --all-rules\n"
        + "      Activates all available (even unstable) rules.\n" + "      Default: false\n"
        + "    --auto-correct, -ac\n" + "      Allow rules to auto correct code if they support it. The default rule \n"
        + "      sets do NOT support auto correcting and won't change any line in the \n"
        + "      users code base. However custom rules can be written to support auto \n"
        + "      correcting. The additional 'formatting' rule set, added with \n"
        + "      '--plugins', does support it and needs this flag.\n" + "      Default: false\n"
        + "    --base-path, -bp\n" + "      Specifies a directory as the base path.Currently it impacts all file \n"
        + "      paths in the formatted reports. File paths in console output and txt \n"
        + "      report are not affected and remain as absolute paths.\n" + "    --baseline, -b\n"
        + "      If a baseline xml file is passed in, only new code smells not in the \n"
        + "      baseline are printed in the console.\n" + "    --build-upon-default-config\n"
        + "      Preconfigures detekt with a bunch of rules and some opinionated defaults \n"
        + "      for you. Allows additional provided configurations to override the \n" + "      defaults. \n"
        + "      Default: false\n" + "    --classpath, -cp\n"
        + "      EXPERIMENTAL: Paths where to find user class files and depending jar \n"
        + "      files. Used for type resolution.\n" + "    --config, -c\n"
        + "      Path to the config file (path/to/config.yml). Multiple configuration \n"
        + "      files can be specified with ',' or ';' as separator.\n" + "    --config-resource, -cr\n"
        + "      Path to the config resource on detekt's classpath (path/to/config.yml).\n"
        + "    --create-baseline, -cb\n"
        + "      Treats current analysis findings as a smell baseline for future detekt \n" + "      runs. \n"
        + "      Default: false\n" + "    --debug\n"
        + "      Prints extra information about configurations and extensions.\n" + "      Default: false\n"
        + "    --disable-default-rulesets, -dd\n" + "      Disables default rule sets.\n" + "      Default: false\n"
        + "    --excludes, -ex\n" + "      Globbing patterns describing paths to exclude from the analysis.\n"
        + "    --generate-config, -gc\n" + "      Export default config. Path can be specified with --config option \n"
        + "      (default path: default-detekt-config.yml)\n" + "      Default: false\n" + "    --help, -h\n"
        + "      Shows the usage.\n" + "    --includes, -in\n"
        + "      Globbing patterns describing paths to include in the analysis. Useful in \n"
        + "      combination with 'excludes' patterns.\n" + "    --input, -i\n"
        + "      Input paths to analyze. Multiple paths are separated by comma. If not \n"
        + "      specified the current working directory is used.\n" + "    --jdk-home\n"
        + "      EXPERIMENTAL: Use a custom JDK home directory to include into the \n" + "      classpath \n"
        + "    --jvm-target\n" + "      EXPERIMENTAL: Target version of the generated JVM bytecode that was \n"
        + "      generated during compilation and is now being used for type resolution \n"
        + "      (1.8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18 or 19)\n" + "      Default: 1.8\n"
        + "    --language-version\n" + "      EXPERIMENTAL: Compatibility mode for Kotlin language version X.Y, \n"
        + "      reports errors for all language features that came out later\n"
        + "      Possible Values: [1.0, 1.1, 1.2, 1.3, 1.4, 1.5, 1.6, 1.7, 1.8, 1.9, 2.0]\n" + "    --max-issues\n"
        + "      Return exit code 0 only when found issues count does not exceed \n" + "      specified issues count.\n"
        + "    --parallel\n" + "      Enables parallel compilation and analysis of source files. Do some \n"
        + "      benchmarks first before enabling this flag. Heuristics show performance \n"
        + "      benefits starting from 2000 lines of Kotlin code.\n" + "      Default: false\n" + "    --plugins, -p\n"
        + "      Extra paths to plugin jars separated by ',' or ';'.\n" + "    --report, -r\n"
        + "      Generates a report for given 'report-id' and stores it on given 'path'. \n"
        + "      Entry should consist of: [report-id:path]. Available 'report-id' values: \n"
        + "      'txt', 'xml', 'html', 'md', 'sarif'. These can also be used in \n"
        + "      combination with each other e.g. '-r txt:reports/detekt.txt -r \n" + "      xml:reports/detekt.xml' \n"
        + "    --version\n" + "      Prints the detekt CLI version.\n" + "      Default: false\n",
        ((HandledArgumentViolation) cause).getUsageText());
  }

  /**
   * Method under test: {@link CliRunner#run(String[], Appendable, Appendable)}
   */
  @Test
  void testRun4() {
    // Arrange
    CliRunner cliRunner = new CliRunner();
    NullPrintStream outputChannel = new NullPrintStream();

    // Act
    AnalysisResult actualRunResult = cliRunner.run(new String[]{null}, outputChannel, new NullPrintStream());

    // Assert
    assertNull(actualRunResult.getContainer());
    assertTrue(actualRunResult.getError() instanceof UnexpectedError);
  }
}

