import pages.LNMainPage
import pages.LNProfilePage
import spock.lang.Specification

class LNLogin extends Specification {

//    def
//
//    Class = specification (for an area in this case it is the LNMLOGIC spec)
//
//    next we have methods within the spce and those are called features / and or test cases
//
//    within the feasture test cases / assertions that will be an actual assertion using BDD or TDD

//    given, when, and, then

    // Navigate to the linkedin Page
    def setup() {
//        to LNMainPage
    }

    def "Log into linkedin from main page"(){
        given: "The user is on the login page"
        def loginPage = new LNMainPage()
        waitFor {loginPage.loginContainer}
        at loginPage

        when: "The username and password are entered"
        loginPage.completelogin("", "")

        then: "The User Profile is displayed "
        def profilePage = new LNProfilePage()

        waitFor {profilePage.userProfileName}
        assert profilePage.userProfileName.text() == "Michael DiSalvo"
    }


//

}
