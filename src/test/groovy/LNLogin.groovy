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

//    Initialize the pages I am working on
    def loginPage = new LNMainPage()
    def profilePage = new LNProfilePage()
    static username = 'username'
    static password = 'Password'

    def setup() {
        // THIS WILL EXECUTE THE STATIC URL AND THE AT IN THE PAGE OBJECT.
        to loginPage
    }

    def "Log into linkedin from main page"(){
        given: "The user is on the login page"
        waitFor {loginPage.loginContainer}

        when: "The username and password are entered"
        loginPage.completelogin(username, password)

        then: "The User Profile is displayed "
        assert profilePage.userProfileName() == "Michael Disalvo"
    }


//

}
