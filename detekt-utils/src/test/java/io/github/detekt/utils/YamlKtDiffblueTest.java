package io.github.detekt.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;

class YamlKtDiffblueTest {
  /**
  * Method under test: {@link YamlKt#list(YamlNode, String, List)}
  */
  @Test
  void testList() {
    // Arrange
    YamlNode $this$list = new YamlNode();

    // Act
    YamlKt.list($this$list, "Name", new ArrayList<>());

    // Assert
    assertEquals("Name: []", $this$list.getContent());
  }

  /**
   * Method under test: {@link YamlKt#list(YamlNode, String, List)}
   */
  @Test
  void testList2() {
    // Arrange
    YamlNode $this$list = new YamlNode();

    ArrayList<String> list = new ArrayList<>();
    list.add("foo");

    // Act
    YamlKt.list($this$list, "foo", list);

    // Assert
    assertEquals("foo:\n  - 'foo'", $this$list.getContent());
  }

  /**
   * Method under test: {@link YamlKt#list(YamlNode, String, List)}
   */
  @Test
  void testList3() {
    // Arrange
    YamlNode $this$list = new YamlNode();

    ArrayList<String> list = new ArrayList<>();
    list.add("");

    // Act
    YamlKt.list($this$list, "Name", list);

    // Assert
    assertEquals("Name:\n  - ''", $this$list.getContent());
  }

  /**
   * Method under test: {@link YamlKt#list(YamlNode, String, List)}
   */
  @Test
  void testList4() {
    // Arrange
    YamlNode $this$list = new YamlNode(58, "Not all who wander are lost");

    ArrayList<String> list = new ArrayList<>();
    list.add("");

    // Act
    YamlKt.list($this$list, "Name", list);

    // Assert
    assertEquals("Not all who wander are lost\n"
        + "                                                                                                    "
        + "                Name:\n"
        + "                                                                                                    "
        + "                  - ''", $this$list.getContent());
  }

  /**
   * Method under test: {@link YamlKt#list(YamlNode, String, List)}
   */
  @Test
  void testList5() {
    // Arrange
    YamlNode $this$list = new YamlNode();

    ArrayList<String> list = new ArrayList<>();
    list.add("'");

    // Act
    YamlKt.list($this$list, "foo", list);

    // Assert
    assertEquals("foo:\n  - '", $this$list.getContent());
  }

  /**
   * Method under test: {@link YamlKt#list(YamlNode, String, List)}
   */
  @Test
  void testList6() {
    // Arrange
    YamlNode $this$list = new YamlNode();

    ArrayList<String> list = new ArrayList<>();
    list.add("\"");

    // Act
    YamlKt.list($this$list, "foo", list);

    // Assert
    assertEquals("foo:\n  - \"", $this$list.getContent());
  }

  /**
   * Method under test: {@link YamlKt#listOfMaps(YamlNode, String, List)}
   */
  @Test
  void testListOfMaps() {
    // Arrange
    YamlNode $this$listOfMaps = new YamlNode();

    // Act
    YamlKt.listOfMaps($this$listOfMaps, "Name", new ArrayList<>());

    // Assert
    assertEquals("Name: []", $this$listOfMaps.getContent());
  }

  /**
   * Method under test: {@link YamlKt#listOfMaps(YamlNode, String, List)}
   */
  @Test
  void testListOfMaps2() {
    // Arrange
    YamlNode $this$listOfMaps = new YamlNode(1, "Not all who wander are lost");

    // Act
    YamlKt.listOfMaps($this$listOfMaps, "Name", new ArrayList<>());

    // Assert
    assertEquals("Not all who wander are lost\n  Name: []", $this$listOfMaps.getContent());
  }

  /**
   * Method under test: {@link YamlKt#listOfMaps(YamlNode, String, List)}
   */
  @Test
  void testListOfMaps3() {
    // Arrange
    YamlNode $this$listOfMaps = new YamlNode();

    ArrayList<Map<String, String>> maps = new ArrayList<>();
    maps.add(new HashMap<>());

    // Act
    YamlKt.listOfMaps($this$listOfMaps, "Name", maps);

    // Assert
    assertEquals("Name: []", $this$listOfMaps.getContent());
  }

  /**
   * Method under test: {@link YamlKt#listOfMaps(YamlNode, String, List)}
   */
  @Test
  void testListOfMaps4() {
    // Arrange
    YamlNode $this$listOfMaps = new YamlNode(27, "Not all who wander are lost");

    // Act
    YamlKt.listOfMaps($this$listOfMaps, "Name", new ArrayList<>());

    // Assert
    assertEquals("Not all who wander are lost\n                                                      Name: []",
        $this$listOfMaps.getContent());
  }

  /**
   * Method under test: {@link YamlKt#listOfMaps(YamlNode, String, List)}
   */
  @Test
  void testListOfMaps5() {
    // Arrange
    YamlNode $this$listOfMaps = new YamlNode();

    HashMap<String, String> stringStringMap = new HashMap<>();
    stringStringMap.put("<this>", "<this>");

    ArrayList<Map<String, String>> maps = new ArrayList<>();
    maps.add(stringStringMap);

    // Act
    YamlKt.listOfMaps($this$listOfMaps, "Name", maps);

    // Assert
    assertEquals("Name:\n  - <this>: '<this>'", $this$listOfMaps.getContent());
  }

  /**
   * Method under test: {@link YamlKt#listOfMaps(YamlNode, String, List)}
   */
  @Test
  void testListOfMaps6() {
    // Arrange
    YamlNode $this$listOfMaps = new YamlNode();

    HashMap<String, String> stringStringMap = new HashMap<>();
    stringStringMap.put("name", "name");
    stringStringMap.put("<this>", "<this>");

    ArrayList<Map<String, String>> maps = new ArrayList<>();
    maps.add(stringStringMap);

    // Act
    YamlKt.listOfMaps($this$listOfMaps, "Name", maps);

    // Assert
    assertEquals("Name:\n  - <this>: '<this>'\n    name: 'name'", $this$listOfMaps.getContent());
  }

  /**
   * Method under test: {@link YamlKt#listOfMaps(YamlNode, String, List)}
   */
  @Test
  void testListOfMaps7() {
    // Arrange
    YamlNode $this$listOfMaps = new YamlNode();

    HashMap<String, String> stringStringMap = new HashMap<>();
    stringStringMap.put("<this>", null);

    ArrayList<Map<String, String>> maps = new ArrayList<>();
    maps.add(stringStringMap);

    // Act
    YamlKt.listOfMaps($this$listOfMaps, "Name", maps);

    // Assert
    assertEquals("Name:", $this$listOfMaps.getContent());
  }

  /**
   * Method under test: {@link YamlKt#listOfMaps(YamlNode, String, List)}
   */
  @Test
  void testListOfMaps8() {
    // Arrange
    YamlNode $this$listOfMaps = new YamlNode();

    HashMap<String, String> stringStringMap = new HashMap<>();
    stringStringMap.put("<this>", "");

    ArrayList<Map<String, String>> maps = new ArrayList<>();
    maps.add(stringStringMap);

    // Act
    YamlKt.listOfMaps($this$listOfMaps, "Name", maps);

    // Assert
    assertEquals("Name:\n  - <this>: ''", $this$listOfMaps.getContent());
  }

  /**
   * Method under test: {@link YamlKt#listOfMaps(YamlNode, String, List)}
   */
  @Test
  void testListOfMaps9() {
    // Arrange
    YamlNode $this$listOfMaps = new YamlNode();

    HashMap<String, String> stringStringMap = new HashMap<>();
    stringStringMap.put("<this>", "'");

    ArrayList<Map<String, String>> maps = new ArrayList<>();
    maps.add(stringStringMap);

    // Act
    YamlKt.listOfMaps($this$listOfMaps, "Name", maps);

    // Assert
    assertEquals("Name:\n  - <this>: '", $this$listOfMaps.getContent());
  }

  /**
   * Method under test: {@link YamlKt#listOfMaps(YamlNode, String, List)}
   */
  @Test
  void testListOfMaps10() {
    // Arrange
    YamlNode $this$listOfMaps = new YamlNode();

    HashMap<String, String> stringStringMap = new HashMap<>();
    stringStringMap.put("<this>", "\"");

    ArrayList<Map<String, String>> maps = new ArrayList<>();
    maps.add(stringStringMap);

    // Act
    YamlKt.listOfMaps($this$listOfMaps, "Name", maps);

    // Assert
    assertEquals("Name:\n  - <this>: \"", $this$listOfMaps.getContent());
  }
}

