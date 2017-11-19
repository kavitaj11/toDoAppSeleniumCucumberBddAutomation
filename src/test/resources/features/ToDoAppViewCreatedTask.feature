Feature: Create Task
As a ToDo App user
I should be able to create a task
So I can manage my tasks

Background: 
   Given I navigate to home page
   And I click on the My Tasks Link

Scenario: click on the  My Tasks Link to view created tasks
Then I should be able to view all created tasks
 
Scenario: click on the My Tasks Link to verify personalized header message
Then I should see a message on the top part saying that the tasks list belongs to the logged user
 
Scenario: User clicks the  Add Task Button to create a new task
When I input valid task name abc in the task name field
And I click the Add Task Button 
Then I should be able to see new task created in the tasks list

 
Scenario: verify new task appends to the created tasks
When I input valid task name abc in the task name field
And I click the Add Task Button 
Then I should see the new task appended to the created tasks list



