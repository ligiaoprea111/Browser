package decorator;

public class SessionRecoveryTab extends AbstractTabDecorator{
    public SessionRecoveryTab(Tab tab) {
        super(tab);
    }

    @Override
    public void display() {
        super.display();
        System.out.printf("Functionalitate de recuperare sesiune activata! \n");
    }
}
