package decorator;

public class AdBlockTab extends AbstractTabDecorator{
    public AdBlockTab(Tab tab) {
        super(tab);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Functionalitate Ad-Block activata! \n");
    }
}
