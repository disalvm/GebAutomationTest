package pages

import geb.Page

class LNProfilePage extends Page {

    static content = {
        userProfileName  { $('a[id="ember263"] > span')}
    }

}
