package Pages;

import org.openqa.selenium.By;

public class element {
    public By header = By.xpath("//div[@class='main-header']");
    public By checkbox = By.xpath("//div[@class='main-header']");
    public By radiobutton = By.xpath("//div[@class='main-header']");
    public By webTable = By.xpath("//div[@class='main-header']");
    public By button = By.xpath("//div[@class='main-header']");
    public By links = By.xpath("//div[@class='main-header']");
    public By images = By.xpath("//div[@class='main-header']");
    public By uploadDownload = By.xpath("//div[@class='main-header']");
    public By dynamicProperties = By.xpath("//div[@class='main-header']");

    public static class textBox {
        public By userName = By.xpath("//input[@id='userName']");
        public By userEmail = By.xpath("//input[@id='userEmail']");
        public By currentAddress = By.xpath("//textarea[@id='currentAddress']");
        public By permanentAAddress = By.xpath("//textarea[@id='permanentAddress']");
        public By submit = By.xpath("//button[@id='submit']");

    }

    public static class checkBox {
        public By home = By.xpath("//span[@class='rct-title']");
        public By Desktop = By.xpath("//span[@class='rct-title']");
        public By Notes = By.xpath("//span[@class='rct-title']");
        public By Commands = By.xpath("//span[@class='rct-title']");
        public By Documents = By.xpath("//span[@class='rct-title']");
        public By WorkSpace = By.xpath("//span[@class='rct-title']");
        public By React = By.xpath("//span[@class='rct-title']");
        public By Angular = By.xpath("//span[@class='rct-title']");
        public By Veu = By.xpath("//span[@class='rct-title']");
        public By Office = By.xpath("//span[@class='rct-title']");
        public By Public = By.xpath("//span[@class='rct-title']");
        public By Private = By.xpath("//span[@class='rct-title']");
        public By Classified = By.xpath("//span[@class='rct-title']");
        public By General = By.xpath("//span[@class='rct-title']");
        public By Downloads = By.xpath("//span[@class='rct-title']");
        public By WordFile = By.xpath("//span[@class='rct-title']");
        public By ExcelFile = By.xpath("//span[@class='rct-title']");

    }

    public static class radioButton {
        public By yesRadio = By.xpath("//label[@class='custom-control-label']");
        public By impressiveRadio = By.xpath("//label[@class='custom-control-label']");
        public By noRadio = By.xpath("//label[@class='custom-control-label disabled']");

    }

    public static class webTables {
        public By addButton = By.xpath("//button[@id='addNewRecordButton']");
        public By searchButton = By.xpath("//input[@id='searchBox']");
        public By firstName = By.xpath("//div[@class='rt-resizable-header-content']");
        public By lastname = By.xpath("//div[@class='rt-resizable-header-content']");
        public By age = By.xpath("//div[@class='rt-resizer']");
        public By email = By.xpath("//div[@class='rt-resizable-header-content']");
        public By salary = By.xpath("//div[@class='rt-resizable-header-content']");
        public By Department = By.xpath("//div[@class='rt-resizable-header-content']");
        public By action = By.xpath("//div[@class='rt-resizable-header-content']");

    }

    public static class buttons {
        public By doubleClick = By.xpath("//button[@id='doubleClickBtn']");
        public By clickMe = By.xpath("//button[@id='KNWLE']");
    }

    public static class links {
        public By homeLink = By.xpath("//a[@id='simpleLink']");
        public By homekdztE = By.xpath("//a[@id='dynamicLink']");
        public By created = By.xpath("//a[@id='created']");
        public By noContent = By.xpath("//a[@id='no-content']");
        public By moved = By.xpath("//a[@id='moved']");
        public By badRequest = By.xpath("//a[@id='bad-request']");
        public By unauthorized = By.xpath("//a[@id='unauthorized']");
        public By forBidden = By.xpath("//a[@id='forbidden']");
        public By notFound = By.xpath("//a[@ id='invalid-url']");
    }

    public static class brokenLinkImage {
        public By validImage = By.xpath("//img[@src='/images/Toolsqa.jpg']");
        public By BrokenImage = By.xpath("//img[@src='/images/Toolsqa_1.jpg']");
        public By validLink = By.xpath("//a[@href='http://demoqa.com']");
        public By BrokenLink = By.xpath("//a[@href='http://the-internet.herokuapp.com/status_codes/500']");
    }

    public static class uploadDownload {
        public By downloadButton = By.xpath("//a[@id='downloadButton']");
        public By uploadFile = By.xpath("//input[@id='uploadFile']");
    }

    public static class dynamicProperties {
        public By enableButton = By.xpath("//button[@id='enableAfter']");
        public By colorChangeButton = By.xpath("//button[@id='colorChange']");
        public By visibleButton = By.xpath("//button[@id='visibleAfter']");
    }
}+




-





