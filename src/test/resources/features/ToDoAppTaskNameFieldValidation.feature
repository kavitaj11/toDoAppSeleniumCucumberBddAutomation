Feature: Create Task
As a ToDo App user
I should be able to create a task
So I can manage my tasks

  Background:
    Given I navigate to home page
    And I click on the My Tasks Link


Scenario Outline: validate the task name field with valid task names
When I input valid task name <taskname> in the task name field
And I click the Add Task Button
Then I should be able to see new task created in the tasks list
#the task name field should require at least three characters 
Examples: Valid task names
     |taskname|
     | abc |
     | 123456 | 
     | abc$@! |
  
Scenario Outline: validate the task name field with invalid task names
When I input invalid task name <taskname> in the task name field
And click the Add Task Button 
Then new task is not created
#the task name field should not accept less than 3 characters or more than 250 characters
Examples: Invalid task names
     |taskname|
     | ab |
     | abbbbbbbbbbbbbcccccccccccccccccccccccccccdddddddddddddddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeeefffffffffffffffffffffffffffffff |

