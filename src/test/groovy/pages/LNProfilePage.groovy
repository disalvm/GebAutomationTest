package pages

import geb.Page

class LNProfilePage extends Page {

    static url = "https://www.linkedin.com/feed/"
//    static at = { waitFor{userProfileName.present}}
    static content = {
        userProfileName  { $('.feed-identity-module__actor-meta > a:nth-child(3) > span').text()}
    }

    def returnProfileName(){
        userProfileName
    }

}
