package decorator;

public abstract class AbstractTabDecorator implements Tab{
    protected Tab tab;

    public AbstractTabDecorator(Tab tab) {
        this.tab = tab;
    }

    @Override
    public void display() {
        tab.display();
    }
}
