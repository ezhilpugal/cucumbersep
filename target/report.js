$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/test/resources/AddTariffPlan.feature");
formatter.feature({
  "name": "Title of your feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "add tariff plan validation",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user click on add tariff button",
  "keyword": "And "
});
formatter.match({
  "location": "AddTariffPlanSteps.user_click_on_add_tariff_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user need to fill the field 1dlist",
  "rows": [
    {
      "cells": [
        "1",
        "2",
        "3",
        "4",
        "5",
        "6",
        "7"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "AddTariffPlanSteps.user_need_to_fill_the_field_dlist(Integer,DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click the submit button",
  "keyword": "And "
});
formatter.match({
  "location": "AddTariffPlanSteps.user_click_the_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verify congratulations is generated",
  "keyword": "Then "
});
formatter.match({
  "location": "AddTariffPlanSteps.user_verify_customer_plan_is_generated()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
});