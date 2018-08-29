$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Application.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: Thuan.Nguyen"
    }
  ],
  "line": 4,
  "name": "Testing with Expedia",
  "description": "I want to use this template for my feature file",
  "id": "testing-with-expedia",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 8,
  "name": "check perform normal",
  "description": "",
  "id": "testing-with-expedia;check-perform-normal",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "Open init browser",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "Click button Flights",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Enter information",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "Click button Search",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Verify information",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "locse browser",
  "keyword": "Then "
});
formatter.match({
  "location": "ExpediaSteps.open_init_browser()"
});
formatter.result({
  "duration": 14288058463,
  "status": "passed"
});
formatter.match({
  "location": "ExpediaSteps.click_button_Flights()"
});
formatter.result({
  "duration": 5008197947,
  "status": "passed"
});
formatter.match({
  "location": "ExpediaSteps.enter_information()"
});
formatter.result({
  "duration": 8293806227,
  "status": "passed"
});
formatter.match({
  "location": "ExpediaSteps.click_button_Search()"
});
formatter.result({
  "duration": 22224129667,
  "status": "passed"
});
formatter.match({
  "location": "ExpediaSteps.verify_information()"
});
formatter.result({
  "duration": 32158,
  "status": "passed"
});
formatter.match({
  "location": "ExpediaSteps.locse_browser()"
});
formatter.result({
  "duration": 29079,
  "status": "passed"
});
});