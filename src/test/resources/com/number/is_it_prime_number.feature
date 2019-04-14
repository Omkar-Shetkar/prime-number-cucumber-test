Feature: Is it prime number?

	Scenario Outline: Is input prime number or not
		Given input is <input>
		When I ask whether input is a prime number
		Then I should be told "<output>" 
		
	Examples:
		| input		| output	|
		| 1			| false		|
		| 2			| true		|
		| 3			| true		|
		| 4			| false		|
		| 25		| false		|