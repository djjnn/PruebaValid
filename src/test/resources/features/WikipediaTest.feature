Feature: Test Automation Valid
  I as automator
  Need validate some sceneries of test
  For wikipedia website

  @ValidateWelcomeWikipedia
  Scenario: Validate the title "Bienvenidos a wikipedia"
    Given the platform wikipedia the website is entered
    Then the title is validated Welcome to wikipedia

  @ValidateTitleSystem
  Scenario: Validate the search title "Sistema"
    Given the platform wikipedia the website is entered
    When searching for the text "Sistema"
    Then the searched title "Sistema" is validated

  @ValidateSearchedTitle
  Scenario: Validate the search title "Analisis CEEM"
    Given the platform wikipedia the website is entered
    When searching for the text "Sistema"
    Then the title "Análisis CEEM" is validated in the searched text

  @ValidateCaptchaFromUserCreation
  Scenario: Validate Captcha from user creation
    Given the platform wikipedia the website is entered
    When you enter the link to create an account
    And enter the username "DanielTestWiki", password "Danielwiki" and email "danieldaeroe@gmail.com"
    Then Validate the text 'completa este campo' of the captcha

  @ValidateViewMobile
  Scenario: Validate View Mobile
    Given the platform wikipedia the website is entered
    When you enter the link mobile version
    Then Validate link 'Escritorio'

  @CompareHistoryRevisions
  Scenario: Compare history revisions
    Given the platform wikipedia the website is entered
    When you enter the link view history
    And Select two revisions
    Then Compared selected reviews