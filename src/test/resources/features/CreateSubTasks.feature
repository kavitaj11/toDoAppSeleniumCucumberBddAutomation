Feature: Create SubTask
As a ToDo App user
I should be able to create a subtask
So I can break down my tasks in smaller pieces

   Background:
      Given I navigate to home page
      And I click on the My Tasks Link


Scenario: The user should see a button labeled as �Manage Subtasks�
Then I should be able to see button labeled as �Manage Subtasks� on the table of created tasks.
 
Scenario: User click on Add button in manage subtask modal dialog with empty task description and duw date fields
When I click on Manage Subtask button
And click on Add button in the modal dialog
Then A new subtask should not be created
 
Scenario: User verifies new subtask appended to the subtasks list in the modal dialog
When I click on Manage Subtask button
And create a new subtask
And click on Add button in the modal dialog
Then the new subtask should be appended to the subtasks list in the modal dialog

 