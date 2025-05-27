package decorator;

public class AntiPhishingTab extends ADecoratorTab {
    public AntiPhishingTab(ITab tab) {
        super(tab);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Functionalitate de anti-phishing activata! \n");
    }
}
