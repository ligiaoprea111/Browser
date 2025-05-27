package decorator;

public abstract class ADecoratorTab implements ITab {
    protected ITab tab;

    public ADecoratorTab(ITab tab) {
        this.tab = tab;
    }

    @Override
    public void display() {
        tab.display();
    }
}
