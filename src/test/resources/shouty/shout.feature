Feature: Shout

  Scenario: Listener within range
    Given Lucy is 350m from Sean
    When Sean shouts "free bagels at Sean's"
    Then Lucy should hear Sean's message