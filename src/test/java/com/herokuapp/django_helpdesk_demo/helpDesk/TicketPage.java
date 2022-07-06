package com.herokuapp.django_helpdesk_demo.helpDesk;

import com.herokuapp.django_helpdesk_demo.core.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TicketPage extends BasePage {

    @FindBy(xpath = "//th[text()='Submitter E-Mail']/following::td[1]")
    private WebElement email;

    @FindBy(xpath = "//h3")
    private WebElement title;

    @FindBy(xpath = "//td[@id='ticket-description']//p")
    private WebElement body;

    public TicketPage() {
        PageFactory.initElements(driver, this);
    }

    public String getEmail() {
        return email.getText();
    }

    public String getTitle() {
        return title.getText();
    }

    public String getBody() {
        return body.getText();
    }
}
