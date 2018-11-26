# refactoring_step_by_step
1. Change 'age' in Driver class from public to private
	1.1. Find usage of driver.age
	1.2. Add unit test for Police Class
	1.3. Run unit test, confirm pass.
	1.4. Add method getAge() for Driver
	1.5. Replace every driver.age to driver.getAge()
	1.6. Rerun unit test, confirm pass.
	1.7. Change 'age' in Driver class from public to private

2. Improve method name of checkDriver() of class Police
	2.1 Find usage of police.checkDriver()
	2.2 Run unit test for Police Class, confirm pass.
	2.3 Rename checkDriver() to checkIfDriverIsAdult()
	2.4 Rerun unit test, confirm pass.

3. Simplify if-else-block return statmenet in checkIfDriverIsAdult()
	3.1 Find usage of police.checkIfDriverIsAdult()
	3.2 Run unit test for Police Class, confirm pass.
	3.3 Simplify if-else-block to directly return the condition.
	3.4 Rerun unit test, confirm pass.
	
4. Extract magic int 18 to a constant legalAdultAge
	4.1 Find usage of that 18 which is only in checkIfDriverIsAdult()
	4.2 Run unit test for Police Class, confirm pass.
	4.3 Extract int 18 to a class variable constant legalAdultAge.
	4.4 Rerun unit test, confirm pass.
	