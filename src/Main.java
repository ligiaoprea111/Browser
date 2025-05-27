import decorator.*;
import strategy.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Proiect configurat cu succes!");
        System.out.println("New branch for Ligia");

        //tab simplu
        ITab simpleTab=new SimpleTab();
        System.out.println("Tab simplu: \n");
        simpleTab.display();

        //tab cu recuperare sesiuni
        ITab sessionTab=new SessionRecoveryTab(simpleTab);
        System.out.println("+ recuperare sesiuni: ");
        sessionTab.display();

        //tab cu recuperare sesiuni + ad-block
        ITab sesssionAdBlockTab=new AdBlockTab(sessionTab);
        System.out.println("+ recuperare sesiuni si ad-block: ");
        sesssionAdBlockTab.display();

        //tab cu recuperare sesiuni, ad-block si anti-phishing
        ITab fullPremiumTab=new AntiPhishingTab(sesssionAdBlockTab);
        System.out.println("+ recuperare sesiuni, ad-block si anti-phishing: ");
        fullPremiumTab.display();

        //strategy
        Browser browser = new Browser();

        PerformanceMetrics strongPC = new PerformanceMetrics(1200, 30.0);
        PerformanceMetrics decentPC = new PerformanceMetrics(700, 65.0);
        PerformanceMetrics lowEndPC = new PerformanceMetrics(200, 85.0);

        System.out.println("🔗 Visiting openai.com");
        browser.visit("https://openai.com", strongPC);

        System.out.println("\n🔗 Visiting github.com");
        browser.visit("https://github.com", decentPC);

        System.out.println("\n🔗 Visiting wikipedia.org");
        browser.visit("https://wikipedia.org", lowEndPC);
    }
}

