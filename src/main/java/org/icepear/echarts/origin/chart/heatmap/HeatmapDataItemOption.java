package org.icepear.echarts.origin.chart.heatmap;

import org.icepear.echarts.origin.util.StatesOptionMixin;

/**
 * https://github.com/apache/echarts/blob/1277d7ae81f2b1c7ede4e1731820a1c06bd16cf0/src/chart/heatmap/HeatmapSeries.ts#L53
 */
public interface HeatmapDataItemOption extends HeatmapStateOption, StatesOptionMixin {

    HeatmapDataItemOption setValue(Object value);
}
