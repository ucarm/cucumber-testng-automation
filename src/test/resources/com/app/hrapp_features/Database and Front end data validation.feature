
Feature: Hr Application Database and UI data verification
@HRAppDB
Scenario: Department data UI and Database verification
 Given I am on DeptEmpPage
 When I search for department id 50
 And I query database with sql "SELECT department_name,manager_id,location_id from departments where department_id=10"
 Then UI data and Database data must match
  
  
