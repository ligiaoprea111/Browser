package decorator;

public class SessionRecoveryTab extends ADecoratorTab {
    public SessionRecoveryTab(ITab tab) {
        super(tab);
    }

    @Override
    public void display() {
        super.display();
        System.out.printf("Functionalitate de recuperare sesiune activata! \n");
    }
}
