$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("component/feature/mendeley/create_new_account.feature");
formatter.feature({
  "line": 2,
  "name": "New Account Creation",
  "description": "  As a user\n  I want to create a new mendeley account,\n  So that users can engage with our services",
  "id": "new-account-creation",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@mendeley_e2e_tests"
    }
  ]
});
formatter.scenarioOutline({
  "line": 10,
  "name": "New Account Registration",
  "description": "",
  "id": "new-account-creation;new-account-registration",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 12,
  "name": "the user is on the \"Elsevier global signin\" page",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "the user enters the \"\u003cemail\u003e\" id",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "the user clicks on the \"Continue\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "the user is on the \"Register\" page",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "the user enters the following information",
  "rows": [
    {
      "cells": [
        "given_name",
        "family_name",
        "password"
      ],
      "line": 17
    },
    {
      "cells": [
        "arshiya",
        "hussain",
        "password123"
      ],
      "line": 18
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "the user clicks on the \"Register\"",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "the user sees the \"You are registered\" message displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "the user clicks on the \"Continue to Mendeley\"",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "the user is on the \"Welcome to Mendeley\" page",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "the user clicks on the \"Skip this step\"",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "the user sees the profile link on the top right corner of the page",
  "keyword": "And "
});
formatter.examples({
  "line": 26,
  "name": "",
  "description": "",
  "id": "new-account-creation;new-account-registration;",
  "rows": [
    {
      "cells": [
        "email"
      ],
      "line": 27,
      "id": "new-account-creation;new-account-registration;;1"
    },
    {
      "cells": [
        "arshiya.hussain"
      ],
      "line": 28,
      "id": "new-account-creation;new-account-registration;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 2465203111,
  "status": "passed"
});
formatter.background({
  "line": 6,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 7,
  "name": "the user is on the mendeley homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "the user clicks on the \"Create Account\" link",
  "keyword": "And "
});
formatter.match({
  "location": "MendeleyStepsImplementation.the_user_is_on_the_mendeley_homepage()"
});
formatter.result({
  "duration": 2003856567,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Create Account",
      "offset": 24
    }
  ],
  "location": "MendeleyStepsImplementation.the_user_clicks_on_the_link(String)"
});
formatter.result({
  "duration": 1098204888,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "New Account Registration",
  "description": "",
  "id": "new-account-creation;new-account-registration;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@mendeley_e2e_tests"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "the user is on the \"Elsevier global signin\" page",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "the user enters the \"arshiya.hussain\" id",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "the user clicks on the \"Continue\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "the user is on the \"Register\" page",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "the user enters the following information",
  "rows": [
    {
      "cells": [
        "given_name",
        "family_name",
        "password"
      ],
      "line": 17
    },
    {
      "cells": [
        "arshiya",
        "hussain",
        "password123"
      ],
      "line": 18
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "the user clicks on the \"Register\"",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "the user sees the \"You are registered\" message displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "the user clicks on the \"Continue to Mendeley\"",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "the user is on the \"Welcome to Mendeley\" page",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "the user clicks on the \"Skip this step\"",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "the user sees the profile link on the top right corner of the page",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Elsevier global signin",
      "offset": 20
    }
  ],
  "location": "MendeleyStepsImplementation.the_user_is_on_the_page(String)"
});
formatter.result({
  "duration": 548781756,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "arshiya.hussain",
      "offset": 21
    }
  ],
  "location": "MendeleyStepsImplementation.the_user_enters_the_id(String)"
});
formatter.result({
  "duration": 817993445,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Continue",
      "offset": 24
    }
  ],
  "location": "MendeleyStepsImplementation.the_user_clicks_on_the_button(String)"
});
formatter.result({
  "duration": 11412762682,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Register",
      "offset": 20
    }
  ],
  "location": "MendeleyStepsImplementation.the_user_is_on_the_page(String)"
});
formatter.result({
  "duration": 550988521,
  "status": "passed"
});
formatter.match({
  "location": "MendeleyStepsImplementation.the_user_enters_the_following_information(DataTable)"
});
formatter.result({
  "duration": 848094051,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Register",
      "offset": 24
    }
  ],
  "location": "MendeleyStepsImplementation.the_user_clicks_on_the_button(String)"
});
formatter.result({
  "duration": 11949388016,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "You are registered",
      "offset": 19
    }
  ],
  "location": "MendeleyStepsImplementation.the_user_sees_the_message_displayed(String)"
});
formatter.result({
  "duration": 566715267,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Continue to Mendeley",
      "offset": 24
    }
  ],
  "location": "MendeleyStepsImplementation.the_user_clicks_on_the_button(String)"
});
formatter.result({
  "duration": 11206217757,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Welcome to Mendeley",
      "offset": 20
    }
  ],
  "location": "MendeleyStepsImplementation.the_user_is_on_the_page(String)"
});
formatter.result({
  "duration": 179691,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Skip this step",
      "offset": 24
    }
  ],
  "location": "MendeleyStepsImplementation.the_user_clicks_on_the_button(String)"
});
formatter.result({
  "duration": 10781187490,
  "status": "passed"
});
formatter.match({
  "location": "MendeleyStepsImplementation.the_user_sees_the_profile_link_on_the_top_right_corner_of_the_page()"
});
formatter.result({
  "duration": 1109401140,
  "status": "passed"
});
});