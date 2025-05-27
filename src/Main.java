import decorator.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Proiect configurat cu succes!");
        System.out.println("New branch for Ligia");

        //tab simplu
        Tab simpleTab=new SimpleTab();
        System.out.println("Tab simplu: \n");
        simpleTab.display();

        //tab cu recuperare sesiuni
        Tab sessionTab=new SessionRecoveryTab(simpleTab);
        System.out.println("+ recuperare sesiuni: ");
        sessionTab.display();

        //tab cu recuperare sesiuni + ad-block
        Tab sesssionAdBlockTab=new AdBlockTab(sessionTab);
        System.out.println("+ recuperare sesiuni si ad-block: ");
        sesssionAdBlockTab.display();

        //tab cu recuperare sesiuni, ad-block si anti-phishing
        Tab fullPremiumTab=new AntiPhishingTab(sesssionAdBlockTab);
        System.out.println("+ recuperare sesiuni, ad-block si anti-phishing: ");
        fullPremiumTab.display();


    }
}

