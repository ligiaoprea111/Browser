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
        System.out.println("\n--- Randare în funcție de strategie ---");

        RenderStrategy strategy;

        strategy = new HighFidelityRendering();
        strategy.renderPage("https://openai.com");

        strategy = new CompressedRendering();
        strategy.renderPage("https://github.com");

        strategy = new MinimalistRendering();
        strategy.renderPage("https://google.com");
    }
}

