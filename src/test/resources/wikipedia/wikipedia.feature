Feature: Wiki search
  Agile story: As an searcher able to search on Wikipedia

  @wiki
Scenario Outline: Search functionality header verification
    When User on the wikipedia main page
    When User searches "<searchValue>" in the wiki search page
    Then User should see "<expectedTitle>" in the wiki title
    Then User should see "<expectedMainHeader>" in the main header
    Then User should see "<expectedImageHeader>" in the image header
    Examples: example test data for wikipedia search
    | searchValue | expectedTitle | expectedMainHeader | expectedImageHeader |
    | Steve Jobs | Steve Jobs | Steve Jobs | Steve Jobs |
    | John Travolta | John Travolta | John Travolta | John Travolta |
    | Albert Einstein | Albert Einstein | Albert Einstein | Albert Einstein |
    | Keanu Reeves | Keanu Reeves | Keanu Reeves | Keanu Reeves |
    | Bruce Lee | Bruce Lee | Bruce Lee | Bruce Lee |
    | Dua Lipa | Dua Lipa | Dua Lipa | Dua Lipa |
    | Thomas Edison | Thomas Edison | Thomas Edison | Thomas Edison |
    | Sam Heughan | Sam Heughan | Sam Heughan | Sam Heughan |
