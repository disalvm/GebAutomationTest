package pages

import geb.Page

class LNProfilePage extends Page {
//    Main page object

    static at = { userProfileName.text() == "Michael Disalvo"}
    static content = {
        userProfileName  { $('.feed-identity-module__actor-meta > a:nth-child(3) > span')}
    }

    def returnProfileName(){
       return userProfileName.text()
    }

}
