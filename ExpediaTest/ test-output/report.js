$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Application.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: Thuan.Nguyen"
    }
  ],
  "line": 2,
  "name": "Testing with Expedia",
  "description": "I want to use this template for my feature file",
  "id": "testing-with-expedia",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 31,
  "name": "check perform OutLine Examples",
  "description": "",
  "id": "testing-with-expedia;check-perform-outline-examples",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 30,
      "name": "@tag3"
    }
  ]
});
formatter.step({
  "line": 32,
  "name": "Enter information \"\u003cFlyingFrom\u003e\" and \"\u003cFlyingTo\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "Click button Search",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "Verify information",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "locse browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 37,
  "name": "",
  "description": "",
  "id": "testing-with-expedia;check-perform-outline-examples;",
  "rows": [
    {
      "cells": [
        "FlyingFrom",
        "FlyingTo"
      ],
      "line": 38,
      "id": "testing-with-expedia;check-perform-outline-examples;;1"
    },
    {
      "cells": [
        "Ho Chi Minh",
        "Hanoi"
      ],
      "line": 39,
      "id": "testing-with-expedia;check-perform-outline-examples;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "line": 5,
  "name": "open browser and click search",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "Open init browser",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Click button Flights",
  "keyword": "And "
});
formatter.match({
  "location": "ExpediaSteps.open_init_browser()"
});
formatter.result({
  "duration": 24948390466,
  "status": "passed"
});
formatter.match({
  "location": "ExpediaSteps.click_button_Flights()"
});
formatter.result({
  "duration": 843091021,
  "status": "passed"
});
formatter.scenario({
  "line": 39,
  "name": "check perform OutLine Examples",
  "description": "",
  "id": "testing-with-expedia;check-perform-outline-examples;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 30,
      "name": "@tag3"
    }
  ]
});
formatter.step({
  "line": 32,
  "name": "Enter information \"Ho Chi Minh\" and \"Hanoi\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "Click button Search",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "Verify information",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "locse browser",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Ho Chi Minh",
      "offset": 19
    },
    {
      "val": "Hanoi",
      "offset": 37
    }
  ],
  "location": "ExpediaSteps.enter_information_and(String,String)"
});
formatter.result({
  "duration": 18481868764,
  "status": "passed"
});
formatter.match({
  "location": "ExpediaSteps.click_button_Search()"
});
formatter.result({
  "duration": 25715810742,
  "status": "passed"
});
formatter.match({
  "location": "ExpediaSteps.verify_information()"
});
formatter.result({
  "duration": 803118599,
  "status": "passed"
});
formatter.match({
  "location": "ExpediaSteps.locse_browser()"
});
formatter.result({
  "duration": 941464143,
  "status": "passed"
});
});