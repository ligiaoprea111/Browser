package decorator;

public class AdBlockTab extends ADecoratorTab {
    public AdBlockTab(ITab tab) {
        super(tab);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Functionalitate Ad-Block activata! \n");
    }
}
