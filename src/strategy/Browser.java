package strategy;

public class Browser {
    private RenderStrategy strategy;

    public void visit(String url, PerformanceMetrics metrics) {
        System.out.println("📡 System metrics → " + metrics);

        // Alegerea strategiei
        if (metrics.getBandwidthKbps() > 1000 && metrics.getCpuUsagePercent() < 50) {
            strategy = new HighFidelityRendering();
        } else if (metrics.getBandwidthKbps() > 500) {
            strategy = new CompressedRendering();
        } else {
            strategy = new MinimalistRendering();
        }

        strategy.renderPage(url);
    }
}
