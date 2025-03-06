package org.icepear.echarts.origin.chart.sankey;

import org.icepear.echarts.origin.util.NumericGraphEdgeItemObject;
import org.icepear.echarts.origin.util.StatesOptionMixin;

/**
 * https://github.com/apache/echarts/blob/566ba8e83dd283ba359fe9aceee0d4a12dbcd6c7/src/chart/sankey/SankeySeries.ts#L83
 */
public interface SankeyEdgeItemOption extends SankeyEdgeStateOption, StatesOptionMixin, NumericGraphEdgeItemObject {

    SankeyEdgeItemOption setFocusNodeAdjacency(Boolean focusNodeAdjacency);

    SankeyEdgeItemOption setFocusNodeAdjacency(String focusNodeAdjacency);
}
