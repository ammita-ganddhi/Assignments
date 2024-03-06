
@regression

Feature: add a run feature
Background:
	Given  user opens "chrome"
	When user opens application url "http://localhost:8000/add-run.php"


@smoke @add-run 
Scenario Outline: Verify user is able to add a new run for an exsisting player

	When user clicks on add run link
	Then user verifys application title as "ADD RUN"
	When user clicks on player name drop down and selects a particular player name
	And user enters details for add run data in the form
		|<Player Name>|<Against Country>|<Run>|<Balls>|<Fours>|<Sixes>|<Inning Date>|
	And user clicks on add run button
	Then user verifys message as, "Runs Added Successfully"
	When user clicks on all players link from the header
	And user clicks on player name hyper-link of newly added players run 
	Then user is able to view page title as, "VIEW RUN [<PLAYER NAME>]"
	Then user is able to view page added run details
		|<DATE>|<Against Country>|<Run>|<FOUR/SIXES>|<BALLS>|


@india @positive
Examples:
|Player Name|Against Country|Run|Balls|Fours|Sixes|Inning Date|application-title|
|Ashish Singh|IND|20|20|1|1|01-01-2018|Runs Added Successfully|


@England @negative
Examples:
|Player Name|Against Country|Run|Balls|Fours|Sixes|Inning Date|application-title|
|SOPHIE LUFF|ENG|5|1|0|0|05-03-2024|Runs Added Successfully|



	
