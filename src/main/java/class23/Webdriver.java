package class23;

public interface Webdriver {
    void OpenBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();
    class ChromeDriver implements Webdriver{
        @Override
        public void OpenBrowser() {
            System.out.println("Chrome opens");
        }

        @Override
        public void closeBrowser() {
            System.out.println("Chrome Closes");
        }

        @Override
        public void maximizeWindow() {
            System.out.println("Chrome Maximize");
        }

        @Override
        public void findElement() {
            System.out.println("Chrome finds element");
        }
    }
    class FirefoxDriver implements Webdriver{
        @Override
        public void OpenBrowser() {
            System.out.println("Firefox opens");
        }

        @Override
        public void closeBrowser() {
            System.out.println("Firefox Closes");
        }

        @Override
        public void maximizeWindow() {
            System.out.println("Firefox Maximize");
        }

        @Override
        public void findElement() {
            System.out.println("Firefox finds element");
        }
    }
}
