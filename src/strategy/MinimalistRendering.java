package strategy;

public class MinimalistRendering implements RenderStrategy {
    @Override
    public void renderPage(String url) {
        System.out.println("Rendering " + url + " in minimalist mode (text only)...");
    }
}
