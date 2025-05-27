package decorator;

public class AntiPhishingTab extends AbstractTabDecorator{
    public AntiPhishingTab(Tab tab) {
        super(tab);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Functionalitate de anti-phishing activata! \n");
    }
}
