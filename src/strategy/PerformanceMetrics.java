package strategy;

public class PerformanceMetrics {
    private final int bandwidthKbps;
    private final double cpuUsagePercent;

    public PerformanceMetrics(int bandwidthKbps, double cpuUsagePercent) {
        this.bandwidthKbps = bandwidthKbps;
        this.cpuUsagePercent = cpuUsagePercent;
    }

    public int getBandwidthKbps() {
        return bandwidthKbps;
    }

    public double getCpuUsagePercent() {
        return cpuUsagePercent;
    }

    @Override
    public String toString() {
        return "Bandwidth: " + bandwidthKbps + "kbps, CPU Usage: " + cpuUsagePercent + "%";
    }
}
