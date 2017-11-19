$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("CreateSubTasks.feature");
formatter.feature({
  "line": 1,
  "name": "Create SubTask",
  "description": "As a ToDo App user\r\nI should be able to create a subtask\r\nSo I can break down my tasks in smaller pieces",
  "id": "create-subtask",
  "keyword": "Feature"
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
  "name": "I navigate to home page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I click on the My Tasks Link",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 11,
  "name": "The user should see a button labeled as �Manage Subtasks�",
  "description": "",
  "id": "create-subtask;the-user-should-see-a-button-labeled-as-�manage-subtasks�",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "I should be able to see button labeled as �Manage Subtasks� on the table of created tasks.",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
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
  "name": "I navigate to home page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I click on the My Tasks Link",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 14,
  "name": "User click on Add button in manage subtask modal dialog with empty task description and duw date fields",
  "description": "",
  "id": "create-subtask;user-click-on-add-button-in-manage-subtask-modal-dialog-with-empty-task-description-and-duw-date-fields",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 15,
  "name": "I click on Manage Subtask button",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "click on Add button in the modal dialog",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "A new subtask should not be created",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
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
  "name": "I navigate to home page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I click on the My Tasks Link",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 19,
  "name": "User verifies new subtask appended to the subtasks list in the modal dialog",
  "description": "",
  "id": "create-subtask;user-verifies-new-subtask-appended-to-the-subtasks-list-in-the-modal-dialog",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 20,
  "name": "I click on Manage Subtask button",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "create a new subtask",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "click on Add button in the modal dialog",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "the new subtask should be appended to the subtasks list in the modal dialog",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.uri("ToDoAppTaskNameFieldValidation.feature");
formatter.feature({
  "line": 1,
  "name": "Create Task",
  "description": "As a ToDo App user\r\nI should be able to create a task\r\nSo I can manage my tasks",
  "id": "create-task",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 11,
  "name": "validate the task name field with valid task names",
  "description": "",
  "id": "create-task;validate-the-task-name-field-with-valid-task-names",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 12,
  "name": "I input valid task name \u003ctaskname\u003e in the task name field",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I click the Add Task Button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I should be able to see new task created in the tasks list",
  "keyword": "Then "
});
formatter.examples({
  "comments": [
    {
      "line": 15,
      "value": "#the task name field should require at least three characters"
    }
  ],
  "line": 16,
  "name": "Valid task names",
  "description": "",
  "id": "create-task;validate-the-task-name-field-with-valid-task-names;valid-task-names",
  "rows": [
    {
      "cells": [
        "taskname"
      ],
      "line": 17,
      "id": "create-task;validate-the-task-name-field-with-valid-task-names;valid-task-names;1"
    },
    {
      "cells": [
        "abc"
      ],
      "line": 18,
      "id": "create-task;validate-the-task-name-field-with-valid-task-names;valid-task-names;2"
    },
    {
      "cells": [
        "123456"
      ],
      "line": 19,
      "id": "create-task;validate-the-task-name-field-with-valid-task-names;valid-task-names;3"
    },
    {
      "cells": [
        "abc$@!"
      ],
      "line": 20,
      "id": "create-task;validate-the-task-name-field-with-valid-task-names;valid-task-names;4"
    }
  ],
  "keyword": "Examples"
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
  "name": "I navigate to ToDoApp home page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I click on the My Tasks Link",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 18,
  "name": "validate the task name field with valid task names",
  "description": "",
  "id": "create-task;validate-the-task-name-field-with-valid-task-names;valid-task-names;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 12,
  "name": "I input valid task name abc in the task name field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I click the Add Task Button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I should be able to see new task created in the tasks list",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
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
  "name": "I navigate to ToDoApp home page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I click on the My Tasks Link",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 19,
  "name": "validate the task name field with valid task names",
  "description": "",
  "id": "create-task;validate-the-task-name-field-with-valid-task-names;valid-task-names;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 12,
  "name": "I input valid task name 123456 in the task name field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I click the Add Task Button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I should be able to see new task created in the tasks list",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
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
  "name": "I navigate to ToDoApp home page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I click on the My Tasks Link",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 20,
  "name": "validate the task name field with valid task names",
  "description": "",
  "id": "create-task;validate-the-task-name-field-with-valid-task-names;valid-task-names;4",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 12,
  "name": "I input valid task name abc$@! in the task name field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I click the Add Task Button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I should be able to see new task created in the tasks list",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenarioOutline({
  "line": 22,
  "name": "validate the task name field with invalid task names",
  "description": "",
  "id": "create-task;validate-the-task-name-field-with-invalid-task-names",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 23,
  "name": "I input invalid task name \u003ctaskname\u003e in the task name field",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "click the Add Task Button",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "new task is not created",
  "keyword": "Then "
});
formatter.examples({
  "comments": [
    {
      "line": 26,
      "value": "#the task name field should not accept less than 3 characters or more than 250 characters"
    }
  ],
  "line": 27,
  "name": "Invalid task names",
  "description": "",
  "id": "create-task;validate-the-task-name-field-with-invalid-task-names;invalid-task-names",
  "rows": [
    {
      "cells": [
        "taskname"
      ],
      "line": 28,
      "id": "create-task;validate-the-task-name-field-with-invalid-task-names;invalid-task-names;1"
    },
    {
      "cells": [
        "ab"
      ],
      "line": 29,
      "id": "create-task;validate-the-task-name-field-with-invalid-task-names;invalid-task-names;2"
    },
    {
      "cells": [
        "abbbbbbbbbbbbbcccccccccccccccccccccccccccdddddddddddddddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeeefffffffffffffffffffffffffffffff"
      ],
      "line": 30,
      "id": "create-task;validate-the-task-name-field-with-invalid-task-names;invalid-task-names;3"
    }
  ],
  "keyword": "Examples"
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
  "name": "I navigate to ToDoApp home page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I click on the My Tasks Link",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 29,
  "name": "validate the task name field with invalid task names",
  "description": "",
  "id": "create-task;validate-the-task-name-field-with-invalid-task-names;invalid-task-names;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 23,
  "name": "I input invalid task name ab in the task name field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "click the Add Task Button",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "new task is not created",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
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
  "name": "I navigate to ToDoApp home page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I click on the My Tasks Link",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 30,
  "name": "validate the task name field with invalid task names",
  "description": "",
  "id": "create-task;validate-the-task-name-field-with-invalid-task-names;invalid-task-names;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 23,
  "name": "I input invalid task name abbbbbbbbbbbbbcccccccccccccccccccccccccccdddddddddddddddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeeefffffffffffffffffffffffffffffff in the task name field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "click the Add Task Button",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "new task is not created",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.uri("ToDoAppViewCreatedTask.feature");
formatter.feature({
  "line": 1,
  "name": "Create Task",
  "description": "As a ToDo App user\r\nI should be able to create a task\r\nSo I can manage my tasks",
  "id": "create-task",
  "keyword": "Feature"
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
  "name": "I navigate to home page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I click on the My Tasks Link",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 10,
  "name": "click on the  My Tasks Link to view created tasks",
  "description": "",
  "id": "create-task;click-on-the--my-tasks-link-to-view-created-tasks",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "I should be able to view all created tasks",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
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
  "name": "I navigate to home page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I click on the My Tasks Link",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 13,
  "name": "click on the My Tasks Link to verify personalized header message",
  "description": "",
  "id": "create-task;click-on-the-my-tasks-link-to-verify-personalized-header-message",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 14,
  "name": "I should see a message on the top part saying that the tasks list belongs to the logged user",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
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
  "name": "I navigate to home page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I click on the My Tasks Link",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 16,
  "name": "User clicks the  Add Task Button to create a new task",
  "description": "",
  "id": "create-task;user-clicks-the--add-task-button-to-create-a-new-task",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 17,
  "name": "I input valid task name abc in the task name field",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "I click the Add Task Button",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I should be able to see new task created in the tasks list",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
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
  "name": "I navigate to home page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I click on the My Tasks Link",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 22,
  "name": "verify new task appends to the created tasks",
  "description": "",
  "id": "create-task;verify-new-task-appends-to-the-created-tasks",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 23,
  "name": "I input valid task name abc in the task name field",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "I click the Add Task Button",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I should see the new task appended to the created tasks list",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});