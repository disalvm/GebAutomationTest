import pages.LNMainPage
import pages.LNProfilePage
import spock.lang.Specification
import geb.spock.GebSpec

class LNLogin extends GebSpec {

//    def
//
//    Class = specification (for an area in this case it is the LNMLOGIC spec)
//
//    next we have methods within the spce and those are called features / and or test cases
//
//    within the feasture test cases / assertions that will be an actual assertion using BDD or TDD

//    given, when, and, then

    // Navigate to the linkedin Page

//    Initialize the PAGE OBJECTS
    def loginPage = new LNMainPage()

    def setup() {
        to LNMainPage
    }

    def "Log into linkedin from main page"(){
        given: "The user is on the login page"
        at loginPage

        when: "The username and password are entered"
        loginPage.completelogin("", "")

        then: "The User Profile is displayed "
        def profilePage = new LNProfilePage()
        profilePage.userProfileName()

    }


//

}
