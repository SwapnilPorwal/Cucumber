$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("FacebookLogin.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    },
    {
      "line": 3,
      "value": "#Feature: List of scenarios."
    },
    {
      "line": 4,
      "value": "#Scenario: Business rule through list of steps with arguments."
    },
    {
      "line": 5,
      "value": "#Given: Some precondition step"
    },
    {
      "line": 6,
      "value": "#When: Some key actions"
    },
    {
      "line": 7,
      "value": "#Then: To observe outcomes or validation"
    },
    {
      "line": 8,
      "value": "#And,But: To enumerate more Given,When,Then steps"
    },
    {
      "line": 9,
      "value": "#Scenario Outline: List of steps for data-driven as an Examples and \u003cplaceholder\u003e"
    },
    {
      "line": 10,
      "value": "#Examples: Container for s table"
    },
    {
      "line": 11,
      "value": "#Background: List of steps run before each of the scenarios"
    },
    {
      "line": 12,
      "value": "#\"\"\" (Doc Strings)"
    },
    {
      "line": 13,
      "value": "#| (Data Tables)"
    },
    {
      "line": 14,
      "value": "#@ (Tags/Labels):To group Scenarios"
    },
    {
      "line": 15,
      "value": "#\u003c\u003e (placeholder)"
    },
    {
      "line": 16,
      "value": "#\"\""
    },
    {
      "line": 17,
      "value": "## (Comments)"
    },
    {
      "line": 18,
      "value": "#Sample Feature Definition Template"
    }
  ],
  "line": 20,
  "name": "Facebook Login Scenario",
  "description": "I want to test Facebook Login scenario",
  "id": "facebook-login-scenario",
  "keyword": "Feature",
  "tags": [
    {
      "line": 19,
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "line": 24,
  "name": "Login to Facebook with Valid Credentials - No Parameter",
  "description": "",
  "id": "facebook-login-scenario;login-to-facebook-with-valid-credentials---no-parameter",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 23,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "Open Chrome and launch Facebook",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "User Enter valid UserName and Password",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "Click login button",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "User should login successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "Close Browser",
  "keyword": "And "
});
formatter.match({
  "location": "SmokeTest.open_Chrome_and_launch_Facebook()"
});
formatter.result({
  "duration": 53006267615,
  "status": "passed"
});
formatter.match({
  "location": "SmokeTest.user_Enter_valid_UserName_and_Password()"
});
formatter.result({
  "duration": 721004139,
  "status": "passed"
});
formatter.match({
  "location": "SmokeTest.click_login_button()"
});
formatter.result({
  "duration": 4972128615,
  "status": "passed"
});
formatter.match({
  "location": "SmokeTest.user_should_login_successfully()"
});
formatter.result({
  "duration": 36121557,
  "status": "passed"
});
formatter.match({
  "location": "SmokeTest.close_Browser()"
});
formatter.result({
  "duration": 762101503,
  "status": "passed"
});
formatter.scenario({
  "line": 32,
  "name": "Login to Facebook with Valid Credentials - with Parameter",
  "description": "",
  "id": "facebook-login-scenario;login-to-facebook-with-valid-credentials---with-parameter",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 31,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 33,
  "name": "Open Chrome and launch Facebook",
  "keyword": "Given "
});
formatter.step({
  "line": 34,
  "name": "User Enter valid \"UserName\" and \"Password\"",
  "keyword": "When "
});
formatter.step({
  "line": 35,
  "name": "Click login button",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "User should login successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 37,
  "name": "Close Browser",
  "keyword": "And "
});
formatter.match({
  "location": "SmokeTest.open_Chrome_and_launch_Facebook()"
});
formatter.result({
  "duration": 9530166297,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "UserName",
      "offset": 18
    },
    {
      "val": "Password",
      "offset": 33
    }
  ],
  "location": "SmokeTest.user_Enter_valid_and(String,String)"
});
formatter.result({
  "duration": 252115085,
  "status": "passed"
});
formatter.match({
  "location": "SmokeTest.click_login_button()"
});
formatter.result({
  "duration": 32547223972,
  "status": "passed"
});
formatter.match({
  "location": "SmokeTest.user_should_login_successfully()"
});
formatter.result({
  "duration": 193027000,
  "status": "passed"
});
formatter.match({
  "location": "SmokeTest.close_Browser()"
});
formatter.result({
  "duration": 2473388296,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 40,
  "name": "Login to Facebook with Valid Credentials - Parameter with scenario outline",
  "description": "",
  "id": "facebook-login-scenario;login-to-facebook-with-valid-credentials---parameter-with-scenario-outline",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 39,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 41,
  "name": "Open Chrome and launch Facebook",
  "keyword": "Given "
});
formatter.step({
  "line": 42,
  "name": "User Enter valid \"\u003cUserName\u003e\" and \"\u003cPassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 43,
  "name": "Click login button",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "User should login successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 45,
  "name": "Close Browser",
  "keyword": "And "
});
formatter.examples({
  "line": 47,
  "name": "",
  "description": "",
  "id": "facebook-login-scenario;login-to-facebook-with-valid-credentials---parameter-with-scenario-outline;",
  "rows": [
    {
      "cells": [
        "UserName",
        "Password"
      ],
      "line": 48,
      "id": "facebook-login-scenario;login-to-facebook-with-valid-credentials---parameter-with-scenario-outline;;1"
    },
    {
      "cells": [
        "SwapOne",
        "PasswordOne"
      ],
      "line": 49,
      "id": "facebook-login-scenario;login-to-facebook-with-valid-credentials---parameter-with-scenario-outline;;2"
    },
    {
      "cells": [
        "SwapTwo",
        "PasswordTwo"
      ],
      "line": 50,
      "id": "facebook-login-scenario;login-to-facebook-with-valid-credentials---parameter-with-scenario-outline;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 49,
  "name": "Login to Facebook with Valid Credentials - Parameter with scenario outline",
  "description": "",
  "id": "facebook-login-scenario;login-to-facebook-with-valid-credentials---parameter-with-scenario-outline;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 19,
      "name": "@tag"
    },
    {
      "line": 39,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 41,
  "name": "Open Chrome and launch Facebook",
  "keyword": "Given "
});
formatter.step({
  "line": 42,
  "name": "User Enter valid \"SwapOne\" and \"PasswordOne\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 43,
  "name": "Click login button",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "User should login successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 45,
  "name": "Close Browser",
  "keyword": "And "
});
formatter.match({
  "location": "SmokeTest.open_Chrome_and_launch_Facebook()"
});
formatter.result({
  "duration": 12463313081,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "SwapOne",
      "offset": 18
    },
    {
      "val": "PasswordOne",
      "offset": 32
    }
  ],
  "location": "SmokeTest.user_Enter_valid_and(String,String)"
});
formatter.result({
  "duration": 815232989,
  "status": "passed"
});
formatter.match({
  "location": "SmokeTest.click_login_button()"
});
formatter.result({
  "duration": 4186869156,
  "status": "passed"
});
formatter.match({
  "location": "SmokeTest.user_should_login_successfully()"
});
formatter.result({
  "duration": 17776983,
  "status": "passed"
});
formatter.match({
  "location": "SmokeTest.close_Browser()"
});
formatter.result({
  "duration": 2319933923,
  "status": "passed"
});
formatter.scenario({
  "line": 50,
  "name": "Login to Facebook with Valid Credentials - Parameter with scenario outline",
  "description": "",
  "id": "facebook-login-scenario;login-to-facebook-with-valid-credentials---parameter-with-scenario-outline;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 19,
      "name": "@tag"
    },
    {
      "line": 39,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 41,
  "name": "Open Chrome and launch Facebook",
  "keyword": "Given "
});
formatter.step({
  "line": 42,
  "name": "User Enter valid \"SwapTwo\" and \"PasswordTwo\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 43,
  "name": "Click login button",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "User should login successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 45,
  "name": "Close Browser",
  "keyword": "And "
});
formatter.match({
  "location": "SmokeTest.open_Chrome_and_launch_Facebook()"
});
formatter.result({
  "duration": 9934415835,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "SwapTwo",
      "offset": 18
    },
    {
      "val": "PasswordTwo",
      "offset": 32
    }
  ],
  "location": "SmokeTest.user_Enter_valid_and(String,String)"
});
formatter.result({
  "duration": 280417074,
  "status": "passed"
});
formatter.match({
  "location": "SmokeTest.click_login_button()"
});
formatter.result({
  "duration": 3648036808,
  "status": "passed"
});
formatter.match({
  "location": "SmokeTest.user_should_login_successfully()"
});
formatter.result({
  "duration": 7439389,
  "status": "passed"
});
formatter.match({
  "location": "SmokeTest.close_Browser()"
});
formatter.result({
  "duration": 2326864622,
  "status": "passed"
});
});