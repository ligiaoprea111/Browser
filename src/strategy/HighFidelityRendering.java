package strategy;

public class HighFidelityRendering implements RenderStrategy {

    @Override
    public void renderPage(String url) {
        System.out.println("Rendering " + url + " in high fidelity mode...");
    }
}
