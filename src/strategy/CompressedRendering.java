package strategy;

public class CompressedRendering implements RenderStrategy {
    @Override
    public void renderPage(String url) {
        System.out.println("Rendering " + url + " in compressed mode...");
    }
}
