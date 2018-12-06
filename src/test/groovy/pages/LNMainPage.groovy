package pages

import geb.Page

class LNMainPage extends Page {
//    Main page object

    static url = "http://www.linkedin.com"
    static at = { title == "LinkedIn: Log In or Sign Up"}
    static content = {

        loginContainer { $("div", id: "main-container")}
        userName { $("input", id: "login-email")}
        password { $("input", id: "login-password")}
        loginButton { $("input", id: "login-submit")}
    }

    def completelogin(usernameString, passwordString){
        userName.value(usernameString)
        password.value(passwordString)
        //Click the login button
        loginButton.click()
    }

    def waitForElement(element){
        waitFor{element}
    }

}
